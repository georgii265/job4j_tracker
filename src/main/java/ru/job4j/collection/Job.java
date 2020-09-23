package ru.job4j.collection;

/**
 * 1. Для модели ru.job4j.collection.Job создайте 4 компаратора:
 * - по имени и по возрастанию
 * - по приоритету и по возрастанию
 * - по имени и по убыванию
 * - по приоритету и по убыванию
 */
public class Job implements Comparable<Job> {
    private String name;
    private int priority;

    public Job(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    /*
     * метод toString().
     * Он используется для получения строкового представления объекта.
     */
    @Override
    public String toString() {
        return "Job{"
                + "name='" + name + '\''
                + ", priority=" + priority
                + '}';
    }

    @Override
    public int compareTo(Job o) {
        return Integer.compare(priority, o.priority);
    }
}

