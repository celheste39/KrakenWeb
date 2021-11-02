package com.demoguru.prueba.models;
import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInyection {
    Faker faker= new  Faker (new Locale("en-US"));
    //declaración de variables
    private String username,password, nombre, fechaNacimientoDia, fechaNacimientoMes, fechaNacimientoAño, direccion, ciudad, estado, pin, telefono, correo, tipoDeCuenta,depositoInicial;

    public DataInyection(){
        this.username="mngr361604";
        this.password="tYzaqem";
        this.nombre=faker.name().firstName();
        this.fechaNacimientoDia=Integer.toString(faker.number().numberBetween(1,30));
        this.fechaNacimientoMes=Integer.toString(faker.number().numberBetween(1,12));
        this.fechaNacimientoAño=Integer.toString(faker.number().numberBetween(1930,2021));
        this.direccion="Carrera 23 N 48 63";
        this.ciudad=faker.address().city();
        this.estado=faker.address().state();
        this.pin=Long.toString(faker.number().randomNumber(6,true));
        this.telefono="6042563";
        this.correo=faker.internet().emailAddress();


        //informacion de la Nueva cuenta
        this.tipoDeCuenta="Savings";
        this.depositoInicial=Long.toString(faker.number().randomNumber(9,true));


    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaNacimientoDia() {
        return fechaNacimientoDia;
    }

    public String getFechaNacimientoMes() {
        return fechaNacimientoMes;
    }

    public String getFechaNacimientoAño() {
        return fechaNacimientoAño;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public String getPin() {
        return pin;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTipoDeCuenta() {
        return tipoDeCuenta;
    }

    public String getDepositoInicial() {
        return depositoInicial;
    }
}
