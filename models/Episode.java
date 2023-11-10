package models;

import calculo.Classifier;

public class Episode implements Classifier {
    private int number;
    private String name;
    private String serie;
    private int visualizeTotal;

    public int visualizeTotal() {
        return visualizeTotal;
    }

    public int number() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String serie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public void setVisualizeTotal(int visualizeTotal) {
        this.visualizeTotal = visualizeTotal;
    }

    @Override
    public int getClassifier() {
        if (visualizeTotal > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
