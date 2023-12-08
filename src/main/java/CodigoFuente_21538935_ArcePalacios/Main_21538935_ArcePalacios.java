package CodigoFuente_21538935_ArcePalacios;

import CodigoFuente_21538935_ArcePalacios.Models_21538935_ArcePalacios.*;

import java.util.*;


public class Main_21538935_ArcePalacios {

    private static List<Option_21538935_ArcePalacios> opcionesMain = new ArrayList<>();
    private static List<Flow_21538935_ArcePalacios> flujosMain = new ArrayList<>();
    private static List<Chatbot_21538935_ArcePalacios> chatbotsMain = new ArrayList<>();
    private static List<System_21538935_ArcePalacios> sistemasMain = new ArrayList<>();
    public static void main(String[] args) {
        // CARGANDO SISTEMA

        // Creando opciones
        Option_21538935_ArcePalacios op1 = new Option_21538935_ArcePalacios(1, "1) Viajar", 1,1, Arrays.asList("viajar", "turistear", "conocer"));
        Option_21538935_ArcePalacios op2 = new Option_21538935_ArcePalacios(2, "2) Estudiar", 2, 1, Arrays.asList("estudiar", "aprender","perfeccionarme"));
        Option_21538935_ArcePalacios op3 = new Option_21538935_ArcePalacios(1, "1) New York, USA",1,2,Arrays.asList("Estados unidos", "New York"));
        Option_21538935_ArcePalacios op4 = new Option_21538935_ArcePalacios(2, "2) Paris, Francia ",1,1,Arrays.asList("Paris", "Eiffel"));
        Option_21538935_ArcePalacios op5 = new Option_21538935_ArcePalacios(3, "3) Torres del Paine, Chile",1,1,Arrays.asList("Chile", "Torres","Paine","Torres Paine", "Torres del Paine"));
        Option_21538935_ArcePalacios op6 = new Option_21538935_ArcePalacios(4, "4) Volver",0,1,Arrays.asList("Regresar", "Salir","Volver"));
        Option_21538935_ArcePalacios op7 = new Option_21538935_ArcePalacios(1, "1) Central Park",1,2,Arrays.asList("Central", "Park", "Central Park"));
        Option_21538935_ArcePalacios op8 = new Option_21538935_ArcePalacios(2, "2) Museos",1,2,Arrays.asList("Museo"));
        Option_21538935_ArcePalacios op9 = new Option_21538935_ArcePalacios(3, "3) Ningun otro atractivo",1,3,Arrays.asList("Ningun otro atractivo"));
        Option_21538935_ArcePalacios op10 = new Option_21538935_ArcePalacios(4, "4) Cambiar destino",1,1,Arrays.asList("Cambiar","Volver", "Salir"));
        Option_21538935_ArcePalacios op11 = new Option_21538935_ArcePalacios(1, "1) Solo",1,3,Arrays.asList("Solo"));
        Option_21538935_ArcePalacios op12 = new Option_21538935_ArcePalacios(2, "2) En pareja",1,3,Arrays.asList("Pareja"));
        Option_21538935_ArcePalacios op13 = new Option_21538935_ArcePalacios(3, "3) En familia",1,3,Arrays.asList("Familia"));
        Option_21538935_ArcePalacios op14 = new Option_21538935_ArcePalacios(4, "4) Agregar más atractivos",1,2,Arrays.asList("Volver", "Atractivos"));
        Option_21538935_ArcePalacios op15 = new Option_21538935_ArcePalacios(5, "5) En realidad quiero otro destino",1,1,Arrays.asList("Cambiar destino"));
        Option_21538935_ArcePalacios op16 = new Option_21538935_ArcePalacios(1, "1) Carrera Técnica",2,1,Arrays.asList("Tecnica"));
        Option_21538935_ArcePalacios op17 = new Option_21538935_ArcePalacios(2, "2) Postgrado",2,1,Arrays.asList("Doctorado", "Magister", "Postgrado"));
        Option_21538935_ArcePalacios op18 = new Option_21538935_ArcePalacios(3, "3) Volver",0,1,Arrays.asList("Regresar", "Salir","Volver"));

        // Flujo 1 chatbot 0
        Flow_21538935_ArcePalacios f11 = new Flow_21538935_ArcePalacios(1, "Flujo Principal Chatbot 1\nBienvenido\n¿Que te gustaria hacer?", Arrays.asList(op1,op2,op2,op2,op2,op1));
        f11.flowAddOption(op1);

        // Flujo 1 chatbot 1
        Flow_21538935_ArcePalacios f20 = new Flow_21538935_ArcePalacios(1, "Flujo 1 Chatbot1\n¿Donde te gustaria ir", Arrays.asList(op3,op4,op5,op6));

        // Flujo 2 chatbot 1
        Flow_21538935_ArcePalacios f21 = new Flow_21538935_ArcePalacios(2, "Flujo 2 Chatbot1\n¿Que atractivos te gustaria visitar?", Arrays.asList(op7,op8,op9,op10));

        // Flujo 3 chatbot 1
        Flow_21538935_ArcePalacios f22 = new Flow_21538935_ArcePalacios(3, "Flujo 3 Chatbot1\n¿Vas solo o acompañado?", Arrays.asList(op11,op12,op13,op14,op15));

        // Flujo  chatbot 2
        Flow_21538935_ArcePalacios f30 = new Flow_21538935_ArcePalacios(1, "Flujo 1 Chatbot2\n¿Que te gustaria estudiar?", Arrays.asList(op16, op17, op18));


        // Chatbot 0
        Chatbot_21538935_ArcePalacios cb0 = new Chatbot_21538935_ArcePalacios(0, "Inicial", "Bienvenido\n¿Que te gustaria hacer?", 1, Arrays.asList(f11,f11,f11,f11));

        // Chatbot 1
        Chatbot_21538935_ArcePalacios cb1 = new Chatbot_21538935_ArcePalacios(1, "Agenda Viajes", "Bienvenido\n¿Donde quieres viajar?", 1, Arrays.asList(f20,f21));
        cb1.chatbotAddFlow(f22);

        // Chatbot 2
        Chatbot_21538935_ArcePalacios cb2 = new Chatbot_21538935_ArcePalacios(2, "Orientador Academico", "Bienvenido\n¿Que te gustaria estudiar?", 1, Arrays.asList(f30));


        // Creando sistema
        System_21538935_ArcePalacios s1 = new System_21538935_ArcePalacios("Chatbots Paradigmas", 0, Arrays.asList(cb0,cb0,cb1,cb1));
        s1.systemAddChatbot(cb2);
        sistemasMain.add(s1);

        while(true){
            Scanner input = new Scanner(System.in);
            printMainMenu();
            printSistemasCreadosV1(sistemasMain);
            System.out.println("\nIngrese el indice del sistema con el cual quiere interactuar, si quiere teminar la ejecución del programa ingrese 0: ");
            try {
                int index = input.nextInt();
                input.nextLine();
                if(index == 0){
                    System.exit(0);
                    break;
                }else {
                    s1 = sistemasMain.get(index - 1);
                    menu(sistemasMain.get(index - 1));
                }
            } catch (Exception e){
                System.out.println("Ingresa un valor correcto por favor");
            }

        }

    }

