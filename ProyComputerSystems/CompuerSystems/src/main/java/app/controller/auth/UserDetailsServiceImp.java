/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controller.auth;

import app.dao.UsuarioDAO;
import app.model.Usuario;
import app.model.spring.UserEntity;
import app.zelper.RolesEnum;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author SparKLes
 */
@Service("userDetailsService")
public class UserDetailsServiceImp implements UserDetailsService {

    @Autowired
    private UsuarioDAO usuarioDAO;
    @Autowired
    private Assembler assembler;

    @Override
    public UserDetails loadUserByUsername(String string) throws UsernameNotFoundException {
       
        Usuario user = usuarioDAO.getUsuarioForAuthDAO(string);

        if (user == null) {
            throw new UsernameNotFoundException("Usuario no encontrado");
        }

        List<String> roles = new ArrayList<String>();
        roles.add(RolesEnum.get(user.getTipo_usuario()).toString());

        UserEntity userEntity = new UserEntity();
        userEntity.setActive(true);
        //userEntity.setNombre(user.getPersona().getEmail());
        userEntity.setName(user.getUsuario());
        userEntity.setPassword(user.getPass());
        userEntity.setRoles(roles);

        return assembler.buildUserFromUserEntity(userEntity);
    }
}
