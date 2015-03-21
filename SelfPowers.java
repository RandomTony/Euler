public class SelfPowers{

	public static long power(int i)
	{
		long res = 1;
		long module = 10000000000L;//Keep only the ten digits you need
		for(int a = 0;a<i;a++ )
		{
				res=(res*i)%module;
		}
		return res;
	}
	public static void main(String[] args) {
		long res = 1;
		long module=10000000000L;

		for(int i =2 ; i<1001;i++)
		{
			res=res+SelfPowers.power(i);	
		}
	System.out.println("The ten digits are "+res%module);

	}
}