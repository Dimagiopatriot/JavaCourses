package main.java.task3.model;

import main.java.task3.exceptions.WrongInputNickNameException;
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

    public void addNotation(Notation notation) throws WrongInputNickNameException{
        checkValidNickName(notation);
        notations.add(notation);
    }

    private void checkValidNickName(Notation notation) throws WrongInputNickNameException {
        for (Notation listNotation: notations) {
            if (listNotation.getCommonName().getNickName().equals(notation.getCommonName().getNickName())){
                throw new WrongInputNickNameException();
            }
        }
    }
}
