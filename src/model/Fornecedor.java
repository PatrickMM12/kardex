
package model;

public class Fornecedor {
    private int codigo = 0;
    private String cnpj;
    private String nome;
    private String telefone;
    private String email;

    public Fornecedor(String cnpj, String nome, String telefone, String email) {
        setCnpj(cnpj);
        setNome(nome);
        setTelefone(telefone);
        setEmail(email);
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Fornecedor{" + "codigo=" + codigo + ", nome=" + nome + '}';
    }
    
    
    
}
