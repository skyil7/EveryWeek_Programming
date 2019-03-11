'''Given an integer array, find the largest consecutive sum of elements.
example}

Input: [-1, 3, -1, 5]

Output: 7 // 3 + (-1) + 5



Input: [-5, -3, -1]

Output: -1 // -1



Input: [1, 3, 6, 2, 4]

Output: 6 // 2 + 4

'''

n = int(input("Array Length : "))
arr = []

for i in range(0,n):
    arr.append(int(input("input : ")))

total = arr[0]
maxTotal = arr[0]

for i in range(1,n):
    total=max(total + arr[i], arr[i])
    maxTotal=max(maxTotal, total)

print(maxTotal)
