#include <iostream>
#define FOR(a,b,i) for(int i = a;i<b;i++)
using namespace std;

/*
정수 배열(int array)이 주어지면 두번째로 큰 값을 프린트하시오.

Given an integer array, find the second largest element.

Input: [10, 5, 4, 3, -1]
Output: 5

Input: [3, 3, 3]
Output: Does not exist.
*/

int main()
{
	int ar[5],n;
	int fir, sec;

	cin >> n;
	
	FOR(0, n, i)
		cin >> ar[i];

	fir = ar[0] > ar[1] ? ar[0] : ar[1];
	sec = ar[0] < ar[1] ? ar[0] : ar[1];

	FOR(1, n, i)
	{
		if (ar[i] > fir)
		{
			sec = fir;
			fir = ar[i];
		}
		else if (fir == sec || ar[i] > sec)
		{
			sec = ar[i];
		}
	}

	if (fir == sec)
	{
		cout << "Does not exist";
	}
	else
	{
		cout << sec;
	}
}