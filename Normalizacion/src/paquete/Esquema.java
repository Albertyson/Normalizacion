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

    private HashSet<String> PK;
    private HashSet<String> atributos;
    private Hashtable<HashSet, HashSet> DF;
    private String forma;
    private String nombre;

    public Esquema(HashSet PK, HashSet atributos, Hashtable<HashSet, HashSet> DF, String forma, String nombre) {
        this.PK = PK;
        this.atributos = atributos;
        this.DF = DF;
        this.forma = forma;
        this.nombre = nombre;
    }

    public HashSet<String> getPK() {
        return PK;
    }

    public void setPK(HashSet<String> PK) {
        this.PK = PK;
    }

    public HashSet<String> getAtributos() {
        return atributos;
    }

    public void setAtributos(HashSet<String> atributos) {
        this.atributos = atributos;
    }

    public Hashtable<HashSet, HashSet> getDF() {
        return DF;
    }

    public void setDF(Hashtable<HashSet, HashSet> DF) {
        this.DF = DF;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
