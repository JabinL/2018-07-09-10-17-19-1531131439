package practice08;

public class Klass {

    private int number;
    private String leader;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getDispalyName(){
        return "Class "+this.number;
    }
    public void assignLeader(Student student){
        
    }
}
