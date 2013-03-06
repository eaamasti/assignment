package myPackage;

public class Cprnr {
	private long _cprnr;
	
	public Cprnr(long cprnr){
		
		if (checkCprno(cprnr) == true)
			_cprnr = cprnr;
		else
			_cprnr = -1;
		
	}// Cpnnr()
	
	public long getCprnr(){
		return _cprnr;
	}// getCprnr()
	
	public boolean checkCprno(long  restcpr) {
        long sum = 0L;

        sum += (restcpr % 10) * 1;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 2;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 3;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 4;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 5;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 6;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 7;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 2;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 3;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 4;
        restcpr = restcpr / 10;
        if (sum % 11 == 0 && sum != 0)
          return true;
        else
          return false;
     }// checkCprno()
	
}// class Cprnr
