public class binarySearch {
    public static int binary_search(int a[],int left,int right, int x){
      if(right>=left){
          int mid= left+(right-left)/2;

          if(a[mid]==x)// in case required number is at the middle position
              return mid;
          if(a[mid]>x) //in case required number is smaller than the middle number
              binary_search(a,left,mid-1,x);

          return  binary_search(a,mid+1,right,x); //in case required number is larger than the middle number
      }
      return -1;// in case the required number doesn't exist in the array
    }
    public static void main(String[] args) {
       int []ar={2,5,12,39,45,56,62};//array sorted in ascending order is declared
       int num = 39;//number to be found
       int n= ar.length;
       int result= binary_search(ar,0,n-1,num);
       if(result==-1)
           System.out.println("not found");
       else
           System.out.println("found at index "+result);
    }
}