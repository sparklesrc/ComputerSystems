/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controller.pcs.empresa;

import app.dao.EmpresaDAO;
import app.model.Empresa;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author SparKLes
 */
@Service
public class EmpresaServiceImp implements EmpresaService{

    @Autowired
    EmpresaDAO empresaDAO;
    
    @Override
    public List<Empresa> getEmpresas() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return empresaDAO.getAllDAO();
    }

    @Override
    public Empresa getEmpresa(Empresa empresa) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return empresaDAO.getDAO(empresa);
    }

    @Override
    public void addEmpresa(Empresa empresa) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        empresaDAO.addDAO(empresa);
    }

    @Override
    public void updateEmpresa(Empresa empresa) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        empresaDAO.updateDAO(empresa);
    }

    @Override
    public void deleteEmpresa(Empresa empresa) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        empresaDAO.deleteDAO(empresa);
    }
    
    
}
