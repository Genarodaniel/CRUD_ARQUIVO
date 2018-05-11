/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import java.io.*;

/**
 *
 * @author adm
 */
public class DaoPessoaFisica {
    
    public  void salvarPf(PessoaFisica obj){
            
        try 
        { 
         

           FileOutputStream fos = new FileOutputStream("C:\\Users\\itach\\Desktop\\CadastroCliente.txt",true);
           PrintStream dos = new PrintStream(fos);
          
            dos.println(obj);
            
            dos.flush();
            
            
            
            
        }
     
        catch(Exception e ){
            System.out.println("erro: " + e);
           
        }
        
        
        
        }

   
    
    
    
    
    
}
