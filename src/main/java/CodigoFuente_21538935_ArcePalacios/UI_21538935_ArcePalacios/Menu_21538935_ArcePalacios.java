package CodigoFuente_21538935_ArcePalacios.UI_21538935_ArcePalacios;

import CodigoFuente_21538935_ArcePalacios.Models_21538935_ArcePalacios.*;

import java.util.*;

public class Menu_21538935_ArcePalacios {

    private List<Option_21538935_ArcePalacios> opcionesMain = new ArrayList<>();
    private List<Flow_21538935_ArcePalacios> flujosMain = new ArrayList<>();
    private List<Chatbot_21538935_ArcePalacios> chatbotsMain = new ArrayList<>();

    private List<System_21538935_ArcePalacios> sistemasMain = new ArrayList<>();
    /**
     * Constructor de menú
     */
    public Menu_21538935_ArcePalacios() {
    }

    /**
     * método que sigue toda la logica de un menú, se encarga de regoger el sistema ya creado en el Main
     * @param s1 sistema cargado en Main
     * @author Vicente Arce
     */
    public void principalMenu(System_21538935_ArcePalacios s1){
        sistemasMain.add(s1);
        while (true){
            Scanner input = new Scanner(System.in);
            printPrincipalMenu();
            printSistemasCreadosV1(sistemasMain);
            System.out.println("\nIngrese el indice del sistema con el cual quiere interactuar: ");
            try {
                int index = input.nextInt();
                input.nextLine();
                if(index == 0){
                    System.exit(0);
                    break;
                }else {
                    s1 = sistemasMain.get(index - 1);
                    firstMenu(sistemasMain.get(index - 1));
                }
            } catch (Exception e){
                System.out.println("Ingresa un valor correcto por favor");
            }
        }
    }


