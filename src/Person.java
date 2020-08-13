public class Person{

//Create Person class inside of src that has a private name property that is a string, and the following methods:

        private String name;

//TODO: return the person's name
        public String getName(){

        return name;
        }

//TODO: change the name property to the passed value
        public void setName(String name){

        this.name = name;
        }

//TODO: print a message to the console using the person's name
        public void sayHello(){
            System.out.println("Hello" + name);
        }


//The class should have a constructor that accepts a `String` value and sets
//the person's name to the passed string.
//
//Create a `main` method on the class that creates a new `Person` object and
//tests the above methods.


    public static void main(String[] args) {
    Person tracy = new Person();
    tracy.name = "Tracy";
        System.out.println(tracy);
    }

        }