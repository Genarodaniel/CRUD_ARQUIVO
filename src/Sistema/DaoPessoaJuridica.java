/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import java.io.File;
import java.io.PrintStream;
import java.util.*;
/**
 *
 * @author adm
 */

public class DaoPessoaJuridica {
    
    public List <PessoaJuridica> getLista(){
        return Dados.listaPj;
    }
    
    public  boolean salvarPj(PessoaJuridica obj){
            
        try 
        { 
            PrintStream ps = new PrintStream("C:\\Users\\itach\\Desktop\\cadastroPj.txt");
            ps.println(obj);
            ps.flush();
            return true;
            
        }
     
        catch(Exception e ){
            System.out.println("erro: " + e);
            return false;
        }
        
        
        
        }
    
    }



