package com.mycompany.sistemabancario;

public class ContaPoupanca extends Conta {
    private double taxaDeRendimento;

    public double getTaxaDeRendimento() {
        return taxaDeRendimento;
    }

    public void setTaxaDeRendimento(double taxaDeRendimento) {
        this.taxaDeRendimento = taxaDeRendimento;
    }
    public void aplicarRendimento() {
        double saldoNovo;
        saldoNovo = getSaldo() * getTaxaDeRendimento();
        System.out.println(saldoNovo);
    }
}
