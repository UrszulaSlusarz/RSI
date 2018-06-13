import jade.core.Agent;
import jade.core.behaviours.*;

public class klasa_2_5 extends Agent {

    private int step=0;
    protected void setup() {
        ParallelBehaviour par = new ParallelBehaviour();
        par.addSubBehaviour( new CyclicBehaviour()
        {
            public void action() {System.out.println( "cyclic 1" ); }
        });

        par.addSubBehaviour( new CyclicBehaviour()
        {
            public void action() { System.out.println( "cyclic 2" ); }
        });
        addBehaviour(par);
    }

    protected void takeDown() {
        System.out.println("zaraz sie usune!");
    }
}

