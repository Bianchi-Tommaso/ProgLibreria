package Biblioteca;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Grafica extends JFrame implements ActionListener
{
    private Container c = new Container();
    private JPanel p1 = new JPanel();
    private JLabel lib = new JLabel("Libreria");
    private JLabel ISBN = new JLabel("Codice ISBN:");
    private JLabel titolo = new JLabel("Titolo:");
    private JLabel prezzo = new JLabel("Prezzo:");
    private JLabel stampaCodice = new JLabel("");
    private JLabel stampaCopie = new JLabel("");
    private JLabel stampaTotali = new JLabel("");
    private JTextField inserimentoISBN = new JTextField();
    private JTextField inserimentoTitolo = new JTextField();
    private JTextField inserimentoPrezzo = new JTextField();
    private JButton bottoneConferma = new JButton("Conferma");
    private JButton bottoneAnnulla = new JButton("Annulla");
    
    public Grafica()
    {
        c = this.getContentPane();
        p1.setLayout(null);
        this.setTitle("Libreria");                              
        this.setVisible(true);                                  
        this.setLocation(400, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        this.setSize(400, 400);                                 
        this.setResizable(false);
        
        int y = 50;
        
        lib.setBounds(160, 10, 150, 20);
        ISBN.setBounds(40, 30 + y, 150, 20);
        titolo.setBounds(40, 70 + y, 150, 20);
        prezzo.setBounds(40, 110 + y, 150, 20);
        stampaCodice.setBounds(40, 180 + y, 200, 20);
        stampaCopie.setBounds(40, 190 + y, 300, 20);
        stampaTotali.setBounds(40, 200 + y, 200, 20);
        inserimentoISBN.setBounds(120, 30 + y, 150, 20);
        inserimentoTitolo.setBounds(120, 70 + y, 150, 20);
        inserimentoPrezzo.setBounds(120, 110 + y, 150, 20);
        bottoneConferma.setBounds(100, 150 + y, 90, 20);
        bottoneAnnulla.setBounds(200, 150 + y, 90, 20);
        
        p1.add(lib);
        p1.add(ISBN);
        p1.add(titolo);
        p1.add(prezzo);
        p1.add(inserimentoISBN);
        p1.add(inserimentoTitolo);
        p1.add(inserimentoPrezzo);
        p1.add(bottoneConferma);
        p1.add(bottoneAnnulla);
        p1.add(stampaCodice);
        p1.add(stampaCopie);
        p1.add(stampaTotali);
        c.add(p1);
        
        bottoneConferma.addActionListener(this);
        bottoneAnnulla.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        String evento = e.getActionCommand();
        String isbn = "";
        String titolo = "";
        String prezzo = "";
        int copieLibro = 0;
        int libriTotali = 0;
        Libreria libreria = new Libreria();
        
        switch(evento)
        {
            case "Conferma":
                isbn = inserimentoISBN.getText();
                titolo = inserimentoTitolo.getText();
                prezzo = inserimentoPrezzo.getText();
                
                inserimentoISBN.setText("");
                inserimentoTitolo.setText("");
                inserimentoPrezzo.setText("");
                
                Libro libro = new Libro(Integer.valueOf(isbn), Integer.valueOf(prezzo), titolo);
                libreria.AggiungiLibro(libro);
                copieLibro = libreria.CopieLibro(libro);
                libriTotali = libreria.numeroTotaliDeiLibri();
                stampaCodice.setText("Codice Libro Inserito: " + libro.getCodiceISBN());
                stampaCopie.setText("Copie del Libro Presenti In Libreria: " + copieLibro);
                stampaTotali.setText("Libri Totali: " + libriTotali);
                
                break;
                
            case "Annulla":
                inserimentoISBN.setText("");
                inserimentoTitolo.setText("");
                inserimentoPrezzo.setText("");
                break;
        }
    }
}
