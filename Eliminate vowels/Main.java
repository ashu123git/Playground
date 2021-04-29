str1 = input()
lst1 = ['A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u']
str2 = ''
for i in str1:
  if i in lst1:
    continue
  else:
    str2 += i
print(str2)
