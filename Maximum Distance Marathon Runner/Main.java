arr1 = []
flag = 0
while True:
    n = input()
    if n == 'q':
        break
    else:
        num = float(n)
    if (num > 42.195) or (num < 0):
        flag = 1
    elif num == 42.195:
        continue
    else:
        arr1.append(num)
if flag == 1:
    print("Invalid Input")
elif flag == 0:
    arr1.sort(reverse=True)
    if len(arr1) == 0:
      print("Invalid Input")
    elif len(arr1) < 4:
        for k in arr1:
            if k.is_integer():
                print(int(k), end=" ")
            else:
                print(k, end=' ')
    else:
        for j in range(3):
            if arr1[j].is_integer():
                print(int(arr1[j]), end=' ')
            else:
                print(arr1[j], end=' ')