package bcb.operacoes;

import bcb.bancos.Banco;
import bcb.bancos.BancoCentral;

public class MontanteBanco {
    public static double executar(String codigoBanco) {
        Banco banco = BancoCentral.getBanco(codigoBanco);

        return banco.calculaSaldo();
    }
}
