/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import java.io.PrintStream;
import java.util.*;

public class DaoCliente{
    
    
        
    public boolean salvarCliente(PessoaFisica obj){
        
    
         
     try
     {
           
            //utilizar a classe PrintStream para gerar relatorios (arquivo texto)
            
            PrintStream ps= new PrintStream("C:\\Users\\itach\\Desktop\\CadastroCliente.txt");
            ps.println(obj);
            // persiste os dados no disco
            ps.flush();
        }
        
        catch(Exception e)
        {
            System.out.println("Excecao: "+ e);
        }
    return true;
        
}
}