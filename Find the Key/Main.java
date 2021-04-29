lst1 = [x for x in input().split()]
small1 = []
large1 = []
small2 = []
large2 = []
for i in lst1:
  small1.append(int(i[0]))
  large1.append(int(i[1]))
  small2.append(int(i[2]))
  large2.append(int(i[3]))
ans = str(min(small1))+str(max(large1))+str(min(small2))+str(max(large2))
print(ans)
