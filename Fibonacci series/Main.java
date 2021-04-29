n = int(input())
a = 0
b = 1
if n == 1:
  print(a)
elif n == 2:
  print(a, b)
else:
  print(a, b, end=' ')
  while n-2 > 0:
    c = a+b
    print(c, end=" ")
    n -= 1
    a = b
    b = c
