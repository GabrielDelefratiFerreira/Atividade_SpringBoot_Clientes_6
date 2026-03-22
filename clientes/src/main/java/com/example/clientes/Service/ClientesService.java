package com.example.clientes.Service;

import com.example.clientes.Model.ClientesModel;
import com.example.clientes.Repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientesService {

    @Autowired
    private ClientesRepository clientesRepository;

    public List<ClientesModel> findAll(){
        return clientesRepository.findAll();
    }

    public Optional<ClientesModel> buscarPorId(Long id){
        return clientesRepository.findById(id);
    }

    public ClientesModel criarCliente(ClientesModel cliente){
        return clientesRepository.save(cliente);
    }

    public void deletarCliente(Long id){
        clientesRepository.deleteById(id);
    }
}