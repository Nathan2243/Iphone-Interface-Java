package smartphone.aplicacao;

import smartphone.ligacao.AparelhoTelefonico;
import smartphone.musica.ReprodutorMusical;
import smartphone.navegador.NavegadorInternet;

public class AplicacaoIphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

	@Override
	public void ligar() {
		System.out.println("Ligando...");
	}

	@Override
	public void atender() {
		System.out.println("Atendendo Telefone");

	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");

	}

	@Override
	public void tocar() {
		System.out.println("Tocando Musica");

	}

	@Override
	public void pausar() {
		System.out.println("Pausando Musica");

	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando uma Musica");

	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo Pagina");

	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando uma nova aba");

	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando a pagina");

	}

}
