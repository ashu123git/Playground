n = int(input())
m = int(input())
lst1 = [int(x) for x in input().split()]
lst1.sort(reverse=True)
sum1 = 0
for i in range(m):
  sum1 += lst1[i]
print(sum1)
