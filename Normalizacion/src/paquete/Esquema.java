/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.util.HashSet;
import java.util.Hashtable;

/**
 *
 * @author Alberto
 */
public class Esquema {
    Hashtable<HashSet,HashSet> tabla;
    String forma;

    public Esquema(Hashtable<HashSet, HashSet> tabla, String forma) {
        this.tabla = tabla;
        this.forma = forma;
    }

    public Esquema() {
    }

    public Hashtable<HashSet, HashSet> getTabla() {
        return tabla;
    }

    public void setTabla(Hashtable<HashSet, HashSet> tabla) {
        this.tabla = tabla;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    @Override
    public String toString() {
        return "Esquema{" + "tabla=" + tabla + ", forma=" + forma + '}';
    }
    
}
