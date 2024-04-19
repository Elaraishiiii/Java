package alunno;
public class Console {
    public static void main(String[] args) {
        Alunno Mohamed = new Alunno("Mohamed", "Elaraishi", "12/09/2006", "Egitto");
        System.out.println(Mohamed.visualizzaStudente());
        Mohamed.AggiungiNota("Lo Studente disturba la lezione continuamente");
        Mohamed.AggiungiNota("Lo Studente non ha portato il quaderno ");
        Mohamed.AggiungiNota("Lo Studente rutta");
        Mohamed.AggiungiNota("Lo Studente Collabora");
        System.out.println(Mohamed.VisualizzaNote());
        System.out.println("Lo Studente ha: " + Mohamed.numeroNote() + " Note" );
        Mohamed.eliminaNota(3);
        System.out.println(Mohamed.VisualizzaNote());
        System.out.println("Lo Studente ha: " + Mohamed.numeroNote() + " Note" );
    }
    
}
