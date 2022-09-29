
package controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import model.*;

public class ProducaoSrv {
     public static void producao(HashMap<String, Producao> producao , BufferedReader leitor,String linha){
        try{
            leitor= new BufferedReader(new FileReader("produções.csv"));
            while((linha=leitor.readLine())!=null){
                linha.trim();
                String dividir[]=linha.split(";");
                String id=dividir[0];
                String curriculoid=dividir[1];
                String tipo=dividir[2];
                String titulo=dividir[3];
                String identidade=dividir[4];
                String veiculo=dividir[5];
                Producao prod=new Producao(id,curriculoid,tipo,titulo,identidade,veiculo);
                String key=id+identidade;
                producao.put(key, prod);
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
