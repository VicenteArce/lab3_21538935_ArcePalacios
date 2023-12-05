package CodigoFuente_21538935_ArcePalacios.Interfaces_21538935_ArcePalacios;

import CodigoFuente_21538935_ArcePalacios.Models_21538935_ArcePalacios.Flow_21538935_ArcePalacios;

import java.util.List;

public interface IChatbot_21538935_ArcePalacios {

    /**
     * método que obtiene el chatbotId de un chatbot
     * @return chatbotId
     */
    int getChatbotId();

    /**
     * método que obtiene el name de un chatbot
     * @return name
     */
    String getName();

    /**
     * método que obtiene el welcomeMessage de un chatbot
     * @return welcomeMessage
     */
    String getWelcomeMessage();

    /**
     * método que obtiene el startFlowId de un chatbot
     * @return startFlowId
     */
    int getStartFlowId();

    /**
     * método que obtiene la lista de flujos de un chatbot
     * @return flows
     */
    List<Flow_21538935_ArcePalacios> getFlows();

    void chatbotAddFlow(Flow_21538935_ArcePalacios flow);
}
