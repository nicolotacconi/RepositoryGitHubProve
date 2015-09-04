package it.noccio.progetto.animale;

/**
 * CLasse Animale
 * @author arx50036
 *
 */
public abstract class Animale {

	public Animale(int eta, int zampe, String nome) {
		this.eta = eta;
		this.zampe = zampe;
		this.nome = nome;
	}

	private int eta;
	private int zampe;
	private String nome;

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public int getZampe() {
		return zampe;
	}

	public void setZampe(int zampe) {
		this.zampe = zampe;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
