import java.util.Hashtable;

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId(){
        return this.id;
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }
}

public class HashTableDemo {
    public static void main(String[] args) {
        // Student's data
        Student student1 = new Student(1, "Student 1");
        Student student2 = new Student(2, "Student 2");
        Student student3 = new Student(3, "Student 3");

        Hashtable<Integer, Student> hashTable = new Hashtable<Integer, Student>();
        hashTable.put(student1.getId(), student1);
        hashTable.put(student2.getId(), student2);
        hashTable.put(student3.getId(), student3);

        for (Integer key : hashTable.keySet()) {
            Student value = hashTable.get(key);
            System.out.println(key + " = " + value);
        }
    }
}