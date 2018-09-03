#include<iostream>
#include <time.h>

using namespace std;

int main()
{

	clock_t t1,t2;
    t1 = clock();

	int n;
	cout<<"How many numbers in the array? \n";
	cin>>n;
	int Array[n];
	cout<<"Enter " << n << " numbers for the array";
	//take input
	for(int i = 0; i < n; i++){
		cin>>Array[i];
	}

	//sort
	for(int i = 0; i < n; i++){
		for(int j = 0; j < n-1; j++){
			if(Array[j] > Array[j + 1]){
				int temp = Array[j];
				Array[j] = Array[j+1];
				Array[j + 1] = temp; 
			}
		}
	}

	//print
	cout<<"Sorted array is: ";
	for(int i = 0; i < n; i++){
		cout<<Array[i]<<"\t";
	}

	t2 = clock();
    float diff ((float)t2-(float)t1);
    float secs = diff/1000;
    cout<<"\nTIME TAKEN:" <<secs<<endl;


}
