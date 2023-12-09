package CodigoFuente_21538935_ArcePalacios.Models_21538935_ArcePalacios;

import CodigoFuente_21538935_ArcePalacios.Interfaces_21538935_ArcePalacios.IChatbot_21538935_ArcePalacios;

import java.util.ArrayList;
import java.util.List;

public class Chatbot_21538935_ArcePalacios implements IChatbot_21538935_ArcePalacios {

    private int chatbotId;
    private String name;
    private String welcomeMessage;
    private int startFlowId;
    private List<Flow_21538935_ArcePalacios> flows;

    // RF4
    /**
     * Constructor de Chatbot
     * @param chatbotId id de chatbot
     * @param name nombre de un chatbot
     * @param welcomeMessage mensaje de un chatbot
     * @param startFlowId id inicial de un flujo de un chatbot
     * @param flows flujos de un chatbot
     * @author Vicente Arce
     */
    public Chatbot_21538935_ArcePalacios(int chatbotId, String name, String welcomeMessage, int startFlowId, List<Flow_21538935_ArcePalacios> flows) {
        this.chatbotId = chatbotId;
        this.name = name;
        this.welcomeMessage = welcomeMessage;
        this.startFlowId = startFlowId;
        this.flows = cleanFlowsById(flows);
    }

    // Getters
    /**
     * método que obtiene el chatbotId de un chatbot
     * @return chatbotId
     * @author Vicente Arce
     */
    public int getChatbotId() {
        return chatbotId;
    }

    /**
     * método que obtiene el name de un chatbot
     * @return name
     * @author Vicente Arce
     */
    public String getName() {
        return name;
    }

    /**
     * método que obtiene el welcomeMessage de un chatbot
     * @return welcomeMessage
     * @author Vicente Arce
     */
    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    /**
     * método que obtiene el startFlowId de un chatbot
     * @return startFlowId
     * @author Vicente Arce
     */
    public int getStartFlowId() {
        return startFlowId;
    }

    /**
     * método que obtiene la lista de flujos de un chatbot
     * @return flows
     * @author Vicente Arce
     */
    public List<Flow_21538935_ArcePalacios> getFlows() {
        return flows;
    }

    // Modificadores
    // RF5
    /**
     * método para añadir un flujo a un chatbot siempre y cuando el flujo no se encuentre en el chatbot
     * @param flow flujo que se quire añadir a un chatbot
     * @author Vicente Arce
     */
    public void chatbotAddFlow(Flow_21538935_ArcePalacios flow){
        boolean rep = false;
        for(Flow_21538935_ArcePalacios flowAux: flows){
            if(flowAux.getId() == flow.getId()) {
                rep = true;
                break;
            }
        }

        if (!rep){
            flows.add(flow);
        }
    }

    // Otros métodos

    /**
     * método que permite limpiar flujos por id, es decir, se devuelve una lista de flujos sin repetir (según id)
     * @param flows lista de flujos
     * @return lista de flujos limpiada
     * @author Vicente Arce
     */
    public List<Flow_21538935_ArcePalacios> cleanFlowsById(List<Flow_21538935_ArcePalacios> flows){
        List<Flow_21538935_ArcePalacios> flowsOut = new ArrayList<>();

        for (Flow_21538935_ArcePalacios flow : flows){
            boolean rep = false;

            for (Flow_21538935_ArcePalacios uniqueFlow : flowsOut){
                if(uniqueFlow.getId() == flow.getId()){
                    rep = true;
                }
            }

            if(!rep){
                flowsOut.add(flow);
            }
        }

        return flowsOut;
    }

    // ToString

    /**
     * método que formatea un chatbot como un string
     * @return string
     * @author Vicente Arce
     */
    @Override
    public String toString() {
        return "[" +
                chatbotId +
                ", '" + name + '\'' +
                ", '" + welcomeMessage + '\'' +
                ", " + startFlowId +
                ", " + flows +
                ']';
    }
}
