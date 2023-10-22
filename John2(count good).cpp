bool Good_num ( int x, int d, int sum ){
        if(x==0) return true;
        int temp=x%10;   if(temp<=sum || temp==d) return false;
        return Good_num( x/10, d, sum+temp );
    }  
vector<int> goodNumbers(int a, int b, int d) {
    vector<int> res;
    for(int i=a;i<=b;i++){
        if(i%10==d) continue;
        if (Good_num(i/10,d,i%10)) res.push_back(i);    
    }
    return res;
}
