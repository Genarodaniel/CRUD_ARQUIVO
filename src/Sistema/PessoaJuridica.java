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
public class PessoaJuridica extends Cliente{
    private String cnpj;
    private int ie;

    public PessoaJuridica(String cnpj, int ie, int codigo, String nome, String endereco, String telefone, String Tipo) {
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
    
    
}
