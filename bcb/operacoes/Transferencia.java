package bcb.operacoes;

import bcb.bancos.BancoCentral;

public class Transferencia {
    public static void executar(String pixUsuario, String pixDestino, double valor) {
        BancoCentral.pix(pixUsuario, pixDestino, valor);
    }
}