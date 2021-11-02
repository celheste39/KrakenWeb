package com.demoguru.prueba.steps;

import com.demoguru.prueba.models.DataInyection;
import com.demoguru.prueba.pages.PageObjects;
import com.sqasa.web.demo.utils.KrakenWeb;


public class RegistroSteps extends KrakenWeb {

   PageObjects login =new PageObjects();
    DataInyection data= new DataInyection();

    public void login(){
        configuracionesIniciales();
        abrirNavegadorEn(login);
    }
    public void escribirUsuario(){
        escribirTexto(login.textUser, data.getUsername());

    }
    public void escribirContraseña(){
        escribirTexto(login.textPassword,data.getPassword());
    }
    public void clickLogin(){
         click(login.btnLogin);
    }
    public void validacionMensaje(){
        validarPresenciaDeObjeto(login.lblWelcome);
    }
    public void clickClientePagina(){
        click(login.ClienteWebPage);
    }
    public void escribirNombre(){
        escribirTexto(login.name,data.getNombre());
    }
    public void clickGender(){
        click(login.genderClick);
    }
    public void escribirCumpleaños(){
        escribirTexto(login.birthday,data.getFechaNacimientoDia()+data.getFechaNacimientoMes()+data.getFechaNacimientoAño());
    }

    public void escribirDireccion(){
        escribirTexto(login.address,data.getDireccion());
    }
    public void escribirCiudad(){
        escribirTexto(login.city,data.getCiudad());
    }
    public void escribirEstado(){
        escribirTexto(login.state,data.getEstado());
    }
    public void escribirPin(){
        escribirTexto(login.pinno,data.getPin());
    }
    public void escribirTelefono(){
        escribirTexto(login.telephone, data.getTelefono());
    }
    public void escribirCorreo(){
        escribirTexto(login.email,data.getCorreo());
    }
    public void escribirPassword(){
        escribirTexto(login.password, data.getPassword());
    }
    public void clickEnviar(){
        click(login.submit);
    }

    public static String valueTable;

    public void idGeneradoCliente(){
        valueTable=obtenerTexto(login.clienteIDGenerado);
        System.out.println(valueTable);

    }
    public void validarMensajeClienteCreado(){
        validarPresenciaDeObjeto(login.lblClenteRegistrado);
    }
    public void clickCuentaDeLaPagina(){
        click(login.cuentaDeLaPagina);

    }
    public void crearcuenta(){
        escribirTexto(login.cuentaId,valueTable);
    }
    public void seleccionarTipoDeCuenta(){
        escribirTexto(login.tipoDeCuenta,data.getTipoDeCuenta());
    }
    public void escribirdepositoInicial(){
        escribirTexto(login.depositoInicial,data.getDepositoInicial());
    }
    public void clickSumit(){
        click(login.submi);
    }
    public void validarMensajeCuenta(){
        validarPresenciaDeObjeto(login.LblCuenta);

    }
}
