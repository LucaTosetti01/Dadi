/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dadi;

/**
 * @author Tosetti Luca
 *
 * Classe che collabora con il Main e ThDado1 andando raggruppare e a gestire i
 * dati condivisi
 */
public class CDatiCondivisi {
    /**
     * @author Tosetti Luca
     * 
     * Attributo che conterrà le varie linee di testo che dovranno poi comparire su schermo
     */
    private String[] schermo;
    /**
     * @author Tosetti Luca
     * 
     * Attributo che indica a quanti elementi si è arrivati ad avere nell'attributo "schermo"
     */
    private int Elementi;
    /**
     * @author Tosetti Luca
     *
     * Attributo che assume il valore della "prima ruota" della slot machine
     */
    private int primaRuota;
    /**
     * @author Tosetti Luca
     *
     * Attributo che assume il valore della "seconda ruota" della slot machine
     */
    private int secondaRuota;
    /**
     * @author Tosetti Luca
     *
     * Attributo che assume il valore della "terza ruota" della slot machine
     */
    private int terzaRuota;

    /**
     * @author Tosetti Luca
     *
     * @brief: Metodo costruttore con parametri che inizializza la slot machine
     *
     * Questo metodo assegna a primaRuota,secondaRuota,terzaRuota i parametri
     * passati, ed inizializza le varie posizioni dell'attributo schermo ad "", oltre
     * che inizializzare l'attributo Elementi a 0.
     *
     * @param primaRuota valore che si vuole far assumere alla primaRuota della
     * slot machine
     * @param secondaRuota valore che si vuole far assumere alla secondaRuota
     * della slot machine
     * @param terzaRuota valore che si vuole far assumere alla terzaRuota della
     * slot machine
     *
     */
    public CDatiCondivisi(int primaRuota, int secondaRuota, int terzaRuota) {
        schermo = new String[10000];
        for (int i = 0; i < 10000; i++) {
            schermo[i] = "";
        }
        this.primaRuota = primaRuota;
        this.secondaRuota = secondaRuota;
        this.terzaRuota = terzaRuota;
        this.Elementi = 0;
    }

    /**
     * @author Tosetti Luca
     *
     * @brief: Metodo costruttore senza parametri
     *
     * In questo metodo gli attributi primaRuota,secondaRuota,terzaRuota ed Elementi
     * vengono inizializzati a 0, mentre le varie posizioni dell'attributo schermo
     * vengono inizializzate a "".
     *
     */
    public CDatiCondivisi() {
        this.primaRuota = 0;
        this.secondaRuota = 0;
        this.terzaRuota = 0;
        schermo = new String[10000];
        for (int i = 0; i < 10000; i++) {
            schermo[i] = "";
        }
        this.Elementi = 0;
    }
    /**
     * @author Tosetti Luca
     * 
     * @brief Metodo get dell'attributo Elementi
     * 
     * questo metodo si occupa di ritornare il valore dell'attributo Elementi
     * di questa classe.
     * 
     * @return Valore dell'attributo Elementi
     */
    public synchronized int getNumElementi() {
        return Elementi;
    }

    /**
     * @author Tosetti Luca
     *
     * @brief: Metodo get dell'attributo primaRuota
     *
     * Questo metodo si occupa di ritornare il valore dell'attributo primaRuota
     * di questa classe
     *
     * @return valore dell'attributo primaRuota
     *
     */
    public synchronized int getPrimaRuota() {
        return primaRuota;
    }

    /**
     * @author Tosetti Luca
     *
     * @brief: Metodo set dell'attributo secondaRuota
     *
     * Questo metodo si occupa di assegnare all'attributo primaRuota il valore
     * che gli viene passato
     *
     * @param primaRuota valore da assegnare all'attributo primaRuota
     *
     */
    public synchronized void setPrimaRuota(int primaRuota) {
        this.primaRuota = primaRuota;
    }

    /**
     * @author Tosetti Luca
     *
     * @brief: Metodo get dell'attributo secondaRuota
     *
     * Questo metodo si occupa di ritornare il valore dell'attributo
     * secondaRuota di questa classe
     *
     * @return valore dell'attributo secondaRuota
     *
     */
    public synchronized int getSecondaRuota() {
        return secondaRuota;
    }

    /**
     * @author Tosetti Luca
     *
     * @brief: Metodo set dell'attributo secondaRuota
     *
     * Questo metodo si occupa di assegnare all'attributo secondaRuota il valore
     * che gli viene passato
     *
     * @param secondaRuota valore da assegnare all'attributo secondaRuota
     *
     */
    public synchronized void setSecondaRuota(int secondaRuota) {
        this.secondaRuota = secondaRuota;
    }

    /**
     * @author Tosetti Luca
     *
     * @brief: Metodo get dell'attributo terzaRuota
     *
     * Questo metodo si occupa di ritornare il valore dell'attributo terzaRuota
     * di questa classe
     *
     * @return valore dell'attributo terzaRuota
     *
     */
    public synchronized int getTerzaRuota() {
        return terzaRuota;
    }

    /**
     * @author Tosetti Luca
     *
     * @brief: Metodo set dell'attributo terzaRuota
     *
     * Questo metodo si occupa di assegnare all'attributo terzaRuota il valore
     * che gli viene passato
     *
     * @param terzaRuota valore da assegnare all'attributo terzaRuota
     *
     */
    public synchronized void setTerzaRuota(int terzaRuota) {
        this.terzaRuota = terzaRuota;
    }
    
    /**
     * @author Tosetti Luca
     * 
     * @brief: Metodo get di una posizione dell'attributo schermo
     * 
     * Questo metodo si occupa di ritornare il valore contenuto in una posizione,
     * indicata dal parametro che gli viene passato, dell'attributo schermo.
     * 
     * @param posizione Valore usato come indice dell'array per identificare il valore da ritornare
     * 
     * @return Valore contenuto in una posizione dell'attributo schermo
     */
    public synchronized String getRiga(int posizione) {
        return schermo[posizione];
    }

    /**
     * @author Tosetti Luca
     * 
     * @brief: Metodo che si occupa di far visualizzare a schermo tutte le linee memorizzate nell'attributo schermo
     * 
     * In questo metodo viene fatto l'output a schermo dei valori contenuti in tutte le linee dell'attributo schermo
     * fino a quando si arriva al numero di linee salvate nello stesso attributo.
     * 
     */
    public synchronized void VisualizzaSchermo() {
        for (int i = 0; i < Elementi; i++) {
            if (schermo[i].equals("")) {
                i = 10000;
            } else {
                System.out.println(schermo[i]);
            }
        }

    }
    
    /**
     * @author Tosetti Luca
     * 
     * @brief: Metodo che si occupa di aggiungere una linea di testo nella prima posizione vuota dell'attributo schermo
     * 
     * @param str Stringa in cui è contenuto il valore della linea di testo da memorizzare.
     */
    public synchronized void aggiungiStringa(String str) {
        schermo[Elementi] = str;
        Elementi++;
    }

}
