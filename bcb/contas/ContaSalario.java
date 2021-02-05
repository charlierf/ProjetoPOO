package bcb.contas;

import java.text.SimpleDateFormat;
import java.util.Date;

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
        if (empregador.equals(this.empregador)){
           super.depositarValor(x);
        }
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

    


    
}
