class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int n=nums.size();
        /*int ans;
        for(int i=0;i<n;i++){
            int count=1;
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>(n/2))
            {
                ans=nums[i];
                break;
            }
        }
        return ans;*/
        map<int,int>mpp;
        for(int i=0;i<n;i++){
            mpp[nums[i]]++;
        }
        int maxi=INT_MIN;
        int ans;
        for(auto it:mpp){
           if(it.second>maxi){
                maxi=it.second;
                ans=it.first;
           } 
          
        }
        return ans;

        

    }
};
