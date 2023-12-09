package CodigoFuente_21538935_ArcePalacios.Models_21538935_ArcePalacios;

import CodigoFuente_21538935_ArcePalacios.Interfaces_21538935_ArcePalacios.IOption_21538935_ArcePalacios;

import java.util.List;

public class Option_21538935_ArcePalacios implements IOption_21538935_ArcePalacios {
    private int code;
    private String message;
    private int chatbotCodeLink;
    private int initialFlowCodeLink;
    private List<String> keywords;


    // RF1
    /**
     * Constructor de option
     * @param code código de la opción
     * @param message mensaje de la opción
     * @param chatbotCodeLink código del chatbot al que se le asocia la opción
     * @param initialFlowCodeLink código del flow al que se le asocia la opción
     * @param keywords lista de palabras claves
     * @author Vicente Arce
     */
    public Option_21538935_ArcePalacios(int code, String message, int chatbotCodeLink, int initialFlowCodeLink, List<String> keywords) {
        this.code = code;
        this.message = message;
        this.chatbotCodeLink = chatbotCodeLink;
        this.initialFlowCodeLink = initialFlowCodeLink;
        this.keywords = keywords;
    }

    // Getters
    /**
     * método que obtiene el código de una opción
     * @return code
     * @author Vicente Arce
     */
    public int getCode() {
        return code;
    }

    /**
     * método que obtiene el mensaje de una opción
     * @return message
     * @author Vicente Arce
     */
    public String getMessage() {
        return message;
    }

    /**
     * método que obtiene el chatbotCodeLink de una opción
     * @return chatbotCodeLink
     * @author Vicente Arce
     */
    public int getChatbotCodeLink() {
        return chatbotCodeLink;
    }

    /**
     * método que obtiene el initialFlowCodeLink de una opción
     * @return initialFlowCodeLink
     * @author Vicente Arce
     */
    public int getInitialFlowCodeLink() {
        return initialFlowCodeLink;
    }

    /**
     * método que obtiene la lista de keywords de una opción
     * @return keywords
     * @author Vicente Arce
     */
    public List<String> getKeywords() {
        return keywords;
    }

    /**
     * método que setea una lista de keywords en una opción
     * @param keywords lista de palabras claves
     * @author Vicente Arce
     */
    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    // ToString
    /**
     * método que formatea como un string una opción
     * @return string
     * @author Vicente Arce
     */
    @Override
    public String toString() {
        return "[" +
                code +
                ", '" + message + '\'' +
                ", " + chatbotCodeLink +
                ", " + initialFlowCodeLink +
                ", " + keywords +
                ']';
    }
}
