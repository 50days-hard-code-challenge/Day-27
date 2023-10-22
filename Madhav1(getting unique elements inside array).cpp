#include <iostream>
using namespace std;

void solve(int arr[], int n) {
  arr[0] = 100;
}

int getUnique(int arr[], int n) {
  int ans = 0;
  for(int i=0; i<n; i++) {
    ans = ans^arr[i];
  }
  return ans;
}

  return 0;
}};
