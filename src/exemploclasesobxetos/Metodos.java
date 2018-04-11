/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploclasesobxetos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author estudios
 */
public class Metodos {

    Cpu cpu;
    Pantalla pantalla;
    Rato rato;
    Ordenador ordenador;

    public void escribirFichero(String fichero) {
        ObjectOutputStream fich = null;
        try {

            fich = new ObjectOutputStream(new FileOutputStream(fichero));
            for (int i = 0; i < 1; i++) {
                ordenador = new Ordenador(new Cpu(Integer.parseInt(JOptionPane.showInputDialog("Velocidad")), Integer.parseInt(JOptionPane.showInputDialog("Memoria"))),
                        new Pantalla(JOptionPane.showInputDialog("Marca"), Float.parseFloat(JOptionPane.showInputDialog("Pulgadas"))),
                        new Rato(JOptionPane.showInputDialog("Tipo"), new Mouse(JOptionPane.showInputDialog("Tipo"))));
                fich.writeObject(ordenador);
            }

        } catch (IOException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (fich != null) {
                    fich.writeObject(null);
                    fich.close();
                    System.out.println("Escribio en el fichero");
                } else {
                    System.out.println("No escribio en el fichero");
                }

            } catch (IOException ex) {
                Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void leerFichero(String fichero) {
        try {
            ObjectInputStream fich;
            ObjectOutputStream escribir;
            Ordenador o;
            fich = new ObjectInputStream(new FileInputStream(fichero));
            try {

                o = (Ordenador) fich.readObject();
                while (o != null) {
                    System.out.println(o.toString());

                    o = (Ordenador) fich.readObject();

                }

            } catch (IOException ex) {
                Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                fich.close();
            }

        } catch (IOException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void engadir(String ficheiro) {

        Ordenador o;
        ObjectOutputStream escri = null;
        ObjectOutputStream fich = null;

        try {
            salvarObjectos("ExemploSerie.txt", "Salvados.txt");
            escri = new ObjectOutputStream(
                    new FileOutputStream(ficheiro, true));

            for (int i = 0; i < 1; i++) {

                o = new Ordenador(new Cpu(Integer.parseInt(JOptionPane.showInputDialog("Velocidad")), Integer.parseInt(JOptionPane.showInputDialog("Memoria"))),
                        new Pantalla(JOptionPane.showInputDialog("Marca"), Float.parseFloat(JOptionPane.showInputDialog("Pulgadas"))),
                        new Rato(JOptionPane.showInputDialog("Tipo"), new Mouse(JOptionPane.showInputDialog("Tipo"))));
                escri.writeObject(o);

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (escri != null) {
                try {
                    escri.writeObject(null);
                    escri.close();
                } catch (IOException ex) {
                    Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    public void salvarObjectos(String fichero, String fichero2) throws FileNotFoundException {
        try {
            File fich1 = new File(fichero);
            File fich2 = new File(fichero2);
            Ordenador salvados = null;
            ObjectInputStream leer;
            MeuObjectOutputStream escribir = null;

            Ordenador o;
            escribir = new MeuObjectOutputStream(new FileOutputStream(fichero2));
            leer = new ObjectInputStream(new FileInputStream(fichero));
            try {

                o = (Ordenador) leer.readObject();
                while (o != null) {

                    escribir.writeObject(o);
                    o = (Ordenador) leer.readObject();
                }
                escribir.writeObject(null);
                escribir.close();
                leer.close();
                fich1.delete();
                boolean c = fich2.renameTo(fich1);
                if (c == true) {
                    System.out.println("Renombrado");
                } else {
                    System.out.println("No renombrado");
                }

            } catch (IOException ex) {
                Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
            } finally {

            }

        } catch (IOException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
