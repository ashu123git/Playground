n = input()
lst1 = []
lst2 = []
for i in range(len(n)//2):
  lst1.append(n[i])
for i in range(len(n)//2 + 1, len(n)):
  lst2.append(n[i])
lst3 = lst2.copy()
lst3.reverse()
if lst1 == lst2:
  print("Palindrome")
elif lst1 == lst3:
  print("Palindrome")
else:
  print("Not a Palindrome")
