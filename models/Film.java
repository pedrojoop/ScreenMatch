package models;

import calculo.Classifier;

public class Film extends Title implements Classifier {
    private String direction;

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public int getClassifier() {
        return (int) returnAverage() / 2;
    }
}