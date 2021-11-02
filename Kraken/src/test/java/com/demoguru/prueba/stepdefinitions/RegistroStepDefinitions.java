package com.demoguru.prueba.stepdefinitions;

import com.demoguru.prueba.steps.RegistroSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RegistroStepDefinitions {
    @Steps
    RegistroSteps registroSteps;

    @Given("^que ingreso a la pagina de demoguru$")
    public void que_ingreso_a_la_pagina_de_demoguru() {
        registroSteps.login();


    }

    @When("^digito los nuevos datos$")
    public void digito_los_nuevos_datos() {
        registroSteps.escribirUsuario();
        registroSteps.escribirContraseña();
        registroSteps.clickLogin();

    }

    @Then("^se valida mensaje de Bienvenida$")
    public void seValidaMensajeDeBienvenida() {
       registroSteps.validacionMensaje();
    }

    @When("^ingresa los datos del cliente$")
    public void ingresa_los_datos_del_cliente() {
        registroSteps.clickClientePagina();
        registroSteps.escribirNombre();
        registroSteps.clickGender();
        registroSteps.escribirCumpleaños();
        registroSteps.escribirDireccion();
        registroSteps.escribirCiudad();
        registroSteps.escribirEstado();
        registroSteps.escribirPin();
        registroSteps.escribirTelefono();
        registroSteps.escribirCorreo();
        registroSteps.escribirPassword();
        registroSteps.clickEnviar();
        registroSteps.idGeneradoCliente();

    }

    @Then("^valida el nuevo cliente$")
    public void valida_el_nuevo_cliente() {
        registroSteps.validarMensajeClienteCreado();



    }
    @When("^digita los datos de la nueva cuenta$")
    public void digitaLosDatosDeLaNuevaCuenta() {
        registroSteps.clickCuentaDeLaPagina();
        registroSteps.crearcuenta();
        registroSteps.seleccionarTipoDeCuenta();
        registroSteps.escribirdepositoInicial();
        registroSteps.clickSumit();


    }

    @Then("^Se valida la informacion de la nueva cuenta$")
    public void seValidaLaInformacionDeLaNuevaCuenta() {
        registroSteps.validarMensajeCuenta();


    }
}
