numlist=input("Enter comma sepreated numbers ").split(",")
print(numlist)

sum=0
for num in numlist:
    sum=sum+int(num)


print("The sum of number in the list is:",sum)
