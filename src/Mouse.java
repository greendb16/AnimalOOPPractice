public class Mouse extends Animal {

    public Mouse(){

        System.out.println("A mouse Scurries in!");
    }

    @Override
    public String eat(){

        return "A mouse eats......";
    }


    @Override
    public String sleep(){

        return "A mouse sleeps....";
    }

    public String squeek(){

        return "A mouse Squeeks....";
    }



}
