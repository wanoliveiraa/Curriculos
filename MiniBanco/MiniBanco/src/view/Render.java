
package view;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import model.*;

public class Render {
    public static void avaliacao( HashMap<String,Avaliacao> avaliacao, BufferedReader leitor){
         try{
            String linha=null; 
             leitor = new BufferedReader(new FileReader("avaliações.csv"));
            while((linha=leitor.readLine())!=null){
               String dividir[]=linha.split(";");
               String identificador=dividir[0];
               String nome=dividir[1];
               String avalaicao=dividir[2];
               Avaliacao aval=new Avaliacao(identificador,nome,avalaicao);
               String key=identificador+nome;
               avaliacao.put(key, aval);
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
