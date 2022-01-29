// author adjimuhamadzidan
import java.util.Scanner;
public class bloodcharacter {
	// golongan darah A
	static void goldarA() {
		System.out.println("Golongan Darah A :");
		System.out.println();
		System.out.println("=======================================================================================================");
		System.out.println("Orang dengan golongan darah A identik dengan sifatnya yang terorganisir kritis, bertanggung jawab,");
		System.out.println("konsisten dengan apa yang sudah direncanakan, tenang dalam menghadapi masalah, dan berusaha adil");
		System.out.println("dalam situasi apapun. Sayangnya, ada sifat yang membuat orang dengan golongan darah A ini cenderung"); 
		System.out.println("tidak disukai, yaitu sifat keras kepala dan perfeksionisnya.");
		System.out.println();
		System.out.println("Jika ada pekerjaan yang harus dilakukan, beberapa orang dengan golongan darah A ini memilih untuk");
		System.out.println("mengurusnya sendiri. Mereka juga jarang merasa cocok dengan orang lain dan hanya menceritakan");
		System.out.println("situasinya kepada orang yang dipercaya saja."); 
		System.out.println("=======================================================================================================");
	}

	// golongan darah B
	static void goldarB() {
		System.out.println("Golongan Darah B :");
		System.out.println();
		System.out.println("=======================================================================================================");
		System.out.println("Orang dengan golongan darah B memiliki semangat yang tinggi, aktif, kreatif, dan selalu ingin tahu.");
		System.out.println("Mereka ingin tahu banyak hal karena rasa penasarannya yang tinggi. Jika mereka sudah tertarik dengan");
		System.out.println("sesuatu hal, mereka melakukannya dengan sepenuh hati."); 
		System.out.println();
		System.out.println("Sayangnya, karakternya yang santai cenderung dianggap kurang kooperatif karena lebih suka mengikuti");
		System.out.println("aturan dan ide mereka sendiri. Beberapa orang dengan golongan darah B ini juga cenderung individualis");
		System.out.println("dan lebih mementingkan logika daripada perasaannya.");
		System.out.println("=======================================================================================================");
	}

	// golongan darah AB
	static void goldarAB() {
		System.out.println("Golongan Darah AB :");
		System.out.println();
		System.out.println("==============================================================================================================");
		System.out.println("Dibandingkan golongan darah lainnya, orang dengan golongan darah AB paling sulit diprediksi atau dikenal");
		System.out.println("misterius. Walaupun kepribadiannya suka berubah, orang dengan golongan darah AB ini dikenal memiliki banyak");
		System.out.println("teman."); 
		System.out.println();
		System.out.println("Mereka memiliki karakter yang kritis, rasional, bertanggung jawab, suka menolong, dan mudah beradaptasi.");
		System.out.println("Sayangnya, mereka cenderung tidak tegas, mudah lupa, dan sensitif. Mereka memiliki perasaan yang lembut,");
		System.out.println("karena rasa empatinya yang tinggi terhadap situasi orang lain. Bahkan, mereka tidak keberatan membantu");
		System.out.println("orang lain selama mereka mampu.");
		System.out.println("==============================================================================================================");
	}

	// golongan darah O
	static void goldarO() {
		System.out.println("Golongan Darah O :");
		System.out.println();
		System.out.println("==============================================================================================================");
		System.out.println("Mereka memiliki karakter yang kritis, rasional, bertanggung jawab, suka menolong, dan mudah beradaptasi.");
		System.out.println("Mereka cenderung baik hati, pemurah, enerjik, terbuka, dan menghargai pendapat orang lain sehingga mudah");
		System.out.println("disukai oleh banyak orang. Sayangnya, orang dengan golongan darah O ini mudah terpengaruh oleh orang lain,");
		System.out.println("kurang fokus, keras kepala, dan lebih suka menjadi pengikut dibanding pemimpin.");
		System.out.println("==============================================================================================================");
	} 

	public static void main(String []args) {
		
		Scanner test = new Scanner(System.in);

		System.out.println("================== Blood Personality ==================");
		System.out.println("Mengecek Kepribadian Seseorang Berdasarkan Jenis Goldar");
		System.out.println();
		// input nama
		System.out.print("Masukan Nama Anda : ");
		String nama = test.nextLine();
		// input jenis goldar
		System.out.print("Golongan Darah : ");
		String goldar = test.nextLine();

		// konfirmasi iya/tidak
		System.out.print("Cek? [iya/tidak] : ");
		String cek = test.nextLine();

		if(cek.equals("iya")) {
			// goldarA
			if(goldar.equals("a") || goldar.equals("A")) {
				System.out.println();
				System.out.println("Nama Anda " + nama);
				goldarA();
			}

			// goldarB
			if(goldar.equals("b") || goldar.equals("B")) {
				System.out.println();
				System.out.println("Nama Anda " + nama);
				goldarB();
			}

			// goldarAB
			if(goldar.equals("ab") || goldar.equals("AB")) {
				System.out.println();
				System.out.println("Nama Anda " + nama);
				goldarAB();
			}

			// goldarO
			if(goldar.equals("o") || goldar.equals("O")) {
				System.out.println();
				System.out.println("Nama Anda " + nama);
				goldarO();
			}

			// goldar tidak tersedia
			else {
				System.out.println();
				System.out.println("Maaf, Jenis Golongan Darah " + goldar + " Tidak Tersedia.");
			}
		}

		// cancel pengecekan
		else {
			System.out.println();
			System.out.println("Pengecekan Dibatalkan.");
		}		
	}
}