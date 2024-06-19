
package com.adso.project2.controller;

import com.adso.project2.model.Registro;
import com.adso.project2.service.ServiceRegistro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
    @Autowired
    private ServiceRegistro serviceRegistro;

    public UserController() {
    }

    @GetMapping({"/"})
    public String index() {
        return "pages/index";
    }

    @GetMapping({"/inicio"})
    public String inicio() {
        return "pages/inicio";
    }

    @GetMapping({"/register/new"})
    public String formRegister(Model model) {
        model.addAttribute("registro", new Registro());
        return "pages/registro";
    }

    @PostMapping({"/registro"})
    public String createRegister(@ModelAttribute Registro registro) {
        this.serviceRegistro.saveRegister(registro);
        return "redirect:/lista";
    }

    @RequestMapping({"/lista"})
    public String listRegister(Model model) {
        model.addAttribute("result", this.serviceRegistro.getAllRegistro());
        return "pages/lista";
    }

    @GetMapping("/lista/{id}")
    public String deleteRegister(@PathVariable("id") long id){
        serviceRegistro.deleteRegister(id);
        return "redirect:/lista";
    }

    @GetMapping("/registros/edit/{id}")
    public String editRegistro(@PathVariable Long id, Model model) {
        Registro registro = serviceRegistro.getRegistro(id);
        model.addAttribute("registro", registro);
        return "fragments/editRegistro"; // Asegúrate de tener una plantilla llamada "editRegistro"
    }

    @PostMapping("/registros/update/{id}")
    public String updateRegistro(@PathVariable Long id, @ModelAttribute Registro registro) {
        registro.setId(id);
        serviceRegistro.saveOrUpdate(registro);
        return "redirect:/lista"; // Redirige a la lista de registros después de actualizar
    }
}