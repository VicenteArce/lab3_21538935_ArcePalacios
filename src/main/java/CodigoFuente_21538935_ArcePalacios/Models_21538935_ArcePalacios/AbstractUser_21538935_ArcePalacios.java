package CodigoFuente_21538935_ArcePalacios.Models_21538935_ArcePalacios;

import CodigoFuente_21538935_ArcePalacios.Interfaces_21538935_ArcePalacios.IAbstractUser_21538935_ArcePalacios;

public abstract class AbstractUser_21538935_ArcePalacios implements IAbstractUser_21538935_ArcePalacios {

    protected String username;
    protected String historial;
    protected boolean isAdmin;

    /**
     * Constructor de usuario
     * @param username nombre del usuario
     * @param isAdmin boleano que indica si es o no administrador el usuario
     * @author Vicente Arce
     */
    public AbstractUser_21538935_ArcePalacios(String username, boolean isAdmin){
        this.username = username;
        this.historial = "";
        this.isAdmin = isAdmin;
    }

    // Getters

    /**
     * método para obtener el username del usuario
     * @return string
     * @author Vicente Arce
     */
    public String getUsername() {return username;}

    /**
     * método para obtener el historial del usuario
     * @return historial
     * @author Vicente Arce
     */
    public String getHistorial() {return historial;}

    /**
     * método para obtener el permiso que tiene el usuario
     * @return isAdmin
     * @author Vicente Arce
     */
    public boolean getIsAdmin() {return isAdmin;}

    // Setters
    /**
     * método que permite setear un historial a un usuario
     * @param historial historial del usuario
     * @author Vicente Arce
     */
    public void setHistorial(String historial) {
        this.historial = historial;
    }

    // ToString
    /**
     * método que formatea como un string un usuario
     * @return string
     * @author Vicente Arce
     */
    @Override
    public String toString() {
        return "['" + username + '\'' +
                ", " + "[" + historial + "]"+
                ", " + isAdmin +
                ']';
    }
}
