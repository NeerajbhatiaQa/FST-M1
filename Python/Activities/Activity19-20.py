import pandas as pd
from pandas import ExcelWriter

data={
    'FirstName' : ["Satvik","Avinash","Lahri"],
    'LastName' : ["Shah","Kati","Rath"],
    'Email':["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
	'PhoneNumber':["4537829158", "4892184058", "4528727830"]
}

dataframe=pd.DataFrame(data)

writer=ExcelWriter("./sample19.xlsx")
dataframe.to_excel(writer,'Sheet1',index=False)
writer.close()

print("No of rows and Columns : ",dataframe.shape)
print(dataframe['Email'])
print(dataframe.sort_values(by='FirstName'))