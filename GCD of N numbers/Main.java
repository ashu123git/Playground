from math import *
n = int(input())
lst1 = []
lst2 = []
d = {}
for i in range(n):
    lst1.append(int(input()))
for i in lst1:
    for j in range(1, int(sqrt(i)) + 1):
        if i % j == 0:
            if i//j == j:
                lst2.append(j)
            else:
                lst2.append(j)
                lst2.append(i//j)
for i in lst2:
    d[i] = d.get(i, 0) + 1
ans = []
for i, j in d.items():
    if j == n:
        ans.append(i)
print(max(ans))
