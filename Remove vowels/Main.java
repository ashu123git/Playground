str1 = input()
str2 = ''
vowel = ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U']
for i in str1:
  if i in vowel:
    continue
  else:
    str2 += i
print(str2)
