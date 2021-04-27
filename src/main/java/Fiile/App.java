/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fiile;

import java.time.LocalDate;
import java.util.Random;


/**
 *
 * @author NitroPc
 */
public class App {

    //Atributos de la clase App
    private int codigo;
    private String nombre;
    private String descripcion;
    private double kb;
    private LocalDate fecha;

    //Atributos utilizados para la clase
    //Contador para asignar a los codigos
    private static int contador;
    private final static Random aleatorio = new Random();
    
    //Constructor parametrizado
    public App(int codigo, String nombre, String descripcion, double kb, LocalDate fecha) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.kb = kb;
        this.fecha = fecha;
        contador++;
    }

    //Constructor por defecto
    public App() {
    }
    
    //Metodos getter y setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getKb() {
        double roundDbl = Math.round(kb * 100.0) / 100.0;
        return roundDbl;
    }

    public void setKb(double kb) {
        this.kb = kb;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        App.contador = contador;
    }

    //Metodo to String para imprimir los atributos del objeto  
    @Override
    public String toString() {
        return  codigo + "\t" + nombre + "\t" + descripcion + "\t" + kb + "\t" + fecha;
    }

    //Metodo para crear el nombre aleatorio ("app" + cod + letra)
    private static String nombreAleatorio(int codigo) {
        String nombre = "app" + codigo;

        char letraMinus = (char) (aleatorio.nextInt(26) + 'a');

        String letra = Character.toString(letraMinus);

        return nombre + letra;
    }

    //Metodo para crear la descripción
    private static String descripcionAleatoria() {
        String descripcion = "Finanzas,Juegos,Educación,Entretenimiento,Conocimiento,Deporte,Parejas,Logica,Conducción,Lectura";
        String[] lista = descripcion.split(",");
        int random = aleatorio.nextInt(9 - 0 + 1) + 0;

        return lista[random];
    }

    //Metodo para generar el tamaño entre 100y 1024
    private static double kbAleatoria() {
        
        //Utilizamos el .sum para que decuelva un double 
        return aleatorio.doubles(1, 100.0, 1024.0).sum();
    }

    //Metodo para generar fechas aleatorias
    private static LocalDate fechaAleatoria() {

        int dia = aleatorio.nextInt(28 - 1 + 1) + 1;
        int mes = aleatorio.nextInt(12 - 1 + 1) + 1;
        int ano = aleatorio.nextInt(2025 - 2015 + 1) + 2015;

        LocalDate fecha = LocalDate.of(ano, mes, dia);
        return fecha;
    }
    
    public static App crearAppAleatoria(){
        App app1 = new App();
        app1.setCodigo(contador+1);
        app1.setNombre(nombreAleatorio(app1.getCodigo()));
        app1.setDescripcion(descripcionAleatoria());
        app1.setKb(kbAleatoria());
        app1.setFecha(fechaAleatoria());
        contador++;
        
        return app1;
    }

}
