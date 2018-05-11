/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import java.io.Serializable;

/**
 *
 * @author adm
 */
public class PessoaJuridica extends Cliente implements Serializable{
    private String cnpj;
    private int ie;

    public PessoaJuridica(int codigo, String nome, String endereco, String telefone, String Tipo,String cnpj,int ie) {
        super(codigo, nome, endereco, telefone, Tipo);
        this.cnpj = cnpj;
        this.ie = ie;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getIe() {
        return ie;
    }

    public void setIe(int ie) {
        this.ie = ie;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return  "" +getCodigo() +";"+getNome() +";"+getEndereco()+";"
                +getTelefone()+";"+getTipo()+";"+getCnpj()+";"
                +getIe()+";";
    }
    
    
    
}
