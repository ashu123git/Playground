def fib(n):
  if n == 1:
    return 1
  elif n == 2:
    return 2
  else:
    return fib(n-1)+fib(n-2)

def main():
  num = int(input())
  if num > 30:
    print("Invalid Input")
  else:
    res = fib(num)
    print(res)
main()