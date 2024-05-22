package com.leandro.banco;
import java.util.Scanner;

public class Conversor {


    public static void main(String[] args) {
         double pesoArg;
         double dolar=868.30;
         double euro=1.09;
         double resultado;

        Scanner scanner=new Scanner(System.in);
        System.out.println("ingrese la cantidad de euros a convertir");
        pesoArg=scanner.nextDouble();
        resultado=(pesoArg*dolar);
        System.out.println(pesoArg +" pesos Argentinos equivale a :"+resultado+" US dolares");

//        int a, b, c;
//        a = b = c = 1;
//        a += b += c += 5;
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(a + b + c);
//        int entero1 = 10;
//        int entero2 = 3;
//        float num1 = 1.5f;
//        float num2 = 5.0f;
//
//        int suma = entero1 + entero2;
//        float multiplicacion = num1 * num2;
//        int divisionEnteros = entero1 / entero2;
//        int modulo = entero1 % entero2;
//        float division = num2 / entero2;
//
//        System.out.println(suma + " " + multiplicacion + " " + divisionEnteros + " " + modulo + " " + division);
//        int a = 5;
//        int b = 1;
//        int c = 0;
//
//        boolean op1 = a < b;//false
//        boolean op2 = c <= a;//true
//        boolean op3 = (a > b) != (c > a) ;//true
//
//        System.out.println("Op1: " + op1);
//        System.out.println("Op2: " + op2);
//        System.out.println("Op3: " + op3);
//        int var1 = 0x101;
//        System.out.println(var1);

//        double gradosC=0.0;
//        double gradosF=0.0;
//
//        System.out.println("Introduzca los grados Fahrenheit: ");
//
//        gradosF = scanner.nextDouble();
//
//        gradosC = (5.0/9.0)*(gradosF-32);
//
//        System.out.println(gradosF + " grados Fahrenheit equivalen a " + gradosC + " grados centígrados");


    }
}
