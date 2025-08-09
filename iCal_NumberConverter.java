import java.util.*;
class iCal_NumberConverter{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int op = 0;
		do{
			System.out.println("					 __   ______             __");
			System.out.println("					|  \\ /      \\           |  \\");
			System.out.println("					 \\$$|  $$$$$$\\  ______  | $$  ______");
			System.out.println("					|  \\| $$   \\$$ |      \\ | $$ /      \\");
			System.out.println("					| $$| $$        \\$$$$$$\\| $$|  $$$$$$$");
			System.out.println("					| $$| $$   __  /      $$| $$| $$");
			System.out.println("					| $$| $$__/  \\|  $$$$$$$| $$| $$_____");
			System.out.println("					| $$ \\$$    $$ \\$$    $$| $$ \\$$     \\");
			System.out.println("					 \\$$  \\$$$$$$  \\$$$$$$$  \\$$  \\$$$$$$$");
			System.out.println();
			System.out.println(" _   _                       _                       _____                                         _");
			System.out.println("| \\ | |                     | |                     / ____|                                       | |");
			System.out.println("|  \\| |  _   _   _ __ ___   | |__     ___   _ __   | |        ___    _ __   __    __  ___   _ __  | |_   ___   _ __");
			System.out.println("| . ` | | | | | | `_ ` _ \\  | '_ \\   / _ \\ | '__|  | |       / _ \\  | '_ \\  \\ \\  / / / _ \\ | '__| | __| / _ \\ | '__|");
			System.out.println("| |\\  | | |_| | | | | | | | | |_) | |  __/ | |     | |____  | (_) | | | | |  \\ \\/ / |  __/ | |    | |_ |  __/ | |  ");
			System.out.println("|_| \\_|  \\__,_| |_| |_| |_| |_.__/   \\___| |_|      \\_____|  \\___/  |_| |_|   \\__/   \\___| |_|     \\__| \\___| |_|\n");
			System.out.println("==================================================================================================================\n\n");
			
			System.out.println("\t[01] Decimal Converter\n");
			System.out.println("\t[02] Binary Converter\n");
			System.out.println("\t[03] Octal Converter\n");
			System.out.println("\t[04] Hexadecimal Converter\n");
			System.out.println("\t[05] Roman Number Converter\n");
			System.out.println("\t[06] Exit\n");
			
			System.out.print("Enter Option -> ");
			op = input.nextInt();
		
			switch(op){
				case 1:
					System.out.println("+-----------------------------------------------+");
					System.out.println("|		Decimal Converter		|");
					System.out.println("+-----------------------------------------------+\n");
					
					int dec_num = 0;
					int dec_num2 = 0;
					int dec_num3 = 0;
					int dec_num4 = 0;
					boolean process = false;
					String op2 = "";
					String op3 = "";
					
					while(true){
						System.out.print("\nEnter an Decimal number	: ");
						dec_num = input.nextInt();
						
						dec_num2 = dec_num;
						dec_num3 = dec_num;
						dec_num4 = dec_num;
						
						while(dec_num!=0){
							int digit = dec_num%10;
							if(digit>=0&&digit<=9){
								process=true;
							}
							dec_num/=10;
						}
						
						
						if(dec_num2>0&&process==true){
							String binary = "";
							String binary2 = "";
							String octal = "";
							String octal2 = "";
							String hexa = "";
							String hexa2 = "";
							while(dec_num2!=0){
								binary+=dec_num2%2;
								dec_num2/=2;
							}
							for(int i=(binary.length()-1);i>=0;i--){
								binary2+=binary.charAt(i);
							}
							System.out.println("\n\tBinary number		: "+binary2);
							
							while(dec_num3!=0){
								octal+=dec_num3%8;
								dec_num3/=8;
							}
							for(int i=(octal.length()-1);i>=0;i--){
								octal2+=octal.charAt(i);
							}
							System.out.println("\tOctal number		: "+octal2);
							
							while(dec_num4!=0){
								int remainder=dec_num4%16;
								String str = ""+remainder;
								switch(str){
									case "10":
										str="A";
										break;
									case "11":
										str="B";
										break;
									case "12":
										str="C";
										break;
									case "13":
										str="D";
										break;
									case "14":
										str="E";
										break;
									case "15":
										str="F";
										break;
								}
								hexa+=str;
								dec_num4/=16;
							}
							for(int i=(hexa.length()-1);i>=0;i--){
								hexa2+=hexa.charAt(i);
							}
							System.out.println("\tHexadecimal number	: "+hexa2+"\n");
							
							System.out.println("Do you want to go to homepage (Y/N)-> ");
							op2 = input.next();
							if(op2.equals("Y")||op2.equals("y")){
								break;
							}
						}
						else{
							System.out.println("Invalid input!! Enter a valid number\n");
							System.out.println("Do you want input number again (Y/N) -> ");
							op3 = input.next();
							if(op3.equals("N")||op3.equals("n")){
								break;
							}
						}
						
					}
					break;
				case 2:
					System.out.println("+-----------------------------------------------+");
					System.out.println("|		Binary Converter		|");
					System.out.println("+-----------------------------------------------+\n");
					
					String bin_num = "";
					String bin_num2 = "";
					String bin_num3 = "";
					String bin_num4 = "";
					int count5 = 0;
					int count6 = 0;
					
					while(true){
						count5=0;
						count6=0;
						
						System.out.print("\nEnter an Binary number: ");
						bin_num = input.next();
						
						bin_num2 = bin_num;
						bin_num3 = bin_num;
						bin_num4 = bin_num;
						
						for(int i=0;i<=(bin_num.length()-1);i++){
							char digit2 = bin_num.charAt(i);
							if(digit2=='0'||digit2=='1'){
								count5++;
							}
							count6++;
						}
						
						if(count5==count6){
							int decimal = 0;
							int times = 0;
							String octal = "";
							String octal2 = "";
							String hexa = "";
							String hexa2 = "";
							
							for(int i=(bin_num2.length()-1);i>=0;i--){
								char num1 = bin_num2.charAt(i);
								int num2 = 0;
								if(num1=='1'){
									num2=1;
								}
								else{
									num2=0;
								}
								decimal+=(num2*(int)Math.pow(2,times));
								times++;
							}
							System.out.println("\n\tDecimal number		: "+decimal);
							
							int decimal2 = decimal;
							
							while(decimal!=0){
								octal+=(decimal%8);
								decimal/=8;
							}
							for(int i=(octal.length()-1);i>=0;i--){
								octal2+=octal.charAt(i);
							}
							
							System.out.println("\tOctal number		: "+octal2);
							
							while(decimal2!=0){
								int remainder=decimal2%16;
								String str = ""+remainder;
								switch(str){
									case "10":
										str="A";
										break;
									case "11":
										str="B";
										break;
									case "12":
										str="C";
										break;
									case "13":
										str="D";
										break;
									case "14":
										str="E";
										break;
									case "15":
										str="F";
										break;
								}
								hexa+=str;
								decimal2/=16;
							}
							for(int i=(hexa.length()-1);i>=0;i--){
								hexa2+=hexa.charAt(i);
							}
							
							System.out.println("\tHexadecimal number	: "+hexa2);
							
							System.out.println("\nDo you want to go to homepage (Y/N)-> ");
							op2 = input.next();
							if(op2.equals("Y")||op2.equals("y")){
								break;
							}
						}
						else{
							System.out.println("Invalid input!! Enter a valid number\n");
							System.out.println("Do you want input number again (Y/N) -> ");
							op3 = input.next();
							if(op3.equals("N")||op3.equals("n")){
								break;
							}
						}
						
					}
					
					break;
				case 3:
					System.out.println("+-----------------------------------------------+");
					System.out.println("|		 Octal Converter		|");
					System.out.println("+-----------------------------------------------+");
					
					int oct_num = 0;
					
					while(true){
						System.out.print("\nEnter an Octal number: ");
						oct_num = input.nextInt();
						
						int oct_num2 = oct_num;
						int oct_num3 = oct_num;
						int oct_num4 = oct_num;
						int decimal = 0;
						String binary = "";
						String binary2 = "";
						String hexa = "";
						String hexa2 = "";
						int count = 0;
						int count2 = 0;
						int count3 = 0;
						
						while(oct_num!=0){
							int digit=oct_num%10;
							if(digit>=0&&digit<=7){
								count++;
							}
							oct_num/=10;
							count2++;
						}
						
						if(oct_num2>0&&count==count2){
							while(oct_num2!=0){
								decimal+=((oct_num2%10)*Math.pow(8,count3));
								oct_num2/=10;
								count3++;
							}
							System.out.println("\n\tDecimal number		: "+decimal);
							
							int decimal2 = decimal;
							
							while(decimal!=0){
								binary+=decimal%2;
								decimal/=2;
							}
							for(int i=(binary.length()-1);i>=0;i--){
								binary2+=binary.charAt(i);
							}
							System.out.println("\tBinary number		: "+binary2);
							
							while(decimal2!=0){
								int remainder=decimal2%16;
								String str = ""+remainder;
								switch(str){
									case "10":
										str="A";
										break;
									case "11":
										str="B";
										break;
									case "12":
										str="C";
										break;
									case "13":
										str="D";
										break;
									case "14":
										str="E";
										break;
									case "15":
										str="F";
										break;
								}
								hexa+=str;
								decimal2/=16;
							}
							for(int i=(hexa.length()-1);i>=0;i--){
								hexa2+=hexa.charAt(i);
							}
							
							System.out.println("\tHexadecimal number	: "+hexa2);
							
							System.out.println("\nDo you want to go to homepage (Y/N)-> ");
							op2 = input.next();
							if(op2.equals("Y")||op2.equals("y")){
								break;
							}
						}
						else{
							System.out.println("Invalid input!! Enter a valid number\n");
							System.out.println("Do you want input number again (Y/N) -> ");
							op3 = input.next();
							if(op3.equals("N")||op3.equals("n")){
								break;
							}
						}
					}
					break;
				case 4:
					System.out.println("+-----------------------------------------------+");
					System.out.println("|		HexaDecimal Converter		|");
					System.out.println("+-----------------------------------------------+\n");
					
					String hexa = "";
					int hexanum = 0;
					boolean process3 = true;
					int count = 0;
					int count2 = 0;
					int count3 = 0;
					int num = 0;
					int decimal_num = 0;
					
					while(true){
						count=0;
						count2=0;
						count3=0;
						decimal_num=0;
						
						System.out.print("\nEnter an HexaDecimal number: ");
						hexa = input.next();
						
						for(int i=(hexa.length()-1);i>=0;i--){
							char digit=hexa.charAt(i);
							if(digit=='0'||digit=='1'||digit=='2'||digit=='3'||digit=='4'||digit=='5'||digit=='6'||digit=='7'||digit=='8'||digit=='9'||digit=='A'||digit=='B'||digit=='C'||digit=='D'||digit=='E'||digit=='F'||digit=='a'||digit=='b'||digit=='c'||digit=='d'||digit=='e'||digit=='f'){
								count++;
							}
							count2++;
						}
						
						String binary = "";
						String binary2 = "";
						String octal = "";
						String octal2 = "";
						int decimal_num2 = 0;
						
						if(count==count2){
							for(int i=(hexa.length()-1);i>=0;i--){
								char digit=hexa.charAt(i);
								switch(digit){
									case '0':
										num=0;
										break;
									case '1':
										num=1;
										break;
									case '2':
										num=2;
										break;
									case '3':
										num=3;
										break;
									case '4':
										num=4;
										break;
									case '5':
										num=5;
										break;
									case '6':
										num=6;
										break;
									case '7':
										num=7;
										break;
									case '8':
										num=8;
										break;
									case '9':
										num=9;
										break;
									case 'A':
									case 'a':
										num=10;
										break;
									case 'B':
									case 'b':
										num=11;
										break;
									case 'C':
									case 'c':
										num=12;
										break;
									case 'D':
									case 'd':
										num=13;
										break;
									case 'E':
									case 'e':
										num=14;
										break;
									case 'F':
									case 'f':
										num=15;
										break;
								}
								decimal_num+=(num*Math.pow(16,count3));
								count3++;
							}
							System.out.println("\n\tDecimal number		: "+decimal_num);
							
							decimal_num2 = decimal_num;
							
							while(decimal_num!=0){
								binary+=decimal_num%2;
								decimal_num/=2;
							}
							for(int i=(binary.length()-1);i>=0;i--){
								binary2+=binary.charAt(i);
							}
							System.out.println("\tBinary number		: "+binary2);
							
							while(decimal_num2!=0){
								octal+=decimal_num2%8;
								decimal_num2/=8;
							}
							for(int i=(octal.length()-1);i>=0;i--){
								octal2+=octal.charAt(i);
							}
							System.out.println("\tOctal number		: "+octal2);
							
							System.out.println("\nDo you want to go to homepage (Y/N)-> ");
							op2 = input.next();
							if(op2.equals("Y")||op2.equals("y")){
								break;
							}
						}
						else{
							System.out.println("Invalid input!! Enter a valid number\n");
							System.out.println("Do you want input number again (Y/N) -> ");
							op3 = input.next();
							if(op3.equals("N")||op3.equals("n")){
								break;
							}
						}
					}
					break;
				case 5:
					System.out.println("+-----------------------------------------------+");
					System.out.println("|		Roman Number Converter		|");
					System.out.println("+-----------------------------------------------+\n");
					
					System.out.println("\t[01] Decimal Number to Roman Number Converter\n");
					System.out.println("\t[02] Roman Number to Decimal Number Converter\n");
					
					System.out.print("Enter an option: ");
					int op4 = input.nextInt();
					
					switch(op4){
						case 1:
						while(true){
							System.out.print("\nEnter the Decimal number: ");
							int denum = input.nextInt();
							int denum2 = denum;
							int countt = 1;
							int countt1 = 0;
							int countt2 = 0;
							String rom = "";
							String str2 = "";
							String str4 = "";
							
							while(denum!=0){
								int digit=denum%10;
								if(digit>=0&&digit<=9){
									countt1++;
								}
								countt2++;
								denum/=10;
							}
							if(denum2>0&&denum2<=1000&&countt1==countt2){
								while(denum2!=0){
									int digit = (denum2%10*countt);
									switch(digit){
										case 1:
											rom="I";
											break;
										case 2:
											rom="II";
											break;
										case 3:
											rom="III";
											break;
										case 4:
											rom="IV";
											break;
										case 5:
											rom="V";
											break;
										case 6:
											rom="VI";
											break;
										case 7:
											rom="VII";
											break;
										case 8:
											rom="VIII";
											break;
										case 9:
											rom="IX";
											break;
										case 10:
											rom="X";
											break;
										case 20:
											rom="XX";
											break;
										case 30:
											rom="XXX";
											break;
										case 40:
											rom="XL";
											break;
										case 50:
											rom="L";
											break;
										case 60:
											rom="LX";
											break;
										case 70:
											rom="LXX";
											break;
										case 80:
											rom="LXXX";
											break;
										case 90:
											rom="XC";
											break;
										case 100:
											rom="C";
											break;
										case 200:
											rom="CC";
											break;
										case 300:
											rom="CCC";
											break;
										case 400:
											rom="CD";
											break;
										case 500:
											rom="D";
											break;
										case 600:
											rom="DC";
											break;
										case 700:
											rom="DCC";
											break;
										case 800:
											rom="DCCC";
											break;
										case 900:
											rom="CM";
											break;
										case 1000:
											rom="M";
											break;
									}
									for(int i=(rom.length()-1);i>=0;i--){
										char ch=rom.charAt(i);
										String str=Character.toString(ch);
										str2+=str;
									}
									countt*=10;
									denum2/=10;
								}
								for(int i=(str2.length()-1);i>=0;i--){
									char ch=str2.charAt(i);
									String str3=Character.toString(ch);
									str4+=str3;
								}
								
								System.out.println("\n\tRoman number: "+str4);
								
							System.out.println("\nDo you want to go to homepage (Y/N)-> ");
							op2 = input.next();
							if(op2.equals("Y")||op2.equals("y")){
								break;
							}
							}
							else{
								System.out.println("Invalid input!! Enter a valid number\n");
								System.out.println("Do you want input number again (Y/N) -> ");
								op3 = input.next();
								if(op3.equals("N")||op3.equals("n")){
									break;
								}
							}
						}
								break;
							case 2:
								System.out.print("Enter the Roman Number: ");
								String st = input.nextLine();
								
							/*	while(true){
									for(int i=0;i<=(st.length()-1);i++){
										
									}
								}*/
								break;
							default:
								System.out.println("Invalid Input!!");
						}
					break;
				case 6:
					break;
				default:
					System.out.println("Invalid Input!!");
						
			}
		}while(op!=6);
		
	}
 }
