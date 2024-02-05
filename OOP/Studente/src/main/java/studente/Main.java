package studente;

public class Main {
    public static void main(String[] args) {
        Studente Mohamed = new Studente("Mohamed", "Elaraishi", "12/09/2006");
        System.out.println(Mohamed.visualizzaStudente());
        Mohamed.AggiungiNota("Lo Studente disturba la lezione continuamente");
        Mohamed.AggiungiNota("Lo Studente non ha portato il quaderno ");
        Mohamed.AggiungiNota("Lo Studente rutta");
        Mohamed.AggiungiNota("Lo Studente Collabora");
        System.out.println(Mohamed.VisualizzaNote());
        System.out.println(Mohamed.numeroNote());
        Mohamed.eliminaNota(5);
        System.out.println(Mohamed.VisualizzaNote());
        System.out.println(Mohamed.numeroNote());
    }
}
