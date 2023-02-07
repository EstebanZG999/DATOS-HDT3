public class Bubble {
    public void BubbleSort(int Array[]){
        int l = Array.length;
        for(int i = 0; i < l -1; i++){
            for(int j = 0; j < l - i -1; j++){
                if (Array[j] > Array[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int Temporal = Array[j];
                    Array[j] = Array[j + 1];
                    Array[j + 1] = Temporal;
                }
            }

        }

    }




}
