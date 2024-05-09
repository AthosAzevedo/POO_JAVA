package Exercicio;

public class Subscribed extends Person {
    private String login;
    private int totalWatched;

    public Subscribed(String name, int age, String gender, String login) {
        super(name, age, gender);
        setLogin(login);
        setTotalWatched(0);
    }

    public void watchedOneMore(){

    }

    @Override
    public void gainExperience() {

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalWatched() {
        return totalWatched;
    }

    public void setTotalWatched(int totalWatched) {
        this.totalWatched = totalWatched;
    }

    @Override
    public String toString() {
        return "Subscribed{" +
                "login='" + login + '\'' +
                ", totalWatched=" + totalWatched +
                '}';
    }
}
