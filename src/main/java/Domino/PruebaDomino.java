/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domino;


/**
 *
 * @author NitroPc
 */
public class PruebaDomino {

    public static void main(String[] args) {

        
        Domino d1 = new Domino();
        
        d1.imprimirFicha();
        
        System.out.println("El numero de fichas son: " + d1.numeroFichas());
        
        FichaDomino f1 = new FichaDomino (3,4);
        
        System.out.println("La ficha se encuentra dentro : " + d1.fichaConjunto(f1));
        
        System.out.println("Esta vacio : " + d1.vacio());
        
        d1.eliminarFicha(f1);
        
        System.out.println("La ficha se encuentra dentro : " + d1.fichaConjunto(f1));
        
        System.out.println("Imprimir ficha despues de haberla elminiado:");
        d1.imprimirFicha();
        
        System.out.println("Imprimir ficha despues de haberla añadido, la ficha borrada:");
        d1.introducirFicha(f1);
        d1.imprimirFicha();
        
        d1.sacarFichas();
        System.out.println("Ver el resulatdo despues de sacar las fichas de domino: ");
        d1.imprimirFicha();
        
        for(FichaDomino ficha : d1.sacarFichas()){
            System.out.println(ficha);
        }
                        
    }
}
