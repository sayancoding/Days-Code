def powerSet(mainString,curr,index):
  if(len(curr) == len(mainString) or index == len(mainString)):
    return
  print(curr)
  for i in range(index,len(mainString)):
    curr = curr + mainString[i]
    powerSet(mainString,curr,i)