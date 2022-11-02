
### 1. Caesar's Cipher Strategies

![imagen](https://user-images.githubusercontent.com/63612112/199528708-a6595e60-7ed7-48b8-9fde-1ff5d0aaa981.png)

![imagen](https://user-images.githubusercontent.com/63612112/199537332-c6811c0e-fa1a-46f5-a294-3559bca5db13.png)

`
    //Supose we have F
    codedLetter= 'F'-3;
    // If we have B
    codedLetter= 'B'-3+26;
    
    // so if letter-key<1 then key= 26-key
    char letter2code,key;
    
    if( letter2code-key<'A') {
      key= 26-key;
      
    }
    char codedLetter= letter2code - key
`

![imagen](https://user-images.githubusercontent.com/63612112/199537470-281334d9-6cf9-47d7-9e93-ff4452df9088.png)

``` 
// Suppose we have an F and the shifted slphabet

int index = alphabet.indexOf('F');
char codedF= shiftedAlphabet.charAt(index);

```
### 2. Shifted Alphabet Build


![imagen](https://user-images.githubusercontent.com/63612112/199542616-e57e9b58-41f3-4f0d-9520-37adafe0b2e7.png)

#### 2.1 Pseudocode

```
String alphabet= 'ABCDEFGHIJKLMNOPQRSTVWXYZ';
// enc should be = 'XYZABCDEFGHIJKLMNOPQRSTVW';
// key=23
//String shiftedAlphabet= 'XYZ' + substring(0,23) = subs(23) + substring(0,23)
String shiftedAlphabet =  alphabet.subString(0,key) + substring(0,key);

```
### 3. Remeber to use StringBuilder in java
![imagen](https://user-images.githubusercontent.com/63612112/199546472-8d62fbec-2e60-4f80-a206-ae74026c2979.png)

