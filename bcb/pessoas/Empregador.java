package bcb.pessoas;

import java.util.ArrayList;
import java.util.List;

public class Empregador extends Pessoa {
    private List<Cliente> empregados;

    public Empregador() {}

    public Empregador(String nome) {
        List<Cliente> empregados = new ArrayList<>();

        this.setNome(nome);
        this.setEmpregados(empregados);
    }

    public void setEmpregados(List<Cliente> empregados) {
        this.empregados = empregados;
    }

    public void setEmpregado(Cliente cliente) {
        this.empregados.add(cliente);
    }

    public List<Cliente> getEmpregados() {
        return empregados;
    }

    /* public void cadastrarEmpregado(String nome) {
        
    } */
}
