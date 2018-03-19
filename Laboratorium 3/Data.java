package com.company;
import java.util.Scanner;

 abstract public class Data
 {
     public String name ;
     public String surname;
     public String place;
     public String street;
     public double numberhouse;
     public float age;


     Scanner scanner=new Scanner(System.in);
     void podaniedanych(Patient patient){
         System.out.println("Prosze wprowadzic dane pacjenta");

         System.out.println("Imie:");
         patient.name= scanner.next();
         System.out.println("Nazwisko:");
         patient.surname = scanner.next();
         System.out.println("Wiek:");
         patient.age = scanner.nextFloat();
         System.out.println("Miejscowosc:");
         patient.place = scanner.next();
         System.out.println("Ulica:");
         patient.street = scanner.next();
         System.out.println("Numer domu:");
         patient.numberhouse = scanner.nextShort();
     }


 }
