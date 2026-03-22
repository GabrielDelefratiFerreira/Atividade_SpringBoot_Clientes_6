package com.example.clientes.Repository;

import com.example.clientes.Model.ClientesModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRepository extends JpaRepository<ClientesModel, Long> {
}
