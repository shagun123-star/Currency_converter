package apnaproject;
import java.util.*;
import java.text.DecimalFormat;



public class Currency_converter  {
	public Currency_converter() {
	
	
	}
	public static void main(String[] args) {
		new Currency_converter();
		double rupee ,usDollar,pound,euro,kwd,australianDollar, yen,swissfranc,yuan,riyal,hongkongDollar;
		DecimalFormat f= new DecimalFormat("##.###");
		Scanner sc = new Scanner(System.in);
		System.out.println("**Welcome to the currency converter project ***\n Enter the currency you wants to convert : \n 1:rupee \n 2:Dollar \n 3:Pound \n 4:Euro \n 5:Kuwait Dinnar \n 6:Australian Dollar \n 7:Japanese Yen \n 8:SwissFranc \n 9:Chinese Yuan \n 10:Saudi riyal \n 11: Hong kong dollar");
		int	country_number =sc.nextInt();



		switch(country_number) {
		case 1:


			System.out.println("Enter the country currency you wants to convert in : \n 1:Dollar \n 2:Pound \n 3:Kwd \n 4:Euro \n 5::Australian Dollar \n 6:Japanese yen \n 7:Swiss Franc \n 8:Chinese yuan \n 9:Saudi riyal \n 10:Hongkong dollar");
			int countryToConvert =sc.nextInt();

			System.out.println("Enter amount in rupee: ");

			rupee =sc.nextDouble();
			if(countryToConvert==1) {
				usDollar = rupee/82.888;	  
				System.out.println("Dollar: "+f.format(usDollar));
			}
			else if(countryToConvert==2) {
				pound=rupee / 105.53;
				System.out.println("Pound: "+f.format(pound));
			}
			else if(countryToConvert==3) {
				kwd=rupee/269.6176;
				System.out.println("Kuwaiti dinnar :"+f.format(kwd));

			}
			else if(countryToConvert==4) {
				euro = rupee /90.31;
				System.out.println("Euro: "+f.format(euro));
			}
			else if(countryToConvert==5) {
				australianDollar=rupee /54.40005711;
				System.out.println("Australian Dollar"+f.format(australianDollar));
			}

			else if(countryToConvert==6) {
				yen=rupee/1.79831142;
				System.out.println("Japanese yen: "+f.format(yen));
			}

			else if(countryToConvert==7) {
				swissfranc=rupee/93.71;
				System.out.println("Swiss Franc: "+f.format(swissfranc));  
			}
			else if(countryToConvert==8) {
				yuan =rupee/11.79;
				System.out.println("Chinese yuan: "+f.format(yuan));
			}
			else if(countryToConvert==9) {
				riyal=rupee/22.10;
				System.out.println("Saud riyal: "+f.format(riyal));
			}
			else if(countryToConvert==10) {
				hongkongDollar=rupee/10.60;
				System.out.println("Hong kong Dollar:"+f.format(hongkongDollar));
			}
			else {
				System.out.println("Envalid currency number");
			}

			break;
		case 2:


			System.out.println("Enter the country currency you wants to convert in : \n 1:Rupee \n 2:Pound \n 3:Kwd \n 4:Euro \n 5::Australian Dollar \n 6:Japanese yen \n 7:Swiss Franc \n 8:Chinese yuan \n 9:Saudi riyal \n 10:Hongkong dollar");
			countryToConvert =sc.nextInt();
			System.out.println("Enter the amount in Dollar:");
			usDollar=sc.nextDouble();
			if(countryToConvert==1) {
				rupee=usDollar/0.012;
				System.out.println("Indian rupee: "+f.format(rupee));
			}
			else if(countryToConvert==2) {
				pound=usDollar / 1.27;
				System.out.println("Pound: "+f.format(pound));
			}
			else if(countryToConvert==3) {
				kwd=usDollar/3.26;
				System.out.println("Kuwaiti dinnar :"+f.format(kwd));

			}
			else if(countryToConvert==4) {
				euro = usDollar/1.09;
				System.out.println("Euro: "+f.format(euro));
			}
			else if(countryToConvert==5) {
				australianDollar=usDollar/0.66;
				System.out.println("Australian Dollar"+f.format(australianDollar));
			}

			else if(countryToConvert==6) {
				yen=usDollar/0.0067;
				System.out.println("Japanese yen: "+f.format(yen));
			}

			else if(countryToConvert==7) {
				swissfranc=usDollar/1.13;
				System.out.println("Swiss Franc: "+f.format(swissfranc));  
			}
			else if(countryToConvert==8) {
				yuan =usDollar/0.14;
				System.out.println("Chinese yuan: "+f.format(yuan));
			}
			else if(countryToConvert==9) {
				riyal=usDollar/3.75;
				System.out.println("Saud riyal: "+f.format(riyal));
			}
			else if(countryToConvert==10) {
				hongkongDollar=usDollar/7.82;
				System.out.println("Hong kong Dollar:"+f.format(hongkongDollar));
			}
			else {
				System.out.println("Envalid currency number");
			}
			break;

		case 3:
			System.out.println("Enter the country currency you wants to convert in : \n 1:Rupee \n 2:Dollar \n 3:Kwd \n 4:Euro \n 5::Australian Dollar \n 6:Japanese yen \n 7:Swiss Franc \n 8:Chinese yuan \n 9:Saudi riyal \n 10:Hongkong dollar");
			countryToConvert =sc.nextInt();
			System.out.println("Enter the amount in Pounds:");
			pound=sc.nextDouble();


			if(countryToConvert==1) {
				rupee=pound/0.0095;
				System.out.println("Indian rupee: "+f.format(rupee));
			}
			else if(countryToConvert==2) {
				usDollar=pound/ 0.79;
				System.out.println("Us Dollar: "+f.format(usDollar));
			}
			else if(countryToConvert==3) {
				kwd=pound/2.56;
				System.out.println("Kuwaiti dinnar :"+f.format(kwd));

			}
			else if(countryToConvert==4) {
				euro = pound/0.86;
				System.out.println("Euro: "+f.format(euro));
			}
			else if(countryToConvert==5) {
				australianDollar=pound/0.52;
				System.out.println("Australian Dollar"+f.format(australianDollar));
			}

			else if(countryToConvert==6) {
				yen=pound/0.0053;
				System.out.println("Japanese yen: "+f.format(yen));
			}

			else if(countryToConvert==7) {
				swissfranc=pound/0.89;
				System.out.println("Swiss Franc: "+f.format(swissfranc));  
			}
			else if(countryToConvert==8) {
				yuan =pound/0.11;
				System.out.println("Chinese yuan: "+f.format(yuan));
			}
			else if(countryToConvert==9) {
				riyal=pound/0.21;
				System.out.println("Saud riyal: "+f.format(riyal));
			}
			else if(countryToConvert==10) {
				hongkongDollar=pound/0.10;
				System.out.println("Hong kong Dollar:"+f.format(hongkongDollar));
			}
			else {
				System.out.println("Envalid currency number");
			}
			break;


		case 4:
			System.out.println("Enter the country currency you wants to convert in : \n 1:Rupee \n 2:Dollar \n 3:Kwd \n 4:Pounds \n 5::Australian Dollar \n 6:Japanese yen \n 7:Swiss Franc \n 8:Chinese yuan \n 9:Saudi riyal \n 10:Hongkong dollar");
			countryToConvert =sc.nextInt();
			System.out.println("Enter the amount in Euro:");
			euro=sc.nextDouble();


			if(countryToConvert==1) {
				rupee=euro/0.011;
				System.out.println("Indian rupee: "+f.format(rupee));
			}
			else if(countryToConvert==2) {
				usDollar=euro/ 0.92;
				System.out.println("Us Dollar: "+f.format(usDollar));
			}
			else if(countryToConvert==3) {
				kwd=euro/2.99;
				System.out.println("Kuwaiti dinnar :"+f.format(kwd));

			}
			else if(countryToConvert==4) {
				pound = euro/1.17;
				System.out.println("Pounds: "+f.format(pound));
			}
			else if(countryToConvert==5) {
				australianDollar=euro/0.60;
				System.out.println("Australian Dollar"+f.format(australianDollar));
			}

			else if(countryToConvert==6) {
				yen=euro/0.0062;
				System.out.println("Japanese yen: "+f.format(yen));
			}

			else if(countryToConvert==7) {
				swissfranc=euro/1.02;
				System.out.println("Swiss Franc: "+f.format(swissfranc));  
			}
			else if(countryToConvert==8) {
				yuan =euro/0.13;
				System.out.println("Chinese yuan: "+f.format(yuan));
			}
			else if(countryToConvert==9) {
				riyal=euro/0.24;
				System.out.println("Saud riyal: "+f.format(riyal));
			}
			else if(countryToConvert==10) {
				hongkongDollar=euro/0.117308;
				System.out.println("Hong kong Dollar:"+f.format(hongkongDollar));
			}
			else {
				System.out.println("Envalid currency number");
			}
			break;
		case 5:
			System.out.println("Enter the country currency you wants to convert in : \n 1:Rupee \n 2:Dollar \n 3:Euro \n 4:Pounds \n 5::Australian Dollar \n 6:Japanese yen \n 7:Swiss Franc \n 8:Chinese yuan \n 9:Saudi riyal \n 10:Hongkong dollar");

			countryToConvert =sc.nextInt();
			System.out.println("Enter the amount in Kuwait dinnar:");
			kwd=sc.nextDouble();

			if(countryToConvert==1) {
				rupee=kwd/0.0037;
				System.out.println("Indian rupee: "+f.format(rupee));
			}
			else if(countryToConvert==2) {
				usDollar=kwd/ 0.31;
				System.out.println("Us Dollar: "+f.format(usDollar));
			}
			else if(countryToConvert==3) {
				euro=kwd/0.33;
				System.out.println("Euro :"+f.format(euro));

			}
			else if(countryToConvert==4) {
				pound = kwd/0.39;
				System.out.println("Pounds: "+f.format(pound));
			}
			else if(countryToConvert==5) {
				australianDollar=kwd/0.20;
				System.out.println("Australian Dollar"+f.format(australianDollar));
			}

			else if(countryToConvert==6) {
				yen=kwd/0.0021;
				System.out.println("Japanese yen: "+f.format(yen));
			}

			else if(countryToConvert==7) {
				swissfranc=kwd/0.35;
				System.out.println("Swiss Franc: "+f.format(swissfranc));  
			}
			else if(countryToConvert==8) {
				yuan =kwd/0.043;
				System.out.println("Chinese yuan: "+f.format(yuan));
			}
			else if(countryToConvert==9) {
				riyal=kwd/0.082;
				System.out.println("Saud riyal: "+f.format(riyal));
			}
			else if(countryToConvert==10) {
				hongkongDollar=kwd/0.039;
				System.out.println("Hong kong Dollar:"+f.format(hongkongDollar));
			}
			else {
				System.out.println("Envalid currency number");
			}
			break;
		case 6:
			System.out.println("Enter the country currency you wants to convert in : \n 1:Rupee \n 2:Dollar \n 3:Euro \n 4:Pounds \n 5:Kuwait Dinnar \n 6:Japanese yen \n 7:Swiss Franc \n 8:Chinese yuan \n 9:Saudi riyal \n 10:Hongkong dollar");

			countryToConvert =sc.nextInt();
			System.out.println("Enter the amount in Australian Dollar:");
			australianDollar=sc.nextDouble();

			if(countryToConvert==1) {
				rupee= australianDollar/0.018;
				System.out.println("Indian rupee: "+f.format(rupee));
			}
			else if(countryToConvert==2) {
				usDollar= australianDollar/ 1.52;
				System.out.println("Us Dollar: "+f.format(usDollar));
			}
			else if(countryToConvert==3) {
				euro= australianDollar/1.66;
				System.out.println("Euro :"+f.format(euro));

			}
			else if(countryToConvert==4) {
				pound =  australianDollar/1.94;
				System.out.println("Pound: "+f.format(pound));
			}
			else if(countryToConvert==5) {
				kwd= australianDollar/4.96;
				System.out.println("kuwait dinnar: "+f.format(kwd));
			}

			else if(countryToConvert==6) {
				yen= australianDollar/0.010;
				System.out.println("Japanese yen: "+f.format(yen));
			}

			else if(countryToConvert==7) {
				swissfranc= australianDollar/1.72;
				System.out.println("Swiss Franc: "+f.format(swissfranc));  
			}
			else if(countryToConvert==8) {
				yuan = australianDollar/0.21;
				System.out.println("Chinese yuan: "+f.format(yuan));
			}
			else if(countryToConvert==9) {
				riyal= australianDollar/0.41;
				System.out.println("Saud riyal: "+f.format(riyal));
			}
			else if(countryToConvert==10) {
				hongkongDollar= australianDollar/0.20;
				System.out.println("Hong kong Dollar:"+f.format(hongkongDollar));
			}
			else {
				System.out.println("Envalid currency number");
			}
			break;
		case 7:

			System.out.println("Enter the country currency you wants to convert in : \n 1:Rupee \n 2:Dollar \n 3:Euro \n 4:Pounds \n 5:Kuwait Dinar \n 6:Australian Dollar \n 7:Swiss Franc \n 8:Chinese yuan \n 9:Saudi riyal \n 10:Hongkong dollar");

			countryToConvert =sc.nextInt();
			System.out.println("Enter the amount in Japanese Yen:");
			yen=sc.nextDouble();

			if(countryToConvert==1) {
				rupee= yen/1.80;
				System.out.println("Indian rupee: "+f.format(rupee));
			}
			else if(countryToConvert==2) {
				usDollar= yen/ 149.17;
				System.out.println("Us Dollar: "+f.format(usDollar));
			}
			else if(countryToConvert==3) {
				euro= yen/162.15;
				System.out.println("Euro :"+f.format(euro));

			}
			else if(countryToConvert==4) {
				pound =  yen/189.75;
				System.out.println("Pound: "+f.format(pound));
			}
			else if(countryToConvert==5) {
				kwd= yen/485.34;
				System.out.println("kuwait dinnar: "+f.format(kwd));
			}

			else if(countryToConvert==6) {
				australianDollar= yen/97.76;
				System.out.println("Australian Dollar: "+f.format(australianDollar));
			}

			else if(countryToConvert==7) {
				swissfranc= yen/168.24;
				System.out.println("Swiss Franc: "+f.format(swissfranc));  
			}
			else if(countryToConvert==8) {
				yuan = yen/20.72;
				System.out.println("Chinese yuan: "+f.format(yuan));
			}
			else if(countryToConvert==9) {
				riyal= yen/39.77;
				System.out.println("Saud riyal: "+f.format(riyal));
			}
			else if(countryToConvert==10) {
				hongkongDollar= yen/19.08;
				System.out.println("Hong kong Dollar:"+f.format(hongkongDollar));
			}
			else {
				System.out.println("Envalid currency number");
			}
			break;
		case 8:
			System.out.println("Enter the country currency you wants to convert in : \n 1:Rupee \n 2:Dollar \n 3:Euro \n 4:Pounds \n 5:Kuwait Dinar \n 6:Australian Dollar \n 7:yen \n 8:Chinese yuan \n 9:Saudi riyal \n 10:Hongkong dollar");

			countryToConvert =sc.nextInt();
			System.out.println("Enter the amount in Swiss Franc:");
			swissfranc=sc.nextDouble();


			if(countryToConvert==1) {
				rupee= swissfranc/0.011;
				System.out.println("Indian rupee: "+f.format(rupee));
			}
			else if(countryToConvert==2) {
				usDollar= swissfranc/ 0.89;
				System.out.println("Us Dollar: "+f.format(usDollar));
			}
			else if(countryToConvert==3) {
				euro= swissfranc/0.97;
				System.out.println("Euro :"+f.format(euro));

			}
			else if(countryToConvert==4) {
				pound =  swissfranc/1.13;
				System.out.println("Pound: "+f.format(pound));
			}
			else if(countryToConvert==5) {
				kwd= swissfranc/2.89;
				System.out.println("kuwait dinnar: "+f.format(kwd));
			}

			else if(countryToConvert==6) {
				australianDollar= swissfranc/0.58;
				System.out.println("Australian Dollar: "+f.format(australianDollar));
			}

			else if(countryToConvert==7) {
				yen= swissfranc/0.0059;
				System.out.println("Japanese Yen: "+f.format(yen));  
			}
			else if(countryToConvert==8) {
				yuan = swissfranc/0.12;
				System.out.println("Chinese yuan: "+f.format(yuan));
			}
			else if(countryToConvert==9) {
				riyal= swissfranc/0.24;
				System.out.println("Saud riyal: "+f.format(riyal));
			}
			else if(countryToConvert==10) {
				hongkongDollar= swissfranc/0.11;
				System.out.println("Hong kong Dollar:"+f.format(hongkongDollar));
			}
			else {
				System.out.println("Envalid currency number");
			}
			break;

		case 9:
			System.out.println("Enter the country currency you wants to convert in : \n 1:Rupee \n 2:Dollar \n 3:Euro \n 4:Pounds \n 5:Kuwait Dinar \n 6:Australian Dollar \n 7:yen \n 8:Swiss Franc \n 9:Saudi riyal \n 10:Hongkong dollar");

			countryToConvert =sc.nextInt();
			System.out.println("Enter the amount in Chinese yuan:");
			yuan=sc.nextDouble();

			if(countryToConvert==1) {
				rupee= yuan/0.087;
				System.out.println("Indian rupee: "+f.format(rupee));
			}
			else if(countryToConvert==2) {
				usDollar= yuan/ 7.20;
				System.out.println("Us Dollar: "+f.format(usDollar));
			}
			else if(countryToConvert==3) {
				euro= yuan/7.82;
				System.out.println("Euro :"+f.format(euro));

			}
			else if(countryToConvert==4) {
				pound =  yuan/9.01;
				System.out.println("Pound: "+f.format(pound));
			}
			else if(countryToConvert==5) {
				kwd= yuan/23.41;
				System.out.println("kuwait dinnar: "+f.format(kwd));
			}

			else if(countryToConvert==6) {
				australianDollar= yuan/4.69;
				System.out.println("Australian Dollar: "+f.format(australianDollar));
			}

			else if(countryToConvert==7) {
				yen= yuan/0.047;
				System.out.println("Japanese Yen: "+f.format(yen));  
			}
			else if(countryToConvert==8) {
				swissfranc = yuan/7.99;
				System.out.println("Swiss Franc: "+f.format(swissfranc));
			}
			else if(countryToConvert==9) {
				riyal= yuan/1.92;
				System.out.println("Saud riyal: "+f.format(riyal));
			}
			else if(countryToConvert==10) {
				hongkongDollar= yuan/0.92;
				System.out.println("Hong kong Dollar:"+f.format(hongkongDollar));
			}
			else {
				System.out.println("Envalid currency number");
			}
			break;

		case 10:
			System.out.println("Enter the country currency you wants to convert in : \n 1:Rupee \n 2:Dollar \n 3:Euro \n 4:Pounds \n 5:Kuwait Dinar \n 6:Australian Dollar \n 7:yen \n 8:Swiss Franc \n 9:Chinese yuan \n 10:Hongkong dollar");

			countryToConvert =sc.nextInt();
			System.out.println("Enter the amount in Saudi Riyal:");
			riyal=sc.nextDouble();

			if(countryToConvert==1) {
				rupee= riyal/0.045;
				System.out.println("Indian rupee: "+f.format(rupee));
			}
			else if(countryToConvert==2) {
				usDollar= riyal/ 3.75;
				System.out.println("Us Dollar: "+f.format(usDollar));
			}
			else if(countryToConvert==3) {
				euro= riyal/4.07;
				System.out.println("Euro :"+f.format(euro));

			}
			else if(countryToConvert==4) {
				pound =  riyal/4.77;
				System.out.println("Pound: "+f.format(pound));
			}
			else if(countryToConvert==5) {
				kwd= riyal/12.20;
				System.out.println("kuwait dinnar: "+f.format(kwd));
			}

			else if(countryToConvert==6) {
				australianDollar= riyal/2.45;
				System.out.println("Australian Dollar: "+f.format(australianDollar));
			}

			else if(countryToConvert==7) {
				yen= riyal/0.025;
				System.out.println("Japanese Yen: "+f.format(yen));  
			}
			else if(countryToConvert==8) {
				swissfranc = riyal/4.22;
				System.out.println("Swiss Franc: "+f.format(swissfranc));
			}
			else if(countryToConvert==9) {
				yuan= riyal/0.52;
				System.out.println("Chinese yuan: "+f.format(yuan));
			}
			else if(countryToConvert==10) {
				hongkongDollar= riyal/0.48;
				System.out.println("Hong kong Dollar:"+f.format(hongkongDollar));
			}
			else {
				System.out.println("Envalid currency number");
			}
			break;

		case 11:

			System.out.println("Enter the country currency you wants to convert in : \n 1:Rupee \n 2:Dollar \n 3:Euro \n 4:Pounds \n 5:Kuwait Dinar \n 6:Australian Dollar \n 7:yen \n 8:Swiss Franc \n 9:Chinese yuan \n 10:Saudi Riyal");

			countryToConvert =sc.nextInt();
			System.out.println("Enter the amount in Hongkong Dollar: ");
			hongkongDollar =sc.nextDouble();

			if(countryToConvert==1) {
				rupee= hongkongDollar/0.094;
				System.out.println("Indian rupee: "+f.format(rupee));
			}
			else if(countryToConvert==2) {
				usDollar= hongkongDollar/ 7.82;
				System.out.println("Us Dollar: "+f.format(usDollar));
			}
			else if(countryToConvert==3) {
				euro= hongkongDollar/8.50;
				System.out.println("Euro :"+f.format(euro));

			}
			else if(countryToConvert==4) {
				pound =  hongkongDollar/9.94;
				System.out.println("Pound: "+f.format(pound));
			}
			else if(countryToConvert==5) {
				kwd= hongkongDollar/25.44;
				System.out.println("kuwait dinnar: "+f.format(kwd));
			}

			else if(countryToConvert==6) {
				australianDollar= hongkongDollar/5.10;
				System.out.println("Australian Dollar: "+f.format(australianDollar));
			}

			else if(countryToConvert==7) {
				yen= hongkongDollar/0.052;
				System.out.println("Japanese Yen: "+f.format(yen));  
			}
			else if(countryToConvert==8) {
				swissfranc = hongkongDollar/8.80;
				System.out.println("Swiss Franc: "+f.format(swissfranc));
			}
			else if(countryToConvert==9) {
				yuan= hongkongDollar/1.09;
				System.out.println("Chinese yuan: "+f.format(yuan));
			}
			else if(countryToConvert==10) {
				riyal= hongkongDollar/2.09;
				System.out.println("Saudi riyal: "+f.format(riyal));
			}
			else {
				System.out.println("Envalid currency number");
			}
			break;

		default:
			System.out.println("This type of currency is not present in the system");
			System.exit(0);
		}






	}
}








