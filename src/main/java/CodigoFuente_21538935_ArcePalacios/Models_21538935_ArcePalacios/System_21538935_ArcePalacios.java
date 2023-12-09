package CodigoFuente_21538935_ArcePalacios.Models_21538935_ArcePalacios;

import CodigoFuente_21538935_ArcePalacios.Interfaces_21538935_ArcePalacios.ISystem_21538935_ArcePalacios;

import java.util.*;

public class System_21538935_ArcePalacios implements ISystem_21538935_ArcePalacios {
    private Date systemDateCreation;
    private String name;
    private int initialChatbotCodeLink;
    private List<Chatbot_21538935_ArcePalacios> chatbots;
    private List<AbstractUser_21538935_ArcePalacios> registerUsers;
    private String logUser;
    private int actualChatbotCodeLink;
    private int actualFlowCodeLink;
    private int placeHolderSimulate;

    // RF7
    /**
     * Constructor de sistema
     * @param name nombre chatbot
     * @param initialChatbotCodeLink codigo de chatbot inicial del sistema
     * @param chatbots lista de chatbots del sistema
     * @author Vicente Arce
     */
    public System_21538935_ArcePalacios(String name, int initialChatbotCodeLink ,List<Chatbot_21538935_ArcePalacios> chatbots) {
        this.systemDateCreation = new Date();
        this.name = name;
        this.initialChatbotCodeLink = initialChatbotCodeLink;
        this.chatbots = cleanChatbotsById(chatbots);
        this.registerUsers = new ArrayList<>();
        this.logUser = null;
        this.actualChatbotCodeLink = initialChatbotCodeLink;
        this.actualFlowCodeLink = -1;
        this.placeHolderSimulate = -1;
    }

    // Getters
    /**
     * método que obtiene el nombre de un sistema
     * @return name
     * @author Vicente Arce
     */
    public String getName() {
        return name;
    }

    /**
     * método que obtiene la lista de registerUsers de un sistema
     * @return registerUsers
     * @author Vicente Arce
     */
    public List<AbstractUser_21538935_ArcePalacios> getRegisterUsers() {
        return registerUsers;
    }

    /**
     * método que obtiene el usuario logueado de un sistema
     * @return logUser
     * @author Vicente Arce
     */
    public String getLogUser() {
        return logUser;
    }

    /**
     * método que obtiene el código actual de flujo en el que esta el sistema
     * @return actualFlowCodeLink
     * @author Vicente Arce
     */
    public int getActualFlowCodeLink() {
        return actualFlowCodeLink;
    }


    //Modificadores

    // RF8
    /**
     * método que añade un chatbot a un sistema si y solo si este no se encuentra previamente en el sistema
     * @param chatbot chatbot que se quiere añadir
     * @author Vicente Arce
     */
    public void systemAddChatbot(Chatbot_21538935_ArcePalacios chatbot){
        boolean rep = false;
        for(Chatbot_21538935_ArcePalacios uniqueChatbot: chatbots){
            if(uniqueChatbot.getChatbotId()== chatbot.getChatbotId()){
                rep = true;
                break;
            }
        }
        if(!rep){
            chatbots.add(chatbot);
        }
    }

    // RF9
    /**
     * método para registrar usuario a un sistema
     * @param user usuario a registrar
     * @author Vicente Arce
     */
    public void systemAddUser(AbstractUser_21538935_ArcePalacios user){
        boolean rep = false;
        for(AbstractUser_21538935_ArcePalacios userAux: registerUsers){
            if(Objects.equals(userAux.getUsername(), user.getUsername())){
                rep = true;
            }
        }
        if(!rep){
            registerUsers.add(user);
            System.out.println("El usuario " + user.getUsername() + " ha sido registrado correctamente.\n");
        }else{
            System.out.println("¡Error! El usuario " + user.getUsername() + " ya se encuentra registrado en el sistema.\n");
        }
    }

