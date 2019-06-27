

//All birds are animals, but not all animals are birds;

                //Inhereting Animal class functions
public class Bird extends Animal{


    //calls basic Animal contructor then prints bird specific, due to no override
    public Bird(){
        //super() unnecessary
        System.out.println("A bird is hatched...");
    }


    //overrideing Animal sleep class to print this instead
    @Override
    public String sleep(){
        return "A bird sleeps soundly...";
    }

    @Override
    public  String eat(){
        return "A bird eats...";
    }



    public String fly(){
        //Birds can fly but others cant, so this is exclusive to bird class

        return "A bird flies";
    }

}