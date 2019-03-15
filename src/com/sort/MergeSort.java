package com.sort;

public class MergeSort {

    public static void main(String[] args) {
        int unSortedList[] = {5,2,1,4,9,8,7,3,6};
        mergeSort(unSortedList);
    }

    public static void mergeSort(int listToSort[]){
        if (listToSort.length == 1){
            return;
        }

        int midIndex = listToSort.length/2+listToSort.length%2;
        int[] listFirstHalf = new int[midIndex];
        int[] listSecondHalf = new int[listToSort.length-midIndex];
        split(listToSort, listFirstHalf, listSecondHalf);

        mergeSort(listFirstHalf);
        mergeSort(listSecondHalf);
        merge(listToSort, listFirstHalf, listSecondHalf);
        printList(listToSort);

    }

    public static void split(int listToSort[], int []listFirstHalf, int []listSecondHalf){
        int index=0;
        int secondHalfIndexStart = listFirstHalf.length;
        for (int element : listToSort){
            if (index < secondHalfIndexStart){
                listFirstHalf[index] = listToSort[index];

            }else {
                listSecondHalf[index-secondHalfIndexStart] = listToSort[index];
            }
            index++;
        }
    }

    public static void merge(int []listToSort, int []listFirstHalf, int []listSecondHalf){
        int mergeIndex = 0;
        int firstHalfIndex = 0;
        int secondHalfIndex = 0;
        while (firstHalfIndex < listFirstHalf.length && secondHalfIndex < listSecondHalf.length){
            if (listFirstHalf[firstHalfIndex] > listSecondHalf[secondHalfIndex]){
                listToSort[mergeIndex] = listSecondHalf[secondHalfIndex];
                secondHalfIndex++;
            }else if(secondHalfIndex < listSecondHalf.length){
                listToSort[mergeIndex] = listFirstHalf[firstHalfIndex];
                firstHalfIndex++;
            }
            mergeIndex++;
        }


        if (firstHalfIndex < listFirstHalf.length){
            while (mergeIndex < listToSort.length){
                listToSort[mergeIndex++] = listFirstHalf[firstHalfIndex++];
            }
        }

        if (secondHalfIndex < listSecondHalf.length){
            while (mergeIndex < listToSort.length){
                listToSort[mergeIndex++] = listSecondHalf[secondHalfIndex++];
            }
        }


    }

    public static void swap(int listToSwap[], int iIndex, int jIndex){
        int temp = listToSwap[iIndex];
        listToSwap[iIndex] = listToSwap[jIndex];
        listToSwap[jIndex] = temp;
    }

    public static void printList(int listToSort[]){
        for (int i=0;i<listToSort.length;i++){

            System.out.print(listToSort[i]+ " ");
        }
        System.out.println();
    }
}
