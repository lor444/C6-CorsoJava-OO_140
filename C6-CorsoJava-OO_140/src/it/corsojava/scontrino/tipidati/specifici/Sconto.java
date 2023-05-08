package it.corsojava.scontrino.tipidati.specifici;

import it.corsojava.scontrino.tipidati.base.Percentuale;

public class Sconto{
    private Percentuale value;
    private boolean valid;

    public Sconto(Percentuale value){
        setValue(value);
    }
    
    public Percentuale getValue(){
        return this.value;
    }
    public void setValue(Percentuale value){
        if(value!=null && value.getValue()>0){
            this.value=value;
            valid=true;
        }else {
            this.value=null;
            valid=false;
        }
    }
    public double calcolaSconto(double importo){
        if(this.isValid()){
            this.valid=true;
            return importo / 100 * this.value.getValue();
        } else {
            this.valid=false;
            return 0;
        }
    }
    public boolean isValid(){
        return this.valid;
    }

}

