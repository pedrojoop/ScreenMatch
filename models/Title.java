package models;

public class Title {
    private String name;
    private int releaseYear;
    private boolean includedPlan;
    private double assessment = 9.2;
    private double sumRating;
    private int ratingTotal;
    private int filmTime;

    public int getFilmTime() {
        return filmTime;
    }

    public int getRatingTotal() {
        return ratingTotal;
    }

    double getAssessment() {
        return assessment;
    }

    public void setFilmTime(int FilmTime) {
        this.filmTime = FilmTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setIncludedPlan(boolean includedPlan) {
        this.includedPlan = includedPlan;
    }

    public void setAssessment(double assessment) {
        this.assessment = assessment;
    }

    public void setSumRating(double sumRating) {
        this.sumRating = sumRating;
    }

    public void setFilmTime(double filmTime) {
        this.filmTime = (int) filmTime;
    }

    public void showTechnicalFiles() {
        System.out.println("Film name: " + name);
        System.out.println("Release year: " + releaseYear);
        System.out.println("Included plan: " + includedPlan);
        System.out.println("Film time: " + filmTime + " Minutes");
        System.out.println("Assessment: " + assessment);
        System.out.println("Public average assessment: " + returnAverage());

    }

    public void rating(double rate) {
        sumRating += rate;
        ratingTotal++;
    }

    public double returnAverage() {
        return sumRating / ratingTotal;
    }
}
