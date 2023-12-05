package CodigoFuente_21538935_ArcePalacios.Interfaces_21538935_ArcePalacios;

import java.util.List;

public interface IOption_21538935_ArcePalacios {
    /**
     * método que obtiene un código de una opción
     * @return code
     */
    int getCode();

    /**
     * método que obtiene un mensaje de una opción
     * @return message
     */
    String getMessage();

    /**
     * método que obtiene el chatbotCodeLink de una opción
     * @return chatbotCodeLink
     */
    int getChatbotCodeLink();

    /**
     * método que obtiene el InitialFlowCodeLink de una opción
     * @return InitialFlowCodeLink
     */
    int getInitialFlowCodeLink();

    /**
     * método que obtiene las keywords de una opción
     * @return lista de keywords
     */
    List<String> getKeywords();
}
