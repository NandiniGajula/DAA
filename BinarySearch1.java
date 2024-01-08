    import java.util.Scanner;
    class BinarySearch1{  
        public static int binarySearch(int a[], int lb, int ub, int key){  
            if (ub>=lb){  
                int mid = lb + (ub - lb)/2;  
                if (a[mid] == key){  
                return mid;  
                }  
                if (a[mid] > key){  
                return binarySearch(a, lb, mid-1, key);
                }else{  
                return binarySearch(a, mid+1, ub, key);
                }  
            }  
            return -1;  
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
            int result = binarySearch(a,0,ub,key);  
            if (result == -1)  
                System.out.println("Element is not found!");  
            else  
                System.out.println("Element is found at index: "+result);  
        }  
    }  
