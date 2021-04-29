n = int(input())
lst1 = [x for x in input().split()]
ans = []
for i in lst1:
  sum1 = 0
  for j in range(len(i)):
    sum1 = sum1+int(i[j])
  ans.append(sum1)
print(*ans)
