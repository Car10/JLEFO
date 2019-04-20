/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import vista.V_slideMenu;
import vista.V_tabs;
import static funciones.NmComponentes.*;
import javax.swing.JButton;

/**
 *
 * @author herma
 */
public class C_interfaz implements ActionListener, Printable{

    V_tabs tabs;
    JPanel slideMenu;
    JPanel contenedor;
    JTabbedPane tabPane;
    String[] file;
    
    
    public C_interfaz(V_tabs tabs, V_slideMenu slideMenu, JPanel contenedor, 
            V_tabs tabPane, String[] file) {
       this.tabs = tabs;
       this.slideMenu = slideMenu;
       this.tabPane = tabPane;
       this.contenedor = contenedor;
       this.file = file;
       
    }
    
    public static void deslizarMenu(String general) {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Component componente = (Component) e.getSource();
        if(tabs.getComponentCount() != 0){
            //code here
        }
        switch(componente.getName()){
            case AF:
                break;
            case ER:
                break;
            case ABRIR:
                break;
            case GUARDAR:
                break;
            case GUARDARCOMO:
                break;
            case DESHACER:
                break;
            case REHACER:
                break;
            case ACERCAR:
                break;
            case ALEJAR:
                break;
            case MENU:
                break;
            case IMAGEN:
                break;
            case IMPRIMIR:
                break;
            case TUTOTIALES:
                break;
            case MANUAL:
                break;
            case EJERCICIOS:
                break;
            case ACERCADE:
                break;  
        }
    }

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if(pageIndex > 0){
            return NO_SUCH_PAGE;
        }
        return PAGE_EXISTS;
    }
    
}
