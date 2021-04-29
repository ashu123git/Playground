n = input()
dec = 0
length = len(n)-1
for i in range(len(n)):
    dec = dec + (int(n[i]))*(2**(length-i))
print(dec)
