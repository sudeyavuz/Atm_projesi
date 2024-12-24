package JAVA101;
import java.util.Scanner;
public class yirmibesinci_ornek {
    public static void main(String[] args) {
        String username, password;
        int right = 3;
        int bakiye = 1500;
        int sec;
        Scanner input = new Scanner(System.in);
        while (right > 0) {
            System.out.println("Kullanıcı Adınızı Giriniz: ");
            username = input.nextLine();

            System.out.println("Şifrenizi Giriniz: ");
            password = input.nextLine();

            if (username.equals("java") && password.equals("java123")) {
                System.out.println("başarı ile giriş yaptınız");
                do {

                    System.out.println("yapmak istediğiniz işlemi seçiniz: ");
                    System.out.println("1-para yatırma\n2-para çekme\n3-bakiye sorgulama\n4-çıkış yap");
                    sec = input.nextInt();
                    switch (sec) {
                        case 1:
                            System.out.println("yatırılacak miktarı giriniz: ");
                            int miktar= input.nextInt();
                            bakiye+=miktar;
                            System.out.println("son durum: "+bakiye);
                            break;
                        case 2:
                            System.out.println("çekilecek para miktarını giriniz: ");
                            int tutar = input.nextInt();
                            if (tutar>bakiye){
                                System.out.println("bakiye yetersiz");
                            }else {
                                bakiye-=tutar;
                                System.out.println("kalan miktar: "+bakiye);
                            }
                            break;
                        case 3:
                            System.out.println("toplam bakiye: "+bakiye);
                            break;

                    }
                }while (sec!=4);
                System.out.println("tekrar görüşmek üzere");
                break;
            } else {
                right--;
                System.out.println("hatalı bilgi girdiniz");
                if (right == 0) {
                    System.out.println("hesabınız bloke olmuştur banka ile iletişime geçiniz");
                } else {
                    System.out.println("kalan hakkınız: " + right);
                }
            }

        }
    }
}
