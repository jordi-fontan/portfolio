import sys

print( 'Number of arguments:', len(sys.argv), 'arguments.')
print ('Argument List:', str(sys.argv))

uname=sys.argv[1]
age=int(sys.argv[2])
basicSalary=float(sys.argv[3])

har= (50*basicSalary)/100
specialAllowance=(30*100)*basicSalary/100
pf=12*basicSalary/100

grossSalary = basicSalary+har+specialAllowance - pf
annualgrossSalary = 12*grossSalary
txt = 'The anual gross  income of {uname}  is {annualgrossSalary} '

print(txt.format(uname,annualgrossSalary)) 

# on terminal run  python salaryCalculator.py Harry 34 2000