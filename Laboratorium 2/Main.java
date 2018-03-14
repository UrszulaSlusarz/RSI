package com.company;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> lista = new ArrayList<String>();

        while (true)
        {
        System.out.println("###### GABINET DENTYSTYCZNY ######");
        System.out.println("1.Rejestracja");
        System.out.println("2.Odwolaj wizyte");
        System.out.println("3.Lista pacjentow");
        System.out.println("4.Koniec programu");
        byte n = scanner.nextByte();
        if (n>4)
        {
            System.out.println("wprowadziles bledna liczbe");
        }
        else switch (n)
        {
            case 1:
                System.out.println("Jaka liczbe pacjentow chcesz zarejestrowac?");
                int numpeople=scanner.nextInt();
                String patient[]=new String[numpeople];
                for(int i=0;i<patient.length;i++) {
                    System.out.println("Prosze wprowadzic dane pacjenta");
                    System.out.println("Imie:");
                    String nameregistration = scanner.next();
                    System.out.println("Nazwisko:");
                    String surnameregistration = scanner.next();
                    System.out.println("Wiek:");
                    float ageregistration = scanner.nextFloat();
                    System.out.println("Miejscowosc:");
                    String placeregistration = scanner.next();
                    System.out.println("Ulica:");
                    String streetregistration = scanner.next();
                    System.out.println("Numer domu:");
                    short numberhouseregistration = scanner.nextShort();


                    Registration registration = new Registration(nameregistration, surnameregistration, placeregistration, streetregistration, numberhouseregistration,ageregistration);
                    registration.print();
                    lista.add(nameregistration);
                }
                System.out.println("Liczba pacjentow: "+lista.size());
                break;

            case 2:
                System.out.println("Lista pacjentow: "+lista);
                System.out.println("Wizyte na ktore imie odwolac?");
                String namedelete= scanner.next();
                lista.remove(namedelete);
                System.out.println("Wizyta zostala odwolana.");
                break;

            case 3:
                System.out.println("Lista pacjentow: "+lista);
                break;

            case 4:
                System.exit(0);
                break;
        }
    }
    }

}


