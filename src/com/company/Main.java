package com.company;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el valor del arreglo: ");

        int x = scan.nextInt();
        int[] vector = new int[x];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = i;
            System.out.print(vector[i]+",");
        }

        System.out.println("");
        System.out.print("Que elemento a eliminar: ");
        int busqueda = scan.nextInt();

        for (int i = 0; i < x; i++) {
            if(vector[i]==busqueda){
                for (int j = i; j < x-1; j++) {
                    vector[j] = vector[j+1];
                }
                for (int z = 0; z < vector.length-1; z++) {
                    System.out.print(vector[z]+",");
                }

                break;
            }


            if(i == x-1){
                System.out.println("El elemento no existe");
                break;
            }


        }
    }
}

