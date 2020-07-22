package practice11;


import java.util.LinkedList;

public class Teacher extends Person {

    private LinkedList<Klass> classes;

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
        if (this.classes != null) {
            for(int i=0; i< this.classes.size();i++){
                this.classes.get(i).setTeacher(this);
            }
        }
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public void setClasses(LinkedList<Klass> classes) {
        this.classes = classes;
    }


    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }


    @Override
    public String introduce() {
        if(this.classes != null) {
            if (this.classes.size() > 0) {
                String str = "" + this.classes.get(0).getNumber();
                for (int i = 1; i < this.classes.size(); i++) {
                    Klass klass = this.classes.get(i);

                    str += ", " + klass.getNumber();


                }
                return super.introduce() + " I am a Teacher. I teach Class " + str + ".";
            }
        }
        return super.introduce() + " I am a Teacher. I teach No Class.";
    }

    public String introduceWith(Student student) {
        if(this.classes!=null){
            for(int i=0; i < this.classes.size(); i++){
                if (this.classes.get(i).equals(student.getKlass()))
                    return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
            }
        }
        return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
    }

    public boolean isTeaching(Student student){
        if(student==null)
            return false;
        if(this.classes.size()>0){
            for(int i=0; i< this.classes.size(); i++){
                if(this.classes.get(i).equals(student.getKlass())){
                    return true;
                }
            }
        }
        return false;
    }

    public String update() {
        return "I am "+this.getName()+".";
    }
}
