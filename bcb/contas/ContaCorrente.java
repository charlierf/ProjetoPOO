package bcb.contas;

import java.util.Date;

import java.text.SimpleDateFormat;

public class ContaCorrente extends Conta {

    private int taxaManutencao;

    private int chequeEspecial;

    public int getTaxaManutencao() {
        return taxaManutencao;
    }

    public void setTaxaManutencao(int taxaManutencao) {
        this.taxaManutencao = taxaManutencao;
    }

    public int getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(int chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
    
    @Override
    public void sacarValor(int x) {
         if (super.saldo > x){
            super.saldo -= x;
         } else {
             if ((super.saldo + this.chequeEspecial) > x){
                 this.chequeEspecial -= (x - super.saldo);
                 super.saldo = 0;
             } else {
                 System.out.println("Saldo insuficiente e não há limite no cheque especial!");
             }
         }
    }
    
    @Override
    public void obterExtrato() {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("### Extrato da Conta ###");
        Date date = new Date();
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Data: " + sdf.format(date));

    }

    public ContaCorrente() {}

    public ContaCorrente(String codigo, Banco banco, Agencia agencia, Cliente cliente, int saldo,
            String[] chavePix, int taxaManutencao, int chequeEspecial) {
        super(codigo, banco, agencia, cliente, saldo, chavePix);
        this.taxaManutencao = taxaManutencao;
        this.chequeEspecial = chequeEspecial;
    }
    
}
