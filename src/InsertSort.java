import java.util.Scanner;

public class InsertSort {

    public static void main(String[] args){

        int lista[] = new int[10];
        int op;

        for(int i = 0; i<lista.length;i++)
            lista[i] = (int) (Math.random()*999);
        imprimir(lista);

        Scanner ent = new Scanner(System.in);
        System.out.println("Digite 1 Ordem Crescente e imprimir  \nDigite 2 Ordem Descresente e imprimir\n");
        op = ent.nextInt();

        switch (op){
            case 1:
                lista = insertSortAsc(lista);
                imprimir(lista);
                break;
            case 2:
                lista = insertSortDesc(lista);
                imprimir(lista);
                break;

            default:
                System.out.println("Selecionar opcao de 1 ou 2");
                break;
        }
    }
    public static int[] insertSortAsc(int l2[]) {
        int n ,j;
        n=l2.length;
        for (j=1 ; j < n ; j++){
            int aux = l2[j];
            int i = j-1;
            while ( (i > -1) && ( l2 [i] > aux ) ) {
                l2[i+1] = l2[i];
                i--;
            }
            l2[i+1] = aux;
        }
        return l2;
    }

    public static int[]  insertSortDesc(int l3[]){
        int m,k;
        m = l3.length;
        for (k=1 ; k < m ; k++){
            int aux = l3[k];
            int i = k-1;
            while ( (i > -1) && ( l3 [i] < aux ) ) {
                l3[i+1] = l3[i];
                i--;
            }
            l3[i+1] = aux;
        }
        return l3;
    }
    public static void imprimir(int l[]){
        int i;
        for (i=0; i<l.length; i++){
            System.out.print(l[i]+" ");
        }
    }
}
