package bcb.bancos;

import java.util.ArrayList;
import java.util.List;

import bcb.contas.Conta;
import bcb.pessoas.Cliente;
import bcb.utils.Codigo;

public class Agencia {
    private String codigo;
    private String nome;
    private Banco banco;
    private List<Conta> contas;
    private List<Cliente> clientes;

    public Agencia() {}

    public Agencia(String nome, Banco banco) {
        List<Conta> contas = new ArrayList<>();
        
        this.setCodigo(Codigo.gerarCodigo());
        this.setNome(nome);
        this.setBanco(banco);
        this.setContas(contas);
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void setConta(Conta conta) {
        this.contas.add(conta);
    }

    public List<Conta> getContas() {
        return contas;
    }

    public Conta getConta(String codigo) {
        for (Conta conta : this.contas) {
            if (conta.getCodigo().equals(codigo))
                return conta;
        }

        return null;
    }

    public void setCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public double calculaSaldo() {
        double saldoTotal = 0;

        for (Conta conta : this.contas) {
            saldoTotal += conta.getSaldo();
        }

        return saldoTotal;
    }   

    public void cadastrarConta() {
        
    }
}