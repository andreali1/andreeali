package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a,b,c;
        Scanner teclado = new Scanner(System.in);
        System.out.println("hola mundo ");
        System.out.println("ingrese el primer numeor a operar ");
        a = teclado.nextInt();
        System.out.println(" ingrese el segundo numero a operar ");
        b = teclado.nextInt();


        System.out.println("opc 1 --> sumar numeros ");
        System.out.println("opc 2 --> restar los numeros ");
        System.out.println("opc 3 --> multiplicar numeros ");


        System.out.println("ingrese el numero de la operacion a realizar ");
        c = teclado.nextInt();


        switch (c){
            case 1 :
                int sum = a +b;
                System.out.println("la suma de los numeros es igual a --> "+sum);
                break;
            case 2 :
                int resta = a-b;
                System.out.println("la resata de los numeros es igual a --> "+resta);
                break;
            case 3:
                int mult= a*b;
                System.out.println("la multiplicacion de los numeros es igual a --> "+mult);
                default:
                    System.out.println("la opcion ingresada no es correcta ");
        }


    }
}
