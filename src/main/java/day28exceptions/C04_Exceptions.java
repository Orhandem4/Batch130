package day28exceptions;

public class C04_Exceptions {

    /*
    4) NullPointerExceptions
     */

    //Bir String'de bulunan karakter sayisini veren kodu yaziniz

    public static void main(String[] args) {

        String str1 = "Fatma";
        getNumOfChars(str1);//5
        String str2 = "";
        getNumOfChars(str2);//0
        String str3 =null;
        getNumOfChars(str3);
    }

    private static void getNumOfChars(String str3) {

        //System.out.println(str1.length());
        //System.out.println(str2.length());
        try {

            System.out.println(str3.length());
        }catch (NullPointerException e){
            System.err.println("lenght() hata olstu");
            e.printStackTrace();
        }
    }
}
