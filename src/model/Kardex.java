
package model;

import java.util.Date;

public abstract class Kardex {
    private int codigo;
    private Date data;
    private int qtde;
    private double valor;

    public Kardex(int codigo, Date data, int qtde, double valor) {
        this.codigo = codigo;
        setData(data);
        setQtde(qtde);
        setValor(valor);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    @Override
    public String toString() {
        return "Kardex{" + "codigo=" + codigo + ", data=" + data + ", qtde=" + qtde + ", valor=" + valor + '}';
    }
}
