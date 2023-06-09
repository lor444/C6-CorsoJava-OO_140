package it.corsojava.scontrino;

import it.corsojava.scontrino.tipidati.specifici.Sconto ;
import it.corsojava.scontrino.tipidati.specifici.Iva;

public class Riga{

    private double prezzoUnitario;
    private Sconto sconto;
    private Iva iva;
    private double quantita;
    
    public void setPrezzoUnitario(double prezzoUnitario){
        this.prezzoUnitario=prezzoUnitario;
    }
    public double getPrezzoUnitario(){
        return this.prezzoUnitario;
    }

    public void setSconto(Sconto sconto){
        this.sconto=sconto;
    }
    public Sconto getSconto(){
        return this.sconto;
    }
    public void setIva(Iva iva){
        this.iva=iva;
    }
    public Iva getIva(){
        return this.iva;
    }
    public void setQuantita(double quantita){
        this.quantita=quantita;
    }
    public double getQuantita(){
        return this.quantita;
    }

    public double getPrezzoTotale(){
        double temp=0.0;
        temp=prezzoUnitario * quantita;
        if(this.sconto !=null && this.sconto.isValid()){
            double sc = temp / 100 * this.sconto.getValue().getValue();
            temp -= sc;
        }
        if(this.iva!=null){
            double imposta= this.iva.calcolaIva(temp);
            temp += imposta;
        }
        return temp;
    }

}