import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TelaProjetoTest {

	void test() {
		TelaProjeto  tela = new TelaProjeto();
		tela.setFabrica(new FabricaWindows());
		tela.montar();
		assertEquals("janela Windows{menu windows, botão windows}",tela.desenhar());
	}

}
