package org.example;

class Student {

    String surname;
    String name;
    String group;
    String faculty;

    public Student(String surname, String name, String group, String faculty) {
        this.surname = surname;
        this.name = name;
        this.group = group;
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return String.format(
            "%-15s %-15s %-10s %-15s",
            surname,
            name,
            group,
            faculty
        );
    }
}
