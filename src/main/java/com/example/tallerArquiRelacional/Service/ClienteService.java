/*Elaborado por: Andres Leonardo Camargo Cortes*/
package com.example.tallerArquiRelacional.Service;

import com.example.tallerArquiRelacional.InterfaceService.IClienteService;
import com.example.tallerArquiRelacional.Model.Cliente;
import com.example.tallerArquiRelacional.Repository.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService implements IClienteService {
    @Autowired
    private ICliente data;

    @Override
    public List<Cliente> listar() {
        return data.findAll();
    }

    @Override
    public Optional<Cliente> editar(int id) {
        return data.findById(id);
    }

    @Override
    public void guardar(Cliente cli) {
        data.save(cli);
    }

    @Override
    public void eliminar(int id) {
        data.deleteById(id);
    }
}
