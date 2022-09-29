
package controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import model.*;


public class AvaliacaoSrv {
    
    
    
    public static void inserir(HashMap<String,Avaliacao> avaliacao,String n1,String n2,String n3,HashMap<String,Producao> prod){
        boolean flag1 = false;
        boolean flag3 = false;
        boolean flag4 = false;
        for(Avaliacao i : avaliacao.values()){
            if(i.getIdentificador().contains(n1) && i.getNome().contentEquals(n2)){
                i.setAvaliacao(n3);
                System.out.println("Ação Realizada");
                flag1 = true;
                flag3 = true;
                flag4 = true;
                break;
            }
        }
        if(!flag1){
            for(Producao j : prod.values()){
                if(j.getIdentidade().contains(n1) && j.getTitulo().contentEquals(n2)){
                    Avaliacao novoA = new Avaliacao(n1, n2, n3);
                    avaliacao.put(n1+ n2, novoA);
                    System.out.println("Ação realiazada");
                    flag3 = true;
                    flag4 = true;
                }
            }
        }
        if(!flag3){
            System.out.println("Nao encontrado");
        }


        if(flag4){
            try{
                BufferedWriter escreve = new BufferedWriter(new FileWriter("avaliacaoAtt.csv"));
                for(Avaliacao i : avaliacao.values()){
                    if(i.getIdentificador().contains(n1) && i.getNome().contentEquals(n2)){
                        escreve.write(n1 + ";" + n2 + ";" + n3);
                    }else{
                        escreve.write(i.getIdentificador() + ";" + i.getNome() + ";" + i.getAvaliacao());
                    }
                    escreve.write("\n");
                }
                escreve.close();
            }catch(IOException e){
                System.out.println("Erro ao ler o arquivo");
            }
        }                
    }
    
    public static void  remover(HashMap<String,Avaliacao> avaliacao,String n1,String n2,HashMap<String,Producao> prod){
        boolean flag1 = true;
        boolean flag2 = false;
        for(Avaliacao i: avaliacao.values()){
            if(i.getIdentificador().contains(n1) && i.getNome().contentEquals(n2)){
                i.setAvaliacao("00000");
                flag1 = false;
                flag2 = true;
                break;
            }
        }
        if(!flag1){
            System.out.println("Deu bom");
        }else{
            System.out.println("Avaliacao nao encontrada");
        }
        if(flag2){
            try{
                BufferedWriter escreve = new BufferedWriter(new FileWriter("avaliacaoAtt.csv"));
                for(Avaliacao j : avaliacao.values()){
                    if(j.getIdentificador().contains(n1) && j.getNome().contentEquals(n2)){
                        escreve.write(n1 + ";" + n2 + "; 000000");
                    }else{
                        escreve.write(j.getIdentificador() + ";" + j.getNome() + ";" + j.getAvaliacao());
                    }
                    escreve.write("\n");
                }
                escreve.close();
            }catch(IOException e){
                System.out.println("Erro ao ler o arquivo");
            }
        }
    }              
}

