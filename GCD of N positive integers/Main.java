n = int(input())
lst1 = [int(x) for x in input().split()]
ans = []
for i in range(1, max(lst1)):
  flag = 0
  for j in lst1:
    if j % i == 0:
      continue
    else:
      flag = 1
      break
  if flag == 0:
    ans.append(i)
print(max(ans))
