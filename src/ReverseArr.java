public class ReverseArr{

        public static void main(String[] args) {
            String s = "hello world java";
            String[] words = s.split(" ");
            for (int i=0; i<words.length; i++) {
                System.out.println(words[i]);
            }
            for (int i=0; i<words.length; i++) {
                words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1);
            }
            System.out.println(String.join(" ", words));
        }
    }
