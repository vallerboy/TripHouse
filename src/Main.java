public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.gender = Gender.WOMEN;
        person.size = Size.S;

        System.out.println(person.size.getFullName());
        System.out.println(person.gender);
    }
}
