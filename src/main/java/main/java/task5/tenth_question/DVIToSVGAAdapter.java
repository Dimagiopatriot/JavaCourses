package main.java.task5.tenth_question;

/**
 * Created by troll on 11.08.2017.
 */
public class DVIToSVGAAdapter implements ConnectionAdapter {

    SVGAOutput svgaOutput;

    DVIToSVGAAdapter(SVGAOutput svgaOutput){
        this.svgaOutput = svgaOutput;
    }
    @Override
    public void connect() {
        svgaOutput.connectMonitor();
    }
}
