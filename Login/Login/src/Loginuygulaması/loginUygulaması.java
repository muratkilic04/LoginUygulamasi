package Loginuygulaması;

import java.util.Scanner;

public class loginUygulaması {
	
	static boolean aktif=true;
	static int hakSayisi=3;

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		
		if(aktif) {
			if(hakSayisi>0) {
				while(aktif) {
					System.out.println("Kullanıcı adını giriniz:");
					String kullaniciAdi=s.nextLine();
					
					System.out.println("Şifrenizi giriniz: ");
					String sifre=s.nextLine();
					
					boolean sonuc=login(kullaniciAdi,sifre);
					if(sonuc) {
						System.out.println("Uygulamaya başarılı olarak giriş yaptınız.");
						break;
					}else {
						if(hakSayisi==0) {
							aktif=false;
							break;
						}
					}
				}
				if(aktif==false) {
					System.out.println("Hak sayınız dolmuştur.");
				}
				
			}else {
				System.out.println("Hakkınız doldu hesabınız bloke edildi.");
			}
		}else {
			System.out.println("Hesabınız aktif değildir.");
		}
	}
	public static boolean login(String kullaniciAdi,String sifre) {
		if(kullaniciAdi.equals("murat10") && sifre.equals("123")) {
			return true;
		}else {
			hakSayisi--;
			System.out.println("Kullanıcı adı ve şifreniz hatalıdır.Lütfen tekrar deneyin.");
			return false;
			
		}
	}

}
