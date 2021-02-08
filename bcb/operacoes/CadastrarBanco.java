package bcb.operacoes;

import bcb.bancos.BancoCentral;

public class CadastrarBanco {
    public static void executar(String nome) {
        BancoCentral.cadastrarBanco(nome);
    }
}
