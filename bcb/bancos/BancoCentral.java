package bcb.bancos;

import bcb.utils.Codigo;
import bcb.contas.Conta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.Map;

public class BancoCentral {
    private static List<Banco> bancosCadastrados = new ArrayList<>();
    private static Map<String, Conta> chavesPix = new HashMap<>();
    //private static Set<String> chavesPix = new HashSet<>();

    public static void setChavePix(String chavePix, Conta conta) {
        chavesPix.put(chavePix, conta);
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

    public static void cadastrarBanco(String nome) {
        Banco novoBanco = new Banco(nome);
        
        bancosCadastrados.add(novoBanco);
    }

    public static void gerarPixAleatorio(Conta conta) {
        String uuid = UUID.randomUUID().toString();
        String chavePix = "pix-" + uuid;

        conta.setChavePix(chavePix);
        //chavesPix.add(chavePix);
    }

    public static void gerarPixEmail(Conta contaUsuario) {
        String email = contaUsuario.getCliente().getEmail();
        Conta conta = chavesPix.get(email);

        if (conta == null) {
            chavesPix.put(email, contaUsuario);
            contaUsuario.setChavePix(email);
        }

        /* if (!chavesPix.contains(email)) {
            chavesPix.add(email);
            conta.setChavePix(email);
        } */
    }

    public static void gerarPixTelefone(Conta contaUsuario) {
        String telefone = contaUsuario.getCliente().getTelefone();
        Conta conta = chavesPix.get(telefone);

        if (conta == null) {
            chavesPix.put(telefone, contaUsuario);
            contaUsuario.setChavePix(telefone);
        }
    }

    public static void pix(String chaveUsuario, String chaveDestino, double valor) {
        Conta contaUsuario = chavesPix.get(chaveUsuario);
        Conta contaDestino = chavesPix.get(chaveDestino);

        if (contaUsuario != null && contaDestino != null) {
            contaDestino.depositarValor(valor);
        }
    }
    
}
