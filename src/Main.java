public class Main {

    public static void main(String[] args) {
        try {
            Person person1 = new Person("Maria", "Kowalska", "23232", 0);
            Person person2 = new Person("Janina", "Nowak", "23232", 20);
            Person person3 = new Person("M", "Bednarz", "23232", 20);
            Person person4 = new Person("Jadwiga", null, "23232", 20);
        }
        catch (NullPointerException | NameUndefinedException | IncorrectAgeException ex){
            System.out.println(ex.getMessage());
            System.out.println("Wprowadzono nieprawidłowe dane");
        }

        try {
            Person person2 = new Person("Janina", "Nowak", "23232", 20);
        }
        catch (NullPointerException | NameUndefinedException | IncorrectAgeException ex){
            System.out.println(ex.getMessage());
            System.out.println("Wprowadzono nieprawidłowe dane");
        }
        try {
            Person person3 = new Person("M", "Bednarz", "23232", 20);
        }
        catch (NullPointerException | NameUndefinedException | IncorrectAgeException ex){
            System.out.println(ex.getMessage());
            System.out.println("Wprowadzono nieprawidłowe dane");
        }
        try {
            Person person4 = new Person("Jadwiga", null, "23232", 20);
        }
        catch (NullPointerException | NameUndefinedException | IncorrectAgeException ex){
            System.out.println(ex.getMessage());
            System.out.println("Wprowadzono nieprawidłowe dane");
        }
    }
}
