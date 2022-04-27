package OOPconcepts.encapsulation.accessModifier;

public class Student {
	static String schoolName;
	public int id;
	private String fName;
	protected String lName;
	String email;
	
	public void display(){
		System.out.println(this.id+". "+
							this.fName+" "+
							this.lName+"\t"+
							this.email
							);
	}
	/* new
	 * this
	 * static
	 * final
	 * ACCESS Modifiers
	 * 		public
	 * 		protected
	 * 		default
	 * 		private
	 * 
	 * 
	 * 
	 * 
	 */
}
