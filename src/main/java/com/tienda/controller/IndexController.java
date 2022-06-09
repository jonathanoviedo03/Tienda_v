package com.tienda.controller;

import com.tienda.dao.ClienteDao;
import com.tienda.domain.Cliente;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j

public class IndexController {

    @Autowired
    private ClienteDao clienteDao;

    // El GetMapping es para establecer una ruta del sitio web
    @GetMapping("/")
    public String inicio(Model model) {

        log.info("Estamos del lado de programacion");

//        Cliente cliente1 = new Cliente("Pedro","Perez Gomez", "pedro23@gmail.com", "89890456");
//        Cliente cliente2 = new Cliente("Rebeca","Alvares Torres", "rebAlvaTor3677@gmail.com", "87899096");
//        Cliente cliente3 = new Cliente("Juan","Mendez Mora", "juanMora2777@gmail.com", "7677656");
//        
//        var clientes = Arrays.asList(cliente1,cliente2,cliente3);

        var clientes = clienteDao.findAll();

        model.addAttribute("clientes", clientes);

        return "index";
    }
}
