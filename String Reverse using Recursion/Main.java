n = input()
lst1 = []
for i in n:
  lst1.append(i)
lst2 = lst1.copy()
lst2.reverse()
c = ''.join(lst2)
print(c)
