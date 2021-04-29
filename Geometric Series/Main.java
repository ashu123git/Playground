n = int(input())
if n == 1:
  print(1)
elif (n % 2) == 0:
  print(3**(n//2 - 1))
else:
  print(2**(n//2))