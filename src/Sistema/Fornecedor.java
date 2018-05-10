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
public class Fornecedor extends PessoaJuridica {
    private String contato;

    public Fornecedor(String contato, String cnpj, int ie, int codigo, String nome, String endereco, String telefone, String Tipo) {
        super(cnpj, ie, codigo, nome, endereco, telefone, Tipo);
        this.contato = contato;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

  
}
