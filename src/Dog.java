public class Dog extends Animal{

    public Dog(){

        System.out.println("Its a dog named rover.");
    }


    @Override
    public String eat(){

        return "a dog eats...";
    }

    @Override
    public String sleep(){
        return "a dog sleeps...";
    }

    public String woof(){

        return "woof";
    }



}
