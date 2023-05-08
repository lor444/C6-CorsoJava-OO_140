import it.corsojava.scontrino.Riga;
import it.corsojava.scontrino.tipidati.base.Percentuale;
import it.corsojava.scontrino.tipidati.specifici.Iva;
import it.corsojava.scontrino.tipidati.specifici.Sconto;

public class ScontrinoAgent {

    private TerminalUI ui;

    public ScontrinoAgent(TerminalUI ui){
        this.ui=ui;
    }

    public Riga recuperaRiga(){
        Riga r=new Riga();
        r.setPrezzoUnitario(ui.askDouble("Importo unitario"));
        r.setQuantita(ui.askInt("Quantita"));
        Percentuale p = new Percentuale(ui.askDouble("Sconto"));
        r.setSconto(new Sconto(p));
        r.setIva(new Iva(ui.askDouble("Iva")));
        return r;
    }

}
