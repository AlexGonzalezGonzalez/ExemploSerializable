/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploclasesobxetos;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author agonzalezgonzalez
 */
public class ExemploClasesObxetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos m = new Metodos();
        int opcion;
        //Crear un ordenador velocidade 2000, memoria 1000, marca philips, pulgadas 15.5, tipo con cable.
//        Cpu c = new Cpu(2000, 1000);
//        Pantalla p = new Pantalla("Philips", 15.5f);
//        Rato r = new Rato("Con cable",new Mouse("cucu"));
//        Ordenador orde1 = new Ordenador(c, p, r);
//        System.out.println(orde1.toString());
//
//        //crear ordenador vel 2500 mem 2000 marca samsung, pul 12.2, tipo sen cable
//        Ordenador orde2 = new Ordenador(new Cpu(2500, 2000), new Pantalla("Samsung", 17.2f), new Rato("sen cable",new Mouse("cucu")));
//        System.out.println(orde2.toString());
//        //cambiar ao ordenador 1 a velocidade a 5000
//        orde1.getProcesador().setVelocidade(5000);
//        System.out.println(orde1.toString());
//        //orde2 visualizar marca de pantalla do 2º ordenador
//        System.out.println(orde2.getPantalla().getMarca());
//        Ordenador orde3 = new Ordenador();
//        System.out.println(orde3.toString());
//        orde3.getProcesador().setVelocidade(3000);
//        orde3.getProcesador().setMemoria(1500);
//        orde3.getPantalla().setMarca("ASUS");
//        orde3.getPantalla().setPulgadas(13.2f);
//        orde3.getRato().setTipo("Sen cable");
//        orde3.getRato().getMouse().setTipo("abc");
//        System.out.println(orde3.toString());

        do {

            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "1-Escribir en el fichero\n"
                    + "2-Leer el fichero\n"
                    + "3-Anhadir en el fichero\n"
                    + "4-Renombrar el fichero\n"
                    + "5-Salir"));
            switch (opcion) {
                case 1:
                    m.escribirFichero("ExemploSerie.txt");
                    break;
                case 2:
                    m.leerFichero("ExemploSerie.txt");
                    break;
                case 3:
                    m.engadir("ExemploSerie.txt");
                    break;
                case 4:

                    try {
                        m.salvarObjectos("ExemploSerie.txt", "Salvados.txt");
                    } catch (FileNotFoundException ex) {
                        System.out.println("meh");
                    }
                    break;
                case 5:
                    break;
                default: System.out.println("Opcion incorrecta");
            }
        } while (opcion != 5);

    }
}

