package com.mycompany.sistemabancario;

public class ContaCorrente extends Conta {
    private double taxaManutencao;

    public double getTaxaManutencao() {
        return taxaManutencao;
    }

    public void setTaxaManutencao(double taxaManutencao) {
        this.taxaManutencao = taxaManutencao;
    }
    public void descontarTaxa() {
        double saldoNovo;
        saldoNovo = getSaldo() - getTaxaManutencao();
        System.out.println(saldoNovo);
                
    }
}
