public class InsertSort {

    public static void main(String[] args){

        int lista[] = new int[n];
        lista = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};


    }
    public void insertSortAsc() {
        int n=10 ,j;
        for (j=1 ; j<n ; j++){
            int aux = lista[j];
            int i = j-1;

            while ( (i > -1) && ( lista [i] > aux ) ) {
                lista[i+1] = lista[i];
                i--;
            }

            lista[i+1] = aux;
        }
    }

    public void insertSortDesc(){

    }
}
