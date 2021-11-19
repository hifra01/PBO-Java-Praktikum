package id.my.hifra.exceptions;

public class TitleException extends NoteException{
    public TitleException() {
        super("Judul tidak boleh kosong");
    }
}
