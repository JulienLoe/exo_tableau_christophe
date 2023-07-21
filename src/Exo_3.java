public class Exo_3 {
    public static void main(String[] args) {

        int [] tab = new int[]{23, 150, 12, 28, 59, 2};

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        int indiceMax = 0;

        for(int i = 0; i < tab.length; i++ ){
            if(tab[i] < max){
                max = tab[i];
                indiceMax = max;
            }
            if(tab[i] > min ){
                min = tab[i];
            }
        }

        System.out.println("La valeur maximale est " + max + "à l'indice " + indiceMax);
        System.out.println(min);

    }
}
