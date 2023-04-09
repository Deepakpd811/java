public class human {

    String name;
    int age;

    human(String name,int age){ // constructor 
        this.name= name;
        this.age = age;
    }

    void eat(){
        System.out.println(this.name + " is eating");
    }
    void eat(String x){       //  overloding method
        System.out.println(this.name + " is eating " + x);
    }
    void drink(){
        System.out.println(this.name + " is drinking");
    }


    public static void main(String[] args){

        human Human = new human("rick", 80);  //creating a object Human and passing a value using parameter to the object
        human Human2 = new human("morty", 50);

        Human.eat();
        Human.eat("apple");
        Human2.drink();

    }
}
