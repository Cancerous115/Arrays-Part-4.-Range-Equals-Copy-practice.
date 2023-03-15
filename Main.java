import java.util.Arrays;
class Main {
	public static void main(String[]args){
		int number[] = {1,2,3,4,5};
		//this second array/variable has a diffeent name, it still equals to our original variable number as we made it equal to number.
		//we can change the length of our Array by changing the endingIndex.
		int startingIndex=1;
		int endingIndex=10;
		int copyOfNumber[] = number;
		//if we want to "copy" arrays we must use the copy method.See line 20 for print
		int newcopyOfNumber[] = Arrays.copyOf(number,number.length);
		//We can also make it larger or smaller. Make our array hold 10 values ex: Print Line 21
		int largerNewCopyOfNumber[] =Arrays.copyOf(number,10);
		//Find/create the range of our Array.Range method. print line 22"We also need starting and endingIndex.lines 6-7
		int rangeCopyOfNumber[] = Arrays.copyOfRange(number,startingIndex,endingIndex);
		//We can "fill" to change every number by changing our source array number to 0.
		Arrays.fill(number,0);
		//print to show both number ,and copyOfNumber are the same
		System.out.println(Arrays.toString(number));
		System.out.println(Arrays.toString(copyOfNumber));
		System.out.println(Arrays.toString(newcopyOfNumber));
		System.out.println(Arrays.toString(largerNewCopyOfNumber));
		System.out.println(Arrays.toString(rangeCopyOfNumber));
		//To make number==to copyOfNumber. We use our "equals method" so it can be True.
		System.out.println(Arrays.equals(number,copyOfNumber));
	}
}
