package general_problems;

/**
 * Print the following shapes using loops
 *
 * 1*****       12345&      @
 * 12****       1234&&      @ @
 * 123***       123&&&      @  @
 * 1234**       12&&&&      @   @
 * 12345*       1&&&&&      @    @
 * 123456       &&&&&&      @ @ @ @ @
 */
public class TreeNumberPatterns {

    public static void main(String[] args){
        printShape1();
        printShape2();
        printShape3();
    }

    public static void printShape1(){
        for (int i = 1; i<= 6; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            for (int k = 6; k > i; k--){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void printShape2(){
        for (int i = 6; i >= 1; i--){
            for (int j = 1; j < i; j++){
                System.out.print(j);
            }
            for (int k = 6; k >= i; k--){
                System.out.print("&");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void printShape3(){
        System.out.println("@");
        for (int i = 1; i <=5 ; i++){
            System.out.print("@");
            for (int j = 1; j <=i; j++){
                System.out.print(" ");
            }
            System.out.println("@");
        }
        for (int i = 1; i < 6; i++){
            System.out.print("@ ");
        }
    }

}
