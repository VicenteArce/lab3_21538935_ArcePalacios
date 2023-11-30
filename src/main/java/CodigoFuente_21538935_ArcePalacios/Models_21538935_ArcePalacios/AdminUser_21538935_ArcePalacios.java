package CodigoFuente_21538935_ArcePalacios.Models_21538935_ArcePalacios;

public class AdminUser_21538935_ArcePalacios extends AbstractUser_21538935_ArcePalacios{
    /**
     * Constructor de usuario administrador (setea true en isAdmin)
     * @param username nombre del usuario
     */
    public AdminUser_21538935_ArcePalacios(String username) {
        super(username, true);
    }
}
