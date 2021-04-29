str1 = input()
c = 0
str2 = ''
for i in range(len(str1)-1, -1, -1):
  str2 += str1[i]
for i in range(len(str1)):
  if str1[i] == str2[i]:
    c += 1
print(c)
