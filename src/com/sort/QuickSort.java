package com.sort;

public class QuickSort {
    public static void main(String[] args) {
        int unSorteList[] = {5,2,1,4,9,8,7,3,6};
        quickSort(unSorteList,0,unSorteList.length-1);
    }


    public static void quickSort(int[] listToSort, int low, int high){
        if(low >= high){
            return;
        }
        int pivot = partition(listToSort, low, high);
        quickSort(listToSort, low, pivot);
        quickSort(listToSort, pivot+1, high);
    }

    public static int partition(int[] listToSort, int low, int high){
        int pivot = listToSort[low];
        int l = low;
        int h = high;
        while (l < h){
            while (listToSort[l] <= pivot && l<h){
                l++;
            }
            while (listToSort[h] > pivot){
                h--;
            }
            if (l < h){
                swap(listToSort, l,h);
            }

        }
        swap(listToSort, low, h);
        System.out.println("Pivot "+pivot);
        printList(listToSort);
        return h;
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
