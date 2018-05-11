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
public class Testa {
    
    
    
        public static void main(String[] args) {
        
            DaoPessoaJuridica daoPj= new DaoPessoaJuridica();
            DaoPessoaFisica daoPf=new DaoPessoaFisica();
            
            PessoaJuridica c1 = new PessoaJuridica(10,"Daniel","ovidio vilela","993911490","F","46353698895",151515);
             PessoaFisica c2 = new PessoaFisica(10,"Daniel","ovidio vilela","993911490","F","46353698895");
            daoPj.salvarPj(c1);
            daoPf.salvarPf(c2);
    }

   
}
