
package view;

import controller.AvaliacaoSrv;
import controller.CurriculosSrv;
import controller.ProducaoSrv;
import controller.SetorCurriculosSrv;
import controller.SetorSrv;
import model.Producao;
import model.Curriculos;
import model.Avaliacao;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;
import model.Avaliacao;
import model.Curriculos;
import model.Producao;
import model.Setor;
import model.Setorcurriculo;

public class App {
    public static void main(String[] args) {
        HashMap<String,Avaliacao> avaliacao = new HashMap<>();
        HashMap<String, Producao> producao= new HashMap<>();
        HashMap<String,Curriculos> curriculos = new HashMap();
        HashMap<String,Setor> setor = new HashMap<>();
        
        HashMap<String,Setorcurriculo> sc = new HashMap<>();
        BufferedReader leitor=null;
        String linha="";
       
        Scanner teclado = new Scanner(System.in);
        int op=0;
        
        Render.avaliacao(avaliacao, leitor);
        CurriculosSrv.curriculos(curriculos, leitor, linha);
        ProducaoSrv.producao(producao, leitor, linha);
        SetorCurriculosSrv.setorcurriculos(sc, leitor, linha);
        SetorSrv.setor(setor, leitor, linha);
       
            do{
                System.out.println("1-Inserir");
                System.out.println("2-Remover");
                System.out.println("0-Sair");   
                op = teclado.nextInt();
                teclado.nextLine();
                switch(op){
                    case 1:
                        System.out.println("Qual o Identificador: ");
                        String idI = teclado.nextLine();
                        System.out.println("Qual o Titulo: ");
                        String titulo = teclado.nextLine();
                        System.out.println("Qual a nova nota? ");
                        String nota = teclado.nextLine();
                        AvaliacaoSrv.inserir(avaliacao,idI, titulo, nota, producao);
                    break;
                    
                    case 2:
                        System.out.println("Qual o Identificador? ");
                        String idR = teclado.nextLine();
                        System.out.println("Qual o Titulo? ");
                        String titutoR = teclado.nextLine();
                        AvaliacaoSrv.remover(avaliacao, idR, titutoR, producao);
                    break;    
                }
          
            
            }while(op!=0);   
    }   
}
