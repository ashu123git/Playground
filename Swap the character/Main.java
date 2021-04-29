n1 = input()
n2 = input()
n3 = input()
vowel = ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U']
n11 = ''
for i in n1.rstrip():
  if i not in vowel:
    n11 += i
  else:
    i = '$'
    n11 = n11+i
n12 = ''
for i in n2.rstrip():
  if i not in vowel:
    i = '#'
    n12 = n12+i
  else:
    n12 += i
n13 = n3.upper()
print(n11+n12+n13)