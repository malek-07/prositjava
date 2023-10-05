package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private final int nbrCages = 25;
    private int nbrAnimaux = 0;

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public int getNbrAnimaux() {
        return nbrAnimaux;
    }

    public void setNbrAnimaux(int nbrAnimaux) {
        this.nbrAnimaux = nbrAnimaux;
    }

    public Zoo(int nbrAnimals, String name, String city) {
        if (nbrAnimals>nbrCages)
        {
            System.out.println("Number of animals must be below number of cages(25)");
            return;
        }
        this.animals=new Animal[nbrAnimals];
        this.name = name;
        this.city = city;
    }
    public boolean addAnimal(Animal animal){
        if (searchAnimal(animal)!=-1)
        {
            return false;
        }
        // System.out.println(animal.name+" ADDING ----");
        if (!isZooFull()) {
            this.animals[nbrAnimaux] = animal;
            //   System.out.println("INDICE : "+nbrAnimaux++);
            nbrAnimaux++;
            return true;
        }
        return false;
        /*
        for (int i = 0; i < this.animals.length; i++) {
            if(this.animals[i]==null) {
                this.animals[i] = animal;
                return true;
            }
        }*/
    }

    public boolean isZooFull()
    {
        return nbrAnimaux >= nbrCages;
    }
    public void displayAnimals()
    {
        int i = 0;
        /*
        for (Animal animal : this.animals) {
            i++;
            if (animal == null) {
                break;
            }
            System.out.println("Animal["+i+"] = family="+animal.family+" | name = "+animal.name+" | age ="+animal.age+"| Mammal = "+((animal.isMammal) ? "yes" :  "no"));

        }*/
        if (this.animals[0]!=null)
        {
            for (i = 0; i < nbrAnimaux; i++) {
                System.out.println("Animal[" + i + "] = family=" + animals[i].getFamily() + " | name = " + animals[i].getName() + " | age =" + animals[i].getAge() + "| Mammal = " + ((animals[i].isMammal()) ? "yes" : "no"));
            }
        }
    }
    public int searchAnimal(Animal animal)
    {
        for (int i = 0; i < nbrAnimaux; i++) {
            if (this.animals[i]!=null) {
                if (animals[i].getName().equals(animal.getName())) {
                    return i;
                }
            }
        }
        return -1;
    }
    public boolean removeAnimal(Animal an){
        int pos = searchAnimal(an);
        System.out.println(pos);
        if (pos == -1)
            return false;

        for (int i = pos; i < nbrAnimaux - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimaux - 1] = null;
        nbrAnimaux--;
        return true;
        // needs modif
    }
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimaux > z2.nbrAnimaux) {
            return z1;
        } else if (z1.nbrAnimaux < z2.nbrAnimaux) {
            return z2;
        } else {
            return null;
        }
    }
}
