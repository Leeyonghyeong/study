package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Cal {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		//년도가 4의 배수이고 100의 배수가 아니거나 400배수이면 2월 29일
	
		// 서기 1년 1월 1일은 월요일입니다.

		int []month={31,28,31,30,31,30,31,31,30,31,30,31};

		int y,m,w,total;

		do{
			System.out.print("년도 ? ");

			y=Integer.parseInt(br.readLine());

		}while(y<1000);  // 1000보다 작으면 재입력



		do{

			System.out.print("월 ? ");

			m=Integer.parseInt(br.readLine());

		}while(m<1 || m>12);  // 1보다 작거나 12보다 크면 재입력



		// y년도의 2월의 마지막 날짜 계산하기

		if (y%4==0 && y%100!=0 || y%400==0) {
			month[1]=29; // 윤년
		} else {
			month[1]=28; // 평년
		}

		

		//1년 1월 1일 ~ y년 m월 1일 까지의 전체 날수

		total=(y-1)*365+(y-1)/4-(y-1)/100+(y-1)/400;  // 365*해당년-1 + 4년에 한번씩 윤년 - 100의 배수마다 평년 + 400년의 배수마다 윤년

		for(int i=0; i<m-1; i++)  {// 년을 제외한 해당년의 일수의 합
			total+=month[i]; // 전체일수 계산됨
		}
		total+=1;  // 해당 월의 1일까지 합해서 total을 만들어줌

		System.out.printf("\t\t  %d년 %d월\n",y,m);

		System.out.println("=================================================");

		System.out.println("     일    월    화    수    목    금    토"); // 공백 4칸  

		System.out.println("=================================================");


		//y년 m월 1일의 요일 구하기

		w=total%7;

		//1일 출력 전 앞의 공백처리

		for(int i=0; i<w; i++) {
			System.out.print("      ");
		}


		// 1일에서 마지막 날짜까지 날짜 찍기

		for(int i=1; i<=month[m-1]; i++) {

			System.out.printf("%6d",i);

			w++;

			if(w%7==0) {
				System.out.println();
			}

		}

		if(w%7!=0) {
			System.out.println();
		}

		System.out.println("=================================================");

	}
}
