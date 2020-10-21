public class Note {
    int note;

    public Note(int note) {
        this.note = note;
    }

    public boolean isAusreichend(){
        return !(note<40);
    }

    public Note abgerundeteNote(){
        if(note>=38){
            int mult = note/5 + 1;
            if((mult*5 - note)<3) {
                return new Note(mult * 5);
            }
            else
                return new Note(note);
        }
        else
            return new Note(note);
    }

    public int getWertNote(){
        return note;
    }

    public Note getNote(){
        return new Note(note);
    }
}
