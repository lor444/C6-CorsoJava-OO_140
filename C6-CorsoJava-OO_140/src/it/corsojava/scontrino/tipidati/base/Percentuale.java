package it.corsojava.scontrino.tipidati.base;

public class Percentuale{

    public static final double MAX_VALUE=100.0;
    public static final double MIN_VALUE=-100.0;

    private double value;
    private boolean valid = false;
        
    public Percentuale(double value){
        setValue(value);
    }
    
    public double getValue(){
        return this.value;
    }
     
    public void setValue(double value){
        if(value>=Percentuale.MIN_VALUE && value<=Percentuale.MAX_VALUE){
            this.value=value;
            this.valid=true;
        }else{
            this.value=0;
            this.valid=false;
        }
    } 
    
    public boolean isValid(){
        return this.valid;
    }
    
}


