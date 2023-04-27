package com.example.tallerArquiRelacional.Controller;

import com.example.tallerArquiRelacional.InterfaceService.IClienteService;
import com.example.tallerArquiRelacional.InterfaceService.IPedidoService;
import com.example.tallerArquiRelacional.Model.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class Controlador {
    @Autowired
    private IClienteService servCli;

    @Autowired
    private IPedidoService servPed;

    @GetMapping("/inicio")
    public String listar(Model model){
        model.addAttribute("title", "Servicio de pedidos");
        model.addAttribute("datosCli", servCli.listar());
        model.addAttribute("datosPed", servPed.listar());
        return "index";
    }
}
