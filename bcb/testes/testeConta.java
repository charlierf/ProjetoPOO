package bcb.testes;

import bcb.contas.Conta;
import bcb.contas.ContaCorrente;
import bcb.contas.ContaPoupanca;
import bcb.contas.ContaSalario;
import bcb.pessoas.Empregador;

public class testeConta {
    


    public static void main(String[] args) {
       
        Conta contaCorrente = new ContaCorrente();

        Conta contaPoupanca = new ContaPoupanca();

        Conta contaSalario = new ContaSalario();

        Empregador e = new Empregador("Exemplo");

        ((ContaSalario) contaSalario).setEmpregador(e);

        ((ContaSalario) contaSalario).depositarValor(1000, e);

        contaSalario.sacarValor(500);

        contaPoupanca.depositarValor(2000);
        
        contaPoupanca.sacarValor(1241);

        contaPoupanca.depositarValor(115);

        contaPoupanca.sacarValor(333);
        
        contaCorrente.depositarValor(100);

        contaCorrente.depositarValor(10);

        contaCorrente.sacarValor(5);

        contaCorrente.sacarValor(5);
        
        contaCorrente.obterExtrato();

        contaPoupanca.obterExtrato();

        contaSalario.obterExtrato();
    }


}
