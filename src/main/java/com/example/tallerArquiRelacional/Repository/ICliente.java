package com.example.tallerArquiRelacional.Repository;

import com.example.tallerArquiRelacional.Model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICliente extends JpaRepository<Cliente, Integer> {
}
