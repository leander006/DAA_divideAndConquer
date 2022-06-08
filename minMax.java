import java.util.*;
class pair{
        int min;
        int max;
        
        public pair minmax(int arr[],int n){
              pair p = new pair();
              
              if(n==1){
                p.min=arr[0];
                p.max=arr[0];
              }
              if(arr[0]>arr[1]){
                p.min=arr[1];
                p.max=arr[0];
              }
              else if(arr[0]<arr[1]){
                p.min=arr[0];
                p.max=arr[1];
              }
              for(int i=2;i<n;i++){
                if(p.min<arr[i]){
                        p.max=arr[i];
                } 
                else if(p.min>arr[i]){
                        p.min=arr[i];
                }
              }
              return p;
        }
}


public class Main
{
	public static void main(String[] args) {
	        Scanner l = new Scanner(System.in);
	        int n = l.nextInt();
	        int arr[] = new int[n];
	        for(int i =0;i<n;i++){
	                arr[i]=l.nextInt();
	        }
		pair pnew = new pair();
		pair porg = pnew.minmax(arr,n);
		System.out.println("min is "+porg.min);
		System.out.println("Max is "+porg.max);
	}
}
