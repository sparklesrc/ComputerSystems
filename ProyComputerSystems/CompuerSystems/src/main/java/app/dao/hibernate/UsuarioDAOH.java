/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.dao.hibernate;

import app.dao.UsuarioDAO;
import app.model.Persona;
import app.model.Usuario;
import app.zelper.EstadoEnum;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author SparKLes
 */

@Repository
public class UsuarioDAOH extends HibernateTemplate implements UsuarioDAO{
    
    
    @Autowired
    public UsuarioDAOH(SessionFactory sessionFactory){
        super(sessionFactory);
    }
    
    @Override
    public Usuario getUsuarioForAuthDAO(String usuario) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Criteria criteria = this.getSession().createCriteria(Usuario.class);
        criteria.add(Restrictions.eq("usuario",usuario));

        return (Usuario)criteria.uniqueResult();
    }

    @Override
    public List<Usuario> listDAO() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Criteria criteria = this.getSession().createCriteria(Usuario.class);
        return criteria.list();
    }

    @Override
    public Usuario getDAO(Usuario t) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Criteria criteria = this.getSession().createCriteria(Usuario.class);
        criteria.add(Restrictions.eq("id", t.getId()));
        return (Usuario)criteria.uniqueResult();
    }
    
    @Override
    public void saveDAO(Usuario t) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.save(t);
    }

    @Override
    public void updateDAO(Usuario t) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.merge(t);
    }

    @Override
    public void deleteDAO(Usuario t) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //Product product = (Product) session.get(Product.class, productId); 
        //product.setProductDetail("new detail");
        this.delete(t);
    }
    
    
    
}
