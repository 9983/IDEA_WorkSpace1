package com.zking.Shiro;

import com.zking.model.SysUser;
import com.zking.service.ISysUserMapper;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.Permission;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class ShiroRealm extends AuthorizingRealm {


    @Autowired
    private ISysUserMapper SysUserMapper;




    /**
     * 授权认证
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {


        String username = principalCollection.getPrimaryPrincipal().toString();
        //得到用户角色名
        Set<String> roles = SysUserMapper.findrole(username);
        //得到用户权限信息
        Set<String> permissions =SysUserMapper.findpermission(username);

        //设置关于安全数据库中的角色以及权限
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.setRoles(roles);
        simpleAuthorizationInfo.setStringPermissions(permissions);

        return simpleAuthorizationInfo;
    }


    /**
     * 身份认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        //获取用户传过来的账号密码
        String password= authenticationToken.getCredentials().toString();
        String username = authenticationToken.getPrincipal().toString();

        System.out.println("用户输入:--------------------"+username+"---"+password);

        //在数据库中查找
        SysUser user = SysUserMapper.userlogin(username);

        System.out.println("Shiro中User："+user.toString());

        //判断用户是否存在
        if(null == user){

            throw new RuntimeException("用户不存在！");
        }


        //将数据库数据交给Shiro进行匹配
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(
                user.getUsername(),
                user.getPassword(),

                //获得盐进行解密
                ByteSource.Util.bytes(user.getSalt()),

                this.getName()
        );



        return simpleAuthenticationInfo;
    }
}
