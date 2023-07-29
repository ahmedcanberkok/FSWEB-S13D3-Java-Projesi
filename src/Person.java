public class Person {
    String firstName ;
    String LastName ;
    int age;

    String phoneNum;
    String address;
    String job ;
    public Person () {
        System.out.println("Person  olusturuldu");
    }
    public static void main(String[] args) {

        Person person = new Person("John", "Doe", 20);
        System.out.println("Firstname: " + person.getFirstName());

        System.out.println("LastName: " + person.getLastName());

        System.out.println("Age: " + person.getAge());

        Person person1 = new Person("Alex", "De Souza", 20);
        System.out.println("Firstname: " + person1.getFirstName());

        System.out.println("LastName: " + person1.getLastName());

        System.out.println("Age: " + person1.getAge());
    }


    public Person ( String firstName , String LastName, int age ) {
        this.firstName = firstName ;
        this.LastName = LastName ;
        this.age = age;
    }
    public Person (String phoneNum, String address, String job) {
        this.phoneNum = phoneNum ;
        this.address = address ;
        this.job = job ;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public int getAge() {
        return age;
    }

}
