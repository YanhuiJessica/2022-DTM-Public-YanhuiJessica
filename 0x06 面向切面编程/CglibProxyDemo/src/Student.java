
public class Student implements Person {
    private String name;
    public Student() {}
    public Student(String name) {
        this.name = name;
    }
    @Override
    public void wakeup() {
        System.out.println("学生" + name + "醒来了");
    }
    @Override
    public void sleep() {
        System.out.println("学生" + name + "睡觉了");
    }
}
