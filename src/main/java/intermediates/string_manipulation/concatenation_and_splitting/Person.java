package intermediates.string_manipulation.concatenation_and_splitting;

public class Person {
    private int cod;
    private String name;
    private int age;

    public Person() {
    }

    public Person(int cod, String name, int age) {
        this.cod = cod;
        this.name = name;
        this.age = age;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "cod=" + cod +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
