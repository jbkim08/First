package chapter7;

public class ObjectCopy1 {

	static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[6];
		// 2개의 배열인데 안의 내용은 같음
		bookArray1[0] = new Book("태백산맥", "조정래");
		bookArray1[1] = new Book("데미안", "헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
 		System.arraycopy(bookArray1, 0, bookArray2, 3, 3);
		
		for(int i=0; i<bookArray2.length; i++){
			if(bookArray2[i] != null) {
				bookArray2[i].showBookInfo();
			} else {
				System.out.println(bookArray2[i]);
			}
		}
		
		
		
	}
}
