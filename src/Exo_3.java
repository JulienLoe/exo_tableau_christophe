public class Exo_3 {
    public static void main(String[] args) {

        int [] tab = new int[]{23, 150, 12, 28, 59, 2};

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        int indiceMax = 0;
        int indiceMin = 0;

        for(int i = 0; i < tab.length; i++ ){
            if(tab[i] < max){
                max = tab[i];
                indiceMax = i;
            }
            if(tab[i] > min ){
                min = tab[i];
                indiceMin = i;
            }
        }

        System.out.println("La valeur maximale est " + min + " à l'indice " + indiceMin);

    }
}
