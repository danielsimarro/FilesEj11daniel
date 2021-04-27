/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fiile;

import java.util.ArrayList;

/**
 *
 * @author daniel
 */
public class Programa {

    public static void main(String[] args) {
        ArrayList<App> listaApp = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            listaApp.add(App.crearAppAleatoria());
        }
        
        listaApp.forEach(System.out::println);
        
        ServicioFicheroTSV generarFichero = new ServicioFicheroTSV();
        generarFichero.generaTsv(listaApp, "prueba.tsv");
        
    }
}
