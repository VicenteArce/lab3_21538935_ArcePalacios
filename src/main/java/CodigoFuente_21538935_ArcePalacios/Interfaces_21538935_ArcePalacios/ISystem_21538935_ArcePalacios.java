package CodigoFuente_21538935_ArcePalacios.Interfaces_21538935_ArcePalacios;

import CodigoFuente_21538935_ArcePalacios.Models_21538935_ArcePalacios.AbstractUser_21538935_ArcePalacios;
import CodigoFuente_21538935_ArcePalacios.Models_21538935_ArcePalacios.Chatbot_21538935_ArcePalacios;
import CodigoFuente_21538935_ArcePalacios.Models_21538935_ArcePalacios.System_21538935_ArcePalacios;

import java.util.List;

/**
 * Interface System
 * @author Vicente Arce
 */
public interface ISystem_21538935_ArcePalacios {
    /**
     * método que obtiene el nombre de un sistema
     * @return name
     * @author Vicente Arce
     */
    String getName();

    /**
     * método que obtiene la lista de registerUsers de un sistema
     * @return registerUsers
     * @author Vicente Arce
     */
    List<AbstractUser_21538935_ArcePalacios> getRegisterUsers();

    /**
     * método que obtiene el usuario logueado de un sistema
     * @return logUser
     * @author Vicente Arce
     */
    String getLogUser();

    /**
     * método que obtiene el código actual de flujo en el que esta el sistema
     * @return actualFlowCodeLink
     * @author Vicente Arce
     */
    int getActualFlowCodeLink();

    /**
     * método que añade un chatbot a un sistema si y solo si este no se encuentra previamente en el sistema
     * @param chatbot chatbot que se quiere añadir
     * @author Vicente Arce
     */
    void systemAddChatbot(Chatbot_21538935_ArcePalacios chatbot);

    /**
     * método para registrar usuario a un sistema
     * @param user usuario a registrar
     * @author Vicente Arce
     */
    void systemAddUser(AbstractUser_21538935_ArcePalacios user);

    /**
     * método para loguear un usuario en un sistema
     * @param user nombre del usuario a registrar
     * @author Vicente Arce
     */
    void systemLogin(String user);

    /**
     * método que desloguea a un usuario de un sistema, este reinicia algunos atributos del sistema
     * @author Vicente Arce
     */
    void systemLogout();

    /**
     * método que permite interactuar con el sistema de chatbots
     * @param message mensaje del usuario
     * @author Vicente Arce
     */
    void systemTalk(String message);

    /**
     * método para recuperar el historial de un usuario especifico según su username
     * @param username nombre del usuario
     * @return string (historial del usuario)
     * @author Vicente Arce
     */
    String systemSynthesis(String username);

    /**
     * método que hace una simulación de una interacción con un sistema
     * @param maxInteractions numero maximo de interacciones
     * @param seed numero que será la semilla para la simulación
     * @param system sistema al cual se le hará la simulación
     * @author Vicente Arce
     */
    void systemSimulate(int maxInteractions, long seed, System_21538935_ArcePalacios system);
}
