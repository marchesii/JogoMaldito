package model;

public class Pedra implements Coisa{
	private String atributo;
	
	public Pedra(){
		this.atributo = "Quebra";
	}
	
	@Override
	public String getAtributo(){
		return this.atributo;
	}
	
	@Override
	public String toString(){
		return "Pedra ";
	}
	
	@Override
	public boolean ganha(Coisa coisa){
		boolean result = false;
		
		if(coisa instanceof Tesoura){
			result = true;
		}
		
		return result;
	}
}
