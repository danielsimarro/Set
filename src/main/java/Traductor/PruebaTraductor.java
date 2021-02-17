/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Traductor;

import java.util.ArrayList;

/**
 *
 * @author NitroPc
 */
public class PruebaTraductor {
    
    public static void main(String[] args) {
        
    //Creación de las palabaras en español e ingles    
    String e1 = "hola", e2 = "adios",e3 = "pelota",e4 = "coche",e5 = "casa",e6 = "perro",e7 = "gato",
    e8 = "boligrafo",e9 = "manzana",e10 = "avion";
    
    String i1 = "hello",i2 = "bye",i3 = "ball",i4 = "car",i5 = "home",i6 = "dog",
    i7 = "cat",i8 = "pen",i9 = "apple",i10 = "plane";
    
    //Creamos el objeto Traductor
    Traductor tra = new Traductor(); 
    
    //Introducimos las palabras en el objeto 
    tra.introducirValores(i1, e1);
    tra.introducirValores(i2, e2);
    tra.introducirValores(i3, e3);
    tra.introducirValores(i4, e4);
    tra.introducirValores(i5, e5);
    tra.introducirValores(i6, e6);
    tra.introducirValores(i7, e7);
    tra.introducirValores(i8, e8);
    tra.introducirValores(i9, e9);
    tra.introducirValores(i10, e10);
    
    //Mostraremos todas las traducciones
    tra.imprimirMap();
        System.out.println("-------------------------");
    //Obtener una traducción en concreto
    System.out.println("La palabra cat es en Español: " + tra.obtenerTraduccion(i7));
    
    
    //Cambiar un valor 
    tra.modificarValores(i7, e6);
    
    //Obtener una traducción en concreto
    System.out.println("La palabra cat es en Español: " + tra.obtenerTraduccion(i7));
    
    //Borraremos una palabre donde se borrara la palbra que se quiere traducir y la tradución
    tra.borrarEntradas(i7);
        System.out.println("-----------------");
        
    //Imprimimo sde nuevo la lista
    tra.imprimirMap();
    
    ArrayList <String> palabraIngles  = new ArrayList();
    
    palabraIngles = tra.listaTodasClaves();
    
    for(int i = 0; i<palabraIngles.size();i++){
        System.out.println(palabraIngles.get(i));
    }
    
    
    
    }
    
    
}
