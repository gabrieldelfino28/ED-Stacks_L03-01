package view;

import controller.VetorPilhaController;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vetor = {0, 5, 7, -4, 3, 5, -2, -1, 10, 4, 3, -6, 2, -9, 1, -5};
		
		int tamanho = vetor.length;
		
		VetorPilhaController v = new VetorPilhaController();
		System.out.println(v.FVetorPilha(vetor, tamanho));
	}

}
