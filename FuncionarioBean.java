package managedbeans;

import java.util.Date;
import java.util.Locale;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class FuncionarioBean {
	
	public FuncionarioBean(){
		Locale.setDefault(new Locale("es"));
	}
	

	private Locale locale;
	private double salario;  
	private int codigo;  
	private Date aniversario;
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Date getAniversario() {
		return aniversario;
	}
	public void setAniversario(Date aniversario) {
		this.aniversario = aniversario;
	}
	public Locale getLocale() {
		if (locale == null){
			locale = Locale.getDefault();
		}
		return locale;
	}
	public void setLocale(Locale locale) {
		this.locale = locale;
	}
	
	
}
