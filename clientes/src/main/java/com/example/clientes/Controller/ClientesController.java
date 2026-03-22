package com.example.clientes.Controller;

import com.example.clientes.Model.ClientesModel;
import com.example.clientes.Service.ClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/clientes")
public class ClientesController {

    @Autowired
    private ClientesService clientesService;

    @GetMapping
    public List<ClientesModel> findAll(){
        return clientesService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<ClientesModel> buscarPorId(@PathVariable Long id){
        return clientesService.buscarPorId(id);
    }

    @PostMapping
    public ClientesModel criarCliente(@RequestBody ClientesModel cliente){
        return clientesService.criarCliente(cliente);
    }

    @DeleteMapping("/{id}")
    public void deletarCliente(@PathVariable Long id){
        clientesService.deletarCliente(id);
    }
}