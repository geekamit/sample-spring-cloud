package com.sort;

public class InsertionSort {

    public static void main(String[] args) {
        int unSortedList[] = {5,2,1,4,9,8,7,3,6};
        insertionSort(unSortedList);
    }

    public static void insertionSort(int listToSort[]){
        for (int i=0;i<listToSort.length-1;i++){
            for (int j=i+1; j>0;j--){
                if (listToSort[j] < listToSort[j-1]){
                    swap(listToSort,j,j-1);
                }else {
                    break;
                }
                printList(listToSort);
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
