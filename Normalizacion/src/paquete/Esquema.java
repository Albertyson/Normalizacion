/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Alberto
 */
public class Esquema {

    HashSet PK;
    HashSet atributos;
    Hashtable<HashSet, HashSet> DF;
    String forma;
    String nombre;

    public Esquema(HashSet PK, HashSet atributos, Hashtable<HashSet, HashSet> DF, String forma, String nombre) {
        this.PK = PK;
        this.atributos = atributos;
        this.DF = DF;
        this.forma = forma;
        this.nombre = nombre;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public Esquema() {
    }

    public Hashtable<HashSet, HashSet> getTabla() {
        return DF;
    }

    public void setTabla(Hashtable<HashSet, HashSet> tabla) {
        this.DF = tabla;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    @Override
    public String toString() {
        String retorno = nombre + "{"+PK+","+atributos+"} DF:{";
        Set set = DF.entrySet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if(it.hasNext()){
                retorno+=((HashSet)entry.getKey()).toString() +"→"+((HashSet)entry.getValue()).toString()+",";
            }else{
                retorno+=((HashSet)entry.getKey()).toString() +"→"+((HashSet)entry.getValue()).toString();
            }
            
        }
        retorno+="}";
        return retorno;
    }
}
