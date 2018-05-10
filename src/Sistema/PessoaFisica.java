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

    public PessoaFisica(int codigo, String nome, String endereco, String telefone, String Tipo,String cpf) {
        super(codigo, nome, endereco, telefone, Tipo);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return  "" +getCodigo() +";"+getNome() +";"+getEndereco()+";"+getTelefone()+";"+getTipo()+";"+getCpf()+";";
    }

  
    
    
}
