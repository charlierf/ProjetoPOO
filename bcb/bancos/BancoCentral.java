package bcb.bancos;

import bcb.utils.Codigo;
import bcb.contas.Conta;
import bcb.contas.ContaCorrente;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BancoCentral {
    private static List<Banco> bancosCadastrados = new ArrayList<>();
    private static Map<String, Conta> chavesPix = new HashMap<>();

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
        String chavePix = Codigo.gerarCodigo20Linhas();

        conta.setChavePix(chavePix);
    }

    public static void gerarPixEmail(Conta contaUsuario) {
        String email = contaUsuario.getCliente().getEmail();
        Conta conta = chavesPix.get(email);

        if (conta == null) {
            chavesPix.put(email, contaUsuario);
            contaUsuario.setChavePix(email);
        }
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
    
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        
        gerarPixAleatorio(conta);

        System.out.println(conta.getCodigo());
        System.out.println(conta.getChavesPix()[0]);
    }
}