    /**
     * método que tiene toda la lógica del primer menu, se muestran opciones como el registrar y loguear
     * @param s1 sistema con el cual se esta interactuando
     * @author Vicente Arce
     */
    public void firstMenu(System_21538935_ArcePalacios s1){
        int FIRST_MENU_EXIT_OPTION = 3;
        Scanner input = new Scanner(System.in);
        int choice = 0;
        String nombreUsuario;
        do{
            printFirstMenu();
            try{
                choice = input.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Por favor ingresa una opción correcta");
                continue;
            } finally {
                input.nextLine();
            }
            switch (choice){
                case 1:
                    registerMenu(s1);
                    break;
                case 2:
                    if(s1.getRegisterUsers().isEmpty()){
                        System.out.println("Asegurate de registrar a algun usuario antes de registrarte");
                    }else{
                        System.out.println("INTRODUZCA EL NOMBRE DEL USUARIO QUE QUIERE LOGUEAR");
                        nombreUsuario = input.nextLine();
                        s1.systemLogin(nombreUsuario);
                        if(s1.getLogUser() != null){
                            if(s1.getUser(s1.getRegisterUsers(), nombreUsuario).getIsAdmin()){
                                adminUserMenu(s1);
                            } else {
                                comunUserMenu(s1);
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Te has salido del sistema de chatbots " + s1.getName());
                    break;
                default:
                    System.out.println(choice + " ¡no es una opción valida! Por favor selecciona una opción correcta");
                    break;
            }
        } while (choice != FIRST_MENU_EXIT_OPTION);
    }

    /**
     * método que maneja la logica para poder registrar un usuario como admin o como usuario comun
     * @param s1 sistema con el cual se esta interactuando
     * @author Vicente Arce
     */
    public void registerMenu(System_21538935_ArcePalacios s1){
        int REGISTER_MENU_EXIT_OPTION = 3;
        Scanner input = new Scanner(System.in);
        int choice = 0;
        String nombreUsuario;

        do{
            printRegisterMenu();
            try {
                choice = input.nextInt();
            }catch (Exception e){
                System.out.println("Por favor ingresa una opción correcta");
                continue;
            } finally {
                input.nextLine();
            }
            switch (choice){
                case 1:
                    System.out.println("\nINGRESA EL NOMBRE DEL USUARIO COMUN QUE QUIERES REGISTRAR: ");
                    nombreUsuario = input.nextLine();
                    ComunUser_21538935_ArcePalacios comunUser = new ComunUser_21538935_ArcePalacios(nombreUsuario);
                    s1.systemAddUser(comunUser);
                    break;
                case 2:
                    System.out.println("\nINGRESA EL NOMBRE DEL USUARIO ADMINISTRADOR QUE QUIERES REGISTRAR: ");
                    nombreUsuario = input.nextLine();
                    AdminUser_21538935_ArcePalacios adminUser = new AdminUser_21538935_ArcePalacios(nombreUsuario);
                    s1.systemAddUser(adminUser);
                    break;
                case 3:
                    break;
                default:
                    System.out.println(choice + " ¡no es una opción valida! Seleccione una opción correcta.");
                    break;
            }
        } while (choice != REGISTER_MENU_EXIT_OPTION);
    }

    /**
     * método que maneja la lógica de las funcionalidades que realiza el usuario administrador
     * @param s1 sistema con el cual se esta interactuando
     * @author Vicente Arce
     */
    public void adminUserMenu(System_21538935_ArcePalacios s1){

        int ADMIN_MENU_EXIT_OPTION = 13;
        Scanner input = new Scanner(System.in);
        int choice = 0;
        do{
            printAdminUserMenu();
            try{
                choice = input.nextInt();
                input.nextLine();
            } catch (InputMismatchException e){
                System.out.println("Por favor ingresa una opción correcta");
                continue;
            }
            switch (choice){
                case 1:
                    try{
                        System.out.println("\nINTRODUZCA EL ID DE LA OPCIÓN: ");
                        int idOpcion = input.nextInt();
                        input.nextLine();
                        System.out.println("\nINTRODUZCA EL MENSAJE DE LA OPCIÓN: ");
                        String mensajeOpcion = input.nextLine();
                        System.out.println("\nINTRODUZCA EL CHATBOTCODELINK DE LA OPCIÓN: ");
                        int chatbotCodeLinkOpcion = input.nextInt();
                        input.nextLine();
                        System.out.println("\nINTRODUZCA EL INITIALFLOWCODELINK DE LA OPCIÓN: ");
                        int initialFlowCodeLink = input.nextInt();
                        input.nextLine();
                        Option_21538935_ArcePalacios opcionCreadaCase1 = new Option_21538935_ArcePalacios(idOpcion, mensajeOpcion, chatbotCodeLinkOpcion, initialFlowCodeLink, new ArrayList<>());
                        System.out.println("\nINTRODUZCA LA CANTIDAD DE KEYWORDS QUE QUIERE QUE TENGA SU OPCIÓN: ");
                        int cantidadKeywords = input.nextInt();
                        input.nextLine();
                        List<String> keywordsCase1 = new ArrayList<>();
                        for(int i = 0; i < cantidadKeywords; i++){
                            System.out.println("\nINGRESE UNA KEYWORD: ");
                            String keyword = input.nextLine();
                            keywordsCase1.add(keyword);
                        }
                        opcionCreadaCase1.setKeywords(keywordsCase1);
                        opcionesMain.add(opcionCreadaCase1);
                        System.out.println("\nSu opción ha sido creda con exito");
                    }catch (Exception e){
                        System.out.println("\nIntroduce valores correctos");
                        input.nextLine();
                    }
                    break;
                case 2:
                    try {
                        System.out.println("\nINTRODUZCA EL ID DEL FLUJO: ");
                        int idFlow = input.nextInt();
                        input.nextLine();
                        System.out.println("\nINTRODUZCA EL MENSAJE DEL FLOW: ");
                        String nameMsgFlow = input.nextLine();
                        System.out.println("\nINTRODUZCA LA CANTIDAD DE OPCIONES QUE QUIERE PONER EN EL FLOW: ");
                        int cantidadOpciones = input.nextInt();
                        input.nextLine();
                        if(opcionesMain.isEmpty()){
                            System.out.println("No has creado ninguna opción, por ende su flujo se ha creado sin opciones");
                            Flow_21538935_ArcePalacios flowCreadoCase2 = new Flow_21538935_ArcePalacios(idFlow, nameMsgFlow, new ArrayList<>());
                            flujosMain.add(flowCreadoCase2);
                        }else {
                            List<Option_21538935_ArcePalacios> opcionesCase2 = new ArrayList<>();
                            printOpcionesCreadas(opcionesMain);
                            for(int i = 0; i < cantidadOpciones; i++){
                                try{
                                    System.out.println("\nINGRESE EL INDICE DE LA OPCIÓN QUE QUIERE AGREGAR: ");
                                    int indexOpcion = input.nextInt();
                                    input.nextLine();
                                    Option_21538935_ArcePalacios opcionCase2 = opcionesMain.get(indexOpcion);
                                    opcionesCase2.add(opcionCase2);
                                } catch (Exception e2) {
                                    System.out.println("\nSu ultima opción no fue agregada porque no se reconocio el indice");
                                }
                            }
                            Flow_21538935_ArcePalacios flowCreadoCase2 = new Flow_21538935_ArcePalacios(idFlow, nameMsgFlow, opcionesCase2);
                            System.out.println("\nSu flujo ha sido creado con exito");
                            flujosMain.add(flowCreadoCase2);
                        }
                    }catch (Exception e){
                        System.out.println("\nPor favor introduce valores correctos");
                        input.nextLine();
                    }
                    break;
                case 3:
                    if(flujosMain.isEmpty() && opcionesMain.isEmpty()){
                        System.out.println("\nAsegurate de tener al menos un flujo y una opcion creada antes de querer usar esta funcionalidad");
                    }else {
                        printFlujosCreados(flujosMain);
                        System.out.println("\nINGRESE EL INDICE DEL FLUJO AL QUE QUIERE AGREGAR UNA OPCIÓN: ");
                        try {
                            int index = input.nextInt();
                            input.nextLine();
                            Flow_21538935_ArcePalacios flowCase3 = flujosMain.get(index);
                            printOpcionesCreadas(opcionesMain);
                            System.out.println("\nINGRESE EL INDICE DE LA OPCIÓN QUE QUIERE AGREGAR AL FLUJO: ");
                            int index2 = input.nextInt();
                            input.nextLine();
                            Option_21538935_ArcePalacios optionCase3 = opcionesMain.get(index2);
                            flowCase3.flowAddOption(optionCase3);
                            flujosMain.remove(index);
                            flujosMain.add(flowCase3);

                        } catch (Exception e){
                            System.out.println("Lo sentimos, algún valor que ingresaste es erroneo");
                            input.nextLine();
                        }
                    }
                    break;
                case 4:
                    try{
                        System.out.println("\nINTRODUZCA EL ID DEL CHATBOT: ");
                        int chatbotId = input.nextInt();
                        input.nextLine();
                        System.out.println("\nINTRODUZCA EL NOMBRE DEL CHATBOT: ");
                        String name = input.nextLine();
                        System.out.println("\nINTRODUZCA EL WELCOMEMESSAGE DEL CHATBOT: ");
                        String welcomeMessage = input.nextLine();
                        System.out.println("\nINTRODUZCA EL STARTFLOWID DEL CHATBOT: ");
                        int startFlowId = input.nextInt();
                        input.nextLine();
                        System.out.println("\nINTRODUZCA LA CANTIDAD DE FLUJOS QUE QUIERE PONER EN EL CHATBOT: ");
                        int cantidadOpciones = input.nextInt();
                        input.nextLine();
                        if(flujosMain.isEmpty()){
                            System.out.println("No has creado ningun flujo, por ende su chatbot se ha creado sin opciones");
                            Chatbot_21538935_ArcePalacios chatbotCreadoCase4 = new Chatbot_21538935_ArcePalacios(chatbotId, name, welcomeMessage, startFlowId, new ArrayList<>());
                            chatbotsMain.add(chatbotCreadoCase4);
                        }else {
                            List<Flow_21538935_ArcePalacios> flowsCase4 = new ArrayList<>();
                            printFlujosCreados(flujosMain);
                            for (int i = 0;i < cantidadOpciones;i++){
                                try {
                                    System.out.println("\nINGRESE EL INDICE DEL FLUJO QUE QUIERE AGREGAR: ");
                                    int indexFlow = input.nextInt();
                                    input.nextLine();
                                    Flow_21538935_ArcePalacios flowCase4 = flujosMain.get(indexFlow);
                                    flowsCase4.add(flowCase4);
                                } catch (Exception e){
                                    System.out.println("\nSu ultima opción no fue agregada porque no se reconocio el indice");
                                }
                            }
                            Chatbot_21538935_ArcePalacios chatbotCase4 = new Chatbot_21538935_ArcePalacios(chatbotId,name,welcomeMessage,startFlowId, flowsCase4);
                            System.out.println("\nSu chatbot ha sido creado con exito");
                            chatbotsMain.add(chatbotCase4);
                        }
                    }catch (Exception e){
                        System.out.println("\nPor favor introduce valores correctos");
                        input.nextLine();
                    }
                    break;
                case 5:
                    if(chatbotsMain.isEmpty() && flujosMain.isEmpty()){
                        System.out.println("\nAsegurate de tener al menos un chatbot y un flujo creado antes de querer usar esta funcionalidad");
                    }else {
                        printChatbotsCreados(chatbotsMain);
                        System.out.println("\nINGRESE EL INDICE DEL CHATBOT AL QUE QUIERE AGREGAR UN FLUJO: ");
                        try {
                            int index = input.nextInt();
                            input.nextLine();
                            Chatbot_21538935_ArcePalacios chatbotCase5 = chatbotsMain.get(index);
                            printFlujosCreados(flujosMain);
                            System.out.println("\nINGRESE EL INDICE DEL FLUJO QUE QUIERE AGREGAR AL CHATBOT: ");
                            int index2 = input.nextInt();
                            input.nextLine();
                            Flow_21538935_ArcePalacios flowCase5 = flujosMain.get(index2);
                            chatbotCase5.chatbotAddFlow(flowCase5);
                            flujosMain.remove(index);
                            flujosMain.add(flowCase5);

                        } catch (Exception e){
                            System.out.println("Lo sentimos, algún valor que ingresaste es erroneo");
                            input.nextLine();
                        }
                    }
                    break;
                case 6:
                    try {
                        System.out.println("\nINTRODUZCA EL NOMBRE DEL SISTEMA: ");
                        String name = input.nextLine();
                        System.out.println(("\nINTRODUZCA EL INTIALCHATBOTCODELINK DEL SISTEMA: "));
                        int chatbotIncial = input.nextInt();
                        input.nextLine();
                        System.out.println("\nINTRODUZCA LA CANTIDAD DE CHATBOTS QUE QUIERES INTRODUCIR A TU SISTEMA");
                        int cantidad = input.nextInt();
                        input.nextLine();
                        if(chatbotsMain.isEmpty()){
                            System.out.println("No has creado ningún chatbot, por ende tu sistema ha sido creado sin chatbots");
                            System_21538935_ArcePalacios sistemaAux = new System_21538935_ArcePalacios(name, chatbotIncial, new ArrayList<>());
                            sistemasMain.add(sistemaAux);
                        }else {
                            List<Chatbot_21538935_ArcePalacios> chatbotsCase7 = new ArrayList<>();
                            printChatbotsCreados(chatbotsMain);
                            for (int i = 0; i < cantidad; i ++){
                                try {
                                    System.out.println("\nINGRESE EL INDICE DEL CHATBOT QUE QUIERE AGREGAR: ");
                                    int index = input.nextInt();
                                    input.nextLine();
                                    Chatbot_21538935_ArcePalacios chatbotAux = chatbotsMain.get(index);
                                    chatbotsCase7.add(chatbotAux);
                                }catch (Exception e){
                                    System.out.println("El ultimo indice introducido no pertenece al de un chatbot creado, intenta nuevamente");
                                }
                            }
                            System_21538935_ArcePalacios sistemaAux = new System_21538935_ArcePalacios(name, chatbotIncial, chatbotsCase7);
                            System.out.println("Su sistema ha sido creado con exito");
                            sistemasMain.add(sistemaAux);
                        }
                    }catch (Exception e){
                        System.out.println("\nPor favor ingrese valores correctos");
                        input.nextLine();
                    }
                    break;
                case 7:
                    if(chatbotsMain.isEmpty()){
                        System.out.println("\nAntes de querer agregar un chatbot a un sistema, por favor crea al menos un chatbot");
                    }else{
                        printChatbotsCreados(chatbotsMain);
                        System.out.println("\nINGRESE EL INDICE DEL CHATBOT QUE QUIERE AGREGAR AL SISTEMA: ");
                        try {
                            int index = input.nextInt();
                            input.nextLine();
                            Chatbot_21538935_ArcePalacios chatbotCase6 = chatbotsMain.get(index);
                            s1.systemAddChatbot(chatbotCase6);
                            System.out.println("\nLa operación se ha realizado, si el id de tu chatbot coincidia con uno ya exitente en el sistema, este no será agregado");
                        } catch (Exception e){
                            System.out.println("Lo sentimos, algún valor que ingresaste es erroneo");
                            input.nextLine();
                        }
                    }
                    break;
                case 8:
                    s1.systemLogout();
                    choice = ADMIN_MENU_EXIT_OPTION;
                    break;
                case 9:
                    if(s1.getActualFlowCodeLink() == -1){
                        System.out.println("Saluda al sistema de chatbots: ");
                        String mensajeSystemTalk = input.nextLine();
                        s1.systemTalk(mensajeSystemTalk);
                    }else{
                        System.out.println(s1.systemSynthesis(s1.getLogUser()));
                        System.out.println("INTRODUZCA UN MENSAJE (opción que quiere elegir): ");
                        String mensajeSystemTalk = input.nextLine();
                        s1.systemTalk(mensajeSystemTalk);
                    }
                    break;
                case 10:
                    System.out.println(s1.systemSynthesis(s1.getLogUser()));
                    break;
                case 11:
                    AbstractUser_21538935_ArcePalacios usuarioAux = null;
                    for(AbstractUser_21538935_ArcePalacios userAux: s1.getRegisterUsers()) {
                        if (Objects.equals(userAux.getUsername(), s1.getLogUser())) {
                            usuarioAux = userAux;
                            break;
                        }
                    }
                    AbstractUser_21538935_ArcePalacios simulateUserAux = usuarioAux;

                    try {
                        System.out.println("\nINTRODUZCA LA CANTIDAD DE INTERACCIONES QUE QUIERE QUE SE HAGA CON EL SISTEMA: ");
                        int cantInteracciones = input.nextInt();
                        input.nextLine();
                        System.out.println("\nINTRODUZCA LA SEMILLA: ");
                        long semilla = input.nextLong();
                        s1.systemSimulate(cantInteracciones, semilla, s1);
                        s1.systemLogout();
                        s1.systemLogin(simulateUserAux.getUsername());
                        System.out.println("\nEL HISTORIAL DE SU SIMULACIÓN ES: ");
                        System.out.println(s1.systemSynthesis("User" + semilla));
                    } catch (Exception e){
                        System.out.println("Por favor ingresa valores correctos");
                        continue;
                    } finally {
                        input.nextLine();
                    }
                    break;
                case 12:
                    System.out.println(s1);
                    break;
                case 13:
                    s1.systemLogout();
                    break;

            }

        }while (choice != ADMIN_MENU_EXIT_OPTION);
    }

    /**
     * método que maneja la lógica de las funcionalidades que realiza el usuario comun
     * @param s1 sistema con el cual se esta interactuando
     * @author Vicente Arce
     */
    public void comunUserMenu(System_21538935_ArcePalacios s1){
        int COMUN_MENU_EXIT_OPTION = 6;
        Scanner input = new Scanner(System.in);
        int choice = 0;
        do{
            printComunUserMenu();
            try{
                choice = input.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Por favor ingresa una opción correcta");
                continue;
            } finally {
                input.nextLine();
            }
            switch (choice){
                case 1:
                    s1.systemLogout();
                    choice = COMUN_MENU_EXIT_OPTION;
                    break;
                case 2:
                    if(s1.getActualFlowCodeLink() == -1){
                        System.out.println("Saluda al sistema de chatbots: ");
                        String mensajeSystemTalk = input.nextLine();
                        s1.systemTalk(mensajeSystemTalk);
                    }else{
                        System.out.println(s1.systemSynthesis(s1.getLogUser()));
                        System.out.println("\nINTRODUZCA UN MENSAJE (opción que quiere elegir): ");
                        String mensajeSystemTalk = input.nextLine();
                        s1.systemTalk(mensajeSystemTalk);
                    }
                    break;
                case 3:
                    System.out.println(s1.systemSynthesis(s1.getLogUser()));
                    break;
                case 4:
                    AbstractUser_21538935_ArcePalacios usuarioAux2 = null;
                    for(AbstractUser_21538935_ArcePalacios userAux: s1.getRegisterUsers()) {
                        if (Objects.equals(userAux.getUsername(), s1.getLogUser())) {
                            usuarioAux2 = userAux;
                            break;
                        }
                    }
                    AbstractUser_21538935_ArcePalacios simulateUserAux = usuarioAux2;

                    try {
                        System.out.println("\nINTRODUZCA LA CANTIDAD DE INTERACCIONES QUE QUIERE QUE SE HAGA CON EL SISTEMA: ");
                        int cantInteracciones = input.nextInt();
                        input.nextLine();
                        System.out.println("\nINTRODUZCA LA SEMILLA: ");
                        int semilla = input.nextInt();
                        s1.systemSimulate(cantInteracciones, semilla, s1);
                        s1.systemLogout();
                        s1.systemLogin(simulateUserAux.getUsername());
                        System.out.println("\nEL HISTORIAL DE SU SIMULACIÓN ES: ");
                        System.out.println(s1.systemSynthesis("User" + semilla));
                    } catch (Exception e){
                        System.out.println("Por favor ingresa valores correctos");
                        continue;
                    } finally {
                        input.nextLine();
                    }
                    break;
                case 5:
                    System.out.println(s1);
                    break;
                case 6:
                    s1.systemLogout();
                    break;

            }
        }while (choice != COMUN_MENU_EXIT_OPTION);
    }

    // Print

    /**
     * método que printea las opciones del menu principal
     * @author Vicente Arce
     */
    public void printPrincipalMenu(){
        System.out.println("------------Menu principal-------------");
        System.out.println("0) Terminar la ejecución del programa.");
    }

    /**
     * método que printea las opciones del primer menu
     * @author Vicente Arce
     */
    public void printFirstMenu() {
        System.out.println("#-----------Main Menu-----------#");
        System.out.print("1) Registrar usuario.\n");
        System.out.print("2) Loguear usuario.\n");
        System.out.print("3) Salir.\n");
        System.out.print("\nIngrese su opción: ");
    }

    /**
     * método que printea las opciones del menu para registrarse
     * @author Vicente Arce
     */
    public void printRegisterMenu() {
        System.out.println("#-----------Registro-----------#");
        System.out.print("1) Registrar Usuario comun.\n");
        System.out.print("2) Registrar Usuario administrador.\n");
        System.out.print("3) Volver.\n");
        System.out.print("\nIngrese su opción: ");
    }

    /**
     * método que printea las opciones del menu del usuario administrador
     * @author Vicente Arce
     */
    public void printAdminUserMenu() {
        System.out.println("#-----------Usuario Administrador-----------#");
        System.out.print("1) Crear opcion [option].\n");
        System.out.print("2) Crear flujo [flow].\n");
        System.out.print("3) Añadir opción a un flujo [flowAddOption].\n");
        System.out.print("4) Crear chatbot [chatbot].\n");
        System.out.print("5) Añadir flujo a un chatbot [chatbotAddFlow].\n");
        System.out.print("6) Crear sistema [system].\n");
        System.out.print("7) Añadir chatbot a un sistema [systemAddChatbot].\n");
        System.out.print("8) Desloguear [systemLogout].\n");
        System.out.print("9) Interactuar con el sistema [systemTalk].\n");
        System.out.print("10) Mostrar historial [systemSynthesis].\n");
        System.out.print("11) Realizar una simulación con el sistema [systemSimulate].\n");
        System.out.print("12) Visualizar el sistema.\n");
        System.out.print("13) Salir.\n");
        System.out.print("\nIngrese su opción: ");
    }

    /**
     * método que printea las opciones del menu del usuario comun
     * @author Vicente Arce
     */
    public void printComunUserMenu() {
        System.out.println("#-----------Usuario Comun-----------#");
        System.out.print("1) Desloguear.\n");
        System.out.print("2) Interactuar con el sistema [systemTalk].\n");
        System.out.print("3) Mostrar historial [systemSynthesis].\n");
        System.out.print("4) Realizar una simulación con el sistema [systemSimulate].\n");
        System.out.print("5) Visualizar el sistema\n");
        System.out.print("6) Salir.\n");
        System.out.print("\nIngrese su opción: ");
    }


    /**
     * método que printea las opciones creadas por los usuarios administradores
     * @param opcionesMain lista de opciones
     * @author Vicente Arce
     */
    public void printOpcionesCreadas(List<Option_21538935_ArcePalacios> opcionesMain){
        int i = 0;
        System.out.println("/--- Opciones que has creado ---/");
        if(opcionesMain.isEmpty()){
            System.out.println("No has creado ninguna opcion");
        } else {
            for(Option_21538935_ArcePalacios opcion : opcionesMain){
                System.out.println(i + ") " + opcion);
                i++;
            }
        }
    }

    /**
     * método que printea las flujos creadas por los usuarios administradores
     * @param flujosMain lista de flujos
     * @author Vicente Arce
     */
    public void printFlujosCreados(List<Flow_21538935_ArcePalacios> flujosMain){
        int i = 0;
        System.out.println("/--- Flujos que has creado ---/");
        if(flujosMain.isEmpty()){
            System.out.println("No has creado ningun flujo");
        } else {
            for (Flow_21538935_ArcePalacios flow : flujosMain) {
                System.out.println(i + ") " + flow);
                i++;
            }
        }
    }

    /**
     * método que printea los chatbots creados por los usuarios administradores
     * @param chatbotsMain lista de chatbots
     * @author Vicente Arce
     */
    public void printChatbotsCreados(List<Chatbot_21538935_ArcePalacios> chatbotsMain){
        int i = 0;
        System.out.println("/--- Chatbots que has creado ---/");
        if(chatbotsMain.isEmpty()){
            System.out.println("No has creado ningun chatbot");
        } else {
            for (Chatbot_21538935_ArcePalacios chatbot: chatbotsMain){
                System.out.println(i + ") " + chatbot);
                i++;
            }
        }
    }

    /**
     * método que printea el nombre de los sistemas creado por los usuarios administradores
     * @param sistemasMain lista de sistemas
     * @author Vicente Arce
     */
    public static void printSistemasCreadosV1(List<System_21538935_ArcePalacios> sistemasMain) {
        int i = 1;
        for (System_21538935_ArcePalacios system : sistemasMain) {
            System.out.println(i + ") " + system.getName());
            i++;
        }
    }
}
