
package model;

public class Cliente {
    private int codigo = 0;
    private String cpf;
    private String nome;
    private String celular;
    private String email;

    public Cliente(String cpf, String nome, String celular, String email) {
        setCpf(cpf);
        setNome(nome);
        setCelular(celular);
        setEmail(email);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", nome=" + nome + '}';
    }
    
    
}
