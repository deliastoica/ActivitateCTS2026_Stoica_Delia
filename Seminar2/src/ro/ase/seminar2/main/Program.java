package ro.ase.seminar2.main;




import ro.ase.seminar2.clase.Aplicant;
import ro.ase.seminar2.clase.readers.ReaderAngajati;
import ro.ase.seminar2.clase.readers.ReaderAplicanti;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		Aplicant.setPrag(85);
		try {
			ReaderAplicanti ra = new ReaderAngajati("angajati.txt");
			listaAngajati = ra.readAplicanti();
			for(Aplicant aplicant:listaAngajati) {
				System.out.println(aplicant.toString());
				aplicant.afisareVenit();
				aplicant.afisareStatut();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
