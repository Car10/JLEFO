/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

/**
 *
 * @author herma
 */
public class NmComponentes {

    //Interfaz
    public static final String BARRAMENU = "Barra de Menú";
    public static final String ARCHIVO = "Archivo";
    public static final String EDITAR = "Editar";
    public static final String NUEVO = "Nuevo";
    public static final String AYUDA = "Ayuda";
    public static final String AF = "Autómata Finito";
    public static final String ER = "Expresión Regular";
    public static final String ABRIR = "Abrir";
    public static final String GUARDAR = "Guardar";
    public static final String GUARDARCOMO = "Guardar como...";
    public static final String ACERCAR = "Acercar";
    public static final String ALEJAR = "Alejar";
    public static final String DESHACER = "Deshacer";
    public static final String REHACER = "Rehacer";
    public static final String TUTOTIALES = "Tutoriales";
    public static final String MANUAL = "Manual";
    public static final String EJERCICIOS = "Ejercicios";
    public static final String ACERCADE = "JLEFO";
    public static final String BARRAHERR = "Barra de Herramientas";
    public static final String MENU = "Deslizar Menú de Herramientas";
    public static final String IMPRIMIR = "Imprimir";
    public static final String IMAGEN = "Guardar como Imagen";

    //Slide menu
    public static final String ESTADO = "Dibujar Estados";
    public static final String TRANSICION = "Dibujar Transición";
    public static final String SELECCIONAR = "Mover Estados";
    public static final String ANALIZAR = "Analizar Autómata";

    //TEXTOS
    public static final String BIENVENIDA = "JLEFO (Java Lenguajes Formales)"
            + "\n\nBienvenido a JLEFO una nueva y útil herramienta que te servirá de "
            + "apoyo en el análisis y diseño de modelos de:"
            + "\n\nAutómatas Finitos Deterministas"
            + "\n\nAutómatas Finitos No Deterministas "
            + "\n\nExpresiones Regulares "
            + "\n\nDesarrollada por alumnos del Instituto Tecnológico de "
            + "Veracruz y financiada por el Instituto Tecnológico Nacional de México."
            + "\n\nVersión 1.0";

    public static final String INFO_ESTADO = "Estado: "
            + "\nSelecciona para dibujar un estado sobre el área de dibujo, mientras esta opción esta seleccionada dibuja cuantos estados te sea necesario."
            + "\n\nPara eliminar un estado da clic derecho sobre él y de menú emérgete selecciona la opción eliminar y posterior la opción estado."
            + "\n\nPara hacer estado de aceptación da clic derecho sobre el estado deseado del menú emergente selecciona la opción estado de aceptación."
            + "\n\nMientras esta opción este activa podrás dibujar únicamente estados."
            + "\n\nPara desactivar selecciona una de las otras opciones. ";

    public static String INFO_TRANSICION = "Transición: "
            + "\n\nSelecciona para dibujar las transiciones de estado a estado."
            + "\n\nPara dibuja un a traición da clic en el centro del estado inicial y sin soltar desliza al centro del estado final suelta y selecciona el alfabeto."
            + "\n\nPara editar el alfabeto de una transición da clic sobre ella y del menú emergente selecciona la opción editar transición y elige el alfabeto deseado."
            + "\n\nPara eliminar una transición da clic derecho sobre ella y de menú emérgete selecciona la opción eliminar y posterior la opción transición."
            + "\n\nMientras esta opción este activa podrás dibujar únicamente transiciones."
            + " Para desactivar selecciona una de las otras opciones. ";

    public static String INFO_SELECCIONAR = "Seleccionar: "
            + "\n\nSelecciona para manipular los estados del diagrama. "
            + "\n\nPodrás mover dando clic y sin soltar desliza el estado al lugar de tu preferencia.";

    public static String INFO_ANALIZAR = "Analizar: "
            + "\n\nSelecciona para realizar el análisis de diagrama que se tiene dibujado en el momento ya sea AFD o AFND."
            + "\n\nSe desplegara una ventana con el rastreo del diagrama que contiene:"
            + "\n\n• La tabla de transiciones."
            + "\n\n• La tabla de cadenas."
            + "\n\n• En caso de ser AFND la opción de convertir a AFD."
            + "\n\n• La opción de ordenar y desordenar las cadenas."
            + "\n\n• La opción de rastreo paso a paso que inicia la simulación del rastreo en el diagrama seleccionando una cadena de la tabla de cadenas."
            + "\n\n• La opción de   regular la velocidad del rastreo paso a paso."
            + "\n\n• La visualización de la cadena que se está rastreando.";
}
