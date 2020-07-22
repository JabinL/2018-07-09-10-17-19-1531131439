package practice10;



public class Klass {

    private int number;
    private Student leader;
    private Student member;

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
        if(this.member!=null){
            if(this.member.equals(student))
                this.leader = student;
        }else
            System.out.print("It is not one of us.\n");

    }

    public void appendMember(Student student){
        this.member = student;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null)
            return this.number ==  ((Klass) obj).getNumber();
        return false;
    }

}
