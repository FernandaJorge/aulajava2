package br.com.fernanda;

import java.util.Scanner;

public class Venda {

	
	public void vender() {
		String produto = null;
		
		boolean compra = false;
				
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o produto que deseja comprar ?");
		produto = teclado.nextLine();
		
		if (produto != null  && produto != "") {
			compra = true;
		} else {
			System.out.println("Obrigado volte sempre");
			return; //como se fosse o abort do delphi
		}
		
		if (compra) {
			String formaPagamento;
			System.out.println("Como deseja pagar ?");
			formaPagamento = teclado.nextLine();
			Double valorDigitado = 50.00;
		
			
			if (formaPagamento != null && formaPagamento != " ") {
				
				if (formaPagamento.equalsIgnoreCase("dinheiro")) {
					valorDigitado =	Promocao25(valorDigitado);
					System.out.println("Compra efetuada com sucesso com desconto");		
				} else {
					System.out.println("Compra efetuada com sucesso");
				}
				
			} else {
				System.out.println("Forma de Pagamento invalida");
			}
		}
		
		teclado.close();
	}
	
	public Double Promocao25(Double valor) {
		valor = valor - (valor * 25 / 100);
	    return valor;
	}
	
	public void Promocao25() {
		String produto = null;
		
		boolean compra = false;
				
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o produto que deseja comprar ?");
		produto = teclado.nextLine();
		
		if (produto != null  && produto != "") {
			compra = true;
		} else {
			System.out.println("Obrigado volte sempre");
			return; //como se fosse o abort do delphi
		}
		
		if (compra) {
			String formaPagamento;
			System.out.println("Como deseja pagar ?");
			formaPagamento = teclado.nextLine();
			Double valorDigitado = 50.00;
		
			
			if (formaPagamento != null && formaPagamento != " ") {
				
				if (formaPagamento.equalsIgnoreCase("dinheiro")) {
					valorDigitado = valorDigitado - (valorDigitado * 25 /100);
					System.out.println("Compra efetuada com sucesso com desconto " + valorDigitado.toString() );		
				} else {
					System.out.println("Compra efetuada com sucesso");
				}
				
			} else {
				System.out.println("Forma de Pagamento invalida");
			}
		}
		
		teclado.close();
	}

}
