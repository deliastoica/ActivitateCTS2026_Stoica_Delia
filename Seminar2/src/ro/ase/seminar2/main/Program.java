package ro.ase.seminar2.main;




import ro.ase.seminar2.clase.Aplicant;
import ro.ase.seminar2.clase.readers.ReaderAngajati;
import ro.ase.seminar2.clase.readers.ReaderAplicanti;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		try {
			ReaderAplicanti ra = new ReaderAngajati();
			listaAngajati = ra.readAplicanti("angajati.txt");
			for(Aplicant aplicant:listaAngajati)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
