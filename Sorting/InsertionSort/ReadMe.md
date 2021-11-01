## Introduction

Builds up the sorted array by gradually creating a larger left halfd which is already sorted.

## Alogrithm
- Inititate a loop with a pointer i at the index 1 of array.
- Store the value of arr[i] at a new variable, currVal
- Initiate another loop where a pointer j is maintained. Which will start from the previous index of i and continue looping.
- Keep on pushing the elements to their next indices untill it reaches the index 0 of the array. Or, arr[j]>currVal whichever comes first.
- Repeat
- Return the sorted array.

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
