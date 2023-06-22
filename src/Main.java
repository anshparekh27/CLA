// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        if(args.length>0){
            System.out.println("Arguments are:");

            for(String x:args){
                System.out.println(x+" ");
            }
        }
        else{
            System.out.println("No Arguments");
        }
    }
}