public class ExceptionHandling {
    public static void main(String [] args){
        try {
            int myInt = Integer.parseInt("1");
            System.out.println("After parsing the value");
        }
        catch(NumberFormatException nfe){
            System.out.println("bro do not waste your time and energy");
        }
        finally{
            System.out.println("the finally will be always get exicted");
        }
    }
}
