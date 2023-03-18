package day5;

public class MethodOverriding
{
    public static void main(String[] args)

    {
        SBI sbi = new SBI();
        System.out.println(sbi.rate_interest());

        ICICI icici = new ICICI();
        System.out.println(icici.rate_interest());

        AXIX axix = new AXIX();
        System.out.println(axix.rate_interest());

    }
}
class Bank
{
    double rate_interest()
    {
        return 0;
    }
}
class SBI extends Bank
{
    double rate_interest()
    {
        return 10.5;
    }
}
class AXIX extends Bank
{
    double rate_interest()
    {
        return 9.5;
    }
}

class ICICI extends Bank
{
    double rate_interest()
    {
        return 8.5;
    }
}


