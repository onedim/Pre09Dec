



public class KorisnickiPodatci {

	public static void main(String[] args) {
		
		User u1=getUser();
		User u2=getUser();
		User korisnik = unosKorisnika();
		
		System.out.printf("%s %s ima %d godina\n",korisnik.ime,korisnik.prezime,korisnik.dob);
		
	}

		private static User getUser() {
			User korisnik=new User();
			 
			System.out.println("Unesite ime");
			korisnik.ime=TextIO.getlnString();
			System.out.println("Unesite prezime");
			korisnik.prezime=TextIO.getlnString();
			System.out.println("Unesite dob");
			korisnik.dob=TextIO.getInt();
			 
		return korisnik;
	}

		private static User unosKorisnika() {
		User korisnik=new User();
				 
			System.out.println("Unesite ime");
			korisnik.ime=TextIO.getlnString();
			System.out.println("Unesite prezime");
			korisnik.prezime=TextIO.getlnString();
			System.out.println("Unesite dob");
			korisnik.dob=TextIO.getInt();
			 
		return korisnik;
		}
} 
