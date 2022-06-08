import java.util.*;

public class Main
{
      static void merge(int arr[] ,int l,int m,int h){
                int n1 = m-l+1;
                int n2 = h-m;
                int l1[]=new int[n1];
                int l2[] = new int[n2];
                
                for(int i =0;i<n1;i++){
                      l1[i] = arr[l+i]; 
                }
                for(int j =0;j<n2;j++){
                        l2[j]= arr[j+m+1];
                }
                int i=0;
                int j=0;
                int k=l;
                
                while(i<n1 && j<n2){
                        if(l1[i]<=l2[j]){
                              arr[k]=l1[i]; 
                              i++;
                        }
                        else{
                                arr[k]=l2[j];
                                j++;
                        }
                        k++;
                }
                while(i<n1){
                        arr[k]=l1[i];
                        i++;
                        k++;
                }
                while(j<n2){
                        arr[k]=l2[j];
                        j++;
                        k++;
                }
                
        }

 
        static void mergeSort(int arr[],int l,int h){
                if(l<h){
                           int m = l+(h-l)/2;
                
                mergeSort(arr,l,m);
                mergeSort(arr,m+1,h);
                merge(arr,l,m,h);
                }
             
        }
        
 
 
	public static void main(String[] args) {
	        Scanner l = new Scanner(System.in);
	        int n = l.nextInt();
	        int arr[] = new int[n];
	        for(int i =0;i<n;i++){
	                arr[i]=l.nextInt();
	        }
	        mergeSort(arr,0,n-1);
	        for(int i =0;i<n;i++){
	            System.out.print(arr[i]+" ");    
	        }

	}
}
