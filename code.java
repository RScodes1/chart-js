// // Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

// import java.util.Scanner;
 
// class Main{
//       public static void(){

         
//         int[] arr =new int[n];

//       }

//       public static void triplet(int[] arr, int  n){ 
        
//           for(int i = 0; i < n-2; i++){     
//               for(int j = i+1; j < n-1; j++){
//                  for(int k = i + 2; k<n; k++){
//                         if(i!= j && j != k && i != k && arr[i] + arr[j]+arr[k] == 0){
//                            System.out.print(arr[i] + " " + arr[j] + " " + arr[k]);
//                        }
//                    }
//                }
//            }
//        }

// }

// arr[] = {3,5,-4, 10, 5, -10, 6};

// 0 - n-3 ( 0 - n-2) (0 - n -1)  