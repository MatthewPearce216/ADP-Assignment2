package ac.za.cput;

public class AnimalMain {

    private String name;
    private String type;

    public  AnimalMain(){

    }

    public AnimalMain(String nm, String ty){

        name = nm;
        type = ty;
    }

    public void setName(String nm){

        name = nm;
    }

    public void setType(String ty){

        type = ty;
    }

    public String getName(){

        return name;

    }

    public String getType(){

        return type;
    }

    public String toString(){

        return name + "" + type;
    }
}
