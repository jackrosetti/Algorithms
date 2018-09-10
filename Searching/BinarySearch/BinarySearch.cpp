#include <iostream>

using namespace std;


int binarySearch(int arr[], int n, int low, int high){
	while(low <= high){
		int mid = (low + high)/2;
		if(arr[mid] < n){
			low = mid + 1;
		}
		else if(arr[mid] > n){
			high = mid - 1;
		}
		else{
			cout<<mid;
			return mid;
		}
	}
	return -1;
}

int main()
{
	int n, target;
	cout<<"Enter size of array ";
	cin>>n;
	int arr[n];
	cout<<"Enter "<<n<<" elements ";
	for(int i = 0; i < n; i++)
		cin>>arr[i];
	cout<<"What number are you looking for in the list? ";
	cin>>target;
	cout<<binarySearch(arr, target, 0, n);
}
