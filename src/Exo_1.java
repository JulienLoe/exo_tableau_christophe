public class Exo_1 {
    public static void main(String[] args) {
        int[] tab = new int[100];
        for( int i = 0; i < 100; i++){
            tab[i] = i ;
        }
        for ( int j = 0; j< tab.length; j++){

            if( (j+1)%10 == 0  ){

                System.out.println(String.valueOf(tab[j]));


            }
            else{
                System.out.printf(String.valueOf(tab[j]) + ", ");

            }
        }
    }
}
