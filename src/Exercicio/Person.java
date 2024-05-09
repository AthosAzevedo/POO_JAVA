package Exercicio;

public abstract class Person {
    protected String name;
    protected int age;
    protected String gender;
    protected float experience;

    public Person(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
        setExperience(0);
    }

    public void gainExperience(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", experience=" + experience +
                '}';
    }
}
