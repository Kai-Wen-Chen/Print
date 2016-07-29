package print;

public class Main {
	public static void main(String[] args){
		int i = 100;
		boolean status = true;
		String str = "Welcome";
		System.out.printf("%d, %b, %s", i, status, str);
		//等同C語言用法
		/*%b: boolean, if argument is null, return null.
		 *    If argument isn't a boolean object, return true,
		 *    else return true
		 */
		/*%h: hash, if argument is null, return null,
 		 *    else return its hashcode
		 */
		/*%d: 十進位; %o: 八進位; %x: 十六進位; %e: 實數(科學記號表示)
		 *%f: float; %g: 實數(有精確度和四捨五入，科學記號表示)
		 *%a: 十六進位實數(含有效數字及指數) 
		 */
	}
}
