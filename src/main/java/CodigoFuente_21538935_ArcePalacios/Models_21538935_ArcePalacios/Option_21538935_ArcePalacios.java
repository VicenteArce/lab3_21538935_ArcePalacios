package CodigoFuente_21538935_ArcePalacios.Models_21538935_ArcePalacios;

import CodigoFuente_21538935_ArcePalacios.Interfaces_21538935_ArcePalacios.InterfaceOption_21538935_ArcePalacios;

import java.util.List;

public class Option_21538935_ArcePalacios implements InterfaceOption_21538935_ArcePalacios {
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
     */
    public int getCode() {
        return code;
    }

    /**
     * método que obtiene el mensaje de una opción
     * @return message
     */
    public String getMessage() {
        return message;
    }

    /**
     * método que obtiene el chatbotCodeLink de una opción
     * @return chatbotCodeLink
     */
    public int getChatbotCodeLink() {
        return chatbotCodeLink;
    }

    /**
     * método que obtiene el initialFlowCodeLink de una opción
     * @return initialFlowCodeLink
     */
    public int getInitialFlowCodeLink() {
        return initialFlowCodeLink;
    }

    /**
     * método que obtiene la lista de keywords de una opción
     * @return keywords
     */
    public List<String> getKeywords() {
        return keywords;
    }

    // ToString
    /**
     * método que formatea como un string una opción
     * @return string
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
