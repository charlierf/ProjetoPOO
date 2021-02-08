package bcb.bancos;

import bcb.utils.Codigo;
import bcb.contas.Conta;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class BancoCentral {
    private static List<Banco> bancosCadastrados = new ArrayList<>();
    private static Set<String> chavesPix = new HashSet<>();

    public static void setChavePix(String chavePix) {
        chavesPix.add(chavePix);
    }

    public static void setBanco(Banco banco) {
        bancosCadastrados.add(banco);
    }

    public static List<Banco> getBancos() {
        return bancosCadastrados;
    }

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

    public static void gerarPixAleatorio(Conta conta) {
        String uuid = UUID.randomUUID().toString();
        String chavePix = "pix-" + uuid;

        conta.setChavePix(chavePix);
        chavesPix.add(chavePix);
    }

    public static void gerarPixEmail(Conta conta) {
        String email = conta.getCliente().getEmail();

        if (!chavesPix.contains(email)) {
            chavesPix.add(email);
            conta.setChavePix(email);
        }
    }

    public static void gerarPixTelefone(Conta conta) {
        String telefone = conta.getCliente().getTelefone();

        if (!chavesPix.contains(telefone)) {
            chavesPix.add(telefone);
            conta.setChavePix(telefone);
        }
    }

    public static void pix(String chave ) {}
}
