 static int[] insertionSort(int[] arr){
    for(int i=1;i<arr.length;i++){
      int currVal = arr[i];
      for(int j=i-1;j>=0 && arr[j]>currVal;j--){
         arr[j+1] = arr[j];
         arr[j] = currVal;
      }
    }
    return arr;
  }
