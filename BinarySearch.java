import java.util.Scanner;
    class BinarySearch{  
     public static void binarySearch(int a[], int lb, int ub, int key){  
       int mid = (lb + ub)/2;  
       while( lb<= ub ){  
          if ( a[mid] < key ){  
            lb= mid + 1;     
          }else if ( a[mid] == key ){  
            System.out.println("Element is found at index: " + mid);  
            break;  
          }else{  
             ub = mid - 1;  
          }  
          mid = (lb + ub)/2;  
       }  
       if ( lb > ub ){  
          System.out.println("Element is not found!");  
       }  
     }  
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter no.of elements:");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter Elements in a sorted order:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter Search Element:");
        int key=sc.nextInt();
        int ub=a.length-1;  
        binarySearch(a,0,ub,key);     
     }  
    }  
