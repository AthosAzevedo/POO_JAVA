package Exercicio;

public class Video implements VideoActions {
    private String title;
    private int rate;
    private int views;
    private int likes;
    private boolean playing;


    public Video(String title) {
        setTitle(title);
        setRate(1);
        setViews(1);
        setLikes(0);
        setPlaying(false);
    }

    @Override
    public void play() {
        setPlaying(true);
    }
    @Override
    public void pause() {
        setPlaying(false);
    }
    @Override
    public void like() {
        this.likes++;
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", rate=" + rate +
                ", views=" + views +
                ", likes=" + likes +
                ", playing=" + playing +
                '}';
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }
    public int getLikes() {
        return likes;
    }
    public void setLikes(int likes) {
        this.likes = likes;
    }
    public boolean isPlaying() {
        return playing;
    }
    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        if (this.views != 0) {
            int newRate = (this.rate + rate) / this.views;
            this.rate = newRate;
        } else {
            this.rate = rate;
        }
    }
}
