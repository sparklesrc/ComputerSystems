/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controller.pcs.empresa;

import app.model.Empresa;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author SparKLes
 */
@Controller
@SessionAttributes("empresa")
@RequestMapping("/pcs/empresa")
public class EmpresaController {

    @Autowired
    EmpresaService service;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView index(HttpSession session) {
        return new ModelAndView("pcs/empresa/list", "empresas", service.getEmpresas());
    }

    @RequestMapping("new")
    public ModelAndView nuevo() {
        return new ModelAndView("pcs/empresa/form", "empresa", new Empresa());
    }

    @RequestMapping("save")
    public String save(@Valid Empresa empresa, BindingResult result, SessionStatus status) {

        if (result.hasErrors()) {
            return "pcs/empresa/form";
        }

        if (empresa.getId() != null) {
            service.updateEmpresa(empresa);
        } else {
            service.addEmpresa(empresa);
        }

        status.isComplete();
        return "redirect:/pcs/empresa/";
    }
}
