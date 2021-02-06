package bcb.contas;

import bcb.pessoas.Empregador;

public class ContaSalario extends Conta {

    private Empregador empregador;

    public Empregador getEmpregador() {
        return empregador;
    }

    public void setEmpregador(Empregador empregador) {
        this.empregador = empregador;
    }

   
    public void depositarValor(int x, Empregador empregador) {
        if (empregador.equals(this.empregador) && this.empregador != null){
           super.depositarValor(x);
        } else {
            System.out.println("Depósito não autorizado! Somente o empregador pode realizar depósitos.");
        }
    }

    @Override
    public void sacarValor(int x) {
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
    
}
