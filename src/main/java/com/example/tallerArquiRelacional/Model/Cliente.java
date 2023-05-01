package com.example.tallerArquiRelacional.Model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCliente;

    private String nombre;

    private String apellido;

    private String direccion;

    private String ciudad;

    private String pais;

    private int telefono;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Pedido> pedidos;
}
