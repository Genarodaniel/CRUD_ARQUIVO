/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import java.io.PrintStream;

/**
 *
 * @author adm
 */
import Sistema.DaoPessoaJuridica;
public class Testa {
    
    
    
        public static void main(String[] args) {
        
            DaoPessoaJuridica dao= new DaoPessoaJuridica();
            
            PessoaJuridica c1 = new PessoaJuridica(10,"Daniel","ovidio vilela","993911490","F","46353698895",10120);
            dao.salvarPj(c1);
    }

   
}
