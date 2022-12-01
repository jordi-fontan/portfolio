var uname=process.argv[2];
var age=parseInt(process.argv[3]);
var basicSalary=parseFloat(process.argv[4]);

if(age<0){
    console.log('Sorry too young')

}
else if(basicSalary<0)
{
    console.log('Bad job you have')
}
else 
{
    

    const  har= (50*basicSalary)/100;
    const specialAllowance=(30*100)*basicSalary/100;
    const pf=12*basicSalary/100;

    let grossSalary = basicSalary+har+specialAllowance - pf
    let annualgrossSalary = 12*grossSalary;

    console.log(` The anual gross  income of ${uname}  is ${annualgrossSalary} ` );
    // on terminal run  node salaryCalculator.js Harry 34 2000
}


