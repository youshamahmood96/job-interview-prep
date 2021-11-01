## Introduction

Similar to bubble sort, but instead of first placing largest values at the end, we will place smallest values at the start.

## Alogrithm
- Store the index of first element in a variable minIndex.
- Take one pointer i which will start from the beginning of the array and loop through the whole length. 
- Take another pointer j which will start from the next element of the current location of the first pointer.Loop thorugh the end of the array. If any element is smaller than the first element, keep replacing the value of minIndex with that index. This way, we find the index of the minimum number.
- If value of i doesnt match with minIndex, swap their elemnts.
- Keep on looping
- return the sorted array

<img src="https://upload.wikimedia.org/wikipedia/commons/0/0f/Insertion-sort-example-300px.gif"
     alt="Markdown Monster icon"
     style="float: left; margin-right: 10px;" />
 
 <img src="https://www.w3resource.com/w3r_images/insertion-sort.png"
     alt="Markdown Monster icon"
     style="float: left; margin-right: 10px;" />

```java

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
```


## Time Complexity
- Worst Case: O(n^2), where the array is not sorted at all
- Best Case: O(n), where the array is partiall/completely sorted. 

## Space Complexity
- Constant for both cases

## Special Note
Insertion sort can handle dynamic arrays. If we have data in live/streaming, insertion sort is the only option among bubble/selection/insertion.
