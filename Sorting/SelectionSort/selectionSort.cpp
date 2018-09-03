#include<iostream>
#include <time.h>

using namespace std;

void selection(int n, int a[20]){

    int k,i,temp,min;
    
    for(i=0; i<n-1; i++){
        min=i;

        for(k=i+1; k<n; k++){
            if(a[min]>a[k])
                min=k;
        }

            if(i!=min){
                temp=a[i];
                a[i]=a[min];
                a[min]=temp;
            }
    }

    cout<<"Sorted list is: \n";
    
    for(i=0;i<n;i++)
        cout<<a[i]<<", ";
    
    cout<<"\n";
}

int main(){

	clock_t t1,t2;
    t1 = clock();

    int a[20],i,j,k,n,temp,min;

    cout<<"Enter the size of the array: ";
    cin>>n;

    cout<<"Enter "<<n<< " elements ";

    for(i=0; i<n; i++)
        cin>>a[i];

    selection(n,a);

    t2 = clock();
    float diff (((float)t2-(float)t1)/1000);
    cout<<"\nTIME TAKEN: " <<diff<<endl;


}
