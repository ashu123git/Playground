n = int(input())
lst1 = [int(x) for x in input().split()]
lst2 = [0]*n
for i in range(len(lst1)):
  lst2[lst1[i]] = i
print(*lst2)
