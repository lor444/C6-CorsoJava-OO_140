import it.corsojava.scontrino.Riga;
import it.corsojava.scontrino.tipidati.base.Percentuale;
import it.corsojava.scontrino.tipidati.specifici.Iva;
import it.corsojava.scontrino.tipidati.specifici.Sconto;

import java.util.Scanner;

public class Avvio{


    public static void main (String[] s){

        Scanner in = new Scanner(System.in);
        Riga r = new Riga();

        System.out.print("Importo unitario: ");
        String strImporto=in.nextLine();
        Double dImporto = Double.parseDouble(strImporto);
        r.setPrezzoUnitario(dImporto);

        System.out.print("Quantita: ");
        String strQuantita = in.nextLine();
        Integer iQuantita = Integer.parseInt(strQuantita);
        r.setQuantita(iQuantita);

        System.out.print("Sconto: ");
        String strSconto=in.nextLine();
        Double dSconto = Double.parseDouble(strSconto);
        r.setSconto(new Sconto(new Percentuale(dSconto)));

        System.out.print("Iva: ");
        String strIva=in.nextLine();
        Double dIva = Double.parseDouble(strIva);
        r.setIva(new Iva(dIva));

        System.out.println("Totale riga: "+r.getPrezzoTotale());

    }


}