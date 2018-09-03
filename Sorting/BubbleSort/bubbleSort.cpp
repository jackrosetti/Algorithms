#include<iostream>
#include <time.h>

using namespace std;

void swap(int *a, int *b)
{
    int temp = *a;
    *a = *b;
    *b = temp;
}

void bubbleSort(int arr[], int n)
{
   int i, j;
   for (i = 0; i < n-1; i++){      
       for (j = 0; j < n-i-1; j++){ 
           if (arr[j] > arr[j+1]){
              swap(&arr[j], &arr[j+1]);
           }
       }
   }
 	for(i=0;i<n;i++)
 		cout<<arr[i]<<", ";
    	
    cout<<"\n";
}

int main()
{

    clock_t t1,t2;
    t1 = clock();

    int arr[100],n;
    cout<<"Enter the size of array : \n";
    cin>>n;
    cout<<"Enter the elements : \n";
    for(int i=0 ; i<n ; i++){
        cin>>arr[i];
        }
    //int n = sizeof(arr)/sizeof(arr[0]);
    bubbleSort(arr, n);

    t2 = clock();
    float diff (((float)t2-(float)t1)/1000);
    cout<<"\nTIME TAKEN: " <<diff<<endl;
    
    return 0;
}
