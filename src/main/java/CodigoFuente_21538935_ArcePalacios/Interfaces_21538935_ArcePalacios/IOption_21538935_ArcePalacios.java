package CodigoFuente_21538935_ArcePalacios.Interfaces_21538935_ArcePalacios;

import java.util.List;

/**
 * Interface de Option
 * @author Vicente Arce
 */
public interface IOption_21538935_ArcePalacios {
    /**
     * método que obtiene un código de una opción
     * @return code
     * @author Vicente Arce
     */
    int getCode();

    /**
     * método que obtiene un mensaje de una opción
     * @return message
     * @author Vicente Arce
     */
    String getMessage();

    /**
     * método que obtiene el chatbotCodeLink de una opción
     * @return chatbotCodeLink
     * @author Vicente Arce
     */
    int getChatbotCodeLink();

    /**
     * método que obtiene el InitialFlowCodeLink de una opción
     * @return InitialFlowCodeLink
     * @author Vicente Arce
     */
    int getInitialFlowCodeLink();

    /**
     * método que obtiene las keywords de una opción
     * @return lista de keywords
     * @author Vicente Arce
     */
    List<String> getKeywords();
}
