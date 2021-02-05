package bcb.contas;

public class ContaCorrente extends Conta {

    private int taxaManutencao;

    private int chequeEspecial;

    public ContaCorrente(){}    


    public int getTaxaManutencao() {
        return taxaManutencao;
    }

    public void setTaxaManutencao(int taxaManutencao) {
        this.taxaManutencao = taxaManutencao;
    }

    public int public int getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(int chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
    
    @Override
    public void sacarValor(int x) {
         if (super.saldoConta > x){
            super.saldoConta -= x;
         } else {
             if ((super.saldoConta + this.chequeEspecial) > x){
                 this.chequeEspecial -= (x - super.saldoConta);
                 super.saldoConta = 0;
             } else {
                 System.out.println("Saldo insuficiente e não há limite no cheque especial!");
             }
         }
    }
    
    @Override
    public void obterExtrato() {
        // TODO Auto-generated method stub

    }

    @Override
    public void pix(String chave, int valor) {
        // TODO Auto-generated method stub

    }

    public ContaCorrente() {
    }

    public ContaCorrente(String codigo, Banco banco, Agencia agencia, Cliente cliente, int saldoConta,
            String[] chavePix, int taxaManutencao, int chequeEspecial) {
        super(codigo, banco, agencia, cliente, saldoConta, chavePix);
        this.taxaManutencao = taxaManutencao;
        this.chequeEspecial = chequeEspecial;
    }
    
}
