package it.corsojava.scontrino.tipidati.specifici;


public class Iva{

    private double aliquota=22.0;

    public Iva(){
    }

    public Iva(double aliquota){
        setAliquota(aliquota);
    }

    private void setAliquota(double aliquota){
        this.aliquota=aliquota;
    }

    public double getAliquota(){
        return this.aliquota;
    }

    public double calcolaIva(double imponibile){
        return imponibile / 100 * this.aliquota;
    }

}
