package bcb.operacoes;

import bcb.bancos.Agencia;
import bcb.bancos.Banco;
import bcb.bancos.BancoCentral;
import bcb.contas.Conta;

public class SaldoCliente {
    public static double executar(String codigoBanco, String codigoAgencia, String codigoConta) {
        Banco banco = BancoCentral.getBanco(codigoBanco);
        Agencia agencia = banco.getAgencia(codigoAgencia);
        Conta conta = agencia.getConta(codigoConta);
        
        return conta.getSaldo();
    }
}
