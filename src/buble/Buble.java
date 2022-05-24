package buble;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Buble {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		List<Integer> lista2 = new ArrayList<>();
		List<Integer> anotherList = Arrays.asList(5, 12, 9, 3, 15, 88);
		List<Integer> anotherList2 = Arrays.asList(5, 12, 9, 3, 15, 88);
		lista.addAll(anotherList);
		lista2.addAll(anotherList2);
		
		System.out.println(lista2);
		for(int i = 0 ; i < lista2.size() - 1 ; i++) {
			for(int j = i+1 ; j < lista2.size() ; j++) {
				if(lista2.get(i) > lista2.get(j)) {
					lista2 = scambio(lista2,i,j);
				}
				
			}
		}
		System.out.println(lista2);
		System.out.println(lista);
		boolean flag = false;
		int n = lista.size();
		do {
			flag = true;
			for(int i = 0 ; i < n ; i++) {
				if(lista.get(i) > lista.get(i+1)) {
					lista = scambio(lista, i, -1);
					flag=false;
					n--;
				}
				
			}
			
		}while(!flag);
		
		System.out.println(lista);

	}
	
	public static List<Integer> scambio(List<Integer> lista, int index, int index2) {
		if(index2 == -1) {
			int temp = 0;
			temp = lista.get(index);
			lista.set(index, lista.get(index+1));
			lista.set(index+1, temp);
			
			
		}else {
			int temp = 0;
			temp = lista.get(index);
			lista.set(index, lista.get(index2));
			lista.set(index2, temp);
		}
		return lista;
	}

}
