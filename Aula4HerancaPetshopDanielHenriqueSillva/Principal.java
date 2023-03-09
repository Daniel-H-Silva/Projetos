package Aula4HerancaPetshopDanielHenriqueSillva;


import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) throws ParseException {
		
		List<Dono>listaDonos = new ArrayList<Dono>();
		Dono dono1 = new Dono("Carlos",18,"111.154.122-05");
		listaDonos.add(dono1);
		Dono dono2 = new Dono("Andre",25,"55.457.669-21");
		listaDonos.add(dono2);
		
		
		Cachorro tibu = new Cachorro("Tibu",5,"Vira Lata", "Marron", "Macho", listaDonos.get(0));
		Gato pintado = new Gato("Pintado",7,"Angora", "Pardo", "Macho", listaDonos.get(0));
		Passaro rep = new Passaro("Rep", 2,"Papagaio","Amarelo","Femea",listaDonos.get(1));
		
		List<Animal>ListaPetsCarlos = new ArrayList<Animal>();
		ListaPetsCarlos.add(tibu);
		ListaPetsCarlos.add(pintado);
		
		List<Animal>ListaPetsAndre = new ArrayList<Animal>();
		ListaPetsAndre.add(rep);
		
		
		listaDonos.get(0).setPets(ListaPetsCarlos);
		listaDonos.get(1).setPets(ListaPetsAndre);
		
		//tentei implementar a organização atrave do collections.sort();
		
		//Collections.sort(listaDonos);
		//Collections.sort(ListaPetsCarlos);
		//Collections.sort(ListaPetsAndre);
		
		for(int n = 0; n<listaDonos.size(); n++) {
			System.out.println("Informações do:\n" +listaDonos.get(n).getNome());
			System.out.println("Idade:\n"+listaDonos.get(n).getIdade());
			System.out.println("CPF:\n" +listaDonos.get(n).getCpf());
			System.out.println("Pets:\n");
			for(int i=0; i<listaDonos.get(n).getPets().size(); i++) {
				System.out.println("Nome:\n"+listaDonos.get(n).getPets().get(i).getNome());
				System.out.println("Idade:\n"+listaDonos.get(n).getPets().get(i).getIdade());
				System.out.println("Raça:\n"+listaDonos.get(n).getPets().get(i).getRaca());
				System.out.println("Cor:\n"+listaDonos.get(n).getPets().get(i).getCor());
				System.out.println("Sexo:\n"+listaDonos.get(n).getPets().get(i).getSexo());
				System.out.println("\n");
			}
			System.out.println("\n");
			}
		}
	}

