package Biblioteca;

import java.util.HashMap;
import java.util.Map;

public class Libreria
{
    HashMap<Integer, Libro> Libreria = new HashMap<Integer, Libro>();
    
    public void AggiungiLibro(Libro x)
    {
        int quantitaPresente = 0;
        
        if(Libreria.containsKey(x.getCodiceISBN()))
        {
            quantitaPresente = Libreria.get(x.getCodiceISBN()).getQuantita();
            Libreria.get(x.getCodiceISBN()).setQuantita(1 + quantitaPresente);
        }
        else
        {
            x.setQuantita(1);
            Libreria.put(x.getCodiceISBN(), x);
        }
    }
    
    public int CopieLibro(Libro x)
    {
        int quantita = 0;
        
        if(Libreria.containsKey(x.getCodiceISBN()))
        {
          quantita = Libreria.get(x.getCodiceISBN()).getQuantita();
        }
   
        return quantita;
    }
    
    public int numeroTotaliDeiLibri()
    {
        int chiave = 0;
        int conta = 0;
        
         for(Map.Entry<Integer, Libro> e : Libreria.entrySet())
         {
             chiave = e.getKey();
             conta += Libreria.get(chiave).getQuantita();
         }
        
        return conta;    
    }
}
