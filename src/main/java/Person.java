import java.util.ArrayList;

public class Person {

    private String name;
    private String middleName;
    private String lastname;
    private char sex;
    private int age;
    Person mother;
    Person father;
    ArrayList <Person> siblings;
    ArrayList <Person> children;
    ArrayList<Pet> pets;


    public Person(String name, String lastname, char sex, int age) {
        this.name = name;
        this.lastname = lastname;
        this.sex = sex;
        this.age = age;
    }

    public Person(String name, String middleName, String lastname, char sex, int age) {
        this.name = name;
        this.middleName = middleName;
        this.lastname = lastname;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public ArrayList<Person> getSiblings() {
        return siblings;
    }

    public void setSiblings(ArrayList<Person> siblings) {
        this.siblings = siblings;
    }

    public ArrayList<Person> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Person> children) {
        this.children = children;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }

    //methods
    public void addParents(Person child, Person mother, Person father){
        child.setMother(mother);
        child.setFather(father);
        mother.addChildToChildren(child, mother);
        father.addChildToChildren(child, father);

    }

    public void addChildToChildren(Person child, Person parent) {
        children.add(child);

    }

    public void addChild() {}

    public void addPet() {}

    public void addSibling() {}

    public void getGrandchildren() {}
}
