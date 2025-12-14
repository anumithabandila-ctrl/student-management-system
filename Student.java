public class Student {
    private String name;
    private int rollNo;
    private int marks;

    public Student(String name,int rollNo,int marks){
        this.name=name;
        this.rollNo=rollNo;
        this.marks=marks;
    }

    public int getRollNo(){ 
        return rollNo; 
    }

    public String toString(){
        return "Roll No: "+rollNo+", Name: "+name+", Marks: "+marks;
    }
}
