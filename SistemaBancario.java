package com.mycompany.sistemabancario;

public class SistemaBancario {

    public static void main(String[] args) {
        ContaPoupanca cp1 = new ContaPoupanca();
        cp1.setNumeroConta("AAA-000");
        cp1.setTitular("Joao");
        cp1.setSaldo(5000);
        cp1.setTaxaDeRendimento(2);
        cp1.aplicarRendimento();
        cp1.exibirSaldo();
        
        ContaCorrente cc1 = new ContaCorrente();
        cc1.setNumeroConta("BBB-111");
        cc1.setTitular("Herminio");
        cc1.setSaldo(1200);
        cc1.setTaxaManutencao(15);
        cc1.descontarTaxa();
        cc1.exibirSaldo();
        
        ContaInvestimento ci = new ContaInvestimento();
        ci.setNumeroConta("CCC-222");
        ci.setTitular("Lazaro");
        ci.setSaldo(10000);
        ci.setTaxaLucro(5);
        ci.resgatarLucro();
        ci.exibirSaldo();
    }
}
