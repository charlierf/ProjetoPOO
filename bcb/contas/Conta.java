package bcb.contas;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import bcb.bancos.Agencia;
import bcb.bancos.Banco;
import bcb.pessoas.Cliente;

public abstract class Conta {

    private String codigo;

    private Banco banco;

    private Agencia agencia;

    private Cliente cliente;

    protected int saldo;

    private String[] chavesPix = new String[5];

    protected Date data = new Date();

    protected List<Date> datas = new LinkedList<Date>();

    protected List<String> operacoes = new LinkedList<String>();

    protected List<Double> valores = new LinkedList<>();

    protected List<Integer> saldos = new LinkedList<Integer>();

    public Conta() {
    }


    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

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

    public String[] getChavesPix() {
        return chavesPix;
    }

    public void setChavePix(String chavePix) {
        int total = this.chavesPix.length;

        if (total <= 4)
            this.chavesPix[total] = chavePix;
    }

    public void setChavesPix(String[] chavesPix) {
        this.chavesPix = chavesPix;
    }

    public void depositarValor(double valor) {
        this.saldo += valor;
        this.datas.add(this.data);
        this.operacoes.add(" DEPÓSITO ");
        this.valores.add(valor);
        this.saldos.add(this.saldo);
    }

    public abstract void sacarValor(double x);

    public void obterExtrato(){

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("############ Extrato da Conta ############");
        System.out.println("     DATA         OPERACAO  VALOR   SALDO");

        int i = 0;

        for (Date data : datas){
            System.out.print(sdf.format(data));
            System.out.print(" "+operacoes.get(i));
            System.out.print(" R$"+df.format(valores.get(i).floatValue()/100));
            System.out.println("  R$"+df.format(saldos.get(i).floatValue()/100));
            i++;            
        }

    };

    public Conta(String codigo, Banco banco, Agencia agencia, Cliente cliente, int saldo, String[] chavesPix) {
            this.codigo = codigo;
            this.banco = banco;
            this.agencia = agencia;
            this.cliente = cliente;
            this.saldo = saldo;
            this.chavesPix = chavesPix;
        }
} 
    

    


