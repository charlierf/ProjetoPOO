package bcb.bancos;

import java.util.ArrayList;
import java.util.List;

import bcb.utils.Codigo;

public class Banco {
    private String codigo;
    private String nome;
    private List<Agencia> agencias;

    public Banco() {}

    public Banco(String nome) {
        List<Agencia> agencias = new ArrayList<>();

        this.setCodigo(Codigo.gerarCodigo());
        this.setNome(nome);
        this.setAgencias(agencias);
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

    public void setAgencias(List<Agencia> agencias) {
        this.agencias = agencias;
    }

    public void setAgencia(Agencia agencia) {
        this.agencias.add(agencia);
    }

    public List<Agencia> getAgencias() {
        return agencias;
    }

    public Agencia getAgencia(String codigo) {
        for (Agencia agencia : this.agencias) {
            if (agencia.getCodigo().equals(codigo))
                return agencia;
        }

        return null;
    }

    public double calculaSaldo() {
        double saldoTotal = 0;

        for (Agencia agencia : this.agencias) {
            saldoTotal += agencia.calculaSaldo();
        }

        return saldoTotal;
    }

    public void cadastrarAgencia(String nome, String codigoBanco) {
        Banco banco = BancoCentral.getBanco(codigoBanco);
        Agencia novaAgencia = new Agencia(nome, banco);

        this.agencias.add(novaAgencia);


    }
}
