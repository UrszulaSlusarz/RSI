package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Patient patient= new Patient();
        AddDeletePatient addDeletePatient=new AddDeletePatient();

        while (true)
        {
        System.out.println("###### GABINET DENTYSTYCZNY ######");
        System.out.println("1.REJESTRACJA PACJENTA");
        System.out.println("2.USUWANIE PACJENTA");
        System.out.println("3.DODAWANIE INFORMACJII Z WIZYTY");
        System.out.println("4.KONIEC PROGRAMU");
        byte n = scanner.nextByte();
        if (n>4)
        {
            System.out.println("Liczba jaka wprowadziles jest bledna.");
        }
        else switch (n) {
            case 1:
                System.out.println("Jaka liczbe pacjentow chcesz zarejestrowac?");
                int numpeople=scanner.nextInt();
                String exceptions[]=new String[numpeople];
                for(int i=0;i<exceptions.length;i++) {
                    addDeletePatient.dodawaniepacjentow(patient);
                }
                break;

            case 2:
                addDeletePatient.usuwaniepacjentow(patient);
                break;

            case 3:
               System.out.println("Wybierz pacjenta dla ktorego ma zostac dodana informacja z wizyty: " + addDeletePatient.lista);
               addDeletePatient.dodanieinformacji(patient);
               addDeletePatient.suma();
                break;
            case 4:
                System.exit(0);
                break;
        }
    }
    }

}


