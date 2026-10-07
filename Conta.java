
package com.mycompany.sistemabancario;

public class Conta {
    private String numeroConta;
    private String titular;
    private double saldo;
    private double valor = 0;

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setDeposito() {
        valor = valor + saldo;
    }
    
    public double getDeposito( ) {
        return this.valor; 
    }
    public void exibirSaldo() {
        System.out.println("Numero da Conta: "+getNumeroConta()+
                "\n" + "Titular: " + getTitular()+
                "\n" + "Saldo: " + getSaldo());
}
}