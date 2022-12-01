public class salaryCalculator
{

    public salaryCalculator()
    {
            String uname=sys.argv[1]
           int age=Integer.parseInt(sys.argv[2])
           float basicSalary=Float.parseFloat(sys.argv[3])

           float har= (50*basicSalary)/100
           float specialAllowance=(30*100)*basicSalary/100
           float pf=12*basicSalary/100

           float grossSalary = basicSalary+har+specialAllowance - pf
           float annualgrossSalary = 12*grossSalary
    }
    private void printInfo(String uname,String annualgrossSalary)
    {
        System.out.printf("The anual gross  income of {uname}  is {annualgrossSalary}" );
    }


}
print(txt.format(uname,annualgrossSalary)) 

# on terminal run  python salaryCalculator.py Harry 34 2000