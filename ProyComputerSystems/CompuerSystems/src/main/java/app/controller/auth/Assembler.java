/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controller.auth;

import app.model.spring.UserEntity;
import java.util.ArrayList;
import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author SparKLes
 */

@Service("assembler")
public class Assembler{
    
    @Transactional(readOnly = true)
    public User buildUserFromUserEntity(UserEntity userEntity) {
        
        String username = userEntity.getName();
        String password = userEntity.getPassword();
        
        boolean enabled = userEntity.isActive();
        boolean accountNonExpired = userEntity.isActive();
        boolean credentialsNonExpired = userEntity.isActive();
        boolean accountNonLocked = userEntity.isActive();
        
        Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        for (String role : userEntity.getRoles()) {
            authorities.add(new SimpleGrantedAuthority(role));
        }
        
        User user = new User(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
        return user;
    }
}
