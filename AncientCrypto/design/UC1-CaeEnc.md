1. Ask for key
 
 1.1 Ask for input method

2.1 Ask for input

  2.1.1 Open file
  
  2.1.2 Read input

3 Build shifted alphabet
  3.1 ShiftedAlphabet = alphabet.substring(key) + alphabet.substring(0,key)

4 Encript
    
    for  chars in message
      encChar= shiftedAlphabet.getChar(char) # look the char at same pos 
      output=output + encChar
5 Show output
