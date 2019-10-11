package model;

public class Tesoura implements Coisa {
	private String atributo;
	
	public Tesoura(){
		this.atributo = "Corta";
	}
	
	@Override
	public String getAtributo(){
		return this.atributo;
	}
	
	@Override
	public String toString(){
		return "Tesoura ";
	}
	
	@Override
	public boolean ganha(Coisa coisa){
		boolean result = false;
		
		if(coisa instanceof Papel){
			result = true;
		}
		
		return result;
	}
}
