package Biblioteca;

import java.util.HashMap;

public class Libreria
{
    HashMap<Integer, Libro> Libreria = new HashMap<Integer, Libro>();
    
    public String AggiungiLibro(Libro x)
    {
        int quantitaPresente = 0;
        String s = "";
        
        if(Libreria.containsKey(x.getCodiceISBN()))
        {
            quantitaPresente = Libreria.get(x).getQuantita();
            Libreria.get(x).setQuantita(1 + quantitaPresente);
            s = Ricerca(x);
        }
        else
        {
            x.setQuantita(1);
            Libreria.put(x.getCodiceISBN(), x);
            s = Ricerca(x);
        }
        
        return s;
    }
    
    public String Ricerca(Libro x)
    {
        Libro y;
        String s = "";
        
        if(Libreria.containsKey(x.getCodiceISBN()))
        {
           y = Libreria.get(x.getCodiceISBN());
           
           s = "Codice Libro Inserito: " + y.getCodiceISBN();
        }
        else
        {
            s = "Nessun Libro Trovato";
        }
        
        return s;
    }
    
    public String numeroTotaliDeiLibri()
    {
        int conta = 0;
        String s = "";
        
        for(int i = 0; i < Libreria.size(); i++)
        {
            conta = Libreria.get(i).getQuantita();
        }
        
        s = "Il Numero Totale Dei Libir E': " + conta; 
        
        return s;    
    }
}
