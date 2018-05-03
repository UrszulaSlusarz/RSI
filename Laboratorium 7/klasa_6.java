import jade.core.Agent;
import jade.core.behaviours.Behaviour;

import java.util.Scanner;

public class klasa_6 extends Agent {


    protected void setup() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("startuje!");

        addBehaviour( new Behaviour()
        {
            public void action() {
                System.out.println( "zachowanie startuje" );
            }
            @Override
            public boolean done() {
                return true; }
        });

        addBehaviour( new Behaviour()
        {
            public void action() {
                System.out.print("Podaj liczbe calkowita: ");
                int number = scanner.nextInt();
                if(number>0) {
                    System.out.println("liczba dodatnia!");
                }
                if(number<0) {
                    System.out.println("liczba ujemna!-usuwam zachowanie Agenta");
                    removeBehaviour(this);
                    System.out.println("zachowanie zakonczone!");
                }
            }
            @Override
            public boolean done() {
                return false;
            }
        });
    }
    protected void takeDown() {
        System.out.println("zaraz sie usune!");
    }
}
