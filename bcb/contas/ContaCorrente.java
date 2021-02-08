package bcb.contas;

import bcb.bancos.Agencia;
import bcb.bancos.Banco;
import bcb.pessoas.Cliente;

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
    public void sacarValor(double x) {
        if (super.saldo > x) {
            super.saldo -= x;

            this.datas.add(this.data);
            this.operacoes.add("    SAQUE ");
            this.valores.add(x);
            this.saldos.add(this.saldo);

        } else {
            if ((super.saldo + this.chequeEspecial) > x) {
                this.chequeEspecial -= (x - super.saldo);
                super.saldo -= x;

                this.datas.add(this.data);
                this.operacoes.add("    SAQUE ");
                this.valores.add(x);
                this.saldos.add(this.saldo);
            } else {
                System.out.println("Saldo insuficiente e não há limite no cheque especial!");
            }
        }
    }

    public ContaCorrente() {}

    public ContaCorrente(String codigo, Banco banco, Agencia agencia, Cliente cliente, int saldo,
            String[] chavePix, int taxaManutencao, int chequeEspecial) {
        super(codigo, banco, agencia, cliente, saldo, chavePix);
        this.taxaManutencao = taxaManutencao;
        this.chequeEspecial = chequeEspecial;
    }
    
}
