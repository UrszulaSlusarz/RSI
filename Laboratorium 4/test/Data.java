package com.slusarz.test;

import java.util.Scanner;
import java.util.InputMismatchException;

abstract public class Data
{
    public String name ;
    public String surname;
    public String place;
    public String street;
    public double numberhouse;
    public float age;


    public Scanner scanner=new Scanner(System.in);
    public void podaniedanych(Patient patient) {
        System.out.println("Prosze wprowadzic dane pacjenta");
        try {
            System.out.println("Imie:");
            patient.name = scanner.next();
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
        } catch (InputMismatchException e) {
            System.out.println("Wprowadziles niepoprawne dane.");
            System.exit(0);
        }
    }
}
