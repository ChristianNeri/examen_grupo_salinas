package com.examen.crud;

import com.examen.crud.modelo.cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientesRepository extends JpaRepository<cliente,Long>{
    @Query("SELECT c FROM cliente c WHERE c.correo=?1")
    Optional<cliente> findByEmail(String correo);
}//clientesRepository
