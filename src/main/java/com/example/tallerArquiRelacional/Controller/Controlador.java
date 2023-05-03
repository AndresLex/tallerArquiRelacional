/*Elaborado por: Andres Leonardo Camargo Cortes*/
package com.example.tallerArquiRelacional.Controller;

import com.example.tallerArquiRelacional.InterfaceService.IClienteService;
import com.example.tallerArquiRelacional.InterfaceService.IPedidoService;
import com.example.tallerArquiRelacional.Model.Cliente;
import com.example.tallerArquiRelacional.Model.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/regisCli")
    public String registrarCliente(Model model){
        model.addAttribute("title", "Registro Cliente");
        model.addAttribute("title2", "Formulario Registro de Cliente");
        model.addAttribute("btnMsj", "Añadir Usuario");
        model.addAttribute("cliente", new Cliente());
        return "registroCli";
    }

    @GetMapping("/regisPed")
    public String registrarPedido(Model model){
        model.addAttribute("title", "Registro Pedido");
        model.addAttribute("title2", "Formulario Registro de Pedido");
        model.addAttribute("btnMsj", "Añadir Pedido");
        model.addAttribute("labelSelec", "Seleccionar Cliente:");
        model.addAttribute("datosCli", servCli.listar());
        model.addAttribute("pedido", new Pedido());
        return "registroPed";
    }

    @GetMapping("/acciones")
    public String acciones(Model model){
        model.addAttribute("title", "Acciones");
        model.addAttribute("datosCli", servCli.listar());
        model.addAttribute("datosPed", servPed.listar());
        return "acciones";
    }

    @GetMapping("/editarCli/{id}")
    public String editarCliente(@PathVariable("id") int id, Model model){
        model.addAttribute("title", "Edicion Cliente");
        model.addAttribute("title2", "Formulario Edicion de Cliente");
        model.addAttribute("btnMsj", "Editar Usuario");
        model.addAttribute("cliente", servCli.editar(id));
        return "registroCli";
    }

    @GetMapping("/editarPed/{id}")
    public String editarPedido(@PathVariable("id") int id, Model model){
        model.addAttribute("title", "Edicion Pedido");
        model.addAttribute("title2", "Formulario Edicion de Pedido");
        model.addAttribute("btnMsj", "Editar Pedido");
        model.addAttribute("labelSelec", "Cliente");
        model.addAttribute("datosCli", servCli.listar());
        model.addAttribute("pedido", servPed.editar(id));
        return "registroPed";
    }

    @GetMapping("/eliminarCli/{id}")
    public String eliminarCliente(@PathVariable("id") int id){
        servCli.eliminar(id);
        return "redirect:/acciones";
    }

    @GetMapping("/eliminarPed/{id}")
    public String eliminarPedido(@PathVariable("id") int id){
        servPed.eliminar(id);
        return "redirect:/acciones";
    }

    @PostMapping("/guardarCli")
    public String guardarCli(@ModelAttribute Cliente cli){
        servCli.guardar(cli);
        return "redirect:/inicio";
    }

    @PostMapping("/guardarPed")
    public String guardarPed(@ModelAttribute Pedido ped){
        servPed.guardar(ped);
        return "redirect:/inicio";
    }
}
