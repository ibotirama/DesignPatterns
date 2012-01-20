package relatoriotemplate;

/**
 *
 * @author Pedro Henrique
 */
class Conta {
    private Banco banco;
    private String titular;
    private String agencia;
    private String numero;
    private double saldo;

    public Conta(String titular, String agencia, String numero, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double saldo) {
        this.saldo += saldo;
    }

    public void saque(double saldo) {
        if (saldo <= this.saldo){
            this.saldo -= saldo;
        }
        else{
            System.out.println("Saldo da conta é menor que o valor solicitado.(Cabe exception aqui)");
        }
            
    }
}
