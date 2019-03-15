package com.sort;

public class BubbleSort {


    public static void main(String[] args) {
        int unSorteList[] = {5,2,1,4,9,8,7,3,6};
        BubbleSort(unSorteList);
    }


    public static void BubbleSort(int listToSort[]){
        for (int i=0;i<listToSort.length;i++){
            boolean swapped = false;
            for (int j=listToSort.length-1; j>i; j--){
                if (listToSort[j] < listToSort[j-1]){
                    swap(listToSort,j,j-1);
                    swapped = true;
                }
                printList(listToSort);
            }
            if (!swapped){
                break;
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
