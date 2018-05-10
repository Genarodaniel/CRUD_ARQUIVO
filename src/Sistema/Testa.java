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
        
            
            PessoaFisica c1 = new PessoaFisica(10,"Daniel","ovidio vilela","993911490","F","46353698895");
            salvarCliente(c1);
    }

    private static void salvarCliente(PessoaFisica c1) {
         try
     {
           
            //utilizar a classe PrintStream para gerar relatorios (arquivo texto)
            
            PrintStream ps= new PrintStream("C:\\Users\\itach\\Desktop\\CadastroCliente.txt");
            ps.println(c1);
            // persiste os dados no disco
            ps.flush();
        }
        
        catch(Exception e)
        {
            System.out.println("Excecao: "+ e);
        }
  
    }
}
