package com.slusarz.patientservice;

import com.slusarz.dataPatient.Patient;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main extends AddDeletePatient {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);

        Patient patient = new Patient();
        AddDeletePatient addDeletePatient = new AddDeletePatient();



        while (true) {
            System.out.println("###### GABINET DENTYSTYCZNY ######");
            System.out.println("1.REJESTRACJA PACJENTA");
            System.out.println("2.USUWANIE PACJENTA");
            System.out.println("3.DODAWANIE INFORMACJII Z WIZYTY");
            System.out.println("4.LISTA PACJENTOW");
            System.out.println("5.KONIEC PROGRAMU");
            try {
                byte n = scanner.nextByte();
                if (n > 5) {
                    System.out.println("Liczba jaka wprowadziles jest bledna.");
                }
                switch (n) {

                    case 1:
                        System.out.println("Jaka liczbe pacjentow chcesz zarejestrowac?");

                        int numpeople = scanner.nextInt();
                        if (numpeople > 0) {
                            String exceptions[] = new String[numpeople];
                            for (int i = 0; i < exceptions.length; i++) {
                                addDeletePatient.dodawaniepacjentow(patient);
                            }
                        } else {
                            throw new ArithmeticException("Wproawdziles liczbe ujemna.");
                        }
                        break;

                    case 2:
                        addDeletePatient.usuwaniepacjentow(patient);
                        break;

                    case 3:
                        System.out.println("Wybierz pacjenta dla ktorego ma zostac dodana informacja z wizyty: ");
                        addDeletePatient.dodanieinformacji(patient);

                        break;
                    case 4:
                        System.out.println(addDeletePatient.lista);
                        break;
                    case 5:
                        System.exit(0);
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Nie wprowadziles liczby.");
                System.exit(0);
            }
        }
    }
}




