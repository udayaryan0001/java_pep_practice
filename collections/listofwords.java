package collections;

public class listofwords {
    public static void main(String[] args) {
        java.util.List<String> words = java.util.Arrays.asList("java", "python", "c++", "c#", "javascript", "html", "css", "php");
        java.util.List<String> validWords = words.stream()
            .filter(word -> word.length() <= 4 && word.matches("[a-zA-Z]+"))
            .collect(java.util.stream.Collectors.toList());
        System.out.println(validWords);   
}
}
