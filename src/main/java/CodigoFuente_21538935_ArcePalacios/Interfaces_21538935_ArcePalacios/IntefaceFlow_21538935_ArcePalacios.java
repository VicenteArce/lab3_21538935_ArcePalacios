package CodigoFuente_21538935_ArcePalacios.Interfaces_21538935_ArcePalacios;

import CodigoFuente_21538935_ArcePalacios.Models_21538935_ArcePalacios.Option_21538935_ArcePalacios;

import java.util.List;

public interface IntefaceFlow_21538935_ArcePalacios {
    /**
     * método que obtiene el id de un flujo
     * @return id
     */
    int getId();

    /**
     * método que obtiene el mensaje de un flujo
     * @return nameMsg
     */
    String getNameMsg();

    /**
     * método que obtiene la lista de opciones de un flujo
     * @return options
     */
    List<Option_21538935_ArcePalacios> getOptions();

    /**
     * método que permite añadir una opcion a un flujo verficando que la opción no se repita
     * @param option opcion a añadir a un flujo
     */
    void flowAddOption(Option_21538935_ArcePalacios option);
}
