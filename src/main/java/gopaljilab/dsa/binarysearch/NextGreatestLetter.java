package gopaljilab.dsa.binarysearch;

public class NextGreatestLetter {
    public char nextGreatestLetter(char[] letters, char target) {
        // for(char letter : letters){
        //     if(letter > target){
        //         return letter;
        //     }
        // }

        int leftIndex = 0;
        int rightIndex = letters.length;
        while (leftIndex < rightIndex){
            int mid  = (rightIndex+leftIndex)/2;
            if(letters[mid] > target){
                rightIndex = mid;
            }
            else{
                leftIndex = mid + 1;
            }
        }
        return letters[leftIndex % letters.length];
    }
}
