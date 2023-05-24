package day25inheritiance;

public class A04_Lessons {

    public void liveSessions(){
        System.out.println("Online dersler");
    }

    public A04_Lessons(){

        System.out.println("deneme");
    }//default bos const

    public A04_Lessons(String level){
        this();
        System.out.println("derserin seviyesi olur");
    }//paramereli const
}
