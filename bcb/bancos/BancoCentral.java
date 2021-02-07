package bcb.bancos;

import java.util.ArrayList;
import java.util.List;

public class BancoCentral {
    private static List<Banco> bancosCadastrados = new ArrayList<>();
    private static List<String> chavesPix = new ArrayList<>();

    public static Banco getBanco(String codigo) {
        for (Banco banco : bancosCadastrados) {
            if (banco.getCodigo().equals(codigo))
                return banco;
        }

        return null;
    }

    public static boolean confereChavePixRepetida(String chavePix) {
        for (String chave : chavesPix) {
            if (chave.equals(chavePix))
                return true;
        }

        return false;
    }

    public static void cadastrarBanco(String nome) {
        Banco novoBanco = new Banco(nome);
        
        bancosCadastrados.add(novoBanco);
    }

    public static void gerarPixAleatorio() {}

    public static void gerarPixEmail() {}

    public static void gerarPixTelefone() {}

    public static void pix() {}
}
