## Alogrithm
- Start looping the end of the array, with a pointer named j. This will have one decrement per loop. It will stop looping once it reaches the beginning of the array.
- Start an inner loop with another pointer named jk, it will have one increment per loop. It will stop looping once it reaches the poiter j.
- If arr[j+1]>arr[j], swap
- return the sorted array

```

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
```

## Optimization
We dont need to keep on looping if one chunk of the array is already sorted. So we can set a flag to keep track of that. 

```
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
```

## Time Complexity
- Worst Case: O(n^2), where the array is not sorted at all
- Best Case: O(n), where the array is partiall/completely sorted. 
