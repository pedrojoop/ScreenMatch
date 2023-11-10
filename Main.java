import calculo.RecomendationFilter;
import calculo.TimeCalculator;
import models.Episode;
import models.Film;
import models.Serie;

public class Main {
    public static void main(String[] args) {
        Film myFilm = new Film();

        myFilm.setName("The GodFather");
        myFilm.setReleaseYear(1970);
        myFilm.setFilmTime(180);
        myFilm.setIncludedPlan(true);
        System.out.println("Duração do filme:" + myFilm.getFilmTime());

        myFilm.rating(9.3);
        myFilm.rating(8);
        myFilm.rating(10);
        myFilm.showTechnicalFiles();

        System.out.println("****************************************************************");
        System.out.println("****************************************************************");

        Serie lost = new Serie();

        lost.setName("Lost");
        lost.setReleaseYear(2000);
        lost.showTechnicalFiles();
        lost.setSeason(10);
        lost.setActive(true);
        lost.setEpisodesForSeason(10);
        lost.setMinutesForEpisode(50);
        System.out.println("Duração da serie: " + lost.getFilmTime());

        Film myFilm2 = new Film();

        myFilm2.setName("Avatar");
        myFilm2.setReleaseYear(2023);
        myFilm2.setFilmTime(200);

        System.out.println("****************************************************************");
        System.out.println("****************************************************************");

        TimeCalculator calculator = new TimeCalculator();

        calculator.include(myFilm);
        calculator.include(myFilm2);
        calculator.include(lost);
        System.out.println(calculator.getTotalTime());

        RecomendationFilter filter = new RecomendationFilter();

        filter.filter(myFilm);

        Episode episode = new Episode();

        episode.setNumber(1);
        episode.setSerie("Lost");
        episode.setVisualizeTotal(300);
        filter.filter(episode);
    }
}
