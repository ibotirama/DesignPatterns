package relatoriotemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Pedro Henrique 
 */
public class Banco {
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private List<Conta> contas;

    public Banco(String nome, String endereco, String telefone, String email) {
        this.contas = new ArrayList<Conta>();
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }
    
    public void adicionaConta(Conta conta){
        conta.setBanco(this);
        this.contas.add(conta);
    }
    
    public List<Conta> getContas() {
        return Collections.unmodifiableList(contas);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
