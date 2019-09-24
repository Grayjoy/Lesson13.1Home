public class Person {

    private String surName;
    private String name;
    private String middleName;
    private int day;
    private int month;
    private int years;
    private String fullName;


    public Person(String surName, String name, String middleName, int day, int month, int years) {
        this.surName = surName;
        this.name = name;
        this.middleName = middleName;
        this.day = day;
        this.month = month;
        this.years = years;
    }

    public Person(String surName, String name, String middleName) {
        this.name = name;
        this.surName = surName;
        this.middleName = middleName;
    }

    public Person(String fullName) {
        String[] words = fullName.split("\\s");
        this.surName = words[0];
        this.name = words[1];
        this.middleName = words[2];
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYears() {
        return years;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
