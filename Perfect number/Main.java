n = int(input())
div = []
for i in range(1, n//2+1):
  if n % i == 0:
    div.append(i)
if sum(div) == n:
  print("Yes")
else:
  print("No")
