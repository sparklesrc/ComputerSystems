/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.dao;

import app.model.Usuario;
import app.zelper.GenericDAO;

/**
 *
 * @author SparKLes
 */
public interface UsuarioDAO extends GenericDAO<Usuario>{
    
    
    //Obtener usuario para autenticar Login... Mando el objeto usuario pq contiene
    //el atributo usuario, el cual sera usado como un USERNAME para logeo
    Usuario getUsuarioForAuthDAO(String usuario);
    
    //Usuario getByUserName(String username);
}
