package bcb.contas;

import java.util.Date;

import bcb.bancos.Agencia;
import bcb.bancos.Banco;
import bcb.pessoas.Cliente;

public class ContaPoupanca extends Conta {

    private Date aniversario = new Date();

    private int taxaRendimento;
    
    public int getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(int taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public Date getAniversario() {
        return aniversario;
    }

    public void setAniversario(Date aniversario) {
        this.aniversario = aniversario;
    }

    public void aplicarRendimento(){
        this.saldo += this.saldo * this.taxaRendimento;
    }
    
    @Override
    public void sacarValor(double x) {        
        if (this.saldo > x){
            this.saldo -= x;
            this.datas.add(this.data);
            this.operacoes.add("    SAQUE ");
            this.valores.add(x);
            this.saldos.add(this.saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    
   
    public ContaPoupanca() {
    }

    public ContaPoupanca(Banco banco, Agencia agencia, Cliente cliente, int saldo, String[] chavePix) {
        super(banco, agencia, cliente, saldo, chavePix);
    }
    
}
