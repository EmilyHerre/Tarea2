/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Emily
 */
public class ArrayListExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> arrayList = new ArrayList<>();
        String[] numbers = {"Dos", "Tres", "Cuatro"};
        //add
        arrayList.add(0, "Uno");

        //addAll
        arrayList.addAll(1, arrayList);

        for (String number : numbers) {
            arrayList.add(number);
        }
        //clear
        arrayList.clear();

        //cambio for por esto (?
        arrayList.addAll(Arrays.asList(numbers));
        //get
        System.out.println("Obtener elemento posición 1: " + arrayList.get(1));

        //indexOf
        System.out.println("Buscar elemento: " + arrayList.indexOf("Tres"));
        System.out.println("Buscar elemento: " + arrayList.indexOf("Cinco"));

        //contains
        System.out.println("Contiene: " + arrayList.contains("Cuatro"));
        arrayList.addAll(Arrays.asList(numbers));
        
        
        System.out.println(" " + arrayList);
        //LastIndexOf
        System.out.println("LastIndexOf " + arrayList.lastIndexOf("Tres"));
    }

}
