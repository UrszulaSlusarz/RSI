import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;

public class klasa_3 extends Agent{

    protected void setup() {
        System.out.println("startuje!");

        addBehaviour(new CyclicBehaviour() {
            @Override
            public void action() {
                    System.out.println("wykonuje!");
            }
        });
    }

    protected void takeDown() {
        System.out.println("zaraz sie usune!");
    }
}
