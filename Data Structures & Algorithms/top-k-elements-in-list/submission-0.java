class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>m=new HashMap<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->m.get(a)-m.get(b));
        for(int i=0;i<nums.length;i++)
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        int i=0;
        for (Map.Entry<Integer, Integer> e : m.entrySet())
        {
            if(i<k)
            {
                pq.add(e.getKey());
            }
            else
            {
                if(m.get(pq.peek())<e.getValue())
                {
                    pq.poll();
                    pq.add(e.getKey());
                }
            }
            i++;
        }
        int[] arr=new int[k];
        i=0;
        while(!pq.isEmpty())
        {
            arr[i++]=pq.poll();
        }
        return arr;
    }
}
