/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controller.pcs.empresa;

import app.model.Empresa;
import java.util.List;

/**
 *
 * @author SparKLes
 */
public interface EmpresaService {

    List<Empresa> getEmpresas();

    Empresa getEmpresa(Empresa empresa);

    void addEmpresa(Empresa empresa);

    void updateEmpresa(Empresa empresa);

    void deleteEmpresa(Empresa empresa);
}
