package com.example.tallerArquiRelacional.Repository;

import com.example.tallerArquiRelacional.Model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPedido extends JpaRepository<Pedido, Integer> {
}
