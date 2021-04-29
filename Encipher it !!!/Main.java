str1 = input()
key = int(input())
d = {'a':0, 'b':1, 'c':2, 'd':3, 'e':4, 'f':5, 'g':6, 'h':7, 'i':8, 'j':9, 'k':10, 'l':11, 'm':12, 'n':13, 'o':14, 'p':15, 'q':16, 'r':17, 's':18, 't':19, 'u':20, 'v':21, 'w':22, 'x':23, 'y':24, 'z':25}
if str1.isupper():
  c = str1.lower()
  val = d[c] + key
  if val > 25:
    val = val-26
  for i, j in d.items():
    if j == val:
      print(i.upper())
else:
  val = d[str1] + key
  if val > 25:
    val = val-26
  for k, l in d.items():
    if l == val:
      print(k)
