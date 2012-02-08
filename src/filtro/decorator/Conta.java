package filtro.decorator;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Pedro Henrique
 */
class Conta {
    private String titular;
    private String agencia;
    private String numero;
    private Calendar dataAbertura;
    private double saldo;

    public Conta(String titular, String agencia, String numero, double saldo, Calendar dataAbertura) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
        this.dataAbertura = dataAbertura;
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
    
	public Calendar getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Calendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return "Conta [agencia=" + agencia + ", numero=" + numero
				+ ", titular=" + titular + ", dataAbertura=" + sdf.format(dataAbertura.getTime())
				+ ", saldo=" + saldo + "]";
	}
    
    
}
