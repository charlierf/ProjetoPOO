package bcb.utils;

import bcb.bancos.Agencia;
import bcb.bancos.Banco;
import bcb.bancos.BancoCentral;
import bcb.contas.Conta;
import bcb.contas.ContaCorrente;
import bcb.pessoas.Cliente;
import bcb.pessoas.Empregador;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Dados {
    public static BufferedReader abrirLeitura(String nomeArq) {
        try {
            String sep = System.getProperty("file.separator");
            String arquivo = "bcb" + sep + "dados" + sep + nomeArq;
            BufferedReader arq = new BufferedReader(new FileReader(arquivo));

            return arq;
        } catch (Exception e) {
            System.out.printf("Erro ao abrir arquivo: %s", e.getMessage());

            return null;
        }
    }

    public static void carregarBancos() {
        try {
            BufferedReader arq = abrirLeitura("bancos.txt");
            String line = arq.readLine();

            while (line != null) {
                StringTokenizer stk = new StringTokenizer(line, ";");
                Banco banco = new Banco();
                List<Agencia> agencias = new ArrayList<Agencia>();
                
                banco.setCodigo(stk.nextToken());
                banco.setNome(stk.nextToken());
                banco.setAgencias(agencias);

                BancoCentral.setBanco(banco);

                line = arq.readLine();
            }

            arq.close();
        } catch (Exception e) {
            System.out.printf("%s", e.getMessage());
        }
    }

    public static void carregarAgencias(Banco banco) {
        try {
            BufferedReader arq = abrirLeitura("agencias.txt");
            String line = arq.readLine();

            while (line != null) {
                StringTokenizer stk = new StringTokenizer(line, ";");
                Agencia agencia = new Agencia();
                List<Conta> contas = new ArrayList<Conta>();

                agencia.setCodigo(stk.nextToken());
                agencia.setNome(stk.nextToken());
                agencia.setContas(contas);

                String codigo = stk.nextToken();

                if (banco.getCodigo().equals(codigo)) {
                    agencia.setBanco(banco);
                    banco.setAgencia(agencia);
                }
                    
                line = arq.readLine();
            }

            arq.close();
        } catch (Exception e) {
            System.out.printf("%s", e.getMessage());
        }
    }

    public static void carregarContas(Agencia agencia) {

    }

    public static void carregarChavesPix(Conta conta) {
        try {
            BufferedReader arq = abrirLeitura("chavesPix.txt");
            String line = arq.readLine();

            while (line != null) {
                StringTokenizer stk = new StringTokenizer(line, ";");
                String chavePix = stk.nextToken();
                String codigoConta = stk.nextToken();

                if (codigoConta.equals(conta.getCodigo())) {
                    conta.setChavePix(chavePix);
                    BancoCentral.setChavePix(chavePix, conta);
                }

                line = arq.readLine();
            }

            arq.close();
        } catch (Exception e) {
            System.out.printf("%s", e.getMessage());
        }
    }

    public static void carregarClientes() {
        try {
            BufferedReader arq = abrirLeitura("clientes.txt");
            String line = arq.readLine();

            while (line != null) {
                StringTokenizer stk = new StringTokenizer(line, ";");
                Cliente cliente = new Cliente();
                Empregador empregador = new Empregador();

                cliente.setNome(stk.nextToken());
                cliente.setEmail(stk.nextToken());
                cliente.setTelefone(stk.nextToken());
                empregador.setNome(stk.nextToken());
                cliente.setEmpregador(empregador);

                line = arq.readLine();
            }

            arq.close();
        } catch (Exception e) {
            System.out.printf("%s", e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        /* carregarBancos();
        
        for (Banco banco : BancoCentral.getBancos()) {
            carregarAgencias(banco);
        } */
        ContaCorrente conta = new ContaCorrente();
        conta.setCodigo("fnoeiafoe");

        carregarChavesPix(conta);

        for (String chave : conta.getChavesPix()) {
            System.out.printf("%s\n", chave);
        }
    }
}
