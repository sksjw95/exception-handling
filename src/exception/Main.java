package exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("[소문자 알파벳을 대문자로 출력하는 프로그램]");
        printMyName("abc"); //(1)
        printMyName(null); //(2) 넘겨주는 매개변수가 null인 경우 NullPointException 발생
        System.out.println("[프로그램 종료]");
    }
    static void printMyName(String str){
        String upperCaseAlphabet = str.toUpperCase();
        System.out.println(upperCaseAlphabet);
    }
}