package ssg;

public class NestedLoop02 {

    public static void main(String[] args) {

        for (int i=1; i<6;i++){
            System.out.print("."+" ");
            for (int j=0; j<(-1*i+5);j++){
                System.out.print("."+" ");
            }
            System.out.println(i);
        }






    }
}
