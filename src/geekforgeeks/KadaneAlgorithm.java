package geekforgeeks;

public class KadaneAlgorithm {

    public int kadaneAlgorithm(int arr[]){
        int max_ending_here = arr[0];
        int max_so_far = arr[0];
        StringBuffer buffer = new StringBuffer(max_so_far);

        for (int i=1;i<arr.length;i++){
            //max_ending_here = Math.max(arr[i] , max_ending_here+arr[i]);
            if(arr[i] > (max_ending_here+arr[i])){
                max_ending_here = arr[i];

            }else {
                max_ending_here = max_ending_here+arr[i];
                buffer.append(arr[i]);
            }

            max_so_far = Math.max(max_so_far, max_ending_here);

        }
        return max_so_far;
    }

    public static void main(String[] args) {

        int arr[] = {1, -2, 3,5,7,-8};

        KadaneAlgorithm kadaneAlgorithm = new KadaneAlgorithm();
        int max = kadaneAlgorithm.kadaneAlgorithm(arr);
        System.out.println(max);
    }

}
