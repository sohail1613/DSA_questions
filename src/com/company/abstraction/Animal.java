package com.company.abstraction;

abstract class Animal {

       abstract void animalType();
       /**
        *if it is default access modifier then we can make it protected and public but not private.
        because we cannot reduce the visibility, in case of private it will give Compile time error.
        *To do , we need to inherit first and then make it public or protected**/
       public abstract void eating();
       public abstract void animalSound();
       public void running(){
        System.out.println("Running normally");
       }

       public void age(int age) {
              this.age(age);
       }
//       int age;

       /**
        * We cannot create an object of abstract class but, we can create an object of subclass of abstract class.
        When we create an object of subclass of an abstract class, it calls the constructor of subclass.

        * This subclass constructor has a super keyword in the first line that calls constructor of an abstract class.
        Thus, the constructors of an abstract class are used from constructor of its subclass.

        * If the abstract class does not have constructor, a class that extends that abstract class will not get compiled.
       **/
}

class Horse extends Animal {

       @Override
       public void animalType() {
              System.out.println("Carnivore");
       }

       @Override
       public void eating() {
              System.out.println("Eating gram and grass");
       }

       @Override
       public void animalSound() {
              System.out.println("neigh");
       }

       @Override
       public void age(int age) {
              super.age(35);
       }

//       public int horseAge(int age){
//             return this.age = age;
//       }
}

class Goat extends Animal{

       //@Override
//       private void animalType() { //CT error, because we cannot reduce visibility
//
//       }
       @Override
       protected void animalType() { //CT error, because we cannot reduce visibility
              System.out.println("Carnivore");
       }

       @Override
       public void eating() {
              System.out.println("grass");
       }

       @Override
       public void animalSound() {
              System.out.println("mee mee...");
       }
}
