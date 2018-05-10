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
public class PessoaFisica extends Cliente {
    private String cpf;

    public PessoaFisica(String cpf, int codigo, String nome, String endereco, String telefone, String Tipo) {
        super(codigo, nome, endereco, telefone, Tipo);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
