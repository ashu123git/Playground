m = int(input())
n = int(input())
s = int(input())
value = s-1
arr = []
for i in range(m):
  arr1 = []
  for j in range(n):
    arr1.append(0)
  arr.append(arr1)
for i in range(m):
  for j in range(n):
    value = value + 1
    arr[i][j] = value
for i in range(m):
  for j in range(n):
    print(arr[i][j], end=' ')
  print()
