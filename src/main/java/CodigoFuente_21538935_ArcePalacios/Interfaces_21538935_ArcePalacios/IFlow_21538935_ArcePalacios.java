package CodigoFuente_21538935_ArcePalacios.Interfaces_21538935_ArcePalacios;

import CodigoFuente_21538935_ArcePalacios.Models_21538935_ArcePalacios.Option_21538935_ArcePalacios;

import java.util.List;

/**
 * Interface de Flow
 * @author Vicente Arce
 */
public interface IFlow_21538935_ArcePalacios {
    /**
     * método que obtiene el id de un flujo
     * @return id
     * @author Vicente Arce
     */
    int getId();

    /**
     * método que obtiene el mensaje de un flujo
     * @return nameMsg
     * @author Vicente Arce
     */
    String getNameMsg();

    /**
     * método que obtiene la lista de opciones de un flujo
     * @return options
     * @author Vicente Arce
     */
    List<Option_21538935_ArcePalacios> getOptions();

    /**
     * método que permite añadir una opcion a un flujo verficando que la opción no se repita
     * @param option opcion a añadir a un flujo
     * @author Vicente Arce
     */
    void flowAddOption(Option_21538935_ArcePalacios option);
}
