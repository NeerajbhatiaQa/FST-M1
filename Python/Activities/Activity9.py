numlist1=[2,3,4,5,6]
numlist2=[7,8,9,1]
numlist3=[]
for x in numlist1:
    if x%2!=0:
      numlist3.append(x)

for x in numlist2:
    if x%2==0:
        numlist3.append(x)


print(numlist3)