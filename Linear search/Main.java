n = int(input())
nums = [int(x) for x in input().split()]
key = int(input())
flag = 0
for i in range(len(nums)):
  if nums[i] == key:
    flag = 1
    print(i+1)
    break
if flag == 0:
  print("{} isn't present in the array.".format(key))
