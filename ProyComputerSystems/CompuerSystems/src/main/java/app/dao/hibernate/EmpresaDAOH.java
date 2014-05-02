/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.dao.hibernate;

import app.dao.EmpresaDAO;
import app.model.Empresa;
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
public class EmpresaDAOH extends HibernateTemplate implements EmpresaDAO {

    @Autowired
    public EmpresaDAOH(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public void addDAO(Empresa t) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.save(t);
    }

    @Override
    public void updateDAO(Empresa t) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.merge(t);
    }

    @Override
    public void deleteDAO(Empresa t) {
        this.save(t);
    }

    @Override
    public Empresa getDAO(Empresa t) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Criteria criteria = this.getSession().createCriteria(Empresa.class);
        criteria.add(Restrictions.eq("id", t.getId()));
        return (Empresa) criteria.uniqueResult();
    }

    @Override
    public List<Empresa> getAllDAO() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Criteria criteria = this.getSession().createCriteria(Empresa.class);
        criteria.add(Restrictions.eq("estado", (byte)1));
        return criteria.list();
    }
}
