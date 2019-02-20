import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
    BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));

    public static int mainMenuItem() {
        int userSelection = 0;
        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Welcome to the library menu system please press ");
            for (int i = 0; i < 9; i++) {

                System.out.println(i);
                if (i == 1) {
                    System.out.println("Add Item");
                } else if (i == 2) {
                    System.out.println("remove Item");
                }
            }

            userSelection = Integer.parseInt(buffRead.readLine());


        } catch (IOException err) {

        } finally {
            switch (userSelection) {
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                    return 6;
            }


            return 1;
        }


    }

    private int selectItemType() {



        return 0;
    }
}
