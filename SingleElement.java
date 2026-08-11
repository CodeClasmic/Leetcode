import java.util.HashMap;


public class SingleElement {

    static int[] singleNumber(int[] arr) {

        HashMap<Integer,Integer> map=new HashMap<>();
        int[] nums=new int[2];
        int pos=0;
        for(int x=0;x<arr.length;x++)
        {
            map.put(arr[x],map.getOrDefault(arr[x],0 )+1);
        }
        
        for(Integer key: map.keySet())
        {
            if (map.get(key)==1) {
                nums[pos]=key;
                pos++;
               
            }
        }


        return nums;
        
    }


    public static void main(String[] args) {
        int[] arr={1, 1, 3, 3, 4, 4, 5, 5, 7, 7, 8,9};
        int count=0;
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int x=0;x<arr.length;x++)
        // {
        //     map.put(arr[x],map.getOrDefault(arr[x],0 )+1);
        // }
        
        // for(Integer key: map.keySet())
        // {
        //     if (map.get(key)==1) {
        //         System.out.println(key);
        //     }
        // }
        
       int[] result=singleNumber(arr);

       for(int x:result)
       {
        System.out.println(x);
       }
    }
}