    /**
     * método que maneja la lógica para la interacción con un sistema, permite la utilización de todos los requisitos funcionales
     * @param s1 sistema
     */
    public static void menu(System_21538935_ArcePalacios s1){
        String nombreUsuario;

        Scanner input = new Scanner(System.in);

        final int ADMIN_MENU_EXIT_OPTION = 13;
        final int COMUN_MENU_EXIT_OPTION = 6;
        final int MENU_EXIT_OPTION = 3;
        int choice2 = 0;
        var choice = 0;

        do {
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
                    do{
                        printRegisterMenu();
                        try{
                            choice2 = input.nextInt();
                        } catch (InputMismatchException e){
                            System.out.println("Por favor ingresa una opción correcta");
                            continue;
                        } finally {
                            input.nextLine();
                        }
                        switch (choice2){
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
                                System.out.println(choice2 + " is not a valid option! Please select correct option.");
                                choice2 = 1; // Pongo choice2 para que no se rompa la condicion
                                break;
                        }
                    } while (choice2 != 3);
                    break;
                case 2:
                    if(s1.getRegisterUsers().isEmpty()){
                        System.out.println("Asegurate de registrar algún usuario antes de loguearte");
                    }else {
                        System.out.println("\nINTRODUZCA EL NOMBRE DEL USUARIO QUE QUIERE LOGUEAR: ");
                        nombreUsuario = input.nextLine();
                        s1.systemLogin(nombreUsuario);
                        if(s1.getLogUser() != null){
                            if(s1.getUser(s1.getRegisterUsers(), nombreUsuario).getIsAdmin()){
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
                                            }
                                            break;
                                        case 3:
                                            if(flujosMain.isEmpty()){
                                                System.out.println("\nAsegurate de tener flujos creados antes de querer usar esta funcionalidad");
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
                                            }
                                            break;
                                        case 5:
                                            if(chatbotsMain.isEmpty()){
                                                System.out.println("\nAsegurate de tener chatbots creados antes de querer usar esta funcionalidad");
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
                                            }
                                            break;
                                        case 7:
                                            if(chatbotsMain.isEmpty()){
                                                System.out.println("\nAntes de querer agregar un chatbot al sistema, por favor crea uno");
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
                                                System.out.println(s1.systemSynthesis(nombreUsuario));
                                                System.out.println("INTRODUZCA UN MENSAJE (opción que quiere elegir): ");
                                                String mensajeSystemTalk = input.nextLine();
                                                s1.systemTalk(mensajeSystemTalk);
                                            }
                                            break;
                                        case 10:
                                            System.out.println(s1.systemSynthesis(nombreUsuario));
                                            break;
                                        case 11:
                                            AbstractUser_21538935_ArcePalacios usuarioAux = null;
                                            for(AbstractUser_21538935_ArcePalacios userAux: s1.getRegisterUsers()) {
                                                if (Objects.equals(userAux.getUsername(), nombreUsuario)) {
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
                                            choice = ADMIN_MENU_EXIT_OPTION;
                                            s1.systemLogout();
                                            break;

                                    }

                                }while (choice != ADMIN_MENU_EXIT_OPTION);
                            } else{
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
                                                System.out.println(s1.systemSynthesis(nombreUsuario));
                                                System.out.println("\nINTRODUZCA UN MENSAJE (opción que quiere elegir): ");
                                                String mensajeSystemTalk = input.nextLine();
                                                s1.systemTalk(mensajeSystemTalk);
                                            }
                                            break;
                                        case 3:
                                            System.out.println(s1.systemSynthesis(nombreUsuario));
                                            break;
                                        case 4:
                                            AbstractUser_21538935_ArcePalacios usuarioAux2 = null;
                                            for(AbstractUser_21538935_ArcePalacios userAux: s1.getRegisterUsers()) {
                                                if (Objects.equals(userAux.getUsername(), nombreUsuario)) {
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
                                            choice = COMUN_MENU_EXIT_OPTION;
                                            s1.systemLogout();
                                            break;

                                    }
                                }while (choice != COMUN_MENU_EXIT_OPTION);

                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println(choice + " is not a valid option! Please select correct option.");
                    choice = -1;
                    break;
            }
        } while (choice != MENU_EXIT_OPTION);
    }

