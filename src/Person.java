public class Person {
    private String firstName;
    private String lastName;
    private String pesel;
    private int age;

    public Person(String firstName, String lastName, String pesel, int age) {
        if(firstName.length()<3 || firstName.equals(null))
            throw new NameUndefinedException("Imie musi miec wiecej niz 2 znaki");
        this.firstName = firstName;
        if(firstName.length()<3 || lastName.equals(null))
            throw new NameUndefinedException("Nazwisko musi miec wiecej niz 2 znaki");
        this.lastName = lastName;
        this.pesel = pesel;
        if(age<1)
            throw new IncorrectAgeException("Nieprawidłowy wiek");
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName.length()<3 || firstName.equals(null))
            throw new NameUndefinedException("Imie musi miec wiecej niz 2 znaki");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(firstName.length()<3 || firstName.equals(null))
            throw new NameUndefinedException("Nazwisko musi miec wiecej niz 2 znaki");
        this.lastName = lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<1)
            throw new IncorrectAgeException("Nieprawidłowy wiek");
        this.age = age;
    }
}
