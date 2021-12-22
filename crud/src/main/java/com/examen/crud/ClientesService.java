package com.examen.crud;

import com.examen.crud.ClientesRepository;
import com.examen.crud.modelo.cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ClientesService {
   private final ClientesRepository clientesRepository;
    @Autowired
    public ClientesService(ClientesRepository clientesRepository) {
        this.clientesRepository = clientesRepository;
    }//constructor

    public List<cliente> getAllClientes(){
        return clientesRepository.findAll();
    }//GetAllClientes

    public cliente getCliente(Long id){
        return clientesRepository.findById(id).orElseThrow(()-> new IllegalStateException("El cliente con el id [" + id + "] no existe"));
    }//getCliente

    public void deleteCliente(Long id){
        if (clientesRepository.existsById(id)){
            clientesRepository.deleteById(id);
        }else {
            throw new IllegalStateException("El usuario con el id [" + id + "] no existe" );
        }
    }//deleteCliente

    public void addCliente(cliente cliente){
        Optional<cliente> clienteByCorreo = clientesRepository.findByEmail(cliente.getCorreo());
        if (clienteByCorreo.isPresent()){
            throw new IllegalStateException("El usuario con el email [" +cliente.getCorreo() + "] ya existe");
        }//isPresent
        clientesRepository.save(cliente);
    }//addCliente

    @Transactional
    public void updateCliente(Long id, String nombre, String correo){
        cliente clte = clientesRepository.findById(id).orElseThrow(() -> new IllegalStateException("El usuario con el id [" + id + "] no existe"));

        if (nombre !=null)
            if ((!nombre.isEmpty()) && (! nombre.equals(clte.getNombre()))){
                clte.setNombre(nombre);
            }//updateNombre

        if (correo !=null)
            if ((!correo.isEmpty()) && (! correo.equals(clte.getCorreo()))){
                clte.setCorreo(correo);
            }//updateCorreo
    }

}//class ClientesService
