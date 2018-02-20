package main.java;
import java.util.Scanner;

public class MainJava {
    public static void main(String[] args) {
        Scanner S = new Scanner (System.in);
        System.out.println ("Escoja una opcion: ");
        System.out.println ("1. Registrar categoria");
        System.out.println ("2. Coalcular segundos");
        System.out.println ("------------------------------------------");
        int opc = S.nextInt ();
        switch (opc){
            case 1: Categoria ();
            break;
            case 2: Segundos ();
            break;
        }
    }
    public static void Categoria (){
        Scanner C = new Scanner (System.in);
        int opc;
        do {
        System.out.println ("Ingrese su edad: ");
        int edad = C.nextInt ();
        if (edad <= 6){
            System.out.println ("Categoria Pre-Infantil");
        }
        else if (edad ==7 && edad <=17){
            System.out.println ("Categoria Infantil");
        }
        else if (edad == 18 && edad <=25){
            System.out.println ("Categoria Juvenil");
        }
        else if (edad == 26 && edad <=49){
            System.out.println ("Categoria Mayores");
        }
        else if (edad >= 60){
            System.out.println ("Categoria Veteranos");
        }
        System.out.println ("¿Desea ingresar otra edad?");
        System.out.println ("1=SI");
        System.out.println ("2=NO");
        opc = C.nextInt ();
        } while (opc==1);
    }
    public static void Segundos(){
        Scanner d=new Scanner(System.in);
        int seg,min,horas,sema,dias;
        do{
            System.out.println("Ingrese los segundos");
            seg =d.nextInt();
            if(seg<0){
                System.out.println("ERROR, ingrese un dato valido");
            }
        }while(seg<0);
        min=seg/60;
        if(min>=1){
            horas=min/60;
            min=min%60;
            if(horas>=1){
                dias=horas/24;
                horas=horas%24;
                if(dias>=1){
                    sema=dias/7;
                    dias=dias%7;
                    if(sema>=1){
                        
                    }else{
                        sema=0;    
                    }
                }else{
                  sema=0;
                  dias=0;
                }
            }else{
              sema=0;
              dias=0;
              horas=0;  
            }
        }else{
            min=seg;
            horas=0;
            dias=0;
            sema=0;
        }
        System.out.println("Segundos: "+seg);
        System.out.println("Minutos: "+min);
        System.out.println("Horas: "+horas);
        System.out.println("Dias: "+dias);
        System.out.println("Semanas: "+sema);
    }
}
   