class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split(" ");
        String arr1[]=new String[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            
               arr1[j]=arr[i];
               j++;
            
            
        }
        String res="";
        for
        (int i=0;i<arr1.length;i++)
        {
            if(arr1[i].equals(""))
            {
                continue;
            }
            res+=arr1[i];
            res+=" ";
        }
        String ress=res.trim();
        return ress;
        
    }
}