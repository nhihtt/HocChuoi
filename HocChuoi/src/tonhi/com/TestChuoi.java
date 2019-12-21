package tonhi.com;

public class TestChuoi {

	public static void main(String[] args) {
			String s ="hồ thị tố nhi";
			//kiểm tra số kí tự trong chuỗi
			int n= s.length();
			System.out.println("Số kí tự ="+n);
			//đếm số kí tự in hoa,in thường
			int soKTHoa= 0;
			int soKTThuong=0;
			for(int i=0; i<s.length();i++) 
			{
				char c= s.charAt(i);// Lấy kí tự tại vt i
				if(Character.isUpperCase(c))
					soKTHoa++;
				if(Character.isLowerCase(c))
					soKTThuong++;
			}
			System.out.println("Số kt in hoa="+soKTHoa);
			System.out.println("Số kt in thường="+soKTThuong);
			// Hàm kiểm tra ksi tự thông thường
			int soKTLetter =0;
			for(int i=0; i<s.length();i++) {
				char c= s.charAt(i);
				if(Character.isLetter(c))
					soKTLetter++;
			}
			System.out.println("Số kí tự thường"+soKTLetter);
			// Kiểm tra chuoxi xem thử nhập tên đúng ko. tên đúng là tên chứa lí tự thông thường và khoảng trắng
			boolean ktHoLe= true;
			for(int i=0; i<s.length(); i++) 
			{
				char c= s.charAt(i);
				if(!(Character.isLetter(c)|| Character.isSpaceChar(c)))
					ktHoLe=false;
				break;
				
			}
			if(ktHoLe)
				System.out.println("Chuỗi: "+s+" =>hợp lệ");
			else
				System.out.println("Chuỗi: "+s+" =>không hợp lệ");
			
			//Tìm chuỗi => quan trọng
			s="Sài Gòn người ta bán Bông Gòn";
			int vitri=s.indexOf("Gòn");// trả về vị trí đầu tiên xuất hiện của "gòn"
			System.out.println("Vị trí đầu tiên của gòn "+vitri);
			int vitri2=s.lastIndexOf("Gòn");
			System.out.println("Vị trí cuối cùng của gòn "+vitri2);
			
			//Hàm tách chuỗi => gặp nhiều nhất
			// muốn tách được bắt buộc chuỗi phải có cấu trúc
			//=> quy luật giống nhau cho mọi chuổi đầu vào
			String s2="K184060741;Hồ Thị Tố Nhi; nhihtt18406@st.uel.edu.vn";
			String[] arr=s2.split(";");
			
			for(int i=0; i<arr.length;i++) 
			{
				String str= arr[i];//gọi là index
				System.out.println(str);
			}
			//nối chuỗi
			// java giống C# , có 2 cách chính
			//Cách 1: dùng dấu + để nối chuỗi=> cách sai lầm nhất khi chúng ta phải xử lý liên tục và  nhiếu, chỉ phù hợp khi ta nối một vài chuỗi
			//cách 2: dùng đối tượng StringBuilder=> phù hợp cho mọi TH nhưng phức tạp
			//khi nối ít dùng cách 1
			//khi đọc dữ liệu từ trên mạng về hoặc tải dữ liệu từ file cấm dùng dấu +
			//vì mỗi lần dùng 1 dấu + thì hệ điều hàng cấp phát 1 ô nhớ đễ lueu chuỗi mới
			//điều này làm phần mềm chạy cực kì chậm
			
			String s3= "Hồ Thị Tố";
			String s4="Nhi";
			String s5= s3+" "+ s4;
			System.out.println(s5);
			//Minh họa về dùng String Builder
			StringBuilder builder= new StringBuilder();
			for(int i=0; i<1000; i++) 
			{
				builder.append("i=");
				builder.append(i);
				builder.append("\n");
				
			}
			System.out.println(builder.toString());
			
			//Một số hàm trích lọc chuỗi quan trọng
			//giả sử có chuỗi 
			String path="D:/nhac/damma/doithong2mo.mp3";
			int viTriXetCuoiXung=path.lastIndexOf("/");
			String tenBaiHatCoMoRong=path.substring(viTriXetCuoiXung+1);
			System.out.println(tenBaiHatCoMoRong);
			int viTriChamCuoiCung=tenBaiHatCoMoRong.lastIndexOf(".");
			System.out.println(viTriChamCuoiCung);
			String tenBaiHatKhongMoRong=tenBaiHatCoMoRong.substring(0, viTriChamCuoiCung);
			System.out.println(tenBaiHatKhongMoRong);

			String ten ="  nguyễn   Thị Nở   ";
			String tenMoi =toiUuChuoi(ten);
			System.out.println(ten+"có "+ten.length()+" ký tự");
			System.out.println(tenMoi+" có "+tenMoi.length()+" ký tự");
	}
	/**
	 * hàm này để tối ưu chuỗi danh từ
	 * khi người dùng nhập một tên bất kỳ, người dùng phải
	 * 1.xóa khoảng trắng dư thừa bên trái hoặc pahir chuỗi
	 * khoảng cách các từ chỉ có 1 khoảng trắng
	 * chữ đầu của từ phải viết hoa
	 * n
	 * @param s
	 * @return
	 */
	static String toiUuChuoi(String s) 
	{
		//xóa khoảng trắng dư thừa bên trái và phải
		s=s.trim();
		//loại bỏ các khoảng trắng dư thừa ở giữa các từ
		String []arrWord= s.split(" ");
		s="";
		for(int i=0; i<arrWord.length;i++) {
			String word =arrWord[i];
			if(word.length()>0) 
			{
				String newWord=word.toLowerCase();
				char[]arrKt= newWord.toCharArray();
				arrKt[0]=Character.toUpperCase(arrKt[0]);
				newWord = new String (arrKt);
				s+=newWord+" ";
				
			}
		}
		return s.trim();
	}
	

}
