
package controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import model.*;


public class SetorSrv {
    
    public static void  setor(HashMap<String,Setor> setor, BufferedReader leitor,String linha){
         try{
              leitor = new BufferedReader(new FileReader("setores.csv"));
            while((linha=leitor.readLine())!=null){
                linha.trim();
               String dividir[]=linha.split(";");
               String id=dividir[0];
               String nome=dividir[1];
               String sigla=dividir[2];
               Setor set=new Setor(id,nome,sigla);
               setor.put(id, set);
            }
            leitor.close();
        }catch(FileNotFoundException file){
            System.out.println("Arquivo não encontrado");
        }catch(IOException e){
            System.out.println("Erro ao ler o arquivo");
        }catch(IndexOutOfBoundsException i){
            System.out.println("Erro no Index");
        }
    }
}
