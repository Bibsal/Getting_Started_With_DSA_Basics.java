//In this program we will show how the original address is copied as a shallow copy in
//in another array while we assign the original array to a new array and when we change 
// the value in the assigned array(i.e. the shallow copied one) it changes the whole array and the 
// updated value only remains for the original array also as the when it new array was
// assigned from the original array then the new array was shallow copied which means that
// the address of the original array has been the same for the new array and both of them
// point to the same array so any change in any both of them will update the whole array!!!
//import java.util.*; we do not need to import anything as we aren't using any inbuilt input taking class (Like Scanner)
public class ShallowCopyinArray {

	public static void main(String[] args) {
		int arr[];
		arr=new int[5];
		
		arr[0] = 90;
		arr[1] = 80;
		arr[2] = 70;
		arr[3] = 60;
		arr[4] = 50;
		
		System.out.println("This was the original value's in array :-");
		for(int i=0;i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		int another_arr[] = arr;     //the original array is assigned to the newarray(another_arr)
		another_arr[3] = 99;    //we updated index 3 of this another_arr now when we print the original
								//array(arr) then we will get the updated value because the original array was assigned
		 						//to the new array and both are now pointing to the same address so it'll be updated in both !!
	
		System.out.println("\n\nNow after assigning and updating the value of index 3, this is the updated value for both array's :-");
		for(int i=0;i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
