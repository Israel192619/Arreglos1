//Crear un vector de 5 elementos de cadenas de caracteres, inicializa el vector con datos leídos por el
//teclado. Copia los elementos del vector en otro vector pero en orden inverso, y muéstralo por la
//pantalla.

import java.util.Scanner;

public class Practica2 {
    //Definimos los vectores
    String[] original;
    String[] inverso;

    Scanner scanner;


    //metodo constructor
    public Practica2(){
        original= new String[5];
        inverso= new String[5];

        scanner = new Scanner(System.in);
    }

    //metodo ejecutar
    public void ejecutar(){
        //llenamos el vector original con cadena leidas del teclado
        for (int i = 0; i < original.length; i++) {
            System.out.println("original ["+i+"]: ");
            String cadena = scanner.nextLine();

            original[i]= cadena;
        }

        //invertir original
        int indiceOriginal=0;
        int indiceInverso=4;
        while(indiceOriginal < original.length){
            inverso[indiceInverso] = original[indiceOriginal];

            indiceOriginal++;
            indiceInverso--;
        }

        //mostramos el contenido de inverso

        for (int i = 0; i < inverso.length; i++) {
            System.out.println("inverso ["+i+"]:"+ inverso[i]);
        }
    }
}
