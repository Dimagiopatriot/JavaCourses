package main.java.task5.eleventh_question;

/**
 * Created by troll on 11.08.2017.
 */
public class DVDRom {

    private boolean data = false;

    public boolean hasData(){
        return data;
    }

    void loadData(){
        data = true;
    }

    void unloadData(){
        data = false;
    }
}
