class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> list2=new ArrayList<Integer>();
        List<List<Integer>> listans=new ArrayList<List<Integer>>();
        for(int i=1;i<=numRows;i++)
        {
            List<Integer> list1=new ArrayList<Integer>();
            for(int j=1;j<=i;j++)
            {
                if(j==1 || (j-i)==0)
                    list1.add(1);
                else
                {
                    int temp=list2.get(j-2)+list2.get(j-1);
                    list1.add(temp);
                }
            }
            list2=list1;
            listans.add(list1);
        }
        return listans;
    }
}