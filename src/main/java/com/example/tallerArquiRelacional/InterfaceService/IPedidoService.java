package com.example.tallerArquiRelacional.InterfaceService;

import com.example.tallerArquiRelacional.Model.Pedido;

import java.util.List;
import java.util.Optional;

public interface IPedidoService {
    public List<Pedido> listar();

    public Optional<Pedido> editar(int id);

    public void guardar(Pedido ped);

    public void eliminar(int id);
}
