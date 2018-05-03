import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

public class klasa_2 extends Agent{



    protected void setup() {
        System.out.println("startuje!");

        addBehaviour(new OneShotBehaviour() {
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
