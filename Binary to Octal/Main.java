str1 = input()
length = len(str1)-1
sum1 = 0
for i in range(len(str1)):
  sum1 = sum1+((2**(length-i))*int(str1[i]))
octal = oct(sum1)
print(octal[2:])
