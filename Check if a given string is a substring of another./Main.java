n = int(input())
lst1 = []
ans = []
for i in range(n):
  lst1.append([input(), input()])
for i in lst1:
  if i[1] in i[0]:
    ans.append("Yes")
  else:
    ans.append("No")
for i in ans:
  print(i)
