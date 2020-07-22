package practice04;

public class Student extends Person{

    private int Klass;
    public Student(String name, int age, int klass) {
        super(name, age);
        this.Klass = klass;
    }

    @Override
    public String introduce() {
        return super.introduce()+" I am a Student. I am at Class "+this.Klass+".";
    }

    public int getKlass() {
        return Klass;
    }

    public void setKlass(int klass) {
        Klass = klass;
    }
}
