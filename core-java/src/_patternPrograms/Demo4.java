package _patternPrograms;


/*

         1
         2 2
         3 3 3
         4 4 4 4
         5 5 5 5 5

         */
public class Demo4 {
    public static void main(String[] args) {
        for (int row=1;row<=5;row++){
            for (int col=1;col<=row;col++){
                System.out.print(row);
            }
            System.out.println( );
        }
    }
}
