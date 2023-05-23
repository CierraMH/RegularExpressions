package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println(1);
        Pattern validEmail = Pattern.compile("[\\w.-]+@[\\w.0-9-&_$-]+\\.[a-zA-Z0-9]{2,}");
        Matcher emailMatcher = validEmail.matcher("test@ex6a-mple.com");
        boolean emailMatches = emailMatcher.matches();
        System.out.println("Matches: " + emailMatches);

        System.out.println(2);
        Pattern phonePattern = Pattern.compile("[(\\d{3})]+[\\d{3}-]+[\\d{4}]");
        Matcher phoneMatcher = phonePattern.matcher("(123)456-7890");
        boolean phoneMatches = phoneMatcher.matches();
        System.out.println("Matches: " + phoneMatches);

        System.out.println(3);
        Pattern datePattern = Pattern.compile("[\\d{2}/]+[\\d{2}/]+[\\d{4}]");
        Matcher dateMatcher = datePattern.matcher("12/24/2000");
        boolean dateMatches = dateMatcher.matches();
        System.out.println("Matches: " + dateMatches);

        System.out.println(4);
        //does not work!!
        Pattern UrlPattern = Pattern.compile("(http:|https:)+[//]+[\\w.]+[A-Za-z0-9_$.]+[a-z]{3}");
        Matcher UrlMatcher = UrlPattern.matcher("http://www.example.com");
        boolean UrlMatches = UrlMatcher.matches();
        System.out.println("Matches: " + UrlMatches);

        System.out.println(5);
        Pattern creditCardPattern = Pattern.compile("[\\d{4}-]+{4}");
        Matcher creditCardMatcher = creditCardPattern.matcher("1234-1234-4321-4321");
        boolean creditCardMatches = creditCardMatcher.matches();
        System.out.println("Matches: " + creditCardMatches);

        System.out.println(6);
        Pattern zipPattern = Pattern.compile("[\\d{5}-]+?[\\d{4}]");
        Matcher zipMatcher = zipPattern.matcher("12345-4321");
        boolean zipMatches = zipMatcher.matches();
        System.out.println("Matches: " + zipMatches);

        System.out.println(7);
        Pattern javaPattern = Pattern.compile("[^0-9]+[A-Za-z0-9_$]{6}");
        Matcher javaMatcher = javaPattern.matcher("hello_123");
        boolean javaMatches = javaMatcher.matches();
        System.out.println("Matches: " + javaMatches);

        System.out.println(8);
        Pattern hexadecimalColorPattern = Pattern.compile("[#\\d{6}]+");
        Matcher hexadecimalColorMatcher = hexadecimalColorPattern.matcher("#1234");
        boolean hexadecimalColorMatches = hexadecimalColorMatcher.matches();
        System.out.println("Matches: " + hexadecimalColorMatches);

        System.out.println(9);
        Pattern timePattern = Pattern.compile("[\\d{2}:]+[\\d{2}]");
        Matcher timeMatcher = timePattern.matcher("12:34");
        boolean timeMatches = timeMatcher.matches();
        System.out.println("Matches: " + timeMatches);
        
        
    }
}
