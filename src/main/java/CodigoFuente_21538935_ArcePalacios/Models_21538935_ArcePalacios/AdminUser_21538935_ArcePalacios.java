package CodigoFuente_21538935_ArcePalacios.Models_21538935_ArcePalacios;

/**
 * Clase AdminUser, esta hereda atributos y métodos de AbstractUser
 * @author Vicente Arce
 */
public class AdminUser_21538935_ArcePalacios extends AbstractUser_21538935_ArcePalacios{
    /**
     * Constructor de usuario administrador (setea true en isAdmin)
     * @param username nombre del usuario
     * @author Vicente Arce
     */
    public AdminUser_21538935_ArcePalacios(String username) {
        super(username, true);
    }
}
