#include <iostream>

using namespace std;

int linearSearch(int arr[], int target, int size)
{
	for(int i = 0; i < size; i++)
	{
		if(arr[i] == target)
			return i;
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

	cout<<linearSearch(arr, target, n)<<endl;
}
