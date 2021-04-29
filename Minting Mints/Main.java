n, m = [int(x) for x in input().split()]
lst1 = []
total = n + (n-1)
if m == 1:
  print(n)
elif m == 2:
  print(total)
else:
  lst1.append(total)
  for i in range(m-2):
    lst1.append((total-1)*(2**i))
  print(sum(lst1))
