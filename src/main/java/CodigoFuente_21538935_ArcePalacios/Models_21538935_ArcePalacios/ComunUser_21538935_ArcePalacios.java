package CodigoFuente_21538935_ArcePalacios.Models_21538935_ArcePalacios;

/**
 * Clase AdminUser, esta hereda atributos y métodos de AbstractUser
 * @author Vicente Arce
 */
public class ComunUser_21538935_ArcePalacios extends AbstractUser_21538935_ArcePalacios{

    /**
     * Constructor de usuario comun (Setea false en isAdmin)
     * @param username nombre del usuario
     * @author Vicente Arce
     */
    public ComunUser_21538935_ArcePalacios(String username) {
        super(username, false);
    }
}
