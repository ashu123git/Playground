test = int(input())
for i in range(test):
  r, c = [int(x) for x in input().split()]
  arr1 = []
  arr2 = []
  final = []
  for j in range(r):
    lst2 = [int(x) for x in input().split()]
    arr1.append(lst2)
  for j in range(r):
    lst3 = [int(x) for x in input().split()]
    arr2.append(lst3)
  for j in range(len(arr1)):
    for k in range(len(arr1[i])):
      final.append(arr1[j][k] + arr2[j][k])
      continue
  print(*final)