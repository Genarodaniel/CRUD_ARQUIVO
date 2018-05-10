/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

/**
 *
 * @author adm
 */
public class Produto {
    private int codigo;
    private int estoqueMinimo;
    private int quantidadeEstoque;
    private int percentualLucro;
    private double custo;
    private String desc;
    private double precoVenda;

    public Produto(int codigo, int estoqueMinimo, int quantidadeEstoque, int percentualLucro, double custo, String desc, double precoVenda) {
        this.codigo = codigo;
        this.estoqueMinimo = estoqueMinimo;
        this.quantidadeEstoque = quantidadeEstoque;
        this.percentualLucro = percentualLucro;
        this.custo = custo;
        this.desc = desc;
        setPrecoVenda(precoVenda);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(int estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getPercentualLucro() {
        return percentualLucro;
    }

    public void setPercentualLucro(int percentualLucro) {
        this.percentualLucro = percentualLucro;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    private void setPrecoVenda(double precoVenda) {
        this.precoVenda= custo+custo*percentualLucro;
    }

    
}
