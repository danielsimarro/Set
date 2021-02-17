/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loteria;

import java.util.ArrayList;
import java.util.Map;

import java.util.TreeMap;

/**
 *
 * @author NitroPc
 */
public class Loteria {

    private Map<String, Integer> loteria;

    public Loteria() {
        this.loteria = new TreeMap<>();
    }

    //Introducción de valores 
    public void introducirValores(String numero, Integer premio) {
        loteria.put(numero, premio);
    }

    //Borar entrada según la clave
    public void borrarEntradas(String numero) {
        loteria.remove(numero);
    }

    //Modificar valores según la clave
    public void modificarValores(String numero, Integer premio) {
        loteria.replace(numero, premio);
    }

    //Obtener un atraducción según el la clave
    public Integer obtenerPremio(String numero) {
        return loteria.get(numero);
    }

    //Metodo para imprimir el MAP
    public void imprimirMap() {
        int contador=1;
        for (String key : loteria.keySet()) {
            System.out.println(contador + "- El número de loteria es --" + key + "-- con un premio de -->" + loteria.get(key) + "€");
            contador++;
        }
    }

    //Metodo keyset devuelve las claves del metodo
    public ArrayList<String> listaTodasClaves() {
        ArrayList<String> lista = new ArrayList<>(loteria.keySet());

        return lista;
    }

    //El metodo values devuelve los valores sin las claves primarias
    public ArrayList<Integer> listaPremios() {
        ArrayList<Integer> lista = new ArrayList<>(loteria.values());

        return lista;
    }

}
