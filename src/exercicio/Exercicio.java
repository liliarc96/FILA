/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author aluno
 */
public class Exercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<Integer>();
        Stack<Integer> pilha = new Stack<Integer>();
        
        fila.add(1);
        fila.add(2);
        fila.add(3);
        fila.add(4);
        
        int tamanho = fila.size();
        
        for(int i = 0;i<= (tamanho-1);i++){
            System.out.println("Fila: "+fila);
            System.out.println("Pilha: "+pilha);
            System.out.println("Retirado: "+pilha.push(fila.poll()));
        }
        
        System.out.println("\n\n\n");
        
        for(int i = 0;i<= (tamanho - 1);i++){
            System.out.println("Fila nova: "+fila);
            System.out.println("Pilha nova: "+pilha);
            fila.add(pilha.pop());
        }
        
         System.out.println("\n\nFila nova: "+fila);
         System.out.println("Pilha nova: "+pilha);
    }
    
}
