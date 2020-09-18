def powerSet(str,index,curr):
  if index == len(str):
    return
  print(curr)
  for i in range(index+1,len(str)):
    curr = curr + str[i]
    powerSet(str,i,curr)
    curr = curr[0:len(curr)-1]

if __name__ == "__main__":
    str = "abc"
    powerSet(str,-1," ")