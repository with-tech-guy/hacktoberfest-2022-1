
public class Bubblesort {

	public static void main(String[] args) {
		int []arr= {5,9,2,9,1,4,3,0};
		int temp=0;
        for(int i=0;i<arr.length-1;i++) {
        	for(int j=0;j<arr.length-i-1;j++) {
        		if(arr[j]>arr[j+1]) {
        			temp=arr[j];
        			arr[j]=arr[j+1];
        			arr[j+1]=temp;
        		}
        	}
        }
        
        System.out.println("after sorting the elements are: ");
        for(int i=0;i<arr.length;i++) {
        	System.out.print(arr[i]+" ");
        }
	}

}
