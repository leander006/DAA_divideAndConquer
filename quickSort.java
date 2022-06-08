import java.util.*;

public class Main{
        static void swap(int arr[],int i,int j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
        }
      static int partition(int arr[],int l,int h){
              int pivot=arr[h];
              
              int i = l-1;
              
              for(int j =l;j<=h;j++){
                      if(arr[j]<pivot){
                             
                             i++;
                             swap(arr,i,j);
                      }
              }
              swap(arr,i+1,h);
              return (i+1);
      }

 
        static void quickSort(int arr[],int l,int h){
                if(l<h){
                
                int pi = partition(arr,l,h);
                
                quickSort(arr,l,pi-1);
                quickSort(arr,pi+1,h);
                }
             
        }
        
 
 
	public static void main(String[] args) {
	        Scanner l = new Scanner(System.in);
	        int n = l.nextInt();
	        int arr[] = new int[n];
	        for(int i =0;i<n;i++){
	                arr[i]=l.nextInt();
	        }
	        quickSort(arr,0,n-1);
	        for(int i =0;i<n;i++){
	            System.out.print(arr[i]+" ");    
	        }

	}
}
