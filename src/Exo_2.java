import java.util.Arrays;

public class Exo_2 {
    public static void main(String[] args) {
        int[] tableauSource = new int[10];
        int[] tableauDestination = new int[10];

        tableauSource = new int[]{-5, 3, 24, -12, -10, 5, 100, -2, -71, 0};

//

        for (int j = 0; j < tableauSource.length; j++ ){

            if(tableauSource[j] > 0){
               tableauDestination[j] = tableauSource[j] ;
            }

        }
        String strTabSour = Arrays.toString(tableauSource);
        String strTabDest = Arrays.toString(tableauDestination);
        System.out.println("tableauSource = " + strTabSour);
        System.out.println("tableauDestination = " + strTabDest);
    }
}
