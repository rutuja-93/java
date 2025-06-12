package _3_TransferStatement;

public class breakStmt {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            break;
        }


        for (int i = 1; i <= 10; i++) {

            if (i % 3 == 0) {
                break;
            }
            System.out.println(i);
        }
        //1, 2
    }
}
