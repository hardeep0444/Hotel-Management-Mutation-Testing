package Algorithms.Sorting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajElement {
//    Approach-1

    public List<Integer> majorityElement1(int[] arr) {
        int n = arr.length; //size of the array
        List<Integer> result = new ArrayList<>(); // list of answers

        for (int i = 0; i < n; i++) {
            //selected element is arr[i]:
            // Checking if arr[i] is not already
            // a part of the answer:
            if (result.size() == 0 || result.get(0) != arr[i]) {
                int count = 0;
                for (int j = 0; j < n; j++) {
                    // counting the frequency of arr[i]
                    if (arr[j] == arr[i]) {
                        count++;
                    }
                }

                // check if frequency is greater than n/3:
                if (count > (n / 3))
                    result.add(arr[i]);
            }

            if (result.size() == 2) break;
        }

        return result;
    }

//    Approach-2

    public List<Integer> majorityElement2(int[] arr) {
        int n = arr.length; //size of the array
        List<Integer> result = new ArrayList<>(); // list of answers

        //declaring a map:
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // least occurrence of the majority element:
        int minCount = (int)(n / 3) + 1;

        //storing the elements with their occurrence:
        for (int i = 0; i < n; i++) {
            int value = frequencyMap.getOrDefault(arr[i], 0);
            frequencyMap.put(arr[i], value + 1);

            //checking if arr[i] is
            // the majority element:
            if (frequencyMap.get(arr[i]) == minCount) {
                result.add(arr[i]);
            }
            if (result.size() == 2) break;
        }

        return result;
    }

//    Approach-3

    public List<Integer> majorityElement3(int[] nums) {
        int cnt1 =0, cnt2=0;
        int el1=Integer.MIN_VALUE,el2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(cnt1==0 && nums[i]!=el2)
            {
                cnt1=1;
                el1=nums[i];
            }
            else if(cnt2==0 && nums[i]!=el1)
            {
                cnt2=1;
                el2=nums[i];
            }
            else if(nums[i]==el1)
            {
                cnt1++;
            }
            else if(nums[i]==el2)
            {
                cnt2++;
            }
            else
            {
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;
        cnt2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(el1==nums[i])cnt1++;
            if(el2==nums[i])cnt2++;
        }
        List<Integer> ans = new ArrayList<>();
        int mini=(int)(nums.length/3)+1;
        if(cnt1>=mini) ans.add(el1);
        if(cnt2>=mini) ans.add(el2);
        return ans;
    }
}
