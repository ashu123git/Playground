str1 = input()
lst1 = []
lst2 = []
for i in range(len(str1)//2):
  lst1.append(str1[i])
for i in range(len(str1)//2 + 1, len(str1)):
  lst2.append(str1[i])
lst3 = lst2
lst3.reverse()
if lst1 == lst2:
  print('{} is a palindrome'.format(str1))
elif lst1 == lst3:
  print('{} is a palindrome'.format(str1))
else:
  print('{} is not a palindrome'.format(str1))
