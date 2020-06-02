package com.company;

class DogArray {
    String name;
    public static void main(String[] args) {
        DogArray dog1 = new DogArray();
        dog1.bark();
        dog1.name = "Bart";

        DogArray[] myDogs = new DogArray[3];

        myDogs[0] = new DogArray();
        myDogs[1] = new DogArray();
        myDogs[2] = dog1;

        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";

        System.out.println("Last Dog's name is " + myDogs[2].name);

        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x += 1;

        }
    }
    public void bark(){
        System.out.println(name + " says Ruff!");
    }
    public void chaseCat(){

    }
    public void eat(){

    }

}
