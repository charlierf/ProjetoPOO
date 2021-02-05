package bcb.testes;

import bcb.contas.Conta;
import bcb.contas.ContaCorrente;

public class testeConta {
    
    private static Conta contaCorrente = new ContaCorrente();

    public static void main(String[] args) {
        contaCorrente.obterExtrato();
    }


}
