package com.company;

public class Main {
    public static void main(String[] args) {
        int result;
        result= suma(10,30,-2);   // PASO de parámetros por Valor (hace una copia)
        System.out.println("Primera parte");
        System.out.println(result);

        System.out.println("Segunda parte");
        Coche miCoche = new Coche();
        miCoche.AgregarPuerta();
        System.out.println(miCoche.puertas);

    }

    public static int suma(int a , int b , int c ){
        int result = a+b;
        return result + c;
    }

}

class Coche{
    public int puertas= 2;
    public void AgregarPuerta(){
        this.puertas++;
    }
}