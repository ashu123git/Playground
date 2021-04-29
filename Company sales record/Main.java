m, n = [int(x) for x in input().split()]
lst1 = []
ans = []
for i in range(m):
  lst1.append([int(x) for x in input().split()])
for i in lst1:
  ans.append(max(i))
print(*ans)
