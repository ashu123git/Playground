def fib(n):
  lst1 = []
  a = 0
  b = 1
  if n == 1:
    lst1.append(a)
  elif n == 2:
    lst1.append(a)
    lst1.append(b)
  else:
    d = n-2
    lst1.append(a)
    lst1.append(b)
    while d > 0:
      c = a+b
      lst1.append(c)
      a = b
      b = c
      d -= 1
  lst1.reverse()
  print(*lst1)

def main():
  num = int(input())
  fib(num)
main()
