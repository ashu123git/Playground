n = int(input())
lst1 = []
a = 0
b = 1
if n == 1:
  lst1.append(a)
elif n == 2:
  lst1.append(a)
  lst1.append(b)
else:
  lst1.append(a)
  lst1.append(b)
  d = n-1
  while d > 0:
    c = a+b
    lst1.append(c)
    a = b
    b = c
    d -= 1
print(lst1[n-1])