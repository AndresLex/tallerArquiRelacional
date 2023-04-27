package com.example.tallerArquiRelacional.Model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
@Table(name = "pedidos")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPedido;

    private Date fecha;

    private String nombre;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
}
