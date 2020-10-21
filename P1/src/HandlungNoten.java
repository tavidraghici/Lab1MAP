import java.util.ArrayList;
import java.util.List;

public class HandlungNoten {
    List<Note> noten = new ArrayList<Note>();

    public HandlungNoten(List<Note> noten) {
        this.noten = noten;
    }

    public List<Note> ausreichendeNoten (){
        List<Note> result = new ArrayList<Note>();
        for(Note note : noten){
            if(note.isAusreichend()){
                result.add(note);
            }
        }
        return result;
    }

    public double Durchschnittswert(){
        double sum=0;
        for(Note note : noten){
            sum += note.getWertNote();
        }
        return sum/ noten.size();
    }

    public List<Note> abgerundeteNoten () {
        List<Note> result = new ArrayList<Note>();
        for(Note note : noten){
            result.add(note.abgerundeteNote());
        }
        return result;
    }

    public Note maximaleNote(){
        Note maxNote = new Note(0);
        for (Note note : noten){
            if(note.getWertNote() > maxNote.getWertNote())
                maxNote = note;
        }
        return maxNote;
    }
}