    // RF10
    /**
     * método para loguear un usuario en un sistema
     * @param user nombre del usuario a registrar
     * @author Vicente Arce
     */
    public void systemLogin(String user){
        if(logUser != null){
            System.out.println("Lo sentimos, ya hay un usuario logueado.\n");
        }else{
            boolean rep = false;
            for(AbstractUser_21538935_ArcePalacios userAux: registerUsers) {
                if (Objects.equals(userAux.getUsername(), user)) {
                    rep = true;
                    break;
                }
            }
            if(rep){
                logUser = user;
                System.out.print("El usuario " + user +  " ha sido logueado.\n");
            }else{
                System.out.print("El usuario " + user +  " no se encuentra registrado, registrese antes de loguearse.\n");
            }
        }
    }


    // RF11
    /**
     * método que desloguea a un usuario de un sistema, este reinicia algunos atributos del sistema
     * @author Vicente Arce
     */
    public void systemLogout(){
        logUser = null;
        actualChatbotCodeLink = initialChatbotCodeLink;
        actualFlowCodeLink = -1;
        placeHolderSimulate = -1;
    }


    // RF12
    /**
     * método que permite interactuar con el sistema de chatbots
     * @param message mensaje del usuario
     * @author Vicente Arce
     */
    public void systemTalk(String message){
        // Si se cumple, entonces el usuario aun no ha iniciado una conversación con el sistema.
        // Por ende se ira por el camino generico
        if(logUser != null){
            if(actualFlowCodeLink == -1){
                Date fechaCreacion = new Date();
                Chatbot_21538935_ArcePalacios ch = searchChatbotById(chatbots, initialChatbotCodeLink);
                Flow_21538935_ArcePalacios f = searchFlowById(ch.getFlows(), ch.getStartFlowId());
                String formatedOptions = fechaCreacion + " - " + logUser + ": " + message + "\n" + fechaCreacion + " - " + f.getNameMsg() +formatOptionMessages(f)+ "\n";
                formatedOptions = getUser(registerUsers, logUser).getHistorial() + formatedOptions;
                getUser(registerUsers, logUser).setHistorial(formatedOptions);

                // Crear método que devuelva usuario

                actualFlowCodeLink = ch.getStartFlowId();
            }else{
                try{
                    try {
                        int numMessage = Integer.parseInt(message);
                        Date fechaCreacion = new Date();
                        Chatbot_21538935_ArcePalacios ch = searchChatbotById(chatbots, actualChatbotCodeLink);
                        Flow_21538935_ArcePalacios f = searchFlowById(ch.getFlows(), actualFlowCodeLink);
                        Option_21538935_ArcePalacios op = recuperarOpcionPorCode(f.getOptions(), numMessage);
                        int nextChatbotCode = op.getChatbotCodeLink();
                        int nextFlowCode = op.getInitialFlowCodeLink();
                        Chatbot_21538935_ArcePalacios chNext = searchChatbotById(chatbots, nextChatbotCode);
                        Flow_21538935_ArcePalacios fNext  = searchFlowById(chNext.getFlows(), nextFlowCode);

                        String formatedOptions = fechaCreacion + " - " + logUser + ": " + numMessage + "\n" + fechaCreacion + " - " + fNext.getNameMsg() + formatOptionMessages(fNext)+ "\n";
                        formatedOptions = getUser(registerUsers, logUser).getHistorial() + formatedOptions;
                        getUser(registerUsers, logUser).setHistorial(formatedOptions);

                        actualChatbotCodeLink = nextChatbotCode;
                        actualFlowCodeLink = nextFlowCode;
                    } catch (Exception e){
                        int numMessage = Integer.parseInt(message); // Hago esto para que tire error en el caso de que no se pueda transformar a numero y salte al siguiente catch
                        System.out.println("¡Error! Ingresa una opción corecta\n");
                    }

                } catch (NumberFormatException e){
                    try{
                        Date fechaCreacion = new Date();
                        Chatbot_21538935_ArcePalacios ch = searchChatbotById(chatbots, actualChatbotCodeLink);
                        Flow_21538935_ArcePalacios f = searchFlowById(ch.getFlows(), actualFlowCodeLink);
                        Option_21538935_ArcePalacios op = recuperarOpcionPorKeyword(f.getOptions(), message);

                        int nextChatbotCode = op.getChatbotCodeLink();
                        int nextFlowCode = op.getInitialFlowCodeLink();
                        Chatbot_21538935_ArcePalacios chNext = searchChatbotById(chatbots, nextChatbotCode);
                        Flow_21538935_ArcePalacios fNext  = searchFlowById(chNext.getFlows(), nextFlowCode);

                        String formatedOptions = fechaCreacion + " - " + logUser + ": " + message + "\n" + fechaCreacion + " - " + fNext.getNameMsg() + formatOptionMessages(fNext)+ "\n";
                        formatedOptions = getUser(registerUsers, logUser).getHistorial() + formatedOptions;
                        getUser(registerUsers, logUser).setHistorial(formatedOptions);

                        actualChatbotCodeLink = nextChatbotCode;
                        actualFlowCodeLink = nextFlowCode;
                    }catch (Exception e1){
                        System.out.println("¡Error! Ingresa una opción corecta\n");
                    }
                }

            }
        }else{
            System.out.println("¡Error!, no hay ningun usuario logueado");
        }
    }

