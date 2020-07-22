package practice11;


public class Klass {

    private int number;
    private Student leader;
    private Student member;
    private Teacher teacher; //观察者

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Student getLeader() {
        return leader;
    }

    public Student getMember() {
        return member;
    }

    public void setMember(Student member) {
        this.member = member;
    }

    public String getDisplayName(){
        return "Class "+this.number;
    }
    public void assignLeader(Student student){
        if(student == null)
            return;
        if(this.member!=null){
            if(this.member.equals(student))
            {
                this.leader = student;
                if(this.teacher!=null)
                    System.out.print(this.teacher.update()+" I know "+student.getName()+" become Leader of Class "+this.getNumber()+".\n");
            }
        }else
            System.out.print("It is not one of us.\n");



    }

    public void appendMember(Student student){
        if(student == null)
            return;
        this.member = student;
        if(this.getLeader()==null)
            if(this.teacher != null)
                System.out.print(this.teacher.update()+" I know "+student.getName()+" has joined Class "+this.getNumber()+".\n");

    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null)
            return this.number ==  ((Klass) obj).getNumber();
        return false;
    }


}
