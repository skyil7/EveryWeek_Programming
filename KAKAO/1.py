"""
카카오 코딩테스트 #1

자연수 N이 주어지면, 
N의 각 자릿수의 합을 구하시오.

KaKao Coding Test # 1

Given a natural number N,
Find the sum of each digit of N.
"""

N = int(input("Given Number : "))

remainder = 1
sum = 0

while remainder != 0 :
    remainder = N % 10
    N = (int)(N/10)
    sum += remainder

print("answer : ",sum)
