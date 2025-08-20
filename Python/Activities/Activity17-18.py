import pandas as pd

#writing data csv file(Activity 17)
#create the dataset
data={
     
     "Usernames" : ["admin", "Charles", "Deku"],
     "Passwords" : ["password", "char113", "AllMight"]
}

#Convert the dataset into dataFrame
dataframe=pd.DataFrame(data)

print(dataframe)

#Writing dataFrame to a csv
dataframe.to_csv("./sample.csv", index=False)

#Reading data from a CSV file(Activity 18)
input_data=pd.read_csv("./sample.csv")

#print(input_data["Usernames"])
#print(input_data["Usernames"][1], input_data["Passwords"][1])
#print(input_data.sort_values(by="Usernames", ascending=True))
print(input_data.sort_values(by="Passwords", ascending=False))


