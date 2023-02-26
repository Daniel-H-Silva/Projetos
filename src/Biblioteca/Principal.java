package Biblioteca;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import java.util.ArrayList;

public class Principal {
	
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		
		Date publica1 = formato.parse("02/01/2018");
		Livro livro1 = new Livro(publica1,"Principe Cruel","Holly Black",1);
		
		System.out.println("Informações do Livro 1:");
		System.out.println("Nome: "+livro1.getnome());
		System.out.println("Autor: "+livro1.getautor());
		System.out.println("Data de Publicação:"+formato.format(publica1));
		System.out.println("\n");
		
		Date publica2 = formato.parse("01/06/1908");
		Livro livro2 = new Livro(publica2,"Anne de Green Gables","L.M",2);
		
		System.out.println("Informações do Livro 2:");
		System.out.println("Nome: "+livro2.getnome());
		System.out.println("Autor: "+livro2.getautor());
		System.out.println("Data de Publicação:"+formato.format(publica2));
		System.out.println("\n");
		
		Date publica3 = formato.parse("05/05/2015");
		Livro livro3 = new Livro(publica3,"Corte de Rosas e Espinhos","Sarah J. Maas",3);
		
		System.out.println("Informações do Livro 3:");
		System.out.println("Nome: "+livro3.getnome());
		System.out.println("Autor: "+livro3.getautor());
		System.out.println("Data de Publicação:"+formato.format(publica3));
		System.out.println("\n");
		
		Date publica4 = formato.parse("01/09/2012");
		Livro livro4 = new Livro(publica4,"Os Garotos Corvos","Maggie Stiefvater",4);
		
		System.out.println("Informações do Livro 4:");
		System.out.println("Nome: "+livro4.getnome());
		System.out.println("Autor: "+livro4.getautor());
		System.out.println("Data de Publicação:"+formato.format(publica4));
		System.out.println("\n");
		
		Date publica5 = formato.parse("17/09/1954");
		Livro livro5 = new Livro(publica5,"O Senhor das Moscas","Willian Golding",5);
		
		System.out.println("Informações do Livro 5:");
		System.out.println("Nome: "+livro5.getnome());
		System.out.println("Autor: "+livro5.getautor());
		System.out.println("Data de Publicação:"+formato.format(publica5));
		System.out.println("\n");
		
		Date publica6 = formato.parse("24/07/2014");
		Livro livro6 = new Livro(publica6,"IT - A Coisa","Stephen King",6);
		
		System.out.println("Informações do Livro 6:");
		System.out.println("Nome: "+livro6.getnome());
		System.out.println("Autor: "+livro6.getautor());
		System.out.println("Data de Publicação:"+formato.format(publica6));
		System.out.println("\n");
		
		Date publica7 = formato.parse("25/07/1947");
		Livro livro7 = new Livro(publica7,"O Diario de Anne Frank","Anne Frank",7);
		
		System.out.println("Informações do Livro 7:");
		System.out.println("Nome: "+livro7.getnome());
		System.out.println("Autor: "+livro7.getautor());
		System.out.println("Data de Publicação:"+formato.format(publica7));
		System.out.println("\n");
		
		Date publica8 = formato.parse("01/01/1811");
		Livro livro8 = new Livro(publica8,"Razão e Sensibilidade","Jane Austen",8);
		
		System.out.println("Informações do Livro 8:");
		System.out.println("Nome: "+livro8.getnome());
		System.out.println("Autor: "+livro8.getautor());
		System.out.println("Data de Publicação:"+formato.format(publica8));
		System.out.println("\n");
		
		Date publica9 = formato.parse("25/06/2005");
		Livro livro9 = new Livro(publica9,"Percy Jackson e o Ladrão de Raios","Rick Riordan",9);
		
		System.out.println("Informações do Livro 9:");
		System.out.println("Nome: "+livro9.getnome());
		System.out.println("Autor: "+livro9.getautor());
		System.out.println("Data de Publicação:"+formato.format(publica9));
		System.out.println("\n");
		
		Date publica10 = formato.parse("03/03/2014");
		Livro livro10 = new Livro(publica10,"Halfbad","Sally Green",10);
		
		System.out.println("Informações do Livro 10:");
		System.out.println("Nome: "+livro10.getnome()); 
		System.out.println("Autor: "+livro10.getautor());
		System.out.println("Data de Publicação:"+formato.format(publica10));
		System.out.println("\n");

		Categoria catego1 = new Categoria(1,"Romance");
		Categoria catego2 = new Categoria(2,"Terror");
		Categoria catego3 = new Categoria(3,"Fantasia");
		Categoria catego4 = new Categoria(4,"Biografia");
		
		System.out.println("Todas as categorias:");
		System.out.println(""+catego1.getnomeCategoria());
		System.out.println(""+catego2.getnomeCategoria());
		System.out.println(""+catego3.getnomeCategoria());
		System.out.println(""+catego4.getnomeCategoria());
		System.out.println("\n");
		
		Pertence Cat1 = new Pertence(1,3);
		Pertence Cat2 = new Pertence(2,1);
		Pertence Cat3 = new Pertence(3,3);
		Pertence Cat4 = new Pertence(4,3);
		Pertence Cat5 = new Pertence(5,1);
		Pertence Cat6 = new Pertence(6,2);
		Pertence Cat7 = new Pertence(7,4);
		Pertence Cat8 = new Pertence(8,1);
		Pertence Cat9 = new Pertence(9,3);
		Pertence Cat10 = new Pertence(10,3);
	
		List<Pertence>listaLivros = new ArrayList<Pertence>();
		
		listaLivros.add(Cat1);
		listaLivros.add(Cat2);
		listaLivros.add(Cat3);
		listaLivros.add(Cat4);
		listaLivros.add(Cat5);
		listaLivros.add(Cat6);
		listaLivros.add(Cat7);
		listaLivros.add(Cat8);
		listaLivros.add(Cat9);
		listaLivros.add(Cat10);
		
		System.out.println("Lista de Livros e suas Categorias:");
		System.out.println("\n");

		
		for(int i = 0; i<listaLivros.size(); i++) {
				switch(listaLivros.get(i).getidLivro()) {
					case 1:    
						System.out.println("Principe Cruel");
					break;
					case 2:    
						System.out.println("Anne de Green Gables");
					break;
					case 3:    
						System.out.println("Corte de Rosas e Espinhos");
					break;
					case 4:    
						System.out.println("Os Garotos Corvos");
					break;
					case 5:    
						System.out.println("O Senhor das Moscas");
					break;
					case 6:    
						System.out.println("IT - A Coisa");
					break;
					case 7:    
						System.out.println("O Diario de Anne Frank");
					break;
					case 8:    
						System.out.println("Razão e Sensibilidade");
					break;
					case 9:    
						System.out.println("Percy Jackson e o Ladrão de Raios");
					break;
					case 10:    
						System.out.println("Halfbad");
					break;
				}
				switch(listaLivros.get(i).getidCategoria()){
					case 1:    
						System.out.println("Romance");
						break;
					case 2:    
						System.out.println("Terror");
						break;
					case 3:    
						System.out.println("Fantasia");
						break;
					case 4:    
						System.out.println("Biografia");
						break;
				}
				System.out.println("\n");
			}
		}
	}
