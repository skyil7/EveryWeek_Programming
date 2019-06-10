# String이 주어지면, 중복된 char가 없는 가장 긴 서브스트링 (substring)의 길이를 찾으시오.
# Given a string, find the longest substring that does not have duplicate characters.

# 예제)
# Input: “aabcbcbc”
# Output: 3 // “abc”
#
# Input: “aaaaaaaa”
# Output: 1 // “a”

st = input()
cnt = 1
maxCnt = 1
maxCha = st[0]
cha = st[0]

for i in range(1,len(st)):
    if st[i] != st[i-1]:
        cnt += 1
        cha += st[i]
    else:
        cnt=1
        cha=st[i]
    if cnt > maxCnt:
        maxCnt = cnt
        maxCha = cha

print(maxCnt)
print(maxCha)