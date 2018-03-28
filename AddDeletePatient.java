package com.slusarz.patientservice;

import com.slusarz.test.Patient;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddDeletePatient extends Patient implements Print, Comparable<AddDeletePatient> {

    List<String> lista = new ArrayList<>();
    List<AddDeletePatient> listapacjent = new ArrayList<>();
    List<Double> listasuma = new ArrayList<>();


    public void wybieranieosoby(Patient patient) {
            patient.name = scanner.next();
    }

    public void dodawaniepacjentow(Patient patient ) {
        patient.podaniedanych(patient);
        lista.add(patient.name);
        print();
    }

    public void usuwaniepacjentow(Patient patient){
        System.out.println("Ktory pacjent ma zostac usuniety z bazy danych?" +lista);
        wybieranieosoby(patient);
        lista.remove(patient.name);
        print();
    }


    public void dodanieinformacji(Patient patient) {

        print();
        wybieranieosoby(patient);
            while (true) {
                System.out.println("Prosze wwybrac ktora usługa zostala wykonana:");
                System.out.println("1.Wypelnienie ubytku");
                System.out.println("2.Cwiek utrzymujacy wypelnienie");
                System.out.println("3.Leczenie kanalowe");
                System.out.println("4.Usuniecie zeba");
                System.out.println("5.Zdjecie RTG");
                System.out.println("6.Wybielanie zebow");
                System.out.println("7.Higienizacja jamy ustnej");
                System.out.println("8.Ceny wykonanych zabiegow:");

                byte number = scanner.nextByte();
                if (number > 8) {
                    System.out.println("Liczba jaka wprowadziles jest bledna.");
                } else switch (number) {
                    case 1:
                        double one = 150.0;
                        System.out.println("Wypelnienie ubytku cena: " + one + "zl");
                        listasuma.add(one);
                        break;
                    case 2:
                        double two = 135.50;
                        System.out.println("Cwiek utrzymujacy wypelnienie: " + two + "zl");
                        listasuma.add(two);

                        break;
                    case 3:
                        double three = 450.0;
                        System.out.println("Leczenie kanalowe: " + three + "zl");
                        listasuma.add(three);
                        break;
                    case 4:
                        double four = 100.0;
                        System.out.println("Usuniecie zeba: " + four + "zl");
                        listasuma.add(four);
                        break;
                    case 5:
                        double five = 20.0;
                        System.out.println("Zdjecie RTG: " + five + "zl");
                        listasuma.add(five);
                        break;
                    case 6:
                        double six = 600.0;
                        System.out.println("Wybielanie zebow: " + six + "zl");
                        listasuma.add(six);
                        break;
                    case 7:
                        double seven = 120.0;
                        System.out.println("Higienizacja jamy ustnej: " + seven + "zl");
                        listasuma.add(seven);
                        break;
                    case 8:
                        suma();
                    default:
                        System.exit(0);
                        break;
                }
            }

    }

    public double suma(){
        for(int i=0; i<listasuma.size();i++) {
        }
        System.out.println("Ceny usług:"+listasuma);
        return 0;
    }


    @Override
    public void print() {
        System.out.println("Lista pacjentow istniejacych w bazie danych: " +lista);
    }

    @Override
    public int compareTo(AddDeletePatient object) {
        int comparename=name.compareTo(object.name);
        return comparename;
    }
}
