/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fiile;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author NitroPc
 */
public class ServicioFicheroJSON {
    
    //Metodo que genera un archivo JSON pasandole una lista y el nombre del fichero a crear
    public void generaJson(ArrayList<App> listaApp, String nombre) throws IOException {

        ObjectMapper mapeador = new ObjectMapper();
        
        mapeador.configure(SerializationFeature.INDENT_OUTPUT, true);

        // Escribe en un fichero JSON la lista que le pasamos
        mapeador.writeValue(new File(nombre), listaApp);
        
    }
}
