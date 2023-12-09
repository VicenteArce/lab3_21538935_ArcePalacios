package CodigoFuente_21538935_ArcePalacios;

import CodigoFuente_21538935_ArcePalacios.Models_21538935_ArcePalacios.*;
import CodigoFuente_21538935_ArcePalacios.UI_21538935_ArcePalacios.Menu_21538935_ArcePalacios;
import java.util.*;


public class Main_21538935_ArcePalacios {

    /**
     * método main
     * @param args args
     * @author Vicente Arce
     */
    public static void main(String[] args) {
        // Cargando sistema de pruebas
        System_21538935_ArcePalacios s1 = cargarSistemaInicial();

        // Ejecutando Menu
        Menu_21538935_ArcePalacios menu = new Menu_21538935_ArcePalacios();
        menu.principalMenu(s1);
    }

    /**
     * método encargado de inicializar el sistema pedido
     * @return sistemaInicial
     * @author Vicente Arce
     */
    public static System_21538935_ArcePalacios cargarSistemaInicial(){
        // Opciones Chatbot 0
        Option_21538935_ArcePalacios op1 = new Option_21538935_ArcePalacios(1, "1) Peliculas", 1, 1, Arrays.asList("Pelicula", "Peliculas", "Movies"));
        Option_21538935_ArcePalacios op2 = new Option_21538935_ArcePalacios(2, "2) Deportes", 2, 1, Arrays.asList("Futbol", "Basketball", "Deportes"));
        Option_21538935_ArcePalacios op3 = new Option_21538935_ArcePalacios(3, "3) Musica", 3, 1, Arrays.asList("Musica", "Music"));

        // Opciones de chatbot 1
        // Opciones de flujo 1 chatbot 1
        Option_21538935_ArcePalacios op4 = new Option_21538935_ArcePalacios(1, "1) Accion", 1, 2, Arrays.asList("Accion", "Action"));
        Option_21538935_ArcePalacios op5 = new Option_21538935_ArcePalacios(2, "2) Terror", 1, 3, Arrays.asList("Terror", "Horror"));
        Option_21538935_ArcePalacios op6 = new Option_21538935_ArcePalacios(3, "3) Ciencia ficcion", 1, 4, Arrays.asList("Ciencia ficcion", "Ciencia", "ficcion"));
        Option_21538935_ArcePalacios op7 = new Option_21538935_ArcePalacios(4, "4) Animación", 1, 5, Arrays.asList("Animacion", "Animation"));
        Option_21538935_ArcePalacios op8 = new Option_21538935_ArcePalacios(5, "5) Volver", 0, 1, Arrays.asList("volver", "ninguna"));

        // Opciones de flujo 2 chatbot 1
        Option_21538935_ArcePalacios op9 = new Option_21538935_ArcePalacios(1, "1) The Matrix", 1, 2, Arrays.asList("Matrix", "The Matrix"));
        Option_21538935_ArcePalacios op10 = new Option_21538935_ArcePalacios(2, "2) Jhon Wick", 1, 2, Arrays.asList("Jhon Wick", "perro"));
        Option_21538935_ArcePalacios op11 = new Option_21538935_ArcePalacios(3, "3) The Dark Night", 1, 2, Arrays.asList("Batman", "The Dark Night"));
        Option_21538935_ArcePalacios op12 = new Option_21538935_ArcePalacios(4, "4) ninguna pelicula más, volver", 1, 1, Arrays.asList("volver", "ninguna"));

        // Opciones de flujo 3 chatbot 1
        Option_21538935_ArcePalacios op13 = new Option_21538935_ArcePalacios(1, "1) Insidious", 1, 3, Arrays.asList("Insidious", "Demonio"));
        Option_21538935_ArcePalacios op14 = new Option_21538935_ArcePalacios(2, "2) El Conjuro", 1, 3, Arrays.asList("El conjuro", "Conjuro"));
        Option_21538935_ArcePalacios op15 = new Option_21538935_ArcePalacios(3, "3) ninguna pelicula más, volver", 1, 1, Arrays.asList("volver", "ninguna"));

        // Opciones de flujo 4 chatbot 1
        Option_21538935_ArcePalacios op16 = new Option_21538935_ArcePalacios(1, "1) Star Wars", 1, 4, Arrays.asList("Star Wars", "Galaxia"));
        Option_21538935_ArcePalacios op17 = new Option_21538935_ArcePalacios(2, "2) Interstellar", 1, 4, Arrays.asList("Intersetellar", "Tiempo"));
        Option_21538935_ArcePalacios op18 = new Option_21538935_ArcePalacios(3, "3) Blade Runner", 1, 4, Arrays.asList("Blade Runner", "Blade"));
        Option_21538935_ArcePalacios op19 = new Option_21538935_ArcePalacios(4, "4) ninguna pelicula más, volver", 1, 1, Arrays.asList("volver", "ninguna"));

        // Opciones de flujo 5 chatbot 1
        Option_21538935_ArcePalacios op20 = new Option_21538935_ArcePalacios(1, "1) Toy Story", 1, 5, Arrays.asList("Toy Story", "juguetes"));
        Option_21538935_ArcePalacios op21 = new Option_21538935_ArcePalacios(2, "2) Spider-Man: Into the Spider-Verse", 1, 5, Arrays.asList("Spider-Man", "Spider-Verse"));
        Option_21538935_ArcePalacios op22 = new Option_21538935_ArcePalacios(3, "3) Ratatouille", 1, 5, Arrays.asList("rata", "Ratatouille"));
        Option_21538935_ArcePalacios op23 = new Option_21538935_ArcePalacios(4, "4) ninguna pelicula más, volver", 1, 1, Arrays.asList("volver", "ninguna"));

        // Opciones de chatbot 2
        // Opciones de flujo 1 chatbot 2
        Option_21538935_ArcePalacios op24 = new Option_21538935_ArcePalacios(1, "1) Futbol", 2, 2, Arrays.asList("Futbol", "balon pie", "Soccer"));
        Option_21538935_ArcePalacios op25 = new Option_21538935_ArcePalacios(2, "2) Basketball", 2, 3, Arrays.asList("Basquetball", "Basketball", "Encestar"));
        Option_21538935_ArcePalacios op26 = new Option_21538935_ArcePalacios(3, "3) Ciclismo", 2, 4, Arrays.asList("Ciclismo", "Bici", "Bicicleta"));
        Option_21538935_ArcePalacios op27 = new Option_21538935_ArcePalacios(4, "4) Volver", 0, 1, Arrays.asList("volver", "ninguno"));

        // Opciones de flujo 2 chatbot 2
        Option_21538935_ArcePalacios op28 = new Option_21538935_ArcePalacios(1, "1) Cristiano Ronaldo", 2, 2, Arrays.asList("Ronaldo", "bicho", "cristiano", "Cristiano Ronaldo"));
        Option_21538935_ArcePalacios op29 = new Option_21538935_ArcePalacios(2, "2) Lionel Messi", 2, 2, Arrays.asList("Messi", "leo", "lionel", "Lionel Messi"));
        Option_21538935_ArcePalacios op30 = new Option_21538935_ArcePalacios(3, "3) Johan Cruyff", 2, 2, Arrays.asList("cruyff", "johan", "Johan Cruyff"));
        Option_21538935_ArcePalacios op31 = new Option_21538935_ArcePalacios(4, "4) ningun jugador más, volver", 2, 1, Arrays.asList("volver", "ninguno"));

        // Opciones de flujo 3 chatbot 2
        Option_21538935_ArcePalacios op32 = new Option_21538935_ArcePalacios(1, "1) Michael Jordan", 2, 3, Arrays.asList("Jordan", "Michael", "Jordan Michael"));
        Option_21538935_ArcePalacios op33 = new Option_21538935_ArcePalacios(2, "2) Kobe Bryant", 2, 3, Arrays.asList("Kobe", "Bryant", "Kobe Bryant"));
        Option_21538935_ArcePalacios op34 = new Option_21538935_ArcePalacios(3, "3) Magic Johnson", 2, 3, Arrays.asList("Magic", "Johnson", "Magic Johnson"));
        Option_21538935_ArcePalacios op35 = new Option_21538935_ArcePalacios(4, "4) ningun jugador más, volver", 2, 1, Arrays.asList("volver", "ninguno"));

        // Opciones de flujo 4 chatbot 2
        Option_21538935_ArcePalacios op36 = new Option_21538935_ArcePalacios(1, "1) Eddy Merckx", 2, 4, Arrays.asList("Eddy Mercx", "Eddy"));
        Option_21538935_ArcePalacios op37 = new Option_21538935_ArcePalacios(2, "2) Fausto Coppi", 2, 4, Arrays.asList("Fausto Coppi", "Fausto"));
        Option_21538935_ArcePalacios op38 = new Option_21538935_ArcePalacios(3, "3) Alberto Contador", 2, 4, Arrays.asList("Alberto Contador", "alberto"));
        Option_21538935_ArcePalacios op39 = new Option_21538935_ArcePalacios(4, "4) ningun ciclista más, volver", 2, 1, Arrays.asList("volver", "ninguno"));

        // Opciones de chatbot 3
        // Opciones de flujo 1 chatbot 3
        Option_21538935_ArcePalacios op40 = new Option_21538935_ArcePalacios(1, "1) Hip Hop", 3, 2, Arrays.asList("Hip Hop", "Rap"));
        Option_21538935_ArcePalacios op41 = new Option_21538935_ArcePalacios(2, "2) Jazz", 3, 3, Arrays.asList("Jazz"));
        Option_21538935_ArcePalacios op42 = new Option_21538935_ArcePalacios(3, "3) Rock", 3, 4, Arrays.asList("Rock"));
        Option_21538935_ArcePalacios op43 = new Option_21538935_ArcePalacios(4, "4) Volver", 0, 1, Arrays.asList("volver", "ninguna"));

        // Opciones de flujo 2 chatbot 3
        Option_21538935_ArcePalacios op44 = new Option_21538935_ArcePalacios(1, "1) Biggie Smalls", 3, 2, Arrays.asList("Biggie Smalls", "Biggie"));
        Option_21538935_ArcePalacios op45 = new Option_21538935_ArcePalacios(2, "2) Kanye West", 3, 2, Arrays.asList("Kanye West", "Kanye"));
        Option_21538935_ArcePalacios op46 = new Option_21538935_ArcePalacios(3, "3) 2Pac", 3, 2, Arrays.asList("2Pac", "Tupac"));
        Option_21538935_ArcePalacios op47 = new Option_21538935_ArcePalacios(4, "4) ningun artista más, volver", 3, 1, Arrays.asList("volver", "ninguno"));

        // Opciones de flujo 3 chatbot 3
        Option_21538935_ArcePalacios op48 = new Option_21538935_ArcePalacios(1, "1) Louis Armstrong", 3, 3, Arrays.asList("Louis", "Armstrong"));
        Option_21538935_ArcePalacios op49 = new Option_21538935_ArcePalacios(2, "2) Miles Davis", 3, 3, Arrays.asList("Miles Davis", "Miles"));
        Option_21538935_ArcePalacios op50 = new Option_21538935_ArcePalacios(3, "3) Sarah Vaughan", 3, 3, Arrays.asList("Sarah", "Sarah Vaughan"));
        Option_21538935_ArcePalacios op51 = new Option_21538935_ArcePalacios(4, "4) ningun artista más, volver", 3, 1, Arrays.asList("volver", "ninguno"));

        // Opciones de flujo 4 chatbot 3
        Option_21538935_ArcePalacios op52 = new Option_21538935_ArcePalacios(1, "1) The Beatles", 3, 4, Arrays.asList("The Beatles"));
        Option_21538935_ArcePalacios op53 = new Option_21538935_ArcePalacios(2, "2) Queen", 3, 4, Arrays.asList("Queen"));
        Option_21538935_ArcePalacios op54 = new Option_21538935_ArcePalacios(3, "3) Pink Floyd", 3, 4, Arrays.asList("Pink", "Pink Floyd"));
        Option_21538935_ArcePalacios op55 = new Option_21538935_ArcePalacios(4, "4) ningun artista más, volver", 3, 1, Arrays.asList("volver", "ninguno"));

        //Flujo Chatbot 0
        Flow_21538935_ArcePalacios f1 = new Flow_21538935_ArcePalacios(1, "Flujo Principal Chatbot 0\nBienvenido\n¿De qué deseas hablar?", Arrays.asList(op1, op2, op3, op1, op1, op2));

        // Flujos Chatbot 1
        // Flujo 1 chatbot 1
        Flow_21538935_ArcePalacios f2 = new Flow_21538935_ArcePalacios(1, "Flujo 1 Chatbot 1\n¿Qué tipo de películas te gustan?", Arrays.asList(op4, op5, op6, op7, op8));

        // Flujo 2 chatbot 1
        Flow_21538935_ArcePalacios f3 = new Flow_21538935_ArcePalacios(2, "Flujo 2 Chatbot 1\n¿Cuáles son tus películas de Acción favoritas?", Arrays.asList(op9, op10, op11, op12));

        // Flujo 3 chatbot 1
        Flow_21538935_ArcePalacios f4 = new Flow_21538935_ArcePalacios(3, "Flujo 3 Chatbot 1\n¿Cuáles son tus películas de Terror favoritas?", Arrays.asList(op13, op14, op15));

        // Flujo 4 chatbot 1
        Flow_21538935_ArcePalacios f5 = new Flow_21538935_ArcePalacios(4, "Flujo 4 Chatbot 1\n¿Cuáles son tus películas de Ciencia Ficción favoritas?", Arrays.asList(op16, op17, op18, op19));

        // Flujo 5 chatbot 1
        Flow_21538935_ArcePalacios f6 = new Flow_21538935_ArcePalacios(5, "Flujo 5 Chatbot 1\n¿Cuáles son tus películas de Animación favoritas?", Arrays.asList(op20, op21, op22, op23));

        // Flujos Chatbot 2
        // Flujo 1 chatbot 2
        Flow_21538935_ArcePalacios f7 = new Flow_21538935_ArcePalacios(1, "Flujo 1 Chatbot 2\n¿Qué deporte te gusta?", Arrays.asList(op24, op25, op26, op27));

        // Flujo 2 chatbot 2
        Flow_21538935_ArcePalacios f8 = new Flow_21538935_ArcePalacios(2, "Flujo 2 Chatbot 2\n¿Cuál es tu futbolista favorito?", Arrays.asList(op28, op29, op30, op31));

        // Flujo 3 chatbot 2
        Flow_21538935_ArcePalacios f9 = new Flow_21538935_ArcePalacios(3, "Flujo 3 Chatbot 2\n¿Cuál es tu basquetbolista favorito?", Arrays.asList(op32, op33, op34, op35));

        // Flujo 4 chatbot 2
        Flow_21538935_ArcePalacios f10 = new Flow_21538935_ArcePalacios(4, "Flujo 4 Chatbot 2\n¿Cuál es tu ciclista favorito?", Arrays.asList(op36, op37, op38, op39));

        // Flujos Chatbot 3
        // Flujo 1 chatbot 3
        Flow_21538935_ArcePalacios f11 = new Flow_21538935_ArcePalacios(1, "Flujo 1 Chatbot 3\n¿Qué tipo de música te gusta?", Arrays.asList(op40, op41, op42, op43));

        // Flujo 2 chatbot 3
        Flow_21538935_ArcePalacios f12 = new Flow_21538935_ArcePalacios(2, "Flujo 2 Chatbot 3\n¿Cuál es tu rapero favorito?", Arrays.asList(op44, op45, op46, op47));

        // Flujo 3 chatbot 3
        Flow_21538935_ArcePalacios f13 = new Flow_21538935_ArcePalacios(3, "Flujo 3 Chatbot 3\n¿Cuál es tu artista de Jazz favorito?", Arrays.asList(op48, op49, op50, op51));

        // Flujo 4 chatbot 3
        Flow_21538935_ArcePalacios f14 = new Flow_21538935_ArcePalacios(4, "Flujo 4 Chatbot 3\n¿Cuál es tu artista de Rock favorito?", Arrays.asList(op52, op53, op54, op55));

        //-------------------------------------------//
        // Chatbot 0
        Chatbot_21538935_ArcePalacios cb0 = new Chatbot_21538935_ArcePalacios(0, "Chatbot Inicial", "Bienvenido\n¿De qué quieres hablar?", 1, Arrays.asList(f1, f1, f1));

        // Chatbot 1
        Chatbot_21538935_ArcePalacios cb1 = new Chatbot_21538935_ArcePalacios(1, "Chatbot Peliculas", "Bienvenido\n¿Qué tipos de películas te gustan?", 1, Arrays.asList(f2, f3, f4, f5, f6));

        // Chatbot 2
        Chatbot_21538935_ArcePalacios cb2 = new Chatbot_21538935_ArcePalacios(2, "Chatbot Deportes", "Bienvenido\n¿Qué deportes te gustan?", 1, Arrays.asList(f7, f8, f9, f10));

        // Chatbot 3
        // Añadiendo f13 a cb101
        Chatbot_21538935_ArcePalacios cb3 = new Chatbot_21538935_ArcePalacios(3, "Chatbot Musica", "Bienvenido\n¿Qué tipo de música te gusta?", 1, Arrays.asList(f11, f12, f13,f14));

        // Creando sistema
        System_21538935_ArcePalacios s1 = new System_21538935_ArcePalacios("Chatbots Paradigmas", 0, Arrays.asList(cb0,cb1,cb2,cb3));

        return s1;
    }
}