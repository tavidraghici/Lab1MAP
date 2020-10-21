import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Note n1 = new Note(44);
        Note n2 = new Note(72);
        Note n3 = new Note(86);
        Note n4 = new Note(29);
        Note n5 = new Note(38);

        List<Note> noten = new ArrayList<Note>();
        noten.add(n1);
        noten.add(n2);
        noten.add(n3);
        noten.add(n4);
        noten.add(n5);

        HandlungNoten h1 = new HandlungNoten(noten);

        List<Note> result = new ArrayList<Note>();

        result = h1.ausreichendeNoten();
        System.out.println("Ausreichende Noten:");
        for(Note note : result)
            System.out.println(note.getWertNote());
        result.clear();

        System.out.println("Durchschnittsnote: ");
        System.out.println(h1.Durchschnittswert());

        result = h1.abgerundeteNoten();
        System.out.println("Abgerundete Noten:");
        for(Note note : result)
            System.out.println(note.getWertNote());

        System.out.println("Maximale Note: ");
        System.out.println(h1.maximaleNote().getWertNote());
    }
}
