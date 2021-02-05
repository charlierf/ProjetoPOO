package bcb.contas;

import java.text.SimpleDateFormat;
import java.util.Date;

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
        super.saldo += super.saldo * this.taxaRendimento;
    }
    
    @Override
    public void sacarValor(int x) {        
        if (super.saldo > x){
            super.saldo -= x;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    

    @Override
    public void obterExtrato() {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/aaaa");

        System.out.println("### Extrato da Conta ###");
        Date date = new Date();
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Data: " + sdf.format(date));

    }

    public ContaPoupanca() {
    }

    public ContaPoupanca(String codigo, Banco banco, Agencia agencia, Cliente cliente, int saldo, String[] chavePix) {
        super(codigo, banco, agencia, cliente, saldo, chavePix);
    }
    
}