    /**
     * método que printea los nombres de los sistemas de una lista de sistemaas
     * @param sistemasMain lista de sistemas
     */
    public static void printSistemasCreadosV1(List<System_21538935_ArcePalacios> sistemasMain) {
        int i = 1;
        for (System_21538935_ArcePalacios system : sistemasMain) {
            System.out.println(i + ") " + system.getName());
            i++;
        }
    }

    /**
     * método que printea los chatbots de una lista de chatbots formateandolos como un string
     * @param chatbotsMain lista de chatbots
     */
    public static void printChatbotsCreados(List<Chatbot_21538935_ArcePalacios> chatbotsMain){
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
     * método que printea los flujos de una lista de opciones formateandolo como un string
     * @param flujosMain lista de flujos
     */
    public static void printFlujosCreados(List<Flow_21538935_ArcePalacios> flujosMain){
        int i = 0;
        System.out.println("/--- Flujos que has creado ---////");
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
     * método que printea las opciones de una lista de opciones formatenadolo como un string
     * @param opcionesMain lista de opciones
     */
    public static void printOpcionesCreadas(List<Option_21538935_ArcePalacios> opcionesMain){
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
     * Primer menú que aparecera cuando se ejecute el programa
     */
    public static void printMainMenu(){
        System.out.println("------------Menu principal-------------");
        System.out.println("0) Terminar la ejecución del programa.");
    }

    /**
     * método que printea el primer menú al haberse elegido con que sistema interactuar
     */
    public static void printFirstMenu() {
        System.out.println("#-----------Main Menu-----------#\n");
        System.out.print("1) Registrar usuario.\n");
        System.out.print("2) Loguear usuario.\n");
        System.out.print("3) Salir.\n");
        System.out.print("\nIngrese su opción: ");
    }

    /**
     * método que printea el menú de registro
     */
    public static void printRegisterMenu() {
        System.out.println("#-----------Registro-----------#\n");
        System.out.print("1) Registrar Usuario comun.\n");
        System.out.print("2) Registrar Usuario administrador.\n");
        System.out.print("3) Volver.\n");
        System.out.print("\nIngrese su opción: ");
    }

    /**
     * método que printea el menú del usuario administrador
     */
    public static void printAdminUserMenu() {
        System.out.println("#-----------Usuario Administrador-----------#\n");
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
     * Método que printea el menú del usuario común
     */
    public static void printComunUserMenu() {
        System.out.println("#-----------Usuario Comun-----------#\n");
        System.out.print("1) Desloguear.\n");
        System.out.print("2) Interactuar con el sistema [systemTalk].\n");
        System.out.print("3) Mostrar historial [systemSynthesis].\n");
        System.out.print("4) Realizar una simulación con el sistema [systemSimulate].\n");
        System.out.print("5) Visualizar el sistema\n");
        System.out.print("6) Salir.\n");
        System.out.print("\nIngrese su opción: ");
    }
}