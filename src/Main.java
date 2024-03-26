//HomeworkJava-1.3. Suprascrieti toString() dintr-o clasa astfel incat sa returneze
//toate atributele clasei, intr-un format custom.

public class Main {
    public static void main(String[] args) {
        MyClass object = new MyClass("Value1", 10);
        System.out.println("\nAtributele obiectului creat sunt:\n" + object.toString());
    }
}
