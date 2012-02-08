package conta.state;

class Conta {
    private String agencia;
    private String numero;
    private double saldo;
    private EstadoDaConta estado;

    public Conta() {
        this.estado = new Positiva();
	}

	public Conta(String agencia, String numero, double saldo) {
        this();
		this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

	public EstadoDaConta getEstado() {
		return estado;
	}

	public void setEstado(EstadoDaConta estado) {
		this.estado = estado;
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
    
    protected void setSaldo(double valor){
    	this.saldo = valor;
    }
    
    public void deposita(double valor) {
        estado.deposita(this, valor);
    }

    public void saque(double valor) {
    	estado.saque(this, valor);
    }
    
	@Override
	public String toString() {
		return "Conta [agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + ", estado=" + estado + "]";
	}
    
    
}
