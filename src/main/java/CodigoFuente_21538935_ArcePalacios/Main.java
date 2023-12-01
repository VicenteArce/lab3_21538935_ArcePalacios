package CodigoFuente_21538935_ArcePalacios;

import CodigoFuente_21538935_ArcePalacios.Models_21538935_ArcePalacios.*;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String nombreUsuario;

        Scanner input = new Scanner(System.in);

        final int ADMIN_MENU_EXIT_OPTION = 12;
        final int COMUN_MENU_EXIT_OPTION = 6;

        int choice2 = 0;
        var choice = 0;

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

        // Creando usuarios
        ComunUser_21538935_ArcePalacios user1 = new ComunUser_21538935_ArcePalacios("User1");
        ComunUser_21538935_ArcePalacios user2 = new ComunUser_21538935_ArcePalacios("User2");
        AdminUser_21538935_ArcePalacios user3 = new AdminUser_21538935_ArcePalacios("User3");

        // Creando sistema
        System_21538935_ArcePalacios s1 = new System_21538935_ArcePalacios("Chatbots Paradigmas", 0, Arrays.asList(cb0,cb0,cb1,cb1));
        s1.systemAddChatbot(cb2);

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
                                System.out.println("INGRESA EL NOMBRE DEL USUARIO COMUN QUE QUIERES REGISTRAR: ");
                                nombreUsuario = input.nextLine();
                                ComunUser_21538935_ArcePalacios comunUser = new ComunUser_21538935_ArcePalacios(nombreUsuario);
                                s1.systemAddUser(comunUser);
                                break;
                            case 2:
                                System.out.println("INGRESA EL NOMBRE DEL USUARIO ADMINISTRADOR QUE QUIERES REGISTRAR: ");
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
                        System.out.println("INTRODUZCA EL NOMBRE DEL USUARIO QUE QUIERE LOGUEAR: ");
                        nombreUsuario = input.nextLine();
                        s1.systemLogin(nombreUsuario);
                        if(s1.getLogUser() != null){
                            if(s1.getUser(s1.getRegisterUsers(), nombreUsuario).getIsAdmin()){
                                do{
                                    printAdminUserMenu();
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
                                            System.out.println("INTRODUZCA EL ID DE LA OPCIÓN: ");
                                            int idOpcion = input.nextInt();
                                            input.nextLine();  // Consumir nueva línea pendiente
                                            System.out.println("INTRODUZCA EL MENSAJE DE LA OPCIÓN: ");
                                            String mensajeOpcion = input.nextLine();
                                            input.nextLine();
                                            System.out.println("INTRODUZCA EL CHATBOTCODELINK DE LA OPCIÓN: ");
                                            int chatbotCodeLinkOpcion = input.nextInt();
                                            input.nextLine();
                                            System.out.println("INTRODUZCA EL INITIALFLOWCODELINK DE LA OPCIÓN: ");
                                            int initialFlowCodeLink = input.nextInt();
                                            input.nextLine();
                                            break;

                                        case 2:
                                            break;
                                        case 3:
                                            break;
                                        case 4:
                                            break;
                                        case 5:
                                            break;
                                        case 6:
                                            break;
                                        case 7:
                                            s1.systemLogout();
                                            choice = ADMIN_MENU_EXIT_OPTION;
                                            break;
                                        case 8:
                                            AbstractUser_21538935_ArcePalacios user = null;
                                            for(AbstractUser_21538935_ArcePalacios userAux: s1.getRegisterUsers()) {
                                                if (Objects.equals(userAux.getUsername(), nombreUsuario)) {
                                                    user = userAux;
                                                    break;
                                                }
                                            }
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
                                        case 9:
                                            System.out.println(s1.systemSynthesis(nombreUsuario));
                                            break;
                                        case 10:
                                            AbstractUser_21538935_ArcePalacios usuarioAux = null;
                                            for(AbstractUser_21538935_ArcePalacios userAux: s1.getRegisterUsers()) {
                                                if (Objects.equals(userAux.getUsername(), nombreUsuario)) {
                                                    usuarioAux = userAux;
                                                    break;
                                                }
                                            }
                                            AbstractUser_21538935_ArcePalacios simulateUserAux = usuarioAux;

                                            try {
                                                System.out.println("INTRODUZCA LA CANTIDAD DE INTERACCIONES QUE QUIERE QUE SE HAGA CON EL SISTEMA: ");
                                                int cantInteracciones = input.nextInt();
                                                input.nextLine();
                                                System.out.println("INTRODUZCA LA SEMILLA: ");
                                                long semilla = input.nextLong();
                                                s1.systemSimulate(cantInteracciones, semilla, s1);
                                                s1.systemLogout();
                                                s1.systemLogin(simulateUserAux.getUsername());
                                                System.out.println("EL HISTORIAL DE SU SIMULACIÓN ES: ");
                                                System.out.println(s1.systemSynthesis("User" + semilla));
                                            } catch (Exception e){
                                                System.out.println("Por favor ingresa valores correctos");
                                                continue;
                                            } finally {
                                                input.nextLine();
                                            }
                                            break;
                                        case 11:
                                            System.out.println(s1);
                                            break;
                                        case 12:
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
                                                System.out.println("INTRODUZCA UN MENSAJE (opción que quiere elegir): ");
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
                                                System.out.println("INTRODUZCA LA CANTIDAD DE INTERACCIONES QUE QUIERE QUE SE HAGA CON EL SISTEMA: ");
                                                int cantInteracciones = input.nextInt();
                                                input.nextLine();
                                                System.out.println("INTRODUZCA LA SEMILLA: ");
                                                int semilla = input.nextInt();
                                                s1.systemSimulate(cantInteracciones, semilla, s1);
                                                s1.systemLogout();
                                                s1.systemLogin(simulateUserAux.getUsername());
                                                System.out.println("EL HISTORIAL DE SU SIMULACIÓN ES: ");
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
                    System.exit(0);
                    break;
                default:
                    System.out.println(choice + " is not a valid option! Please select correct option.");
                    choice = -1;
                    break;
            }
        } while (true);
    }

    private static void printFirstMenu() {
        System.out.println("#-----------Main Menu-----------#\n");
        System.out.print("1) Registrar usuario.\n");
        System.out.print("2) Loguear usuario.\n");
        System.out.print("3) Salir.\n");
        System.out.print("\nEnter your choice: ");
    }

    private static void printRegisterMenu() {
        System.out.println("#-----------Registro-----------#\n");
        System.out.print("1) Registrar Usuario comun.\n");
        System.out.print("2) Registrar Usuario administrador.\n");
        System.out.print("3) Volver.\n");
        System.out.print("\nEnter your choice: ");
    }

    private static void printAdminUserMenu() {
        System.out.println("#-----------Usuario Administrador-----------#\n");
        System.out.print("1) Crear opcion [option].\n");
        System.out.print("2) Crear flujo [flow].\n");
        System.out.print("3) Añadir opción a un flujo [flowAddOption].\n");
        System.out.print("4) Crear chatbot [chatbot].\n");
        System.out.print("5) Añadir flujo a un chatbot [chatbotAddFlow].\n");
        System.out.print("6) Añadir chatbot a un sistema [systemAddChatbot].\n");
        System.out.print("7) Desloguear [systemLogout].\n");
        System.out.print("8) Interactuar con el sistema [systemTalk].\n");
        System.out.print("9) Mostrar historial [systemSynthesis].\n");
        System.out.print("10) Realizar una simulación con el sistema [systemSimulate].\n");
        System.out.print("11) Visualizar el sistema.\n");
        System.out.print("12) Salir.\n");
        System.out.print("\nEnter your choice: ");
    }

    private static void printComunUserMenu() {
        System.out.println("#-----------Usuario Comun-----------#\n");
        System.out.print("1) Desloguear.\n");
        System.out.print("2) Interactuar con el sistema [systemTalk].\n");
        System.out.print("3) Mostrar historial [systemSynthesis].\n");
        System.out.print("4) Realizar una simulación con el sistema [systemSimulate].\n");
        System.out.print("5) Visualizar el sistema\n");
        System.out.print("6) Salir.\n");
        System.out.print("\nEnter your choice: ");
    }

}