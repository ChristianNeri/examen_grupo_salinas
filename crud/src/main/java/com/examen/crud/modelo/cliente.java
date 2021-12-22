package com.examen.crud.modelo;


import javax.persistence.*;

@Entity
@Table(name="clientes")
public class cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_clientes", unique = true, nullable = false)
    private Long id;
    private String nombre;
    private String correo;

    public cliente(Long id, String nombre, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
    }//constructor

    public cliente(){}

    public Long getId() {
        return id;
    }//getId

    public void setId(Long id) {
        this.id = id;
    }//setId

    public String getNombre() {
        return nombre;
    }//getNombre

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }//setNombre

    public String getCorreo() {
        return correo;
    }//getCorreo

    public void setCorreo(String correo) {
        this.correo = correo;
    }//setCorreo
}//class cliente
