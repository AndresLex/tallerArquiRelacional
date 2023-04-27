package com.example.tallerArquiRelacional.InterfaceService;

import com.example.tallerArquiRelacional.Model.Cliente;

import java.util.List;
import java.util.Optional;

public interface IClienteService {
    public List<Cliente> listar();

    public Optional<Cliente> editar(int id);

    public void guardar(Cliente cli);

    public void eliminar(int id);
}
