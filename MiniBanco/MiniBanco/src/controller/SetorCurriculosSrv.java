
package controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import model.*;


public class SetorCurriculosSrv {
      public static void setorcurriculos (HashMap<String,Setorcurriculo> sc, BufferedReader leitor,String linha){
         try{
            leitor = new BufferedReader(new FileReader("setor_curriculo.csv"));
            while((linha=leitor.readLine())!=null){
               linha.trim();
               String dividir[]=linha.split(";");
               String id=dividir[0];
               String curriculoid=dividir[1];
               String setorid=dividir[2];
               String key=curriculoid;
               Setorcurriculo scc=new Setorcurriculo(id,curriculoid,setorid);
               sc.put(key, scc);
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

