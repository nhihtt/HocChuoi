package tonhi.com;

import java.util.Scanner;

public class BaiTapDemKiTu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hãy nhập chuỗi tùy ý ");
		String chuoi="" ;
		chuoi=sc.nextLine();
		int soKTHoa=0;
		int soKTThuong=0;
		int soChuSo=0;
		int soKTDacBiet=0;
		int soKhoangTrang=0;
		int soNguyenAm=0;
		int soPhuAm=0;
		for (int i=0;i < chuoi.length();i++) 
		{
			char c= chuoi.charAt(i);
			if(Character.isUpperCase(c))
				soKTHoa++;
			if(Character.isLowerCase(c))
				soKTThuong++;
			if(Character.isDigit(c))
				soChuSo++;
			if(!(Character.isSpaceChar(c)||Character.isLetter(c)||Character.isDigit(c)))
					soKTDacBiet++;
			if(Character.isSpaceChar(c))
				soKhoangTrang++;
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
				soNguyenAm++;
			else
				soPhuAm++;
				
		}
		System.out.println("Số chữ in hoa là "+soKTHoa);
		System.out.println("Số chữ in thường là "+soKTThuong);
		System.out.println("Số chữ số là "+soChuSo);
		System.out.println("Số kí tự đặc biệt là "+soKTDacBiet);
		System.out.println("Số khoảng trắng là "+soKhoangTrang);
		System.out.println("Số chữ nguyên âm là "+soNguyenAm);
		System.out.println("Số chữ phụ âm là "+soPhuAm);
	}

}
