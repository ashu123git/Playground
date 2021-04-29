n = int(input())
lst1 = []
lst2 = []
d = {}
for i in range(n):
  lst1.append(int(input()))
for i in lst1:
  d[i] = d.get(i, 0) + 1
for i, j in d.items():
  if j == 1:
    lst2.append(i)
lst2.sort()
print(*lst2)