static int[] bubbleSort (int[] arr){
  for(int i=arr.length-1;i>=0;i--){
    for(int j=0;j<i;j++){
      if(arr[j]>arr[j+1]){
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
      }
    }
  }
  return arr;
}

// Optimized

 static int[] bubbleSort (int[] arr){
    boolean swapped = false;
    for(int i=arr.length-1;i>=0;i--){
      for(int j=0;j<i;j++){
        if(arr[j]>arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
          swapped = true;
        }
      }
      if(swapped) break;
    }
    return arr;
  }

