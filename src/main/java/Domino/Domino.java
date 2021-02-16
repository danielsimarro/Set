/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domino;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author NitroPc
 */
public class Domino  {
    
    //Atributo Set que no permite introducir valores repetidos
    private Set<FichaDomino> domino;

    //Constructor que inicializa el array e introduce las fichas de domino dentro
    public Domino() {

        this.domino = new HashSet<>();

        int[][] numero = new int[7][7];         

        for (int i = 0; i < numero.length; i++) {

            for (int j = i; j < numero[i].length; j++) {

                this.domino.add(new FichaDomino(i,j));
            }

        }

    }
    
    
    //Metodo para ver el tamaño del SET
    public int numeroFichas(){
        return this.domino.size();
    }
    
    //Metodo para introducir valores dentro del SET
    public void introducirFicha(FichaDomino fd){
        this.domino.add(fd);
    }
     
    //Metodo para comprobar si el se esta lleno o vacio
    public boolean vacio(){
        return this.domino.isEmpty();
    }
    
    //Metodo para comprobar si el SET contiene el valor que le pasamos como parametro
    public boolean fichaConjunto(FichaDomino fd){
        return domino.contains(fd);
    }
    
    //Metodo para eliminar una ficha del SET que le pasamos como parametro
    public void eliminarFicha(FichaDomino fd){
        if(domino.contains(fd)){
            this.domino.remove(fd);
        }
       
    }
    
    //Sacar ficha en forma arraylist
    public ArrayList<FichaDomino> sacarFichas(){
        ArrayList<FichaDomino> lista = new ArrayList<>(domino);
        domino.clear();
        
//        for(FichaDomino FichaDomino: domino){
//            lista.add(FichaDomino);
//        }
        
        return lista;
    }
    
   //Metodo para imprimir el SET
   public void imprimirFicha(){
       this.domino.forEach(System.out::println);
   }
   
   
   
   

}
