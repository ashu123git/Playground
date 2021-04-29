str1 = input()
while len(str1) != 1:
  sum1 = 0
  for i in str1:
    sum1 = sum1+int(i)
  str1 = str(sum1)
print(int(str1))
