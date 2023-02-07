public class Merge {

    void merge(int[] array, int u, int w, int v){
        int n1 = w-1 +1;
        int n2 = v - u;

        int U[] = new int[n1];
        int V[] = new int[n2];


        for (int i = 0; i < n1; i++)
            U[i] = array[u + i];

        for (int j = 0; j < n2; j++)
            V[j] = array[w + 1 + j];

        int i=0, j=0;

        int p = 1;
        while (i < n1 && j < n2) {
            if (U[i] <= V[j]) {
                array[p] = U[i];
                i++;
            }else{
                array[p] = V[j];
                j++;
            }
        }   p++
    }
}
