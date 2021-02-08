package bcb.operacoes;

import bcb.bancos.Agencia;
import bcb.bancos.Banco;
import bcb.bancos.BancoCentral;

public class MontanteAgencia {
    public static double executar(String codigoBanco, String codigoAgencia) {
        Banco banco = BancoCentral.getBanco(codigoBanco);
        Agencia agencia = banco.getAgencia(codigoAgencia);

        return agencia.calculaSaldo();
    } 
}
