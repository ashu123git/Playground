n1, n2, n3 = [int(x) for x in input().split()]
if n1 > n2 and n1 > n3:
  print(max(n2, n3))
elif n2 > n1 and n2 > n3:
  print(max(n1, n3))
else:
  print(max(n1, n2))
