#!/usr/bin/env python
# coding: utf-8

# In[ ]:


import pandas as pd
from sklearn.linear_model import LinearRegression
# from sklearn.model_selection import cross_val_score,cross_validate,train_test_split
# from sklearn.preprocessing import StandardScaler,Normalizer, RobustScaler
# from sklearn.metrics import *
# import seaborn as sns
# from sklearn.discriminant_analysis import LinearDiscriminantAnalysis as LDA
import sys
import pickle
import os


# In[ ]:


a = sys.stdin.read()


# In[ ]:


data = a.split()


# In[ ]:


for each in range(0,len(data)):
    data[each] = int(data[each])


# In[ ]:


data = np.array(data).reshape(1,-1)


# In[ ]:


# print(data.shape)


# In[ ]:


model_path = "Model/model.pkl"
# data_path ="Data/df1.csv"


# In[ ]:


# df = pd.read_csv(data_path,thousands=',')


# In[ ]:


# df.describe().T


# In[ ]:


# df.head()


# In[ ]:


# test_set = df.drop('date',axis =1)


# In[ ]:


# test_set.head()


# In[ ]:


# y_test = test_set['open']
# test_set.drop('open',axis=1,inplace=True)


# In[ ]:


with open(model_path,'rb') as f:
    model = pickle.load(f)


# In[ ]:


pred = model.predict(data)


# In[ ]:


print(pred)


# In[ ]:


# err_mae = mean_absolute_error(y_test,pred)
# accuracy = r2_score(y_test,pred)


# In[ ]:


# print("error mae = {}, accuracy = {}".format(err_mae,accuracy))


# In[ ]:


# df['pred']=pred


# In[ ]:


# df.head()


# In[ ]:


# path = "predictions/pred.csv"


# In[ ]:


# df.to_csv(path)


# In[ ]:


try:
    sys.stdout.write(pred)
except Exception as e:
        print("Cannot return the path beacause ",e)

