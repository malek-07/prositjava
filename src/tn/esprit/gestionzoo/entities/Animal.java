package tn.esprit.gestionzoo.entities;

public class Animal {

    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
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

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        if (age<0) {
            System.out.println("age negative ");
            return ;
        }
        this.age = age;
        this.isMammal = isMammal;
    }
}
