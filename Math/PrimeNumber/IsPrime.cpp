#include <iostream>
#include <time.h>

using namespace std;

int sqrt(int x) {
		if (x < 0)
			return false;
		int y = 0;
		for (int i = 1 << 15; i != 0; i >>= 1) {
			y |= i;
			if (y > 46340 || y * y > x)
				y ^= i;
		}
		return y;
	}


bool isPrime(int n){
	if(n <= 1)
		return false;
	else if(n <= 3)
		return true;
	else if(n % 2 ==0)
		return false;
	else{
		for(int i = 1; i < (int)sqrt(n); i++){
			if(n % i ==0)
				return false;
		}
		return true;
	}
}

int main(){
	clock_t t1,t2;
    t1 = clock();

	cout<<isPrime(7);
	cout<<isPrime(2);
	cout<<isPrime(3002);

    t2 = clock();
    float diff (((float)t2-(float)t1)/1000);
    cout<<"\nTIME TAKEN: " <<diff<<endl;
}
