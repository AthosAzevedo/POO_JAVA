package Exercicio;

public class View {
    private Subscribed viewer;
    private Video movie;

    public View(Subscribed viewer, Video movie) {
        this.viewer = viewer;
        this.movie = movie;
        this.viewer.setTotalWatched(this.viewer.getTotalWatched()+1);
        this.movie.setViews(this.movie.getViews()+1);
    }

    public void rate(){
        this.movie.setRate(5);
    }

    public void rate(int note){
        this.movie.setRate(note);
    }

    public void rate(float percent){
        int total = 0;
        if (percent <=20){
            total = 3;
        }else  if (percent <=50){
            total = 5;
        }else if (percent <=90){
            total = 8;
        } else {
            total = 10;
        }
        this.movie.setRate(total);
    }

    public Subscribed getViewer() {
        return viewer;
    }

    public void setViewer(Subscribed viewer) {
        this.viewer = viewer;
    }

    public Video getMovie() {
        return movie;
    }

    public void setMovie(Video movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "View{" +
                "viewer=" + viewer +
                ", movie=" + movie +
                '}';
    }
}
