#include <iostream>
#define FOR(a,b,i) for(int i = a;i<b;i++)
using namespace std;

/*
정수 배열(int array)이 주어지면 0이 아닌 정수 순서를 유지하며 모든 0을 배열 오른쪽 끝으로 옮기시오.
단, 시간복잡도는 O(n), 공간복잡도는 O(1)여야 합니다.

Given an integer array, move all the 0s to the right of the array without changing the order of non-zero elements.

Input: [0, 5, 0, 3, -1]
Output: [5, 3, -1, 0, 0]

Input: [3, 0, 3]
﻿Output: [3, 3, 0]
*/

int main()
{
	int ar[20] = { 0 }, n;
	int zero = 0;//Space Complexity : O(1)
	int num;

	cin >> n;

	FOR(0, n, i)
	{
		cin >> num;
		if (num == 0)
			zero++;
		else
			ar[i - zero] = num;
	}

	FOR(0, n, i)
		cout << ar[i] << " ";
	
}