package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {

    public List<Student> collect(List<Student> students, Predicate<Student> predictable) {
        return students.stream()
                .filter(predictable)
                .collect(Collectors.toList());
    }

    public static Map<Integer, String> ListStudent(List<Student> students) {
        return students.stream()
                .distinct()
                .collect(Collectors.toMap(Student::getScore, Student::getSurname, (oldValue, newValue) -> oldValue
                        )
                );
    }
}
