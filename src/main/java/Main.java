public class Main {
    public static void main(String[] args) {

        Person father = new Person ("Marijan", "Mikolcic", 'm', 68);
        Person mother = new Person ("Grozdana", "Mikolcic", 'm', 65);
        Person child = new Person ("Marina", "Mikolcic Strika", 'f', 38);

        child.addParents(child, father, mother);
        child.addChildToChildren(child, mother);

        System.out.println(child.getMother().getName());
        System.out.println(child.getFather().getName());


    }
}
