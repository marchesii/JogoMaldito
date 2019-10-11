package model;

public class Papel implements Coisa {
	private String atributo;
	
	public Papel(){
		this.atributo = "Embrulha";
	}
	
	@Override
	public String getAtributo(){
		return this.atributo;
	}
	
	@Override
	public String toString(){
		return "Papel ";
	}
	
	/*
	 * E o empate?
	 */
	@Override
	public boolean ganha(Coisa coisa){
		boolean result = false;
		
		if(coisa instanceof Pedra){
			result = true;
		}
		
		return result;
	}
}
