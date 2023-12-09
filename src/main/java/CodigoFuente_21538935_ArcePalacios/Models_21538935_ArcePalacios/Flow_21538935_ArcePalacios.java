package CodigoFuente_21538935_ArcePalacios.Models_21538935_ArcePalacios;

import CodigoFuente_21538935_ArcePalacios.Interfaces_21538935_ArcePalacios.IFlow_21538935_ArcePalacios;

import java.util.ArrayList;
import java.util.List;

public class Flow_21538935_ArcePalacios implements IFlow_21538935_ArcePalacios {

    private int id;
    private String nameMsg;
    private List<Option_21538935_ArcePalacios> options;

    // RF2
    /**
     * Constructor de un flujo
     * @param id id de un flujo
     * @param nameMsg mensaje de un flujo
     * @param options lista de opciones de un flujo
     * @author Vicente Arce
     */
    public Flow_21538935_ArcePalacios(int id, String nameMsg, List<Option_21538935_ArcePalacios> options) {
        this.id = id;
        this.nameMsg = nameMsg;
        this.options = cleanOptionsByCode(options);
    }


    // Getters
    /**
     * método que obtiene el id de un flujo
     * @return id
     * @author Vicente Arce
     */
    public int getId() {
        return id;
    }

    /**
     * método que obtiene el mensaje de un flujo
     * @return nameMsg
     * @author Vicente Arce
     */
    public String getNameMsg() {
        return nameMsg;
    }

    /**
     * método que obtiene la lista de opciones de un flujo
     * @return options
     * @author Vicente Arce
     */
    public List<Option_21538935_ArcePalacios> getOptions() {
        return options;
    }

    // Modificadores

    //RF3
    /**
     * método que permite añadir una opcion a un flujo verficando que la opción no se repita
     * @param option opcion a añadir a un flujo
     * @author Vicente Arce
     */
    public void flowAddOption(Option_21538935_ArcePalacios option){
        boolean rep = false;
        for (Option_21538935_ArcePalacios uniqueOption: options){
            if (uniqueOption.getCode() == option.getCode()) {
                rep = true;
                break;
            }
        }

        if (!rep) {
            options.add(option);
        }
    }

    /**
     * método que devuelve una lista de opciones filtradas en base a su codigo
     * @param options lista de opciones
     * @return optionsOut es una lista de opciones, cuyas opciones fueron  filtradas para que estas no se repitan
     * @author Vicente Arce
     */
    public List<Option_21538935_ArcePalacios> cleanOptionsByCode(List<Option_21538935_ArcePalacios> options) {
        List<Option_21538935_ArcePalacios> optionsOut = new ArrayList<>();

        for (Option_21538935_ArcePalacios option : options) {
            boolean rep = false;

            for (Option_21538935_ArcePalacios uniqueOption : optionsOut) {
                if (uniqueOption.getCode() == option.getCode()) {
                    rep = true;
                    break;
                }
            }

            if (!rep) {
                optionsOut.add(option);
            }
        }

        return optionsOut;
    }

    // ToString

    /**
     * método que formatea un flujo como un string
     * @return flujo formateado como string
     * @author Vicente Arce
     */
    @Override
    public String toString() {
        return "[" +
                id +
                ", '" + nameMsg + '\'' +
                ", " + options +
                ']';
    }
}