    // RF13
    /**
     * método para recuperar el historial de un usuario especifico según su username
     * @param username nombre del usuario
     * @return string (historial del usuario)
     * @author Vicente Arce
     */
    public String systemSynthesis(String username){
        AbstractUser_21538935_ArcePalacios user = recuperarUserPorName(username);
        if(user == null){
            return "\n-------------" + username + "-------------\n" +"El usuario no esta registrado, por ende no tiene un historial";
        } else if (Objects.equals(user.getHistorial(), "")) {
            return "\n-------------" + username + "-------------\nEl usuario no ha interactuado con el sistema aún";
        } else{
            return "\n-------------" + username + "-------------\n" + user.getHistorial();
        }
    }

    // RF14
    /**
     * método que hace una simulación de una interacción con un sistema
     * @param maxInteractions numero maximo de interacciones
     * @param seed numero que será la semilla para la simulación
     * @param system sistema al cual se le hará la simulación
     * @author Vicente Arce
     */
    public void systemSimulate(int maxInteractions, long seed, System_21538935_ArcePalacios system){
        Random randomSeed = new Random(seed);
        for(int i = maxInteractions; i >= 0; i--){
            if(system.placeHolderSimulate == -1){
                ComunUser_21538935_ArcePalacios user = new ComunUser_21538935_ArcePalacios("User" + seed);
                system.systemAddUser(user);
                system.systemLogout();
                system.systemLogin(user.getUsername());
                systemTalk("Hola");
                system.placeHolderSimulate = 1; // Como ya se inicio la simulación, cambio el placeHolderSimulate
            }else{
                long nextSeed = Math.abs(randomSeed.nextInt());
                Chatbot_21538935_ArcePalacios ch = searchChatbotById(system.chatbots, system.actualChatbotCodeLink);
                Flow_21538935_ArcePalacios f = searchFlowById(ch.getFlows(), actualFlowCodeLink);
                long randomOption = (nextSeed % f.getOptions().size()) + 1 ;
                systemTalk("" + randomOption);
            }
        }
    }


    // Otros métodos

    /**
     * método que devuelve una lista de chatbots filtrados en base a su id
     * @param chatbots lista de chatbots
     * @return lista de chatbots filtrados por id
     * @author Vicente Arce
     */
    public List<Chatbot_21538935_ArcePalacios> cleanChatbotsById(List<Chatbot_21538935_ArcePalacios> chatbots) {
        List<Chatbot_21538935_ArcePalacios> chatbotsOut = new ArrayList<>();

        for (Chatbot_21538935_ArcePalacios chatbot : chatbots) {
            boolean rep = false;

            for (Chatbot_21538935_ArcePalacios uniqueChatbot : chatbotsOut) {
                if (uniqueChatbot.getChatbotId() == chatbot.getChatbotId()) {
                    rep = true;
                    break;
                }
            }
            if (!rep) {
                chatbotsOut.add(chatbot);
            }
        }
        return chatbotsOut;
    }

