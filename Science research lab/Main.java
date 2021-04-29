n = int(input())
lst1 = [int(x) for x in input().split()]
lst1.sort(reverse=True)
print(lst1[0]+lst1[1])
