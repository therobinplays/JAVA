public class Dog {

    String name;
    String breed;
    int age;
    String color;

    public Dog(String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public String getName() { return name; }
    public String getBreed() { return breed; }
    public int getAge() { return age; }
    public String getColor() { return color; }

    @Override
    public String toString() {
        return "Name is: " + name
             + "\nBreed is: "+ breed
             +"\nage is: " + age
             +"\ncolor is : " + color;
    }

    public static void main(String[] args) {
        Dog tuffy = new Dog("Rajan", "Alien", 15, "undefined");
        System.out.println(tuffy);
    }
}