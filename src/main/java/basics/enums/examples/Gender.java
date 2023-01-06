package basics.enums.examples;

/**
 * Author: Myke Amorim
 * Date: 05/01/2023
 * This enum represents genders (male and female). It is useful to enhance the understanding
 * of constructors and methods in enums.
 */

public enum Gender {
    MALE('M'), FEMALE('F');

    private char gender;

    Gender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
