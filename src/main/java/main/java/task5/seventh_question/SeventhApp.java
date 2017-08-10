package main.java.task5.seventh_question;

public class SeventhApp {

    public static void main(String[] args) {

        WatchMaker maker = new RomeWatchMaker();//DigitalWatchMaker(); // можем оперировать любыми объектами, что
        // заимпелентили интерфейс WatchMaker
        maker = getMakerByName("Rome");

        //благодаря factory method код ниже не поменялся, клиентский код
        Watch watch = maker.createWatch();
        watch.showTime();
    }

    public static WatchMaker getMakerByName(String maker){
        if (maker.equals("Digital"))
            return new DigitalWatchMaker();
        else if (maker.equals("Rome"))
            return new RomeWatchMaker();
        throw new RuntimeException("Не поддерживаемая производственная линия часов: " + maker);
    }
}
