import java.util.*;
public class searchInSortedAndRotatedArray {
    public static int search(int arr[],int tar,int si,int ei){
        if(si>ei){
            return -1;
        }
        // this question simsilar as binary search

        //finf mid

        int mid=si+(ei-si)/2;
        //check mid elemnt to target
        if(arr[mid]==tar){
            return mid;
        }
        /// check the condition for lines

            // line 2
            if(arr[si]<=arr[mid]){
                //case a:
                if(arr[si]<=tar&&tar<=arr[mid]){
                    // left search
                    return search(arr,tar,si,mid-1);
                }
                // case b:
                else{
                    // right search
                    return search(arr,tar,mid+1,ei);
                }
            }
            // line 2
            else{
                // case c
                if(arr[mid]<=tar&&tar<=arr[ei]){
                    return search(arr,tar,mid+1,ei);
                }
                // case d
                else{
                    return search(arr,tar,si,mid-1);
                }

            }
            
        

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={3,4,5,6,7,0,1,2};
        System.out.println("enter your target:");
        int target=sc.nextInt();
        int tarIdx=search(arr,target,0,arr.length-1);
        System.out.println("Element found at index "+tarIdx);

    }
    
}
