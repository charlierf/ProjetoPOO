package bcb.contas;

import bcb.bancos.Agencia;
import bcb.bancos.Banco;
import bcb.pessoas.Cliente;

public abstract class Conta {
    
    private String codigo;
    
    private Banco banco;
    
    private Agencia agencia;
    
    private Cliente cliente;
    
    protected int saldo;
    
    private String [] chavePix = new String[5];

    public Conta(){}

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String[] getChavePix() {
        return chavePix;
    }

    public void setChavePix(String[] chavePix) {
        this.chavePix = chavePix;
    }

    public void depositarValor(int x){
        this.saldo += x;
    }

    public abstract void sacarValor(int x);

    public abstract void obterExtrato();

    public Conta(String codigo, Banco banco, Agencia agencia, Cliente cliente, int saldo, String[] chavePix) {
            this.codigo = codigo;
            this.banco = banco;
            this.agencia = agencia;
            this.cliente = cliente;
            this.saldo = saldo;
            this.chavePix = chavePix;
        }
} 
    

    


