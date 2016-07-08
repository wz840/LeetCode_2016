public class Solution {
    /*
    private void bubleSort(int[] array) {
        for (int i=0; i<array.length; i++) {
            for (int j=i; j<array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length==0) return nums1;
        else if (nums2.length==0) return nums2;
        else {
            bubleSort(nums1);
            bubleSort(nums2);
            int index = 0;

            ArrayList<Integer> output = new ArrayList<Integer>();
            for (int i=0; i<nums2.length; i++) {
                for (int j=index; j<nums1.length; j++){
                    if (nums2[i]==nums1[j]) {
                        output.add(nums2[i]);
                        index = j + 1;
                        break;
                    }
                    else if (nums2[i] < nums1[j]) {
                        break;
                    }
                }
            }
            
            int[] outputArray = new int[output.size()];
            for (int i=0; i<output.size(); i++) {
                outputArray[i] = output.get(i);
            }
            return outputArray;
        }
     }*/
    
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> output = new ArrayList<Integer>();
        int[] temp = new int[0];
        for (int i=0; i<nums2.length; i++) {
            int j = nums1.length;
            int index = 0;
            while (index < j) {
                if (nums2[i] == nums1[index]) {
                    output.add(nums2[i]);
                    temp = new int[j-1];
                    for (int k=0; k<j-1; k++) {
                        if (k<index) temp[k] = nums1[k];
                        else temp[k] = nums1[k+1];
                    }
                    nums1 = temp;
                    break;
                } else index++;
            }
        }
        int[] outputArray = new int[output.size()];
        for (int i=0; i<output.size(); i++) {
         outputArray[i] = output.get(i);
        }
        return outputArray;
    }
    
}
