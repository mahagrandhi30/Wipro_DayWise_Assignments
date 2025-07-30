package collections.intro;

public class EmployeeSortByName {
    String name;
    int id;

    public EmployeeSortByName(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}
