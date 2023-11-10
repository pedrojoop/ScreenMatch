package models;

public class Serie extends Title{
    private int season;
    private boolean active;
    private int episodesForSeason;
    private int MinutesForEpisode;

    public void setSeason(int season) {
        this.season = season;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setEpisodesForSeason(int episodesForSeason) {
        this.episodesForSeason = episodesForSeason;
    }

    public void setMinutesForEpisode(int minutesForEpisode) {
        MinutesForEpisode = minutesForEpisode;
    }

    @Override
    public int getFilmTime() {
        return season * episodesForSeason * MinutesForEpisode;
    }
}
