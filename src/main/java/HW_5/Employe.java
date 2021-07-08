package HW_5;

public class Employe {
    private String name;
    private String position;
    private String mail;
    private String phone;
    private int salary;
    private int age;

    public Employe(String name, String position, String mail, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.mail = mail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info(){
        System.out.printf("Team member %s\nposition: %s\nemail/pfone number: %s/%s\nsalary: %d\nage: %d\n\n", name,position,mail,phone,salary,age);
    }

    public int getAge() {
        return age;
    }
}
