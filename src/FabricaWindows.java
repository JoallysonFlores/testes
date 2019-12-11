
public class FabricaWindows implements  FabricaAbstrata {

	
	public Janela criarJanela() {
		
		return new JanelaWindows();
	}

	
	public Menu criarMenu() {
		
		return null;
	}

	
	public Botao criarBotaoWindows() {
		
		return null;
	}
	
}
