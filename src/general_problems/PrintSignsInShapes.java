package general_problems;

/**
 * Print the following shapes using loops
 * <p>
 * $$                      #                   @
 * $$$$                    # #                 @  @
 * $$$$$$                  #   #               @     @
 * $$$$$$$$                #     #             @       @
 * $$$$$$$$$$              #       #             @     @
 * $$$$$$$$$$$$            #         #             @   @
 * $$$$$$$$$$$$$$          #############              @
 */
public class PrintSignsInShapes {

    public static void main(String[] args) {
        //shape 1
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 6; k >= i; k--) {
                System.out.print("$");
            }
            for (int k = 6; k >= i; k--) {
                System.out.print("$");
            }
            System.out.println("");
        }

        System.out.println();

        //shape 2
        for (int j = 1; j < 7; j++) {
            System.out.print(" ");
        }
        System.out.println("#");
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("#");
            for (int j = 6; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 6; j >= i; j--) {
                System.out.print(" ");
            }
            System.out.print("#");
            System.out.println("");
        }
        for (int k = 0; k<=7; k++){
            System.out.print("# ");
        }

        System.out.println("");

        //shape 3
        for (int j = 1; j < 7; j++) {
            System.out.print(" ");
        }
        System.out.println("@");
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("@");
            for (int j = 6; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 6; j >= i; j--) {
                System.out.print(" ");
            }
            System.out.print("@");
            System.out.println("");
        }
        for (int i = 6; i >= 1; i--) {
            for (int j = 6; j >= i; j--) {
                System.out.print(" ");
            }
            System.out.print("@");
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("@");
            System.out.println("");
        }
        for (int j = 1; j < 7; j++) {
            System.out.print(" ");
        }
        System.out.println("@");
    }


}
