package exception;

import java.util.Locale;

public class Main2{
    public static void main(String[] args){
        try{
            System.out.println("[소문자 알파벳을 대문자로 출력하는 프로그램]");
            printName(null); //예외 발생
            printName("abc"); // 이 코드는 실행되지 않고 catch문으로 이동
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException 발생!");// (2)첫 번째 catch문
        }
        catch(NullPointerException e){// (3)두 번째 catch문
            System.out.println("NullPointerException 발생!");
            System.out.println("e.getMessage: " + e.getMessage());// (4) 예외 정보를 얻는 방법-1
            System.out.println("e.toString: " + e.toString()); //(4) 예외 정보를 얻는 방법-2
            e.printStackTrace();// (4) 예외 정보를 얻는 방법 - 3
        }
        finally {
            System.out.println("[프로그램 종료]"); //(5) finally문
        }
    }
    static void printName(String str){
        String upperCaseAlphabet = str.toUpperCase();
        System.out.println(upperCaseAlphabet);
    }
}
