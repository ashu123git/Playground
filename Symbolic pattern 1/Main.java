n = int(input())
if n % 2 != 0:
  c = n//2
  for i in range(n//2):
    print(c*" "+'*'+c*" ")
  print('*'*n)
  for i in range(n//2):
    print(c*" "+'*'+c*" ")
else:
  c = n//2
  for i in range(n//2):
    print(c*" "+'*'+(n-(c+1))*" ")
  print(n*"*")
  for i in range(n-c-1):
    print(c*" "+'*'+(n-(c+1))*" ")
