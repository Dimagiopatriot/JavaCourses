package main.java.task5.eleventh_question;

/**
 * Created by troll on 11.08.2017.
 */
public class Computer {

    Power power = new Power();
    DVDRom dvdRom = new DVDRom();
    HDD hdd = new HDD();

    void turnOn(){
        power.on();
    }

    void turnOff(){
        power.off();
    }

    void copy(){
        dvdRom.loadData();
        hdd.copyFromDVD(dvdRom);
    }
}
