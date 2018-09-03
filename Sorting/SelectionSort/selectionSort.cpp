#include<iostream>
#include <time.h>

using namespace std;


int main(){

	clock_t t1,t2;
    t1 = clock();

	int n;
	cout<<"Enter the size you want the array to be: ";
	cin>>n;
	int arr[n];
	cout<<"Enter " <<n<< " numbers for the array";

	for(int i = 0; i < n; i++){
		cin>>arr[i];
	}

	for(int i = 0; i < n-1; i++){
		int min = i;

		for(int j = i+1; j < n; j++){
			if(arr[min] > arr[j]){
				min = j;
			}
		}

		if(min != i){	
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}

	cout<<"Sorted array is: ";
	for(int i = 0; i < n; i++){
		cout<<arr[i]<<"\t";
	}

	t2 = clock();
    float diff ((float)t2-(float)t1);
    float secs = diff/1000;
    cout<<"\nTIME TAKEN:" <<secs<<endl;

}
