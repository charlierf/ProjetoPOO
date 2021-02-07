package bcb.bancos;

import java.util.ArrayList;
import java.util.List;

import bcb.contas.Conta;

public class Agencia {
    private String codigo;
    private String nome;
    private Banco banco;
    private List<Conta> contas;
    private double saldo;

    public Agencia() {}

    public Agencia(String nome, Banco banco) {
        List<Conta> contas = new ArrayList<>();
        
        this.setCodigo("fieoafieofjiaoef");
        this.setNome(nome);
        this.setBanco(banco);
        this.setContas(contas);
        this.setSaldo(0.0);
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

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
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