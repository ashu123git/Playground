n, m = [int(x) for x in input().split()]
if (n < 10) and (m <= 10):
  if m != 10:
    for i in range(n, m+1):
      print('{}'.format(i), end=' ')
  else:
    for i in range(n, m):
      print('0{}'.format(i), end=' ')
    print(10)
elif (n < 10) and (10 < m < 100):
  for i in range(n, 10):
    print('0{}'.format(i), end=' ')
  for i in range(10, m+1):
    print('{}'.format(i), end=' ')
elif (n < 10) and (100 <= m < 1000):
  for i in range(n, 10):
    print('00{}'.format(i), end=' ')
  for i in range(10, 100):
    print('0{}'.format(i), end=' ')
  for i in range(100, m+1):
    print(i, end=' ')
elif (10 <= n < 100) and (10 < m <= 100):
  if m != 100:
    for i in range(n, m+1):
      print(i, end=' ')
  else:
    for i in range(n, m):
      print('0{}'.format(i), end=' ')
    print(100)
elif (10 < n < 100) and (100 < m < 1000):
  for i in range(n, 100):
    print('0{}'.format(i), end=' ')
  for i in range(100, m+1):
    print(i, end=' ')
elif (100 <= n < 1000) and (100 < m < 1000):
  for i in range(n, m+1):
    print(i, end=' ')
