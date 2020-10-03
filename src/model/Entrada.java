
package model;

import java.awt.Color;
import java.util.Date;

public class Entrada extends Kardex{
    
    private Fornecedor fornecedor;
    
    public Entrada(int codigo, Date data, int qtde, double valor, Fornecedor fornecedor) {
        super(codigo, data, qtde, valor);
        setFornecedor(fornecedor); 
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString() {
        return "Entrada{" + "fornecedor=" + fornecedor + '}';
    }
    
}
