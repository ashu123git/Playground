n = int(input())
nums = [int(x) for x in input().split()]
d = {}
lst2 = []
for i in nums:
  d[i] = d.get(i, 0) + 1
for i, j in d.items():
  if j > 1:
    lst2.append(i)
print(*lst2)