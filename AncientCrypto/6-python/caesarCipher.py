# Ask for key
 
# Ask for input method

# Ask for input

  # Open file
  
  # Read ipnut

  

def shiftAlphabet(k):
  # Build shifted alphabet
  lalphabet="abcdefghijklmnopqrstuvwxyz"
  ualphabet=lalphabet.upper()	

  shifted = lalphabet[k:] + lalphabet[0:k]
  #print(shifted)
  return shifted



# Show output
def encryptCaesar(key, message):
  enc=[]
# Encript
  for currChar in message:
    shiftAlpha=shiftAlphabet(key)
    print(currChar)
    if currChar in shiftAlpha:
      idx=shiftAlpha.index(currChar.lower())     
    else:
      continue
    newChar=shiftAlpha[idx]     
    if currChar.isupper(): 
      newChar.upper
  print(currChar,newChar)
  enc.append(newChar)
  print(enc)
  return enc	

  





test= "At noon be in the conference room with your hat on for a surprise party. YELL LOUD!";
k1=13
k2=21
mid=encryptCaesar(k1,test)
final=encryptCaesar(k2,mid)  


## "I want {} pieces of item {} for {} dollars."
print(final)

#print("First Encryption with key " + str(k1) + " : " +mid)
#print("Second Encryption (over already Encrypted Message ) with key " + str(k2) + " : " +final);





