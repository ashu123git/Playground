def value(n):
  if (n > '0') and (n < '9'):
    return ord(n) - ord('0')
  else:
    return ord(n) - ord('A') + 10


def main():
  str1 = input()
  length = len(str1)
  sum1 = 0
  for i in range(len(str1)):
    num1 = value(str1[length-i-1])
    sum1 += (17**i)*num1
  print(sum1)
main()