package print;

public class Main {
	public static void main(String[] args){
		int i = 100;
		boolean status = true;
		String str = "Welcome";
		System.out.printf("%d, %b, %s", i, status, str);
		//���PC�y���Ϊk
		/*%b: boolean, if argument is null, return null.
		 *    If argument isn't a boolean object, return true,
		 *    else return true
		 */
		/*%h: hash, if argument is null, return null,
 		 *    else return its hashcode
		 */
		/*%d: �Q�i��; %o: �K�i��; %x: �Q���i��; %e: ���(��ǰO�����)
		 *%f: float; %g: ���(����T�שM�|�ˤ��J�A��ǰO�����)
		 *%a: �Q���i����(�t���ļƦr�Ϋ���) 
		 */
	}
}
