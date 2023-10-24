public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private int i;
    private static int peopleCount = 0;
    public Person() {
        peopleCount++;
    }
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        peopleCount++;
    }
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        peopleCount++;
    }
    public Person(String firstName, String lastName, byte age, int i) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.i = i;
        peopleCount++;
    }
    public static int getPersonCount() {
        return peopleCount;
    }
    public String speak() {
        if(this.firstName == null && this.lastName == null){
            return "I dont have a name";
        }
        else if((this.firstName != null && this.lastName != null) && (this.age == 0 && this.i == 0)){
           return "My name is " + firstName + " " + lastName;
        }
        else if ((this.firstName != null && this.lastName != null) && (this.age != 0)){
           return  "My name is " + firstName + " " + lastName + " and I am " + age + " years old";
        }
        else {
            return firstName + " " + lastName +" " + i;
        }
    }

    @Override
    public String toString() {
        if(this.firstName == null && this.lastName == null){
            return "N/A";
        }
        if((firstName != null && lastName != null) && (this.age == 0 && this.i == 0)){
            return firstName + " " + lastName;
        }
       if((firstName != null && lastName != null) &&  (this.i != 0)){
           return firstName + " " + lastName + " " + (i % 10000);
       }
       return "";
    }
}