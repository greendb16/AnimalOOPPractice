public class Animal {
    public Animal(){
        System.out.println("A new animal has been created!");
    }

    //Polymorphic methods that will deploy differently based on the class called in.
    public String sleep(){
        return "An animal sleeps...";
    }
    public String eat(){
        return "An animal eats...";
    }

}
