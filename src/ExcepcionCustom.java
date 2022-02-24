
public class ExcepcionCustom extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExcepcionCustom(String msg) {
        super(msg);
        System.out.println(msg);
    }
}
