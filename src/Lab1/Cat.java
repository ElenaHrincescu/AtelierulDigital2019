package Lab1;

public class Cat extends Animal {

    static void classMethod(){
        System.out.println("Static method in cat");
    }

    void instanceMethod(){
        System.out.println("Instance method in cat");
    }


    public static void main(String[] args){
        Cat myCat = new Cat();
        Animal myAnimal = myCat;

        myAnimal.instanceMethod();
        Animal.classMethod();
    }


}
