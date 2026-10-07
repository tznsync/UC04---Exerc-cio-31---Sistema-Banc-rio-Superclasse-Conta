package com.mycompany.sistemabancario;

public class ContaInvestimento extends Conta {
    private double taxaLucro;

    public double getTaxaLucro() {
        return taxaLucro;
    }

    public void setTaxaLucro(double taxaLucro) {
        this.taxaLucro = taxaLucro;
    }
    public void resgatarLucro() {
        double lucro;
        lucro = getSaldo() * getTaxaLucro();
        System.out.println(lucro);
    }
}
