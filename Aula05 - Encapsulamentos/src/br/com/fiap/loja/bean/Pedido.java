package br.com.fiap.loja.bean;

public class Pedido {

	//Atributos encapsulados
	private Usuario usuario;
	
	private boolean pago;
	
	private double valor;
	
	//Gets e Sets
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setPago(boolean pago) {
		this.pago = pago;
	}
	
	public boolean getPago() {
		return pago;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
}