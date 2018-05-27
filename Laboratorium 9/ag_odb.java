import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

public class ag_odb extends Agent{

    protected void setup() {
        System.out.println("startuje!");


        addBehaviour(new CyclicBehaviour() {
            public void action() {
                ACLMessage aclMessage = receive();
                if (aclMessage != null) {
                    ACLMessage aclMessage1 = aclMessage.createReply();
                    if (aclMessage.getPerformative() == ACLMessage.REQUEST) {
                        System.out.println("zawartosc wiadomosci: "+ aclMessage.getContent());
                        aclMessage1.setPerformative(ACLMessage.INFORM);
                        aclMessage1.setContent("wykonalem");
                    } else if(aclMessage.getPerformative() == ACLMessage.CFP){
                        System.out.println("zawartosc wiadomosci: "+aclMessage.getContent());
                        aclMessage1.setPerformative(ACLMessage.REQUEST);
                        aclMessage1.setContent("raz_jeszcze");
                    } else {
                        aclMessage1.setPerformative(ACLMessage.NOT_UNDERSTOOD);
                        aclMessage1.setContent("nie_rozumiem");
                    }
                    myAgent.send(aclMessage1);
                }
                else {
                    block();
                }
            }
        } );
    }
    protected void takeDown() {
        System.out.println("zaraz sie usune!");
    }

}
