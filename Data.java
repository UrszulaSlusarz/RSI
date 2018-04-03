package com.slusarz.dataPatient;

import java.io.*;
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


    private void setTest(String s) {
        name = s;
    }

    private String getTest() {
        return name;
    }


    public Scanner scanner=new Scanner(System.in);
    public void podaniedanych(Patient patient) throws FileNotFoundException {
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

            PrintWriter zapis=new PrintWriter("zapis.txt");
            zapis.println("Dane zapisane do pliku "+"Imię: "+name+" "+"Nazwisko:" + surname+" "+"Wiek:" +age +" "+"Miejscowosc: "+place+" "+"Ulica: "+street+" "+"Numer domu: "+numberhouse+".");
            zapis.close();

        } catch (InputMismatchException e) {
            System.out.println("Wprowadziles niepoprawne dane.");
            System.exit(0);
        }

//        try {
//            ObjectInputStream o = new ObjectInputStream(new FileInputStream("serializable.bin"));
//            Data obj = (Data) o.readObject(); // odczyt obiektu ze strumienia
//            o.close();
//            System.out.println(obj.name); // wyświetlamy zawartość pliku
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }

    }
}
