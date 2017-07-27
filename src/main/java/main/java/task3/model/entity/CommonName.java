package main.java.task3.model.entity;

import main.java.task3.util.GrammarValues;

/**
 * Created by troll on 27.07.2017.
 */
public class CommonName {

    private String name;
    private String surname;
    private String middleName;
    private String nickName;

    CommonName(String name, String surname, String middleName, String nickName){
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.nickName = nickName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        StringBuilder commonName = new StringBuilder();
        commonName.append(surname)
                .append(GrammarValues.SPACE)
                .append(name.charAt(0))
                .append(GrammarValues.DOT);
        return commonName.toString();
    }
}
