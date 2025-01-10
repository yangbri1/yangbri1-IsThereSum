
public class IsThereSum {
    /**
     * Check if there exist two numbers in an array add up to some other number.
     * You will likely need a for loop nested inside of another for loop for this problem - each for loop checking
     * sums of two different indexes of arr.
     *
     * @param arr an array of ints.
     * @param target a hypothetical sum of two numbers.
     * @return true if two separate values in the array add up to a target, false otherwise.
     */
    public boolean check(int[] arr, int target){

        // set up two iterators for below while loop
        int i = 0;      // @ index 0
        int iTwo = 1;   // @ index 1
        // loop through given int array 'arr' up to 1 index from last 
        // (accounting for 'iTwo' -- if iterate to last elem, 'iTwo' would be out of bounds)
        while(i < arr.length - 1){
            // compare sum of two indices value to 'target' int
            if(arr[i] + arr[iTwo] == target){
                // if equivalent ... return true
                return true;
            }
            // increment both iterators to continue loop
            ++i;
            ++iTwo;
        }
        // otw return false
        return false;

        /* Note: If above didn't work out:
        1) maybe would have sorted 'arr' in ascending order (Arrays.sort() method), 
        2) slice out subarray for int less than 'target'
        3) perform or use different collection sorts */
    }
}
