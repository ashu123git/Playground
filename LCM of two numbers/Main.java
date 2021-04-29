from math import *
lst1 = [int(x) for x in input().split()]
lst2 = []
d = {}
for i in lst1:
    for j in range(1, int(sqrt(i))+1):
        if i % j == 0:
            if j == int(i/j):
                lst2.append(j)
            else:
                lst2.append(j)
                lst2.append(i//j)
for i in lst2:
    d[i] = d.get(i, 0) + 1
ans = []
for i, j in d.items():
    if j == 2:
        ans.append(i)
print((lst1[0]*lst1[1])//max(ans))