package pl.edu.pk.pkCodeTeam1.biblioteka;

public class FlyweightPatternDemo {
	private static final String authors[]={"JanuszC", "AdamK", "JozefS", "StanislawW", "JuliuszS", "KrzysztofB"};
	private static final String titles[]={"X", "XX", "XXX", "Y", "YY", "YYY", "Z", "ZZ", "ZZZ"};
	public static void main(int[] args)
	{
		for (int i=1; i<=20; i++)
		{
			Book book=(Book)BookFactory.getBook(i);
			book.setAuthor(getRandomAuthor());
			book.setTitle(getRandomTitle());
			
		}
	}
	
	private static String getRandomAuthor()
	{
		return authors[(int)(Math.random()*authors.length)];
	}
	
	private static String getRandomTitle()
	{
		return titles[(int)(Math.random()*titles.length)];
	}
	
}