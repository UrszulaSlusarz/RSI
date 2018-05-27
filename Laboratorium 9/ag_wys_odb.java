import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
//import jade.domain.introspection.ACLMessage;
import java.util.LinkedList;
import java.util.Random;
import jade.core.AID;
import jade.lang.acl.*;
public class ag_wys_odb extends Agent {


    protected void setup() {
        System.out.println("startuje!");
        Random random = new Random();
        int number = random.nextInt(2);
        addBehaviour(new CyclicBehaviour(this) {
            public void action() {

                if (number == 0)
                {
                ACLMessage aclMessage = new ACLMessage(ACLMessage.CFP);
                    aclMessage.addReceiver(new AID("Ala", AID.ISLOCALNAME));
                    aclMessage.setOntology("presence");
                    aclMessage.setContent("wysylam_wiadomosc_CFP");
                    send(aclMessage);
                } else if (number == 1){
                    ACLMessage aclMessage = new ACLMessage(ACLMessage.REQUEST);
                    aclMessage.addReceiver(new AID("Ala", AID.ISLOCALNAME));
                    aclMessage.setOntology("presence");
                    aclMessage.setContent("wysylam_wiadomosc_REQUEST");
                    send(aclMessage);
                }

                ACLMessage msg = myAgent.receive();
                if (msg != null) {
                   if(msg.getPerformative()==ACLMessage.INFORM){
                       System.out.println("INFORM-wiec usuwamy agenta");
                       myAgent.doDelete();

                   }
                }
                else {
                    block();
                }

            }
        });

    }
    protected void takeDown() {
        System.out.println("zaraz sie usune!");
    }

}
