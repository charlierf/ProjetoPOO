package bcb.pessoas;

import bcb.contas.Conta;

import java.util.List;

public class Cliente extends Pessoa {
    private String email;
    private String telefone;
    private List<Conta> contas;

    public Cliente() {}
    
    public Cliente(String nome, String email, String telefone) {
        this.setNome(nome);
        this.setEmail(email);
        this.setTelefone(telefone);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
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
}
