package managedbeans;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class GeradorDeApostasBean {

	private int quantidadeDeNumeros;
	private int tamanhoDaAposta;
	private int quantidadeDeApostas;
	private List<List<Integer>> apostas;

	public int getQuantidadeDeNumeros() {
		return quantidadeDeNumeros;
	}

	public void setQuantidadeDeNumeros(int quantidadeDeNumeros) {
		this.quantidadeDeNumeros = quantidadeDeNumeros;
	}

	public int getTamanhoDaAposta() {
		return tamanhoDaAposta;
	}

	public void setTamanhoDaAposta(int tamanhoDaAposta) {
		this.tamanhoDaAposta = tamanhoDaAposta;
	}

	public int getQuantidadeDeApostas() {
		return quantidadeDeApostas;
	}

	public void setQuantidadeDeApostas(int quantidadeDeApostas) {
		this.quantidadeDeApostas = quantidadeDeApostas;
	}

	public List<List<Integer>> getApostas() {
		return apostas;
	}

	public void setApostas(List<List<Integer>> apostas) {
		this.apostas = apostas;
	}

	public String geraApostas() {
		// Prepara uma lista com todos os números
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		for (int j = 1; j <= this.quantidadeDeNumeros; j++) {
			numeros.add(j);
		}
		// Cria uma sublista da lista de números
		List<Integer> subList = numeros.subList(0, this.tamanhoDaAposta);
		// Lista de apostas vazia
		this.apostas = new ArrayList<List<Integer>>();
		// Gera as apostas
		for (int i = 0; i < this.quantidadeDeApostas; i++) {
			Collections.shuffle(numeros);
			List<Integer> aposta = new ArrayList<Integer>(subList);
			this.apostas.add(aposta);
		}
		return "lista-de-apostas";
	}
}
