package com.example.tallerArquiRelacional.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
@Table(name = "pedidos")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPedido;

    private Date fechaPedido;
    private Date fechaEntrega;

    private String productos;

    private double precio;

    private String direccion;

    private String ciudad;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
}
