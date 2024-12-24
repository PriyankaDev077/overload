class student{
    int id;
    String name;
    student(){}
    student(int id){
        this.id=id;
    }
    student(int id,String name){
        this.id=id;
        this.name=name;
    }
    void display(){
        System.out.println(this.id+","+this.name);
    }
}
class main{
    public static void main(String[] args){
        student s1=new student();
        student s2=new student(101);
        student s3=new student(108,"priyanka");
        s1.display();
        s2.display();
        s3.display();
    }
}