    // Métodos para systemTalk [RF12]
    /**
     * Método para recuperar una opcion por su codigo
     * @param opciones lista de opciones
     * @param numMessage codigo de la opcion que se quiere elegir
     * @return opcion
     * @author Vicente Arce
     */
    public Option_21538935_ArcePalacios recuperarOpcionPorCode (List<Option_21538935_ArcePalacios> opciones, int numMessage){
        for(Option_21538935_ArcePalacios opcion: opciones){
            if(opcion.getCode() == numMessage) {
                return opcion;
            }
        }
        return null;
    }

    /**
     * método para recuperar una opcion por keyword
     * @param opciones lista de opciones
     * @param message keyword de la opcion que se quiere elegir
     * @return opcion
     * @author Vicente Arce
     */
    public Option_21538935_ArcePalacios recuperarOpcionPorKeyword(List<Option_21538935_ArcePalacios> opciones, String message){
        for(Option_21538935_ArcePalacios opcion: opciones){
            if(opcion.getKeywords().contains(message)) {
                return opcion;
            }
        }
        return null;
    }

    /**
     * método para recuperar un chatbot por id
     * @param chatbots lista de chatbots
     * @param numero id de un chatbot
     * @return chatbot
     * @author Vicente Arce
     */
    public Chatbot_21538935_ArcePalacios searchChatbotById(List<Chatbot_21538935_ArcePalacios> chatbots, int numero){
        for(Chatbot_21538935_ArcePalacios chatbot: chatbots){
            if(chatbot.getChatbotId() == numero) {
                return chatbot;
            }
        }
        return null;
    }

    /**
     * método para recuperar un flujo por id
     * @param flows lista de flujos
     * @param numero id de un flujo
     * @return flow
     * @author Vicente Arce
     */
    public Flow_21538935_ArcePalacios searchFlowById(List<Flow_21538935_ArcePalacios> flows, int numero){
        for(Flow_21538935_ArcePalacios flow: flows){
            if(flow.getId() == numero) {
                return flow;
            }
        }
        return null;
    }

    /**
     * método para formatear los mensajes de las opciones de un flujo
     * @param flow flujo
     * @return formatMessages
     * @author Vicente Arce
     */
    public String formatOptionMessages(Flow_21538935_ArcePalacios flow){
        String formatMessages = "\n";
        List<Option_21538935_ArcePalacios> options = flow.getOptions();
        for(Option_21538935_ArcePalacios option: options){
            formatMessages = formatMessages + option.getMessage() + "\n";
        }
        return formatMessages;
    }

    /**
     * método que obtiene el usuario según su username
     * @param users lista de usuarios
     * @param logUser username
     * @return usuario que tiene como username logUser
     * @author Vicente Arce
     */
    public AbstractUser_21538935_ArcePalacios getUser(List<AbstractUser_21538935_ArcePalacios> users, String logUser){
        for(AbstractUser_21538935_ArcePalacios user: users){
            if(Objects.equals(user.getUsername(), logUser)){
                return user;
            }
        }
        return null;
    }

    // Método para systemSynthesis [RF13]
    /**
     * Método para obtener un usuario según su username
     * @param username nombre del usuario
     * @return userAux
     * @author Vicente Arce
     */
    public AbstractUser_21538935_ArcePalacios recuperarUserPorName(String username){
        AbstractUser_21538935_ArcePalacios user;
        for(AbstractUser_21538935_ArcePalacios userAux: registerUsers) {
            if (Objects.equals(userAux.getUsername(), username)) {
                return userAux;
            }
        }
        return null;

    }


    // ToString
    /**
     * método que formatea un sistema como un string
     * @return string
     * @author Vicente Arce
     */
    @Override
    public String toString() {
        return String.format(
                "%n[" +
                "Fecha de Creación = '%s',%n" +
                " nombre = %s,%n" +
                " initialChatbotCodeLink = %s,%n" +
                " chatbots = %s,%n" +
                " usuarios registrados = %s,%n" +
                " usuario logueado = '%s',%n" +
                " actualChatbotCodeLink = %s,%n" +
                " actualFlowCodeLink = %s,%n" +
                " placeHolderSimulate = %s,%n" +
                "]%n",
                systemDateCreation,
                name,
                initialChatbotCodeLink,
                chatbots,
                registerUsers,
                logUser,
                actualChatbotCodeLink,
                actualFlowCodeLink,
                placeHolderSimulate
                );
    }
}
