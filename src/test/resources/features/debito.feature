# language: es
Característica: Debito de fondos

  Escenario: Caja de ahorro con saldo suficiente
    Dado que mi caja de ahorro tiene un saldo de "100" pesos
    Cuando cuando debito "50" pesos
    Entonces el saldo final es de "50" pesos

  Escenario: Caja de ahorro sin saldo suficiente
    Dado que mi caja de ahorro tiene un saldo de "10" pesos
    Cuando cuando debito "20" pesos
    Entonces la operacion es rechazada y el saldo final es "10" pesos