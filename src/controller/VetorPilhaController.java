package controller;

import model.PilhaInt;

public class VetorPilhaController {

	public VetorPilhaController() {
		// TODO Auto-generated constructor stub
		super();
	}

	PilhaInt p = new PilhaInt();

	public int FVetorPilha(int[] vetor, int tam) {
		for (int i = 0; i < tam; i++) {
			if (vetor[i] >= 0) {
				p.push(vetor[i]);
			} else {
				try {
				int v1 = p.pop();
				int v2 = p.pop();
				p.push(vetor[i]);
				p.push(v1+v2);
				} catch (Exception e) {
					//
				}
			}
		}
		return p.size();
	}

}
