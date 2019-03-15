package com.sort;

public class ShellSort {

    public static void main(String[] args) {
        int unSorteList[] = {5,2,1,4,9,8,7,3,6};
        shellSort(unSorteList);
    }

    public static void shellSort(int listToSort[]){
        int increment = listToSort.length/2;
        while (increment >= 1){
            for (int startIndex=0;startIndex<increment;startIndex++){
                modifiedInsertionSort(listToSort,startIndex,increment);
            }
            increment = increment/2;
        }
    }

    public static void modifiedInsertionSort(int listToSort[], int startIndex, int increment){
        for (int i=startIndex; i<listToSort.length; i = i+increment){
            for (int j= Math.min(i+increment, listToSort.length-1);
            j-increment>=0;j=j-increment){
                if (listToSort[j] < listToSort[j-increment]){
                    swap(listToSort,j,j-increment);
                }else {
                    break;
                }
            }
            printList(listToSort);
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
