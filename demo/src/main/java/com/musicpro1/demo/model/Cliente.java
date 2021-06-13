package com.musicpro1.demo.model;

//import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id;

    @Column(length = 25, nullable = false)
    private String rut;

    @Column(length = 25, nullable = false)
    private String nombre;

    @Column(length = 25, nullable = false)
    private String apellido;

    //@Column(length = 12, nullable = false)
    //private Date F_nac;

    @Column(length = 3, nullable = false)
    private String edad;

    @Column(length = 25, nullable = false)
    private String ciudad;

    @Column(length = 9, nullable = false)
    private String sexo;

    @Column(length = 50, nullable = false)
    private String correo;

    @Column(length = 12, nullable = false, unique = true)
    private String clienteid;

    public Cliente(String rut, String nombre, String apellido, String edad, String ciudad, String sexo,
            String correo, String clienteid) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ciudad = ciudad;
        this.sexo = sexo;
        this.correo = correo;
        this.clienteid = clienteid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /*public Date getF_nac() {
        return F_nac;
    }

    public void setF_nac(Date f_nac) {
        F_nac = f_nac;
    }*/

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClienteid() {
        return clienteid;
    }

    public void setClienteid(String clienteid) {
        this.clienteid = clienteid;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cliente other = (Cliente) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Cliente [apellido=" + apellido + ", ciudad=" + ciudad + ", clienteid=" + clienteid
                + ", correo=" + correo + ", edad=" + edad + ", id=" + id + ", nombre=" + nombre + ", rut=" + rut
                + ", sexo=" + sexo + "]";
    }

}