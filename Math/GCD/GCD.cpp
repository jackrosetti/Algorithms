//read more here: https://en.wikipedia.org/wiki/Binary_GCD_algorithm and https://www.geeksforgeeks.org/operators-c-c/

#include<iostream>

using namespace std;


int gcd(int a, int b){
	if(a == 0)
		return b;
	if(b==0)
		return a;

	int squareNum;
	for (squareNum = 0; ((a | b) & 1) == 0; squareNum++) {
		a >>= 1;
		b >>= 1;
	}

	while((a&1) == 0){
		a >>= 1;
	}

	while(b != 0){
		while ((b&1) == 0)
			b >>= 1;
		if(a > b)
			swap(a, b);
		b -= a;
	} 

	return a << squareNum;
} 

int main()
{
	cout << gcd(258, 321) << endl;
	return 0;
}

