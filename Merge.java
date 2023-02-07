public class Merge {

    void merge(int[] array, int u, int w, int v){
        int n1 = w - u  +1;
        int n2 = v - w;

        int [] U = new int[n1];
        int[] V = new int[n2];


        for (int i = 0; i < n1; ++i)
            U[i] = array[u + i];

        for (int j = 0; j < n2; ++j)
            V[j] = array[w + 1 + j];

        int i=0, j=0;

        int p = u;

        while (i < n1 && j < n2) {
            if (U[i] <= V[j]) {
                array[p] = U[i];
                i++;
            }else{
                array[p] = V[j];
                j++;
            }
            p++;
        }

        while(i < n1){
            array[p] = U[i];
            i++;
            p++;
        }

        while (j < n2) {
            array[p] = V[j];
            j++;
            p++;
        }
    }

    void contar(int[] array, int u, int v){

        if(u < v){
            int w = u + (v - u) / 2;

            contar(array, u, w);
            contar(array, w+1, v);
            merge(array, u, w, v);
        }
    }
}
