/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Traductor;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author daniel
 */
public class Traductor {

    //Atributo de la clase
    private Map<String, String> traductor;

    //Constructor de la clase
    public Traductor() {
        this.traductor = new TreeMap<>();
    }

    //Introducción de valores 
    public void introducirValores(String palabraIngles, String palabraEspañol) {
        traductor.put(palabraIngles, palabraEspañol);
    }

    //Borar entrada según la clave
    public void borrarEntradas(String palabraIngles) {
        traductor.remove(palabraIngles);
    }

    //Modificar valores según la clave
    public void modificarValores(String palabraIngles, String palabraEspañol) {
        traductor.replace(palabraIngles, palabraEspañol);
    }

    //Obtener un atraducción según el la clave
    public String obtenerTraduccion(String palabraIngles) {
        return traductor.get(palabraIngles);
    }

    //Metodo para imprimir el MAP
    public void imprimirMap() {
        for (String key : traductor.keySet()) {
            System.out.println("La palabara en ingles es " + key + " que traducida al Español seria " + traductor.get(key));
        }
    }

    //Metodo keyset devuelve las claves del metodo
    public ArrayList<String> listaTodasClaves() {
        ArrayList<String> lista = new ArrayList<>(traductor.keySet());

        return lista;
    }

    //El metodo values devuelve los valores sin las claves primarias
    public ArrayList<String> listaPalabraEspañol() {
        ArrayList<String> lista = new ArrayList<>(traductor.values());

        return lista;
    }
}
