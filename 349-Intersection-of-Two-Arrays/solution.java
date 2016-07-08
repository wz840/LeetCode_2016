public class Solution {
    /*
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> numList = new ArrayList<Integer>();
        if (nums1.length==0) return nums1;
        else if (nums2.length==0) return nums2;
        else {
            nums1 = delDup(nums1);
            nums2 = delDup(nums2);
            for (int i=0; i<nums1.length; i++) {
                for (int j=0; j<nums2.length; j++) {
                    if (nums1[i] == nums2[j]) {
                        numList.add(nums1[i]);
                        break;
                    }
                }
            }
        }
        int[] output = new int[numList.size()];
        for (int i=0; i<numList.size(); i++) {
            output[i] = numList.get(i);
        }
        return output;
    }
    
    
    public int[] delDup(int[] arr) {
        List<Integer> list = new ArrayList<Integer>();
        for (int x: arr) {
            list.add(x);
        }
        Set<Integer> numSet = new HashSet<Integer>();
        numSet.addAll(list);
        Iterator<Integer> it = numSet.iterator();
        int[] temp = new int[numSet.size()];
        int index = 0;
        while (it.hasNext()) {
            temp[index] = it.next().intValue();
            index++;
        }
        return temp;
    }*/
    
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = arrayToSet(nums1);
        List<Integer> numList = new ArrayList<Integer>();
        for (int i=0; i<nums2.length; i++) {
            if (s1.contains(nums2[i]) && !numList.contains(nums2[i])) numList.add(nums2[i]);
        }
        int[] output = new int[numList.size()];
        for (int i=0; i<numList.size(); i++) {
            output[i] = numList.get(i);
        }
        return output;
        
    }
    
    public Set<Integer> arrayToSet(int[] arr) {
        List<Integer> list = new ArrayList<Integer>();
        for (int x: arr) {
            list.add(x);
        }
        Set<Integer> s = new HashSet<Integer>();
        s.addAll(list);
        return s;
    }
        

    
    
    
    
    
}