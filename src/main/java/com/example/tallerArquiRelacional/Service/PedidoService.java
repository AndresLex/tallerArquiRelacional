/*Elaborado por: Andres Leonardo Camargo Cortes*/
package com.example.tallerArquiRelacional.Service;

import com.example.tallerArquiRelacional.InterfaceService.IPedidoService;
import com.example.tallerArquiRelacional.Model.Pedido;
import com.example.tallerArquiRelacional.Repository.IPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService implements IPedidoService {
    @Autowired
    private IPedido data;

    @Override
    public List<Pedido> listar() {
        return data.findAll();
    }

    @Override
    public Optional<Pedido> editar(int id) {
        return data.findById(id);
    }

    @Override
    public void guardar(Pedido ped) {
        data.save(ped);
    }

    @Override
    public void eliminar(int id) {
        data.deleteById(id);
    }
}
