
import java.util.Scanner;

class practiceProblem3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        //Enter Array Elements
        System.out.println("Enter Array Elements : ");
        for(int i = 0;i<5;i++){
            arr[i] = sc.nextInt();
        }

        //Print Array Elements
        System.out.print("Array Elements are : ");
        for(int i =0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");

        //Sum of Array Elements 
        int sum = 0;
        for(int i = 0;i<5;i++){
            sum+=arr[i];
        }
        System.out.println("Sum of Array Elements is : " + sum);

        //Largest Element
        int maxi = arr[0];
        for(int i = 0;i<5;i++){
            if(arr[i]>maxi){
                maxi=arr[i];
            }
        }
        System.out.println("Largest Element is : "+ maxi);

        //Second Largest Element
        int maxii=arr[0];
        int sLargest = Integer.MIN_VALUE;

        for(int i = 0;i<5;i++){
            if(arr[i]>maxii){
                sLargest=maxii;
                maxii=arr[i];
            }
            else if(arr[i]<maxii && arr[i]>sLargest){
                sLargest=arr[i];
            }
        }
        System.out.println("Second Largest Element is : "+sLargest);

        //Sum of alternate elements 
        int alSum = 0;
        for(int i = 0;i<5;i+=2){
            alSum+=arr[i];
        }
        System.out.println("Sum of alternate elements is : "+alSum);

        //Count of Even Numbers 
        int count=0;
        for(int i = 0;i<5;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        System.out.println("Count of even numbers is : "+count);

        //Occurence of a given number 
        int[] hash = new int [maxi+1];

        for(int i=0;i<5;i++){
            hash[arr[i]]++;
        }
        System.out.println("occurence of numbers : ");
        for(int i=0;i<=maxi;i++){
            if(hash[i]>0){
            System.out.println(i + " occurs " + hash[i] + " times");
        }
        }
    }
}