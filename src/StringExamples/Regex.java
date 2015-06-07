package StringExamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String a[]){
        String[] str = {"www.java2novice.com", "http://java2novice.com"};
        for(int i=0;i < str.length;i++){
            if(str[i].matches("^www\\.(.+)")){
                System.out.println(str[i]+" Starts with 'www'");
            } else {
                System.out.println(str[i]+" is not starts with 'www'");
            }
        }
    }
}