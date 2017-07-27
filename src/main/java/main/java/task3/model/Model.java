package main.java.task3.model;

import main.java.task3.model.entity.Notation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by troll on 27.07.2017.
 */
public class Model {

    private List<Notation> notations;

    public Model() {
        notations = new ArrayList<>();
    }

    public List<Notation> getNotations() {
        return notations;
    }

    public void setNotations(List<Notation> notations) {
        this.notations = notations;
    }

    public void addNotation(Notation notation){

        notations.add(notation);
    }
}
