public class Exo_4 {
    public static void main(String[] args) {

        int[] tab1 = {1,2,3,4};
        int[] tab2 = {1,2,3,4};

        for(int i = 0; i < tab1.length; i++) {

            if(tab1.length != tab2.length){
                System.out.println("les tableaux ne sont pas égaux");
                break;
            }
            if (tab1[1] == tab2[i]){
                System.out.println("les tableaux sont égaux");
            }
            if(tab1[i] != tab2[i])
            {
                System.out.println("les tableaux ne sont pas égaux");
                break;
            }
        }
    }
}
