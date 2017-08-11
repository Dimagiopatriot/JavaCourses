package main.java.task5.eleventh_question;

/**
 * Created by troll on 11.08.2017.
 */
public class HDD {

    void copyFromDVD(DVDRom dvd){
        if (dvd.hasData()){
            System.out.println("Copy data from disk");
        } else {
            System.out.println("Input disk with data");
        }
    }
}
