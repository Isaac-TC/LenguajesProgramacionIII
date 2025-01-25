package com.itsqmet.validacion.controlador;


import com.itsqmet.validacion.Entidad.paciente;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HistorialControlador {

    @GetMapping("/formulario")
    public String mostrarformulario(Model model){
        paciente paciente = new paciente();
        model.addAttribute("paciente",paciente);
        List<String> listaAlergias= Arrays.asList("Medicacion", "Alimentos", "Ninguna", "Otros");
        model.addAttribute("alergias",listaAlergias);
        return "pages/formulario";
    }

    @PostMapping("/registrar")
    public String registrarPaciente(@Valid @ModelAttribute paciente paciente, BindingResult bindingResult , Model model){
       if(bindingResult.hasErrors()) {

           model.addAttribute("errores", bindingResult.getAllErrors());
           return "pages/formulario";

       }else{
           return "pages/registroExitoso";
       }
    }

}
