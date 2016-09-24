package managedbeans;


import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.event.ValueChangeEvent;

import model.Estado;

@ManagedBean
public class LocalidadeBean {
	
	private String cidade;
	private String siglaEstado;
	private Estado estado = new Estado();
	private List<Estado>estados = new ArrayList<Estado>();
	
	public LocalidadeBean() {
		Estado sp = new Estado();
		sp.setSigla("SP");
		sp.setNome("São Paulo");
		sp.getCidades().add("São Paulo");
		sp.getCidades().add("Campinas");
		
		Estado rj = new Estado();
		rj.setSigla("RJ");
		rj.setNome("Rio de Janeiro");
		rj.getCidades().add("Rio de Janeiro");
		rj.getCidades().add("Niterói");
		
		this.estados.add(sp);
		this.estados.add(rj);
		
		
	}
	
	public void mudaEstado( ValueChangeEvent vce ) {
		this.siglaEstado = vce.getNewValue().toString();
		for( Estado e: this.estados) {
			if (e.getSigla().equals(this.siglaEstado))
				this.estado = e;
		}
	
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getSiglaEstado() {
		return siglaEstado;
	}

	public void setSiglaEstado(String siglaEstado) {
		this.siglaEstado = siglaEstado;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public List<Estado> getEstados() {
		return estados;
	}

	public void setEstados(List<Estado> estados) {
		this.estados = estados;
	}
	
	
}
