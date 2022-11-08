## 1. Caesar Cipher

### 1.1 Caesar's Cipher Strategies

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
### 1.2. Shifted Alphabet Build


![imagen](https://user-images.githubusercontent.com/63612112/199542616-e57e9b58-41f3-4f0d-9520-37adafe0b2e7.png)





Vigenere Cipher

![imagen](https://user-images.githubusercontent.com/63612112/199555487-a1b6c83a-308b-49fd-aa0a-fb31ad27e225.png)


#### 1.2.1 Pseudocode

```
String alphabet= 'ABCDEFGHIJKLMNOPQRSTVWXYZ';
// enc should be = 'XYZABCDEFGHIJKLMNOPQRSTVW';
// key=23
//String shiftedAlphabet= 'XYZ' + substring(0,23) = subs(23) + substring(0,23)
String shiftedAlphabet =  alphabet.subString(0,key) + substring(0,key);

```
### 1.3. Remeber to use StringBuilder in java
![imagen](https://user-images.githubusercontent.com/63612112/199546472-8d62fbec-2e60-4f80-a206-ae74026c2979.png)



## 2. Vigenere Code

`key= DICE`

![imagen](https://user-images.githubusercontent.com/63612112/199555682-51924a7a-df2f-4161-bdb6-b950b0b40976.png)


### 2.1 Known Language and Key Length

![imagen](https://user-images.githubusercontent.com/63612112/199556551-d98d121d-d962-43a4-bccd-0c8d2572db90.png)

#### Slicing

1. blue (0)

![imagen](https://user-images.githubusercontent.com/63612112/199556848-3ecd4f26-e55d-4ebb-b08f-07703a362681.png)

2. red (1)

![imagen](https://user-images.githubusercontent.com/63612112/199557135-9c1e229c-b157-4a9f-93b1-1a977b508603.png)

3. Advice

![imagen](https://user-images.githubusercontent.com/63612112/199557400-b498b062-6a76-42c0-bafd-dc3748e32369.png)

4. Try Key Length


