Feature: Demoguru

  Background: Login

    Given que ingreso a la pagina de demoguru
    When digito los nuevos datos
    Then  se valida mensaje de Bienvenida
  @Usuario
  Scenario: registro creacion de un nuevo cliente
    When ingresa los datos del cliente
    Then valida el nuevo cliente

  @NuevaCuenta
  Scenario: registro la creacion de una nueva cuenta
    When digita los datos de la nueva cuenta
    Then Se valida la informacion de la nueva cuenta