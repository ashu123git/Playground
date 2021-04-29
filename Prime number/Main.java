def isPrime(num):
  if num == 2:
    return True
  else:
    flag = 0
    for j in range(2, num):
      if num % j == 0:
        flag = 1
        return False
    if flag == 0:
      return True

    
if __name__ == '__main__':
  n = int(input())
  last1 = []
  for i in range(2, n+1):
    if isPrime(i):
      last1.append(i)
  for i in last1:
    print(i, end=' ')
