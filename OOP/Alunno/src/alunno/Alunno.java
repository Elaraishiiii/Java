package alunno;
import java.util.ArrayList;

public class Alunno {
// Variabili
    private String Nome, Cognome,DataNascita, LuogodiNascita;
    private ArrayList<String> note = new ArrayList<String>(50);
    private ArrayList<String> voti = new ArrayList<>();
    //private ArrayList<Object> noteq = new ArrayList<>();
    // Costruttori
    public Alunno (){
        Nome = null;
        Cognome = null;
        DataNascita = null;
        LuogodiNascita = null;
    }
    
    public Alunno (String Nome, String Cognome, String DataNascita, String LuogodiNascita){
        try {
            this.Nome = Nome;
            this.Cognome = Cognome;
            this.DataNascita = DataNascita;
            this.LuogodiNascita = LuogodiNascita;
        } catch (Exception e) {
            System.out.println("Errore");
        }
    }
    
    public String getNome (){
        return Nome;
    }
    
    public String getCognome (){
        return Cognome;
    }
    
    public String getNascita (){
        return DataNascita;
    }
    
    public String getLuogoNascita (){
        return LuogodiNascita;
    }
    
    public String visualizzaStudente (){
        String s = "";
        s = "Nome: "+ this.getNome()+"\n"+"Cognome: "+this.getCognome()+"\n"+"Data di Nascita: "+getNascita() + "\nLuogo di Nascita: " + getLuogoNascita();
        return s;
    }
    
    public void setNome (String Nome){
        this.Nome = Nome;
    }
    
    public void setCognome (String Cognome){
        this.Cognome = Cognome;
    }
    
    public void setNascita (String DataNascita){
        this.DataNascita = DataNascita;
    }
    
    public void AggiungiNota (String Nota){
        note.add(Nota);
    }
    
    public void eliminaNota (int n){
        int nn = numeroNote();
        if (n > nn || n == 0) {
            System.out.println("Nota Non Presente");
        }
        else
            note.remove(n-1);
    }
    
    public void eliminaNote (){
        for (int i = 0; i < note.size(); i++) {
            note.clear();
            
        }
    }
    
    public String VisualizzaNote (){
        String note = "";
        for (int i = 0; i < this.note.size(); i++) {
            note += "Nota "+(i+1)+": " + this.note.get(i)+"\n";
        }
        return note;
    }
    
    public int numeroNote (){
        return note.size();
    }   
}
