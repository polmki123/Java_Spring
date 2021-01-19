package designpattern;

public class Company extends Singleton
{
    int companyid;
    int people;

    private static Company company = null;

    public static Company getinstance (){
        if ( company == null){
            company = new Company();
        }
        return company;
    }
}
