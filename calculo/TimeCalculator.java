package calculo;
import models.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void include(Title title) {
        System.out.println("Duração em minutos de: " + title);
        this.totalTime += title.getFilmTime();
    }

    /*  mesma coisa sem repetir o codigo acima
    public void include(Film f) {
        this.totalTime += f.getFilmTime();
    }

        public void include(Serie s) {
        this.totalTime += s.getFilmTime();
    }
    */
}
