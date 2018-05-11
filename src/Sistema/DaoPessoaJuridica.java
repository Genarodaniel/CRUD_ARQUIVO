/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.*;
/**
 *
 * @author adm
 */

public class DaoPessoaJuridica {
    

    public  boolean salvarPj(PessoaJuridica obj){
            
        try 
        { 
             FileOutputStream fos = new FileOutputStream("C:\\Users\\itach\\Desktop\\CadastroCliente.txt",true);
             PrintStream dos = new PrintStream(fos);
          
            dos.println(obj);
            
            dos.flush();
            return true;
            
        }
     
        catch(Exception e ){
            System.out.println("erro: " + e);
            return false;
        }
        
        
        
        }
    
    }



