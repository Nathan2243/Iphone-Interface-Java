package smartphone.usuario;

import smartphone.musica.*;
import smartphone.aplicacao.*;
import smartphone.ligacao.*;
import smartphone.navegador.*;

public class UsuarioNathan {
	public static void main(String[] args) {

		AplicacaoIphone aiphone = new AplicacaoIphone();

		ReprodutorMusical appMusica = aiphone;
		AparelhoTelefonico appLigacao = aiphone;
		NavegadorInternet appNavegador = aiphone;

		System.out.println("Abrindo app de musica");
		appMusica.selecionarMusica();
		appMusica.tocar();
		appMusica.pausar();

		System.out.println("");
		System.out.println("Abrindo app de ligação");

		appLigacao.ligar();
		appLigacao.atender();
		appLigacao.iniciarCorreioVoz();

		System.out.println("");
		System.out.println("Abrindo app do navegador");
		appNavegador.exibirPagina();
		appNavegador.adicionarNovaAba();
		appNavegador.atualizarPagina();

	}

}
