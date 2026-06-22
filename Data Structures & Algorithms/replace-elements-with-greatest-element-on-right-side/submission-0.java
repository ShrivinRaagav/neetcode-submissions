class Solution {
    public int findMax(int large,int r, int[] arr){
        while(r<arr.length){
            large = Math.max(large,arr[r]);
            r++;
        }
        return large;

    }
    public int[] replaceElements(int[] arr) {
        int []newArray = new int[arr.length];
        int r = 1;
        int large = 0;
        for(int i=0;i<arr.length;i++){
            newArray[i] = findMax(large,r,arr);
            r++;
            if(r == arr.length + 1){
                newArray[i] = -1;
            }
        }
        return newArray;
    }
}