package bcb.contas;

public abstract class Conta {
    
    private String codigo;
    
    private Banco banco;
    
    private Agencia agencia;
    
    private Cliente cliente;
    
    protected int saldoConta;
    
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

    public int getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(int saldoConta) {
        this.saldoConta = saldoConta;
    }

    public String[] getChavePix() {
        return chavePix;
    }

    public void setChavePix(String[] chavePix) {
        this.chavePix = chavePix;
    }

    public void depositarValor(int x){
        this.saldoConta += x;
    }

    public abstract void sacarValor(int x);

    public abstract void obterExtrato();

    public abstract void pix(String chave, int valor);

    public void gerarPixEmail(){
        int j = 0;
        for (int i = 0; !this.chavePix[i].isEmpty() && i <= chavePix.length; i++) {
            j = i;
        }
        if (j != 6){   
        this.chavePix[j] = this.cliente.getEmail();
        }
        }
    }

    public void gerarPixTelefone(){
        int j = 0;
        for (int i = 0; !this.chavePix[i].isEmpty() && i < chavePix.length; i++) {
            j = i;
        }
        if (j != 6){   
            this.chavePix[j] = this.cliente.getTelefone();
            }
        }

        public Conta(String codigo, Banco banco, Agencia agencia, Cliente cliente, int saldoConta, String[] chavePix) {
            this.codigo = codigo;
            this.banco = banco;
            this.agencia = agencia;
            this.cliente = cliente;
            this.saldoConta = saldoConta;
            this.chavePix = chavePix;
        }
    }



    
    

    

}
