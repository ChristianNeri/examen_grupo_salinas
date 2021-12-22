package com.examen.crud.controller;

import com.examen.crud.ClientesService;
import com.examen.crud.modelo.cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes/")
public class ClientesController {
    private final ClientesService clientesService;
    @Autowired
    public ClientesController(ClientesService clientesService) {
        this.clientesService = clientesService;
    }//constructor

    @GetMapping // /api/clientes/
    public List<cliente> getAllClientes(){
        return clientesService.getAllClientes();
    }//getAllClientes

    @GetMapping (path = "{id}") // /api/clientes/n  n= numero de id
    public cliente getCliente(@PathVariable("id") Long id){
        return clientesService.getCliente(id);
    }//getCliente

    @PostMapping
    public void addCliente(@RequestBody cliente cliente){
        clientesService.addCliente(cliente);
    }//addCliente

    @DeleteMapping(path = "{id}")
    public void deleteCliente(@PathVariable("id") Long id){
        clientesService.deleteCliente(id);
    }

    @PutMapping (path = "{id}")
    public void updateCliente(@PathVariable("id") Long id,
                              @RequestParam(required = true) String nombre,
                              @RequestParam(required = true) String correo){
        clientesService.updateCliente(id,nombre,correo);
    }//updateCLiente

}//classClientesController
