
public class FlyweightPatternDemo {
	private static final String authors[]={"JanuszC", "AdamK", "JozefS", "StanislawW", "JuliuszS", "KrzysztofB"};
	private static final String titles[]={"X", "XX", "XXX", "Y", "YY", "YYY", "Z", "ZZ", "ZZZ"];
	public static void main(int[] args)
	{
		for (int i=1; i<=20; i++)
		{
			Book book=(Book)BookFactory.getBook(id);
			book.setAuthor(getRandomAuthor());
			book.setTitle(getRandomTitle);
			
		}
	}
	
	private static String getRandomAuthor()
	{
		return author[(int)(Math.random()*authors.length)];
	}
	
	private static String getRandomTitle()
	{
		return author[(int)(Math.random()*titles.length)];
	}
	
}