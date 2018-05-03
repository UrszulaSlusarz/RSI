import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.CyclicBehaviour;
import jade.core.behaviours.OneShotBehaviour;
import jade.core.behaviours.SequentialBehaviour;

import java.util.Scanner;

public class klasa_5 extends Agent {

    protected void setup() {
        System.out.println("startuje!");

        Scanner scanner = new Scanner(System.in);
        addBehaviour( new Behaviour()
        {
            public void action() {
                System.out.print("Podaj liczbe calkowita: ");
                int number = scanner.nextInt();
                if(number>0)
                {
                    System.out.println("liczba dodatnia!");
                }
                if(number<0)
                {
                    System.out.println("liczba ujemna!-usuwam Agenta");
                    removeBehaviour(this);
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
