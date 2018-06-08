import jade.core.Agent;
import jade.domain.DFService;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.ServiceDescription;
import jade.domain.FIPAException;

public class wykonawca extends Agent {


    protected void setup() {
        System.out.println("startuje!");

        //Rejestracja usługi:
        // 1. Przygotowanie opisu agenta:
        DFAgentDescription dfd=new DFAgentDescription();
        dfd.setName(getAID());
        ServiceDescription sd=new ServiceDescription();
        sd.setType("POTEGA");
        sd.setName(getName());
        dfd.addServices(sd);

        //• Rejestracja w serwisie:
        try{
            DFService.register(this,dfd);
        }catch (FIPAException fe){
            fe.printStackTrace();
        }
    }
    protected void takeDown() {
        System.out.println("zaraz sie usune!");

        //Wyrejestrowanie z serwisu
        try{
            DFService.deregister(this);
        }catch (FIPAException fe){
            fe.printStackTrace();
        }
    }

}
