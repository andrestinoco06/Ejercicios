/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java;

import java.util.Scanner;

/**
 *
 * @author Johan Zambrano
 */
public class Main2 {
    
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int opcion,desea;
        do{
            System.out.println("\tEjercicios en clase");
            System.out.println("Seleccione la opcion que corresponda");
            System.out.println("1. Promedio de notas");
            System.out.println("2. Estaciones del año");
            opcion=a.nextInt();
            switch(opcion){
                case 1: promedio();
                break;
                case 2: estacion();
                break;    
            }
            do{
                System.out.println("Desea volver al menu principal: \n1-Si\n2-No");
                desea=a.nextInt();
            }while(desea>2 || desea<1);
        }while(desea==1);
    }
    public static void promedio(){
            Scanner b=new Scanner (System.in);
            String nombre;
            System.out.println("Ingrese el nombre del estudiante");
            nombre=b.nextLine();
            int cant,notas,promedio=0;
            do{
                System.out.println("Ingrese la cantidad de notas que desea ingresar");
                cant=b.nextInt();
                if(cant<=0){
                    System.out.println("Ingrese una nota valida");
                }
            }while(cant<=0);
            for(int i=1;i<=cant;i++){
                do{
                    System.out.println("Ingrese la nota "+i+" :");
                    notas=b.nextInt();
                    if(notas>5 || notas<1){System.out.println("ERROR, ingrese una nota valida");
                    }
                }while(notas>5 || notas<1);
                promedio=promedio+notas;
            }
            promedio=promedio/cant;
            System.out.println("El promedio del estudiante "+nombre+" es: "+promedio);
    }
    public static void estacion(){
        int mes,desea;
        Scanner c=new Scanner(System.in);
        do{
             System.out.println("Ingrese el mes");
             mes=c.nextInt();
             if(mes>=1 && mes<=3){
                 System.out.println("El mes "+mes+" corresponde a la estacion de invierno");
             }else{
                 if(mes>=4 && mes<=6){
                     System.out.println("El mes "+mes+" corresponde a la estacion de verano");
                 }else{
                    if(mes>=7 && mes<=9){
                     System.out.println("El mes "+mes+" corresponde a la estacion de otoño");
                    }else{
                        if(mes>=10 && mes<=12){
                           System.out.println("El mes "+mes+" corresponde a la estacion de primavera");
                        }else{
                            System.out.println("El mes "+mes+" no existe");
                        }
                    }
                 }
             }
             do{
                System.out.println("Desea ingresar otro mes\n1-SI\n2-NO");
                desea=c.nextInt();
                if(desea>2 || desea<1){
                    System.out.println("Ingrese una opcion valida");
                }
             }while(desea>2 || desea<1);
        }while(desea==1);
    }
    
}
