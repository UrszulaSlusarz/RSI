package com.slusarz.patientservice;

import com.slusarz.dataPatient.Patient;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AddDeletePatient extends Patient implements Print, Comparable<AddDeletePatient>{

    List<String> lista = new ArrayList<>();
    List<Double> listasuma = new ArrayList<>();



    public  void wybieranieosoby(Patient patient) {
           patient.name = scanner.next();

        // serializacja

        try {
            ObjectOutputStream in = new ObjectOutputStream(new FileOutputStream("serializable.bin"));
            in.writeObject(patient); // zapisanie obiektu
            in.close(); // zamknięcie strumienia
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        // deserializacja
//        try{
//            ObjectInputStream out= new ObjectInputStream(new FileInputStream("serializable.bin"));
//            Patient obj=(Patient) out.readObject();
//            System.out.println("Name: " +obj.name);
//            out.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
    }


    public void dodawaniepacjentow(Patient patient ) throws FileNotFoundException {
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


    public void dodanieinformacji(Patient patient) throws FileNotFoundException {

        String line="";
        FileInputStream fin=null;
        try{
            fin=new FileInputStream("zapisCen.txt");

        }catch (FileNotFoundException e){
            System.out.println("Nie ma takiego pliku" +e);
            System.exit(-1);
        }

        print();
        wybieranieosoby(patient);
            while (true) {
                System.out.println("Prosze wybrac ktora usługa zostala wykonana:");
                try{
                    fin=new FileInputStream("zapisCen.txt");

                }catch (FileNotFoundException e){
                    System.out.println("Blad" +e);
                    System.exit(-1);
                }
                BufferedReader reader=new BufferedReader(new InputStreamReader(fin));
                try{
                    while((line=reader.readLine()) !=null){
                        System.out.println(line);
                    }

                }catch(IOException e){
                    System.out.println("Blad");
                }

                System.out.println("8.Ceny wykonanych zabiegow:");
                System.out.println("9.Koniec programu:");

                byte number = scanner.nextByte();
                if (number > 9) {
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
                        break;
                    case 9:
                        System.exit(1);
                }
            }
    }

    public void suma() {

        for(int i=0; i<listasuma.size();i++) {
        }
         System.out.println("Ceny usług:"+listasuma);

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
