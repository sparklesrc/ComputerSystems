/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.dao.hibernate;

import app.dao.PersonaDAO;
import app.model.Persona;
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
public class PersonaDAOH extends HibernateTemplate implements PersonaDAO {

    @Autowired
    public PersonaDAOH(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Persona getDAO(Persona t) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Criteria criteria = this.getSession().createCriteria(Persona.class);
        criteria.add(Restrictions.eq("id", t.getId()));
        return (Persona) criteria.uniqueResult();
    }


    @Override
    public void updateDAO(Persona t) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.merge(t);
    }

    @Override
    public void deleteDAO(Persona t) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.delete(t);
    }

    @Override
    public void addDAO(Persona t) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.save(t);
    }

    @Override
    public List<Persona> getAllDAO() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Criteria criteria = this.getSession().createCriteria(Persona.class);
        return criteria.list();
    }
}
