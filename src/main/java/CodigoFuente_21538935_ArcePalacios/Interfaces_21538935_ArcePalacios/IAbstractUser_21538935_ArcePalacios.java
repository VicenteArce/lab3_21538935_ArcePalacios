package CodigoFuente_21538935_ArcePalacios.Interfaces_21538935_ArcePalacios;

/**
 * Interface de usuario abstracto
 * @author Vicente Arce
 */
public interface IAbstractUser_21538935_ArcePalacios {
    /**
     * método para obtener el username del usuario
     * @return string
     */
    public String getUsername();

    /**
     * método para obtener el historial del usuario
     * @return historial
     */
    public String getHistorial();

    /**
     * método para obtener el permiso que tiene el usuario
     * @return isAdmin
     */
    public boolean getIsAdmin();
}
