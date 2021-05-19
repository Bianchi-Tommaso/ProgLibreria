package Biblioteca;

public class Libro
{
    private int codiceISBN;
    private int prezzo;
    private int quantita;
    private String titolo;

    public Libro(int codiceISBN, int prezzo, String titolo)
    {
        this.codiceISBN = codiceISBN;
        this.prezzo = prezzo;
        this.titolo = titolo;
    }

    @Override
    public String toString() 
    {
        return "Libro: \n" + "Titolo: " + titolo + "\n" + " Quantità: " + quantita + "\n" + " Prezzo: " + prezzo + "\n" + " ISBN: " + codiceISBN; 
    }    
    
    public int getQuantita()
    {
        return quantita;
    }

    public void setQuantita(int quantita) 
    {
        this.quantita = quantita;
    }

    public int getCodiceISBN() 
    {
        return codiceISBN;
    }

    public void setCodiceISBN(int codiceISBN)
    {
        this.codiceISBN = codiceISBN;
    }

    public int getPrezzo()
    {
        return prezzo;
    }

    public void setPrezzo(int prezzo) 
    {
        this.prezzo = prezzo;
    }

    public String getTitolo() 
    {
        return titolo;
    }

    public void setTitolo(String titolo)
    {
        this.titolo = titolo;
    }   
}
