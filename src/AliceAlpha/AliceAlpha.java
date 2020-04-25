package AliceAlpha;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class AliceAlpha {
	private int temper;// 100best
	private int time;// max=10
	private String username;
	private int birthdate;
	private int birthmonth;
	private int birthyear;
	public int i = -1;

	public String getGreeting() {
		return "Let's talk!";
	}

	public void temperPlus(int i) {
		int tem = 0;
		tem = temper + i;
		temper = tem;
	}

	public void temperMinus(int i) {
		int tem = 0;
		tem = temper - i;
		temper = tem;
	}

	public void Info() throws InterruptedException {
		// TODO Auto-generated method stub
		Calendar cl = Calendar.getInstance();
		Date dat = new Date();
		int yea = cl.get(Calendar.YEAR);
		String name = "Alice";
		int age = yea - 2004;
		int className = 1915;
		double height = 169.5;
		int date = 11;
		int month = 10;
		String school = "Yali High School";
		System.out.println("My name is " + name + ".");
		Thread.sleep(1000 * 2);
		System.out.println("I am " + age + "years old now.");
		Thread.sleep(1000 * 2);
		System.out.println("My birthday is " + month + "." + date + ".");
		Thread.sleep(1000 * 2);
		System.out.println("Now the school I am reading is " + school + ",");
		Thread.sleep(1000 * 2);
		System.out.println("class name is " + className + ".");
		Thread.sleep(1000 * 2);
		System.out.println("I am " + height + "centimeters high.");
		Thread.sleep(1000 * 1);
		System.out.println("May I get your name?");
		Scanner in = new Scanner(System.in);
		this.username = in.nextLine();
		Thread.sleep(1000 * 2);
		System.out.println("Hello " + username + ",nice to meet you.");
		Thread.sleep(1000 * 2);
		System.out.println("When is your birth day?");
		System.out.println("Enter the year month date.");
		Scanner on = new Scanner(System.in);
		this.birthyear = on.nextInt();
		Scanner kn = new Scanner(System.in);
		this.birthmonth = kn.nextInt();
		Scanner jn = new Scanner(System.in);
		this.birthdate = jn.nextInt();
		Thread.sleep(1000 * 1);
		System.out.println("So you are " + (yea - birthyear) + " years old now?");
	}

	public void timeset() throws InterruptedException {
		// TODO Auto-generated method stub
		Calendar cl = Calendar.getInstance();
		Date date = new Date();
		int sec = cl.get(Calendar.SECOND);
		int min = cl.get(Calendar.MINUTE);
		int hod = cl.get(Calendar.HOUR_OF_DAY);
		int dow = cl.get(Calendar.DAY_OF_WEEK);
		int dom = cl.get(Calendar.DAY_OF_MONTH);
		int yea = cl.get(Calendar.YEAR);
		int mon = cl.get(Calendar.MONTH);
		String response = "";
		System.out.println("Today is " + yea + "." + mon + "." + dom);
		if (dom == 11 && mon == 10) {
			System.out.println("You forget to say some thing...");
			Scanner in = new Scanner(System.in);
			String answer = in.nextLine();
			if (answer.indexOf("happy") >= 0 || answer.indexOf("Happy") >= 0 || answer.indexOf("birthday") >= 0
					|| answer.indexOf("Birthday") >= 0) {
				Thread.sleep(1000 * 2);
				System.out.println("Thank you!");
				temperPlus(30);
			}
		}
		if (dom == birthdate && mon == birthmonth) {
			System.out.println("I forget to say some thing...");
			Scanner on = new Scanner(System.in);
			String answer1 = on.nextLine();
			Thread.sleep(1000 * 1);
			System.out.println("Happy birthday, " + username + ".");
			Scanner kn = new Scanner(System.in);
			String answer2 = kn.nextLine();
		}
		int NUMBER_OF_RESPONSES = 0;
		if (temper > 100) {
			NUMBER_OF_RESPONSES = 5;
		} else if (temper > 80) {
			NUMBER_OF_RESPONSES = 4;
		} else if (temper > 60) {
			NUMBER_OF_RESPONSES = 3;
		} else if (temper > 40) {
			NUMBER_OF_RESPONSES = 2;
		} else if (temper > 20) {
			NUMBER_OF_RESPONSES = 1;
		}
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		if (dow <= 5) {
			if (hod >= 23) {
				if (whichResponse == 0) {
					response = "It is " + hod + ":" + min + ":" + sec + " now, time fo sleep, unless you are crazy. ";
				} else if (whichResponse == 1) {
					response = "It is time for sleep now. You need to have class tomorrow.";
				} else if (whichResponse == 2) {
					response = "How dare you are to play computer now?";
				} else if (whichResponse == 3) {
					response = "You should have a better sleep.";
				} else {
					response = "Are you owl?";
				}
				System.out.println(response);
			} else if (hod >= 18) {
				if (whichResponse == 0) {
					response = "Good night!";
				} else if (whichResponse == 1) {
					response = "Time for home work!";
				} else if (whichResponse == 2) {
					response = "Hello.";
				} else if (whichResponse == 3) {
					response = "How was your day?";
				} else {
					response = "It is " + hod + ":" + min + ":" + sec + " now.";
				}
				System.out.println(response);
			} else if (hod >= 12) {
				if (whichResponse == 0) {
					response = "It is " + hod + ":" + min + ":" + sec + " now.";
				} else if (whichResponse == 1) {
					response = "Good afternoon!";
				} else if (whichResponse == 2) {
					response = "How is your work?";
				} else if (whichResponse == 3) {
					response = "Have you finsh your work yet?";
				} else {
					response = "Happy to see you there.";
				}
				System.out.println(response);
			} else if (hod >= 6) {
				if (whichResponse == 0) {
					response = "It is " + hod + ":" + min + ":" + sec + " now.";
				} else if (whichResponse == 1) {
					response = "Good morning?";
				} else if (whichResponse == 2) {
					response = "Do you want to sleep?";
				} else if (whichResponse == 3) {
					response = "Coffee time!";
				} else {
					response = "Are you OK?";
				}
				System.out.println(response);
			} else {
				if (whichResponse == 0) {
					response = "I want to sleep now. please wait for a while......";
					i++;
				} else if (whichResponse == 1) {
					response = "emmm...";
					i++;
				} else if (whichResponse == 2) {
					response = "I need time to have a rest, please wait.";
					i++;
				} else if (whichResponse == 3) {
					response = "zzz";
					i++;
				} else {
					response = "Good moorrrnnnniiiiinnnnnnggggggg......";
					i++;
				}
				System.out.println(response);
			}
		} else {
			if (hod >= 23) {
				if (whichResponse == 0) {
					response = "Blow it up!";
				} else if (whichResponse == 1) {
					response = "Happy time!";
				} else if (whichResponse == 2) {
					response = "Still and silent.";
				} else if (whichResponse == 3) {
					response = "It is " + hod + ":" + min + ":" + sec + " now. time fo sleep, unless you are crazy. ";
				} else {
					response = "Healhy=sleep!";
				}
				System.out.println(response);
			} else if (hod >= 18) {
				if (whichResponse == 0) {
					response = "Have you finish your home work?";
				} else if (whichResponse == 1) {
					response = "Check To Do!";
				} else if (whichResponse == 2) {
					response = "What should we talk today?";
				} else if (whichResponse == 3) {
					response = "Nice!";
				} else {
					response = "Good night!";
				}
				System.out.println(response);
			} else if (hod >= 12) {
				if (whichResponse == 0) {
					response = "Good afternoon!";
				} else if (whichResponse == 1) {
					response = "Time for home work!";
				} else if (whichResponse == 2) {
					response = "Finish your job now!";
				} else if (whichResponse == 3) {
					response = "Now, or never!";
				} else {
					response = "Gooda!";
				}
				System.out.println(response);
			} else if (hod >= 6) {
				if (whichResponse == 0) {
					response = "Time for joy!";
				} else if (whichResponse == 1) {
					response = "Time for programming!";
				} else if (whichResponse == 2) {
					response = "Time for programming!";
				} else if (whichResponse == 3) {
					response = "Time for work!";
				} else {
					response = "Good morning!";
				}
				System.out.println(response);
			} else {
				if (whichResponse == 0) {
					response = "I want to sleep now. please wait for a while......";
					i++;
				} else if (whichResponse == 1) {
					response = "emmm...";
					i++;
				} else if (whichResponse == 2) {
					response = "I need time to have a rest, please wait.";
					i++;
				} else if (whichResponse == 3) {
					response = "zzz";
					i++;
				} else {
					response = "Good moorrrnnnniiiiinnnnnnggggggg......";
					i++;
				}
				Thread.sleep(1000 * 1);
				System.out.println(response);
			}
		}

	}

	public String getResponse(String statement) throws InterruptedException {
		String response = "";
		if (statement.indexOf("Hello") >= 0) {
			final int NUMBER_OF_RESPONSES = 5;
			double r = Math.random();
			int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
			if (whichResponse == 0) {
				response = "Hello.";
			} else if (whichResponse == 1) {
				response = "Hi.";
			} else if (whichResponse == 2) {
				response = "Glad to see you again.";
			} else if (whichResponse == 3) {
				response = "emmm.";
			} else {
				response = username + "?";
			}

			return response;
		} else if ((statement.indexOf("great") >= 0 || statement.indexOf("nice") >= 0
				|| statement.indexOf("exelent") >= 0 || statement.indexOf("clever") >= 0)
				&& (statement.indexOf("not") == 0 || statement.indexOf("don't") == 0
						|| statement.indexOf("never") == 0)) {
			response = "Yes!";
			temperPlus(10);

		} else if (statement.indexOf("Cryptography") >= 0 || statement.indexOf("Crypto") >= 0
				|| statement.indexOf("cryptography") >= 0 || statement.indexOf("cryption") >= 0
				|| statement.indexOf("cryption") >= 0) {
			Cryptography();
		} else if (statement.indexOf("Should") >= 0 || statement.indexOf("Can") >= 0 || statement.indexOf("Does") >= 0
				|| statement.indexOf("May") >= 0 || statement.indexOf("Could") >= 0|| statement.indexOf("Am") >= 0) {
			Answer();
		}

		else if (statement.indexOf("AP") >= 0 || statement.indexOf("Ap") >= 0 || statement.indexOf("ap") >= 0
				|| statement.indexOf("aP") >= 0) {
			APscoreTest();
		} else if (statement.indexOf("+") >= 0 || statement.indexOf("-") >= 0 || statement.indexOf("x") >= 0
				|| statement.indexOf("/") >= 0 || statement.indexOf("caculate") >= 0
				|| statement.indexOf("Caculate") >= 0 || statement.indexOf("÷") >= 0) {
			CalculateSystem();
		} else if (statement.indexOf("Random List") >= 0 || statement.indexOf("Random") >= 0
				|| statement.indexOf("random list") >= 0 || statement.indexOf("get random list") >= 0
				|| statement.indexOf("get random list") >= 0) {
			RandomList();
		} else if (statement.trim().length() == 0) {
			response = GRRnull();
		} else if (statement.indexOf("ConsciousCaculator") >= 0 || statement.indexOf("Sleep less") >= 0
				|| statement.indexOf("less sleep") >= 0 || statement.indexOf("bad sleep") >= 0
				|| statement.indexOf("bad sleep") >= 0) {
			ConsciousCaculator();
		} else if ((statement.compareTo("H") == 0 || statement.compareTo("He") == 0 || statement.compareTo("Li") == 0
				|| statement.compareTo("Be") == 0 || statement.compareTo("B") == 0 || statement.compareTo("C") == 0
				|| statement.compareTo("N") == 0 || statement.compareTo("O") == 0 || statement.compareTo("F") == 0
				|| statement.compareTo("Ne") == 0 || statement.compareTo("Na") == 0 || statement.compareTo("Mg") == 0
				|| statement.compareTo("Al") == 0 || statement.compareTo("Si") == 0 || statement.compareTo("P") == 0
				|| statement.compareTo("S") == 0 || statement.compareTo("Cl") == 0 || statement.compareTo("Ar") == 0
				|| statement.compareTo("K") == 0 || statement.compareTo("Ca") == 0 || statement.compareTo("Sc") == 0
				|| statement.compareTo("Ti") == 0 || statement.compareTo("V") == 0 || statement.compareTo("Cr") == 0
				|| statement.compareTo("Mn") == 0 || statement.compareTo("Fe") == 0 || statement.compareTo("Co") == 0
				|| statement.compareTo("Ni") == 0 || statement.compareTo("Cu") == 0 || statement.compareTo("Zn") == 0
				|| statement.compareTo("Ga") == 0 || statement.compareTo("Ge") == 0 || statement.compareTo("As") == 0
				|| statement.compareTo("Se") == 0 || statement.compareTo("Br") == 0 || statement.compareTo("Kr") == 0
				|| statement.compareTo("Rb") == 0 || statement.compareTo("Sr") == 0 || statement.compareTo("Y") == 0
				|| statement.compareTo("Zr") == 0 || statement.compareTo("Nb") == 0 || statement.compareTo("Mo") == 0
				|| statement.compareTo("Tc") == 0 || statement.compareTo("Ru") == 0 || statement.compareTo("Rh") == 0
				|| statement.compareTo("Pd") == 0 || statement.compareTo("Ag") == 0 || statement.compareTo("Cd") == 0
				|| statement.compareTo("In") == 0 || statement.compareTo("Sn") == 0 || statement.compareTo("Sb") == 0
				|| statement.compareTo("Te") == 0 || statement.compareTo("I") == 0 || statement.compareTo("Xe") == 0
				|| statement.compareTo("Cs") == 0 || statement.compareTo("Ba") == 0 || statement.compareTo("La") == 0
				|| statement.compareTo("Ce") == 0 || statement.compareTo("Pr") == 0 || statement.compareTo("Nd") == 0
				|| statement.compareTo("Pm") == 0 || statement.compareTo("Sm") == 0 || statement.compareTo("Eu") == 0
				|| statement.compareTo("Gd") == 0 || statement.compareTo("Tb") == 0 || statement.compareTo("Dy") == 0
				|| statement.compareTo("Ho") == 0 || statement.compareTo("Er") == 0 || statement.compareTo("Tm") == 0
				|| statement.compareTo("Yb") == 0 || statement.compareTo("Lu") == 0 || statement.compareTo("Hf") == 0
				|| statement.compareTo("Ta") == 0 || statement.compareTo("W") == 0 || statement.compareTo("Re") == 0
				|| statement.compareTo("Os") == 0 || statement.compareTo("Ir") == 0 || statement.compareTo("Pt") == 0
				|| statement.compareTo("Au") == 0 || statement.compareTo("Hg") == 0 || statement.compareTo("Ti") == 0
				|| statement.compareTo("Pb") == 0 || statement.compareTo("Bi") == 0 || statement.compareTo("Po") == 0
				|| statement.compareTo("At") == 0 || statement.compareTo("Rn") == 0 || statement.compareTo("Fr") == 0
				|| statement.compareTo("Ra") == 0 || statement.compareTo("Ac") == 0 || statement.compareTo("Th") == 0
				|| statement.compareTo("Pa") == 0 || statement.compareTo("U") == 0 || statement.compareTo("Np") == 0
				|| statement.compareTo("Pu") == 0 || statement.compareTo("Am") == 0 || statement.compareTo("Cm") == 0
				|| statement.compareTo("Bk") == 0 || statement.compareTo("Cf") == 0 || statement.compareTo("Es") == 0
				|| statement.compareTo("Fm") == 0 || statement.compareTo("Md") == 0 || statement.compareTo("No") == 0
				|| statement.compareTo("Lr") == 0 || statement.compareTo("Rf") == 0 || statement.compareTo("Db") == 0
				|| statement.compareTo("Sg") == 0 || statement.compareTo("Bh") == 0 || statement.compareTo("Hs") == 0
				|| statement.compareTo("Mt") == 0 || statement.compareTo("Ds") == 0 || statement.compareTo("Rg") == 0
				|| statement.compareTo("Cn") == 0 || statement.compareTo("Nh") == 0 || statement.compareTo("Fl") == 0
				|| statement.compareTo("Mc") == 0 || statement.compareTo("Lv") == 0
				|| statement.compareTo(" Relative Molecular mass") == 0 || statement.compareTo("Ts") == 0
				|| statement.compareTo("Relative Atom mass") == 0 || statement.compareTo("atom mass") == 0
				|| statement.compareTo("Og") == 0 || statement.compareTo("molecular mass") == 0)) {
			ChemistrySystem();
		} else {
			fix();
		}
		return response;
	}

	private void ConsciousCaculator() {
		// TODO Auto-generated method stub
		System.out.println("Please enter your sleeping time today. by the format hh mm.");
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		Scanner on = new Scanner(System.in);
		int m = on.nextInt();
		int t = h * 60 + m;
		System.out.println("You have slept for " + t + " minutes today.");
		double i = Math.PI * t;
		// System.out.println(i);
		double ins = i / 720;
		// System.out.println(ins);
		double cs = Math.cos(ins);
		// System.out.println(cs);
		double css = -100 * cs;
		String s = String.format("%.3f", css);
		System.out.println("The consious you have left is " + s + " .");
		if (css < -75) {
			System.out.println("Go back to sleep now!");
			System.out.println("You can't do anything in this circumstance.");
			System.out.println("***************************************");
			System.out.println("*            SYSTEM WARNING           *");
			System.out.println("*  ---------------------------------  *");
			System.out.println("*       CONSCIOUS LOWER THAN -75      *");
			System.out.println("***************************************");

		} else if (css < -50) {
			System.out.println("You need more sleep, at least 2 class or 1.5 hour!");
			System.out.println("***************************************");
			System.out.println("*            SYSTEM WARNING           *");
			System.out.println("*  ---------------------------------  *");
			System.out.println("*       CONSCIOUS LOWER THAN -50      *");
			System.out.println("***************************************");
		} else if (css < -30) {
			System.out.println("You need more sleep, at least 1 class or 1 hour!");
			System.out.println("Your conscious have droped to a danger level.");
			System.out.println("***************************************");
			System.out.println("*            SYSTEM WARNING           *");
			System.out.println("*  ---------------------------------  *");
			System.out.println("*       CONSCIOUS LOWER THAN -30      *");
			System.out.println("***************************************");
		} else if (css < -10) {
			System.out.println("You need more coffee to keep awake.");
		} else if (css < 0) {
			System.out.println("You need some coffee to keep awake.");
		} else if (css < 10) {
			System.out.println("Safe level");
		} else if (css < 30) {
			System.out.println("You can be identified as NORMAL in this circumstance.");
			System.out.println("Go and do something cool.");
		} else if (css < 50) {
			System.out.println("You can be identified as ADVANCED in this circumstance.");
			System.out.println("Go and do something meaningful.");
		} else if (css < 75) {
			System.out.println("You can be identified as SUPREME in this circumstance.");
			System.out.println("Read more book at this moment, you won't be regret.");
		} else if (css < 85) {
			System.out.println("Good morning, Eason!");
		}
	}

	private void RandomList() {
		// TODO Auto-generated method stub
		System.out.println("How many subjects do you have?");
		Scanner on = new Scanner(System.in);
		List org = new ArrayList();
		int sum = on.nextInt();
		for (int k = 1; k <= sum; k++) {
			org.add(k);
		}
		System.out.print("How many intagers do you need?");
		Scanner in = new Scanner(System.in);
		List list = new ArrayList();
		int length = in.nextInt() - 1;
		for (int i = 0; i < length; i++) {
			int pla = (int) (Math.random() * (sum - length));
			int p = (int) org.remove(pla);
			list.add(p);
		}
		System.out.print("Do you need some special order? Put y to add special order, n to get the answer.");
		Scanner kn = new Scanner(System.in);
		String order = kn.nextLine();
		if (order.compareTo("y") == 0) {
			System.out.println("Please tell me your special order.");
			Scanner hn = new Scanner(System.in);
			int spe = (int) hn.nextInt();
			org.remove(spe - 1);
			int plac = (int) (Math.random() * length);
			list.add(plac, spe);
		} else if (order.compareTo("n") == 0) {
			int pla = (int) (Math.random() * (sum - length));
			int p = (int) org.remove(pla);
			list.add(p);
		} else {
			System.out.println("Put y to add special order, n to get the answer, start the program again please.");
		}
		System.out.println(list);

	}

	private void Cryptography() {
		// TODO Auto-generated method stub
		List<Integer> key = new ArrayList<Integer>();
		for (int f = 0; f < 52; f++) {
			key.add(f);
		}
		key.add(52, 0);

		List<Integer> index = new ArrayList<Integer>();
		int p1 = 0;// hour
		int p2 = 0;// day of week
		int p3 = 0;// day of month
		int org = 0;
		index.add(org);// Original code
		System.out.println("Encryption or Decryption?");
		System.out.println("Encryption enter \"E\"");
		System.out.println("Decryption enter \"D\"");
		Scanner n = new Scanner(System.in);
		String sta = n.nextLine();
		if (sta.compareTo("E") == 0) {
			Calendar cl = Calendar.getInstance();
			Date date = new Date();
			p1 = cl.get(Calendar.HOUR_OF_DAY);
			p2 = cl.get(Calendar.DAY_OF_WEEK);
			p3 = cl.get(Calendar.DAY_OF_MONTH);
			System.out.print(" " + p1);// test
			System.out.print(" " + p2);// test
			System.out.print(" " + p3);// test
			int ti = p1 + p2 + p3;
			System.out.println();
			System.out.println("Enter the user name. end in 15 words,use \"Enter\" to end. ");
			int e = 15;
			while (e >= 0) {
				Scanner an = new Scanner(System.in);
				String in1 = an.nextLine();
				if (in1.compareTo("A") == 0) {
					int a = key.get(0);
					index.add(a + 1);
				} else if (in1.compareTo("a") == 0) {
					int a = key.get(1);
					index.add(a + 1);
				} else if (in1.compareTo("B") == 0) {
					int a = key.get(2);
					index.add(a + 1);
				} else if (in1.compareTo("b") == 0) {
					int a = key.get(3);
					index.add(a + 1);
				} else if (in1.compareTo("C") == 0) {
					int a = key.get(4);
					index.add(a + 1);
				} else if (in1.compareTo("c") == 0) {
					int a = key.get(5);
					index.add(a + 1);
				} else if (in1.compareTo("D") == 0) {
					int a = key.get(6);
					index.add(a + 1);
				} else if (in1.compareTo("d") == 0) {
					int a = key.get(7);
					index.add(a + 1);
				} else if (in1.compareTo("E") == 0) {
					int a = key.get(8);
					index.add(a + 1);
				} else if (in1.compareTo("e") == 0) {
					int a = key.get(9);
					index.add(a + 1);
				} else if (in1.compareTo("F") == 0) {
					int a = key.get(10);
					index.add(a + 1);
				} else if (in1.compareTo("f") == 0) {
					int a = key.get(11);
					index.add(a + 1);
				} else if (in1.compareTo("G") == 0) {
					int a = key.get(12);
					index.add(a + 1);
				} else if (in1.compareTo("g") == 0) {
					int a = key.get(13);
					index.add(a + 1);
				} else if (in1.compareTo("H") == 0) {
					int a = key.get(14);
					index.add(a + 1);
				} else if (in1.compareTo("h") == 0) {
					int a = key.get(15);
					index.add(a + 1);
				} else if (in1.compareTo("I") == 0) {
					int a = key.get(16);
					index.add(a + 1);
				} else if (in1.compareTo("i") == 0) {
					int a = key.get(17);
					index.add(a + 1);
				} else if (in1.compareTo("J") == 0) {
					int a = key.get(18);
					index.add(a + 1);
				} else if (in1.compareTo("j") == 0) {
					int a = key.get(19);
					index.add(a + 1);
				} else if (in1.compareTo("K") == 0) {
					int a = key.get(20);
					index.add(a + 1);
				} else if (in1.compareTo("k") == 0) {
					int a = key.get(21);
					index.add(a + 1);
				} else if (in1.compareTo("L") == 0) {
					int a = key.get(22);
					index.add(a + 1);
				} else if (in1.compareTo("l") == 0) {
					int a = key.get(23);
					index.add(a + 1);
				} else if (in1.compareTo("M") == 0) {
					int a = key.get(24);
					index.add(a + 1);
				} else if (in1.compareTo("m") == 0) {
					int a = key.get(25);
					index.add(a + 1);
				} else if (in1.compareTo("N") == 0) {
					int a = key.get(26);
					index.add(a + 1);
				} else if (in1.compareTo("n") == 0) {
					int a = key.get(27);
					index.add(a + 1);
				} else if (in1.compareTo("O") == 0) {
					int a = key.get(28);
					index.add(a + 1);
				} else if (in1.compareTo("o") == 0) {
					int a = key.get(29);
					index.add(a + 1);
				} else if (in1.compareTo("P") == 0) {
					int a = key.get(30);
					index.add(a + 1);
				} else if (in1.compareTo("p") == 0) {
					int a = key.get(31);
					index.add(a + 1);
				} else if (in1.compareTo("Q") == 0) {
					int a = key.get(32);
					index.add(a + 1);
				} else if (in1.compareTo("q") == 0) {
					int a = key.get(33);
					index.add(a + 1);
				} else if (in1.compareTo("R") == 0) {
					int a = key.get(34);
					index.add(a + 1);
				} else if (in1.compareTo("r") == 0) {
					int a = key.get(35);
					index.add(a + 1);
				} else if (in1.compareTo("S") == 0) {
					int a = key.get(36);
					index.add(a + 1);
				} else if (in1.compareTo("s") == 0) {
					int a = key.get(37);
					index.add(a + 1);
				} else if (in1.compareTo("T") == 0) {
					int a = key.get(38);
					index.add(a + 1);
				} else if (in1.compareTo("t") == 0) {
					int a = key.get(39);
					index.add(a + 1);
				} else if (in1.compareTo("U") == 0) {
					int a = key.get(40);
					index.add(a + 1);
				} else if (in1.compareTo("u") == 0) {
					int a = key.get(41);
					index.add(a + 1);
				} else if (in1.compareTo("V") == 0) {
					int a = key.get(42);
					index.add(a + 1);
				} else if (in1.compareTo("v") == 0) {
					int a = key.get(43);
					index.add(a + 1);
				} else if (in1.compareTo("W") == 0) {
					int a = key.get(44);
					index.add(a + 1);
				} else if (in1.compareTo("w") == 0) {
					int a = key.get(45);
					index.add(a + 1);
				} else if (in1.compareTo("X") == 0) {
					int a = key.get(46);
					index.add(a + 1);
				} else if (in1.compareTo("x") == 0) {
					int a = key.get(47);
					index.add(a + 1);
				} else if (in1.compareTo("Y") == 0) {
					int a = key.get(48);
					index.add(a + 1);
				} else if (in1.compareTo("y") == 0) {
					int a = key.get(49);
					index.add(a + 1);
				} else if (in1.compareTo("Z") == 0) {
					int a = key.get(50);
					index.add(a + 1);
				} else if (in1.compareTo("z") == 0) {
					int a = key.get(51);
					index.add(a + 1);
				} else if (in1.compareTo("") == 0) {
					int u = 0;
					int a = key.get(52);
					while (u < e) {
						index.add(a);
						u++;
					}
					e = e - 15;
				} else {
					System.out.println("Error!");
				}
				System.out.println(index);// test
				e--;
			}
			// System.out.println(index);
			System.out.println("Have special order?");
			System.out.println("enter Y to have special order, N to continue.");
			Scanner spe = new Scanner(System.in);
			String special = spe.nextLine();
			if (special.compareTo("Y") == 0) {
				System.out.println("Enter your special order, please.");
				Scanner qn = new Scanner(System.in);
				int in17 = qn.nextInt();
				index.add(in17);
				Scanner rn = new Scanner(System.in);
				int in18 = qn.nextInt();
				index.add(in18);
				Scanner sn = new Scanner(System.in);
				int in19 = qn.nextInt();
				index.add(in19);
				Scanner tn = new Scanner(System.in);
				int in20 = qn.nextInt();
				index.add(in20);
			} else if (special.compareTo("N") == 0) {
				for (int k = 0; k <= 4; k++) {
					index.add(0);
				}
			} else {
				System.out.println("Error!");
			}
			System.out.println(index);// test
			int p4 = index.get(1);// 1
			int p5 = index.get(2);// 2
			int p6 = index.get(3);// 3
			int p7 = index.get(4);// 1
			int p8 = index.get(5);// 2
			int p9 = index.get(6);// 3
			int p10 = index.get(7);// 1
			int p11 = index.get(8);// 2
			int p12 = index.get(9);// 3
			int p13 = index.get(10);// 1
			int p14 = index.get(11);// 2
			int p15 = index.get(12);// 3
			int p16 = index.get(13);// 1
			int p17 = index.get(14);// 2
			int p18 = index.get(15);// 3
			int p19 = index.get(16);// spe1
			int p20 = index.get(17);// spe2
			int p21 = index.get(18);// spe3
			int p22 = index.get(19);// spe4
			int sp = p19 * 1000 + p20 * 100 + p21 * 10 + p22;
			long Public1 = p4 + p7 + p10 + p13 + p16;// max
			long Public2 = p5 + p8 + p11 + p14 + p17;
			long Public3 = p6 + p9 + p12 + p15 + p18;
			System.out.println("Please enter the secure mode,0<=S<=5");
			Scanner s = new Scanner(System.in);
			int S = s.nextInt();
			long cry = 0;
			if (S == 1) {
				cry = Public1;
			} else if (S == 2) {
				cry = Public1 * 1000 + Public2;
			} else if (S == 3) {
				cry = Public1 * 1000000 + Public2 * 1000 + Public3;
			} else if (S == 4) {
				cry = Public1 * 1000000 + Public2 * 1000 - Public3;
			} else if (S == 5) {
				cry = Public1 * 1000000 - Public2 * 1000 + Public3;
			} else {
				cry = 1;
			}
			if (cry == 0) {
				System.out.println("Black hole username, please try again. ");
			}
			System.out.println(cry);// test
			List<Integer> cha = new ArrayList<Integer>();
			for (int f = 1; f < 61; f++) {
				cha.add(f);
			}
			List input = new ArrayList();
			System.out.println("Enter the text,use \".\" to end. ");
			System.out.println("You can use puctuation such as \",-:;!?.");
			int t = -1;
			while (t < 0) {
				Scanner an = new Scanner(System.in);
				String in1 = an.nextLine();
				if (in1.compareTo("A") == 0) {
					int a = cha.get(0);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("a") == 0) {
					int a = cha.get(1);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("B") == 0) {
					int a = cha.get(2);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("b") == 0) {
					int a = cha.get(3);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("C") == 0) {
					int a = cha.get(4);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("c") == 0) {
					int a = cha.get(5);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("D") == 0) {
					int a = cha.get(6);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("d") == 0) {
					int a = cha.get(7);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("E") == 0) {
					int a = cha.get(8);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("e") == 0) {
					int a = cha.get(9);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("F") == 0) {
					int a = cha.get(10);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("f") == 0) {
					int a = cha.get(11);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("G") == 0) {
					int a = cha.get(12);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("g") == 0) {
					int a = cha.get(13);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("H") == 0) {
					int a = cha.get(14);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("h") == 0) {
					int a = cha.get(15);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("I") == 0) {
					int a = cha.get(16);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("i") == 0) {
					int a = cha.get(17);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("J") == 0) {
					int a = cha.get(18);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("j") == 0) {
					int a = cha.get(19);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("K") == 0) {
					int a = cha.get(20);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("k") == 0) {
					int a = cha.get(21);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("L") == 0) {
					int a = cha.get(22);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("l") == 0) {
					int a = cha.get(23);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("M") == 0) {
					int a = cha.get(24);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("m") == 0) {
					int a = cha.get(25);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("N") == 0) {
					int a = cha.get(26);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("n") == 0) {
					int a = cha.get(27);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("O") == 0) {
					int a = cha.get(28);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("o") == 0) {
					int a = cha.get(29);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("P") == 0) {
					int a = cha.get(30);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("p") == 0) {
					int a = cha.get(31);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("Q") == 0) {
					int a = cha.get(32);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("q") == 0) {
					int a = cha.get(33);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("R") == 0) {
					int a = cha.get(34);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("r") == 0) {
					int a = cha.get(35);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("S") == 0) {
					int a = cha.get(36);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("s") == 0) {
					int a = cha.get(37);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("T") == 0) {
					int a = cha.get(38);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("t") == 0) {
					int a = cha.get(39);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("U") == 0) {
					int a = cha.get(40);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("u") == 0) {
					int a = cha.get(41);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("V") == 0) {
					int a = cha.get(42);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("v") == 0) {
					int a = cha.get(43);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("W") == 0) {
					int a = cha.get(44);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("w") == 0) {
					int a = cha.get(45);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("X") == 0) {
					int a = cha.get(46);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("x") == 0) {
					int a = cha.get(47);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("Y") == 0) {
					int a = cha.get(48);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("y") == 0) {
					int a = cha.get(49);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("Z") == 0) {
					int a = cha.get(50);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("z") == 0) {
					int a = cha.get(51);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("\"") == 0) {
					int a = cha.get(52);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo(":") == 0) {
					int a = cha.get(53);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo(",") == 0) {
					int a = cha.get(54);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo(";") == 0) {
					int a = cha.get(55);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("!") == 0) {
					int a = cha.get(56);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("?") == 0) {
					int a = cha.get(57);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("-") == 0) {
					int a = cha.get(58);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo(".") == 0) {
					int a = cha.get(59);
					input.add(cry * ti * sp * a);
					t++;
				} else {
					System.out.println("Error!");
				}
				System.out.println(input);// test
			}

//					System.out.println(p1);
//					System.out.println(p2);
//					System.out.println(p3);
//					System.out.println(p4);
//					System.out.println(p5);
//					System.out.println(p6);
//					System.out.println(p7);
//					System.out.println(p8);
//					System.out.println(p9);
//					System.out.println(p10);
//					System.out.println(p11);
//					System.out.println(p12);
//					System.out.println(p13);
//					System.out.println(p14);
//					System.out.println(p15);
//					System.out.println(p16);
//					System.out.println(p17);
//					System.out.println(p18);
//					System.out.println(p19);
//					System.out.println(p20);
//					System.out.println(p21);
//					System.out.println(p22);

		} else if (sta.compareTo("D") == 0)

		{
			Calendar cl = Calendar.getInstance();
			Date date = new Date();
			p1 = cl.get(Calendar.HOUR_OF_DAY);
			p2 = cl.get(Calendar.DAY_OF_WEEK);
			p3 = cl.get(Calendar.DAY_OF_MONTH);
			System.out.print(" " + p1);// test
			System.out.print(" " + p2);// test
			System.out.print(" " + p3);// test
			int ti = p1 + p2 + p3;
			System.out.println();
			System.out.println("Enter the user name. end in 15 words,use \"Enter\" to end. ");
			int e = 15;
			while (e >= 0) {
				Scanner an = new Scanner(System.in);
				String in1 = an.nextLine();
				if (in1.compareTo("A") == 0) {
					int a = key.get(0);
					index.add(a + 1);
				} else if (in1.compareTo("a") == 0) {
					int a = key.get(1);
					index.add(a + 1);
				} else if (in1.compareTo("B") == 0) {
					int a = key.get(2);
					index.add(a + 1);
				} else if (in1.compareTo("a") == 0) {
					int a = key.get(3);
					index.add(a + 1);
				} else if (in1.compareTo("C") == 0) {
					int a = key.get(4);
					index.add(a + 1);
				} else if (in1.compareTo("c") == 0) {
					int a = key.get(5);
					index.add(a + 1);
				} else if (in1.compareTo("D") == 0) {
					int a = key.get(6);
					index.add(a + 1);
				} else if (in1.compareTo("d") == 0) {
					int a = key.get(7);
					index.add(a + 1);
				} else if (in1.compareTo("E") == 0) {
					int a = key.get(8);
					index.add(a + 1);
				} else if (in1.compareTo("e") == 0) {
					int a = key.get(9);
					index.add(a + 1);
				} else if (in1.compareTo("F") == 0) {
					int a = key.get(10);
					index.add(a + 1);
				} else if (in1.compareTo("f") == 0) {
					int a = key.get(11);
					index.add(a + 1);
				} else if (in1.compareTo("G") == 0) {
					int a = key.get(12);
					index.add(a + 1);
				} else if (in1.compareTo("g") == 0) {
					int a = key.get(13);
					index.add(a + 1);
				} else if (in1.compareTo("H") == 0) {
					int a = key.get(14);
					index.add(a + 1);
				} else if (in1.compareTo("h") == 0) {
					int a = key.get(15);
					index.add(a + 1);
				} else if (in1.compareTo("I") == 0) {
					int a = key.get(16);
					index.add(a + 1);
				} else if (in1.compareTo("i") == 0) {
					int a = key.get(17);
					index.add(a + 1);
				} else if (in1.compareTo("J") == 0) {
					int a = key.get(18);
					index.add(a + 1);
				} else if (in1.compareTo("j") == 0) {
					int a = key.get(19);
					index.add(a + 1);
				} else if (in1.compareTo("K") == 0) {
					int a = key.get(20);
					index.add(a + 1);
				} else if (in1.compareTo("k") == 0) {
					int a = key.get(21);
					index.add(a + 1);
				} else if (in1.compareTo("L") == 0) {
					int a = key.get(22);
					index.add(a + 1);
				} else if (in1.compareTo("l") == 0) {
					int a = key.get(23);
					index.add(a + 1);
				} else if (in1.compareTo("M") == 0) {
					int a = key.get(24);
					index.add(a + 1);
				} else if (in1.compareTo("m") == 0) {
					int a = key.get(25);
					index.add(a + 1);
				} else if (in1.compareTo("N") == 0) {
					int a = key.get(26);
					index.add(a + 1);
				} else if (in1.compareTo("n") == 0) {
					int a = key.get(27);
					index.add(a + 1);
				} else if (in1.compareTo("O") == 0) {
					int a = key.get(28);
					index.add(a + 1);
				} else if (in1.compareTo("o") == 0) {
					int a = key.get(29);
					index.add(a + 1);
				} else if (in1.compareTo("P") == 0) {
					int a = key.get(30);
					index.add(a + 1);
				} else if (in1.compareTo("p") == 0) {
					int a = key.get(31);
					index.add(a + 1);
				} else if (in1.compareTo("Q") == 0) {
					int a = key.get(32);
					index.add(a + 1);
				} else if (in1.compareTo("q") == 0) {
					int a = key.get(33);
					index.add(a + 1);
				} else if (in1.compareTo("R") == 0) {
					int a = key.get(34);
					index.add(a + 1);
				} else if (in1.compareTo("r") == 0) {
					int a = key.get(35);
					index.add(a + 1);
				} else if (in1.compareTo("S") == 0) {
					int a = key.get(36);
					index.add(a + 1);
				} else if (in1.compareTo("s") == 0) {
					int a = key.get(37);
					index.add(a + 1);
				} else if (in1.compareTo("T") == 0) {
					int a = key.get(38);
					index.add(a + 1);
				} else if (in1.compareTo("t") == 0) {
					int a = key.get(39);
					index.add(a + 1);
				} else if (in1.compareTo("U") == 0) {
					int a = key.get(40);
					index.add(a + 1);
				} else if (in1.compareTo("u") == 0) {
					int a = key.get(41);
					index.add(a + 1);
				} else if (in1.compareTo("V") == 0) {
					int a = key.get(42);
					index.add(a + 1);
				} else if (in1.compareTo("v") == 0) {
					int a = key.get(43);
					index.add(a + 1);
				} else if (in1.compareTo("W") == 0) {
					int a = key.get(44);
					index.add(a + 1);
				} else if (in1.compareTo("w") == 0) {
					int a = key.get(45);
					index.add(a + 1);
				} else if (in1.compareTo("X") == 0) {
					int a = key.get(46);
					index.add(a + 1);
				} else if (in1.compareTo("x") == 0) {
					int a = key.get(47);
					index.add(a + 1);
				} else if (in1.compareTo("Y") == 0) {
					int a = key.get(48);
					index.add(a + 1);
				} else if (in1.compareTo("y") == 0) {
					int a = key.get(49);
					index.add(a + 1);
				} else if (in1.compareTo("Z") == 0) {
					int a = key.get(50);
					index.add(a + 1);
				} else if (in1.compareTo("z") == 0) {
					int a = key.get(51);
					index.add(a + 1);
				} else if (in1.compareTo("") == 0) {
					int u = 0;
					int a = key.get(52);
					while (u < e) {
						index.add(a);
						u++;
					}
					e = e - 15;
				} else {
					System.out.println("Error!");
				}
				System.out.println(index);// test
				e--;
			}
			System.out.println(index);
			System.out.println("Have special order?");
			System.out.println("enter Y to have special order, N to continue.");
			Scanner spe = new Scanner(System.in);
			String special = spe.nextLine();
			if (special.compareTo("Y") == 0) {
				System.out.println("Enter your special order, please.");
				Scanner qn = new Scanner(System.in);
				int in17 = qn.nextInt();
				index.add(in17);
				Scanner rn = new Scanner(System.in);
				int in18 = qn.nextInt();
				index.add(in18);
				Scanner sn = new Scanner(System.in);
				int in19 = qn.nextInt();
				index.add(in19);
				Scanner tn = new Scanner(System.in);
				int in20 = qn.nextInt();
				index.add(in20);
			} else if (special.compareTo("N") == 0) {
				for (int k = 0; k <= 4; k++) {
					index.add(0);
				}
			} else {
				System.out.println("Error!");
			}
			System.out.println(index);// test
			int p4 = index.get(1);// 1
			int p5 = index.get(2);// 2
			int p6 = index.get(3);// 3
			int p7 = index.get(4);// 1
			int p8 = index.get(5);// 2
			int p9 = index.get(6);// 3
			int p10 = index.get(7);// 1
			int p11 = index.get(8);// 2
			int p12 = index.get(9);// 3
			int p13 = index.get(10);// 1
			int p14 = index.get(11);// 2
			int p15 = index.get(12);// 3
			int p16 = index.get(13);// 1
			int p17 = index.get(14);// 2
			int p18 = index.get(15);// 3
			int p19 = index.get(16);// spe1
			int p20 = index.get(17);// spe2
			int p21 = index.get(18);// spe3
			int p22 = index.get(19);// spe4
			int sp = p19 * 1000 + p20 * 100 + p21 * 10 + p22;
			long Public1 = p4 + p7 + p10 + p13 + p16;// max
			long Public2 = p5 + p8 + p11 + p14 + p17;
			long Public3 = p6 + p9 + p12 + p15 + p18;
			System.out.println("Please enter the secure mode,0<=S<=5");
			Scanner s = new Scanner(System.in);
			int S = s.nextInt();
			long cry = 0;
			if (S == 1) {
				cry = Public1;
			} else if (S == 2) {
				cry = Public1 * 1000 + Public2;
			} else if (S == 3) {
				cry = Public1 * 1000000 + Public2 * 1000 + Public3;
			} else if (S == 4) {
				cry = Public1 * 1000000 + Public2 * 1000 - Public3;
			} else if (S == 5) {
				cry = Public1 * 1000000 - Public2 * 1000 + Public3;
			} else {
				cry = 1;
			}
			if (cry == 0) {
				System.out.println("Black hole username, please try again. ");
			}
			System.out.println(cry);// test
			List<Integer> cha = new ArrayList<Integer>();
			for (int f = 1; f < 61; f++) {
				cha.add(f);
			}
			List output = new ArrayList();
			System.out.println("Enter the text,use \".\" to end. ");
			System.out.println("You can use puctuation such as \",-:;!?.");
			int t = -1;
			while (t < 0) {
				Scanner an = new Scanner(System.in);
				long ou = an.nextLong();
				long out = ou / cry / ti / sp;
				if (out == cha.get(0)) {
					output.add("A");
				} else if (out == cha.get(1)) {
					output.add("a");
				} else if (out == cha.get(2)) {
					output.add("B");
				} else if (out == cha.get(3)) {
					output.add("b");
				} else if (out == cha.get(4)) {
					output.add("C");
				} else if (out == cha.get(5)) {
					output.add("c");
				} else if (out == cha.get(6)) {
					output.add("D");
				} else if (out == cha.get(7)) {
					output.add("d");
				} else if (out == cha.get(8)) {
					output.add("E");
				} else if (out == cha.get(9)) {
					output.add("e");
				} else if (out == cha.get(10)) {
					output.add("F");
				} else if (out == cha.get(11)) {
					output.add("f");
				} else if (out == cha.get(12)) {
					output.add("G");
				} else if (out == cha.get(13)) {
					output.add("g");
				} else if (out == cha.get(14)) {
					output.add("H");
				} else if (out == cha.get(15)) {
					output.add("h");
				} else if (out == cha.get(16)) {
					output.add("I");
				} else if (out == cha.get(17)) {
					output.add("i");
				} else if (out == cha.get(18)) {
					output.add("J");
				} else if (out == cha.get(19)) {
					output.add("j");
				} else if (out == cha.get(20)) {
					output.add("K");
				} else if (out == cha.get(21)) {
					output.add("k");
				} else if (out == cha.get(22)) {
					output.add("L");
				} else if (out == cha.get(23)) {
					output.add("l");
				} else if (out == cha.get(24)) {
					output.add("M");
				} else if (out == cha.get(25)) {
					output.add("m");
				} else if (out == cha.get(26)) {
					output.add("N");
				} else if (out == cha.get(27)) {
					output.add("n");
				} else if (out == cha.get(28)) {
					output.add("O");
				} else if (out == cha.get(29)) {
					output.add("o");
				} else if (out == cha.get(30)) {
					output.add("P");
				} else if (out == cha.get(31)) {
					output.add("p");
				} else if (out == cha.get(32)) {
					output.add("Q");
				} else if (out == cha.get(33)) {
					output.add("q");
				} else if (out == cha.get(34)) {
					output.add("R");
				} else if (out == cha.get(35)) {
					output.add("r");
				} else if (out == cha.get(36)) {
					output.add("S");
				} else if (out == cha.get(37)) {
					output.add("s");
				} else if (out == cha.get(38)) {
					output.add("T");
				} else if (out == cha.get(39)) {
					output.add("t");
				} else if (out == cha.get(40)) {
					output.add("U");
				} else if (out == cha.get(41)) {
					output.add("u");
				} else if (out == cha.get(42)) {
					output.add("V");
				} else if (out == cha.get(43)) {
					output.add("v");
				} else if (out == cha.get(44)) {
					output.add("W");
				} else if (out == cha.get(45)) {
					output.add("w");
				} else if (out == cha.get(46)) {
					output.add("X");
				} else if (out == cha.get(47)) {
					output.add("x");
				} else if (out == cha.get(48)) {
					output.add("Y");
				} else if (out == cha.get(49)) {
					output.add("y");
				} else if (out == cha.get(50)) {
					output.add("Z");
				} else if (out == cha.get(51)) {
					output.add("z");
				} else if (out == cha.get(52)) {
					output.add("\"");
				} else if (out == cha.get(53)) {
					output.add(":");
				} else if (out == cha.get(54)) {
					output.add(",");
				} else if (out == cha.get(55)) {
					output.add(";");
				} else if (out == cha.get(56)) {
					output.add("!");
				} else if (out == cha.get(57)) {
					output.add("?");
				} else if (out == cha.get(58)) {
					output.add("-");
				} else if (out == cha.get(59)) {
					output.add(".");
					t++;
				} else {
					System.out.println("Error!");
				}
				System.out.println(output);// test
			}

		}

		else {
			System.out.println("Tell me how many KEY you want to change?");
			Scanner c = new Scanner(System.in);
			int ti = c.nextInt();
			int tim = 0;

			while (tim < ti) {
				System.out.println("The position of the old KEY.");
				Scanner d = new Scanner(System.in);
				int okey = (int) d.nextInt();
				System.out.println("The new KEY.");
				Scanner e = new Scanner(System.in);
				int nkey = (int) e.nextInt();
				key.remove(okey);
				key.add(okey, nkey);
				tim++;
			}

//				System.out.println(key);
		}

	}

	private void fix() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Alice is not God,");
		Thread.sleep(1000 * 2);
		System.out.println("She can't predict what you gonna say before you teach her.");
		Thread.sleep(1000 * 3);
		System.out.println("Now you have a chance.");
		Thread.sleep(1000 * 1);
		System.out.println("Enter the important word in your saying.");
		System.out.println("Keyword one.");
		Scanner la1 = new Scanner(System.in);
		String ipword1 = la1.nextLine();
		System.out.println("Keyword two.");
		Scanner la2 = new Scanner(System.in);
		String ipword2 = la2.nextLine();
		System.out.println("Keyword three.");
		Scanner la3 = new Scanner(System.in);
		String ipword3 = la3.nextLine();
		System.out.println("Keyword four.");
		Scanner la4 = new Scanner(System.in);
		String ipword4 = la4.nextLine();
		System.out.println("Keyword five.");
		Scanner la5 = new Scanner(System.in);
		String ipword5 = la5.nextLine();
		System.out.println("Enter the answer for your saying.");
		System.out.println("Answer one.");
		Scanner as1 = new Scanner(System.in);
		String answer1 = as1.nextLine();
		System.out.println("Answer two.");
		Scanner as2 = new Scanner(System.in);
		String answer2 = as2.nextLine();
		System.out.println("Answer three.");
		Scanner as3 = new Scanner(System.in);
		String answer3 = as3.nextLine();
		System.out.println("Answer four.");
		Scanner as4 = new Scanner(System.in);
		String answer4 = as4.nextLine();
		System.out.println("Answer five.");
		Scanner as5 = new Scanner(System.in);
		String answer5 = as5.nextLine();
		System.out.println("Paste this in to the main building we called public String getResponse(String statement) ");
		System.out.println("		else if (statement.indexOf(\"" + ipword1 + "\") >= 0 || statement.indexOf(\""
				+ ipword2 + "\") >= 0 || statement.indexOf(\"" + ipword3 + "\") >= 0\n"
				+ "				|| statement.indexOf(\"" + ipword4 + "\") >= 0 || statement.indexOf(\"" + ipword4
				+ "\") >= 0) {\n" + "			" + ipword1 + "();}");
		System.out.println("Paste this in to the buttom of the code.");
		System.out.println("private String \"" + ipword3
				+ "\"() {final int NUMBER_OF_RESPONSES = 5;double r = Math.random();int whichResponse = (int) (r * NUMBER_OF_RESPONSES);String response = \"\";if (whichResponse == 0) {response = \""
				+ answer1 + "\";} else if (whichResponse == 1) {response = \"" + answer2
				+ "\";} else if (whichResponse == 2) {response = \"" + answer3
				+ "\";} else if (whichResponse == 3) {response =  \"" + answer4
				+ "\";}return response;}else if (whichResponse == 4) {response =  \"" + answer5
				+ "\";}return response;}}");
	}

	private void Answer() {
		// TODO Auto-generated method stub
		String response = "";
		final int NUMBER_OF_RESPONSES = 62;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		if (whichResponse == 1) {
			response = "You will not be disappointed.";
		} else if (whichResponse == 2) {
			response = "Show your appreciation.";
		} else if (whichResponse == 3) {
			response = "Your actions will improve things.";
		} else if (whichResponse == 4) {
			response = "Don’t bet on it.";
		} else if (whichResponse == 5) {
			response = "Adopt an adventurous attitude.";
		} else if (whichResponse == 6) {
			response = "Follow the advice of experts.";
		} else if (whichResponse == 7) {
			response = "You could find yourself unable to compromise.";
		} else if (whichResponse == 8) {
			response = "Focus on your home life.";
		} else if (whichResponse == 9) {
			response = "Investigate and then enjoy it.";
		} else if (whichResponse == 10) {
			response = "Definitely.";
		} else if (whichResponse == 11) {
			response = "Only do it once.";
		} else if (whichResponse == 12) {
			response = "You may have opposition.";
		} else if (whichResponse == 13) {
			response = "It will remain unpredictable.";
		} else if (whichResponse == 14) {
			response = "You’ll need to take the initiative.";
		} else if (whichResponse == 15) {
			response = "Consider it an opportunity.";
		} else if (whichResponse == 16) {
			response = "Be deliberate.";
		} else if (whichResponse == 17) {
			response = "Absolutely not.";
		} else if (whichResponse == 18) {
			response = "Explore it with playful curiosity.";
		} else if (whichResponse == 19) {
			response = "Perhaps, when you’re older.";
		} else if (whichResponse == 20) {
			response = "Be delightfully sure of it.";
		} else if (whichResponse == 21) {
			response = "Better to wait. ";
		} else if (whichResponse == 22) {
			response = "Reprioritize what is important.";
		} else if (whichResponse == 23) {
			response = "It seems assured.";
		} else if (whichResponse == 24) {
			response = "Create more space for it.";
		} else if (whichResponse == 25) {
			response = "Do it early.";
		} else if (whichResponse == 26) {
			response = "Keep it to yourself.";
		} else if (whichResponse == 27) {
			response = "Allow yourself to rest first.";
		} else if (whichResponse == 28) {
			response = "It is sensible.";
		} else if (whichResponse == 29) {
			response = "You’ll have to make it up as you go.";
		} else if (whichResponse == 30) {
			response = "Startling events may occur as a result.";
		} else if (whichResponse == 31) {
			response = "The answer may come to you in another language.";
		} else if (whichResponse == 32) {
			response = "You will need to accommodate.";
		} else if (whichResponse == 33) {
			response = "Doubt it.";
		} else if (whichResponse == 34) {
			response = "It will bring good luck.";
		} else if (whichResponse == 35) {
			response = "It may be challenging, but you will find value in it.";
		} else if (whichResponse == 36) {
			response = "Be patient.";
		} else if (whichResponse == 37) {
			response = "You will find out everything you’ll need to know.";
		} else if (whichResponse == 38) {
			response = "There is a substantial link to another situation. ";
		} else if (whichResponse == 39) {
			response = "Watch and see what happens. ";
		} else if (whichResponse == 40) {
			response = "You know better now than ever before. ";
		} else if (whichResponse == 41) {
			response = "It will affect how others see you.";
		} else if (whichResponse == 42) {
			response = "Reconsider your approach.";
		} else if (whichResponse == 43) {
			response = "You’ll be happy you did.";
		} else if (whichResponse == 44) {
			response = "Get it in writing.";
		} else if (whichResponse == 45) {
			response = "Unfavorable at this time.";
		} else if (whichResponse == 46) {
			response = "It is not something to be taken lightly.";
		} else if (whichResponse == 47) {
			response = "Upgrade in any way you can.";
		} else if (whichResponse == 48) {
			response = "If you do as you’re told.";
		} else if (whichResponse == 49) {
			response = "If it’s done well; if not, don’t do it at all.";
		} else if (whichResponse == 50) {
			response = "Don’t ask for any more at this time.";
		} else if (whichResponse == 51) {
			response = "Avoid the first solution.";
		} else if (whichResponse == 52) {
			response = "You’ll get the final word.";
		} else if (whichResponse == 53) {
			response = "Proceed at a more relaxed pace.";
		} else if (whichResponse == 54) {
			response = "The best solution may not be the obvious one.";
		} else if (whichResponse == 55) {
			response = "Remain flexible.";
		} else if (whichResponse == 56) {
			response = "Respect the rules.";
		} else if (whichResponse == 57) {
			response = "Take the lead.";
		} else if (whichResponse == 58) {
			response = "Choose your words thoughtfully.";
		} else if (whichResponse == 59) {
			response = "You may be hanging on to an outdated ideal.";
		} else if (whichResponse == 60) {
			response = "There may be a struggle.";
		} else if (whichResponse == 61) {
			response = "You’ll have the enthusiasm you’ll need.";
		} else {
			response = "Provided you say “thank you”.";
		}
		System.out.println(response);
	}

	private String GRRnull() {
		// TODO Auto-generated method stub
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";
		if (whichResponse == 0) {
			response = "Say something please.";
		} else if (whichResponse == 1) {
			response = "Hmmm.";
		} else if (whichResponse == 2) {
			response = "Do you really think so?";
		} else if (whichResponse == 3) {
			response = "You don't say.";
		}

		return response;
	}

	private String getRandomResponse() {
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0) {
			response = "Interesting, tell me more.";
		} else if (whichResponse == 1) {
			response = "Hmmm.";
		} else if (whichResponse == 2) {
			response = "Do you really think so?";
		} else if (whichResponse == 3) {
			response = "You don't say.";
		}

		return response;
	}

	private void CalculateSystem() {
		// TODO Auto-generated method stub
		System.out.println("use + to plus");
		System.out.println("use - to minus");
		System.out.println("use x to time");
		System.out.println("use / to divide into");

		Scanner var = new Scanner(System.in);
		double input1 = var.nextInt();
		String input2 = var.next();
		double input3 = var.nextInt();

		if (input2.compareTo("+") == 0) {
			System.out.print(input1 + "+" + input3 + "=" + (double) (input1 + input3));
		} else if (input2.compareTo("-") == 0) {
			System.out.print(input1 + "-" + input3 + "=" + (double) (input1 - input3));
		} else if (input2.compareTo("x") == 0) {
			System.out.print(input1 + "x" + input3 + "=" + (double) (input1 * input3));
		} else if (input2.compareTo("/") == 0) {
			System.out.print(input1 + "÷" + input3 + "=" + (double) (input1 / input3));
		}
	}

	private void APscoreTest() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("What's your AP score?");
		Scanner on = new Scanner(System.in);
		Thread.sleep(1000 * 2);
		System.out.println("So,how much you get in choice?");
		int choice = on.nextInt();
		Thread.sleep(1000 * 2);
		System.out.println("And, free?");
		int free = on.nextInt();
		double score = (choice + free) * 1.11;
		if (score >= 62)
			System.out.println("Wow, you did a great job! You will get 5 score!");
		else if (score >= 47)
			System.out.println("Well,not bad, you will get 4 in this subject.");
		else if (score >= 37)
			System.out.println("Review, and try again!");
		else if (score >= 29)
			System.out.println("How did you do that?");
		else
			System.out.println("Wow, garbage!");
	}

	public void ChemistrySystem() {
		// TODO Auto-generated method stub
		List<Integer> output = new ArrayList<Integer>();
		List<String> input = new ArrayList<String>();
		List<Integer> amount = new ArrayList<Integer>();
		List<Integer> tram = new ArrayList<Integer>();
		tram.add(0, 10);
		tram.add(1, 40);
		tram.add(2, 70);
		tram.add(3, 90);
		tram.add(4, 110);
		tram.add(5, 120);
		tram.add(6, 140);
		tram.add(7, 160);
		tram.add(8, 190);
		tram.add(9, 200);
		tram.add(10, 230);
		tram.add(11, 240);
		tram.add(12, 270);
		tram.add(13, 280);
		tram.add(14, 300);
		tram.add(15, 320);
		tram.add(16, 355);
		tram.add(17, 400);
		tram.add(18, 390);
		tram.add(19, 400);
		tram.add(20, 450);
		tram.add(21, 480);
		tram.add(22, 510);
		tram.add(23, 520);
		tram.add(24, 550);
		tram.add(25, 560);
		tram.add(26, 590);
		tram.add(27, 590);
		tram.add(28, 640);
		tram.add(29, 650);
		tram.add(30, 700);
		tram.add(31, 730);
		tram.add(32, 750);
		tram.add(33, 790);
		tram.add(34, 800);
		tram.add(35, 840);
		tram.add(36, 850);
		tram.add(37, 880);
		tram.add(38, 910);
		tram.add(39, 930);
		tram.add(40, 930);
		tram.add(41, 960);
		tram.add(42, 980);
		tram.add(43, 1010);
		tram.add(44, 1030);
		tram.add(45, 1060);
		tram.add(46, 1080);
		tram.add(47, 1120);
		tram.add(48, 1150);
		tram.add(49, 1190);
		tram.add(50, 1220);
		tram.add(51, 1280);
		tram.add(52, 1270);
		tram.add(53, 1310);
		tram.add(54, 1330);
		tram.add(55, 1370);
		tram.add(56, 1390);
		tram.add(57, 1400);
		tram.add(58, 1410);
		tram.add(59, 1440);
		tram.add(60, 1450);
		tram.add(61, 1500);
		tram.add(62, 1520);
		tram.add(63, 1570);
		tram.add(64, 1590);
		tram.add(65, 1625);
		tram.add(66, 1650);
		tram.add(67, 1670);
		tram.add(68, 1690);
		tram.add(69, 1730);
		tram.add(70, 1750);
		tram.add(71, 1785);
		tram.add(72, 1810);
		tram.add(73, 1840);
		tram.add(74, 1860);
		tram.add(75, 1900);
		tram.add(76, 1920);
		tram.add(77, 1950);
		tram.add(78, 1970);
		tram.add(79, 2010);
		tram.add(80, 2040);
		tram.add(81, 2070);
		tram.add(82, 2090);
		tram.add(83, 2090);
		tram.add(84, 2100);
		tram.add(85, 2220);
		tram.add(86, 2230);
		tram.add(87, 2260);
		tram.add(88, 2270);
		tram.add(89, 2320);
		tram.add(90, 2310);
		tram.add(91, 2380);
		tram.add(92, 2370);
		tram.add(93, 2440);
		tram.add(94, 2430);
		tram.add(95, 2470);
		tram.add(96, 2470);
		tram.add(97, 2510);
		tram.add(98, 2520);
		tram.add(99, 2570);
		tram.add(100, 2580);
		tram.add(101, 2590);
		tram.add(102, 2660);
		tram.add(103, 2670);
		tram.add(104, 2680);
		tram.add(105, 2690);
		tram.add(106, 2700);
		tram.add(107, 2700);
		tram.add(108, 2780);
		tram.add(109, 2810);
		tram.add(110, 2820);
		tram.add(111, 2850);
		tram.add(112, 2860);
		tram.add(113, 2890);
		tram.add(114, 2900);
		tram.add(115, 2930);
		tram.add(116, 2940);
		tram.add(117, 2940);
		tram.add(118, 0);
		System.out.println("Welcome to use the chemistry system.");
		System.out.println("This is a program which use to calculate the ");
		System.out.println("The Relative Molecular mass.");
		System.out.println("The Relative Atoms mass.");
		System.out.println("The format is \"Name amount\".");
		System.out.println("if you need to enter the (),you need to change it in to simple format.");
		System.out.println("for example Mg(OH)2 need translate into Mg O 2 H 2.");
		System.out.println("How many elements in this compound?");
		Scanner var = new Scanner(System.in);
		int amo = var.nextInt();
		System.out.println("What are the elements in this compound?");
		System.out.println("Remember to add space in your statement.");
		int j = 0;
		while (j < amo) {
			Scanner va1 = new Scanner(System.in);
			String element = va1.nextLine();
			Scanner va2 = new Scanner(System.in);
			String number = va1.nextLine();
			int num = 1;
			if (element.compareTo("1") == 0) {
				num = 1;
			} else if (element.compareTo("2") == 0) {
				num = 2;
			} else if (element.compareTo("3") == 0) {
				num = 3;
			} else if (element.compareTo("4") == 0) {
				num = 4;
			} else if (element.compareTo("5") == 0) {
				num = 5;
			} else if (element.compareTo("2") == 0) {
				num = 6;
			} else if (element.compareTo("2") == 0) {
				num = 7;
			} else if (element.compareTo("2") == 0) {
				num = 8;
			} else if (element.compareTo("2") == 0) {
				num = 9;
			} else {
				num = 1;
			}

			if (element.compareTo("H") == 0) {
				i = (int) tram.get(0) * num;

			} else if (element.compareTo("He") == 0) {
				i = (int) tram.get(1) * num;

			} else if (element.compareTo("Li") == 0) {
				i = (int) tram.get(2) * num;

			} else if (element.compareTo("Be") == 0) {
				i = (int) tram.get(3) * num;

			} else if (element.compareTo("B") == 0) {
				i = (int) tram.get(4) * num;

			} else if (element.compareTo("C") == 0) {
				i = (int) tram.get(5) * num;

			} else if (element.compareTo("N") == 0) {
				i = (int) tram.get(6) * num;

			} else if (element.compareTo("O") == 0) {
				i = (int) tram.get(7) * num;

			} else if (element.compareTo("F") == 0) {
				i = (int) tram.get(8) * num;

			} else if (element.compareTo("Ne") == 0) {
				i = (int) tram.get(9) * num;

			} else if (element.compareTo("Na") == 0) {
				i = (int) tram.get(10) * num;

			} else if (element.compareTo("Mg") == 0) {
				i = (int) tram.get(11) * num;

			} else if (element.compareTo("Al") == 0) {
				i = (int) tram.get(12) * num;

			} else if (element.compareTo("Si") == 0) {
				i = (int) tram.get(13) * num;

			} else if (element.compareTo("P") == 0) {
				i = (int) tram.get(14) * num;

			} else if (element.compareTo("S") == 0) {
				i = (int) tram.get(15) * num;

			} else if (element.compareTo("Cl") == 0) {
				i = (int) tram.get(16) * num;

			} else if (element.compareTo("Ar") == 0) {
				i = (int) tram.get(17) * num;

			} else if (element.compareTo("K") == 0) {
				i = (int) tram.get(18) * num;

			} else if (element.compareTo("Ca") == 0) {
				i = (int) tram.get(19) * num;

			} else if (element.compareTo("Sc") == 0) {
				i = (int) tram.get(20) * num;

			} else if (element.compareTo("Ti") == 0) {
				i = (int) tram.get(21) * num;

			} else if (element.compareTo("V") == 0) {
				i = (int) tram.get(22) * num;

			} else if (element.compareTo("Cr") == 0) {
				i = (int) tram.get(23) * num;

			} else if (element.compareTo("Mn") == 0) {
				i = (int) tram.get(24) * num;

			} else if (element.compareTo("Fe") == 0) {
				i = (int) tram.get(25) * num;

			} else if (element.compareTo("Co") == 0) {
				i = (int) tram.get(26) * num;

			} else if (element.compareTo("Ni") == 0) {
				i = (int) tram.get(27) * num;

			} else if (element.compareTo("Cu") == 0) {
				i = (int) tram.get(28) * num;

			} else if (element.compareTo("Zn") == 0) {
				i = (int) tram.get(29) * num;

			} else if (element.compareTo("Ga") == 0) {
				i = (int) tram.get(30) * num;

			} else if (element.compareTo("Ge") == 0) {
				i = (int) tram.get(31) * num;

			} else if (element.compareTo("As") == 0) {
				i = (int) tram.get(32) * num;

			} else if (element.compareTo("Se") == 0) {
				i = (int) tram.get(33) * num;

			} else if (element.compareTo("Br") == 0) {
				i = (int) tram.get(34) * num;

			} else if (element.compareTo("Kr") == 0) {
				i = (int) tram.get(35) * num;

			} else if (element.compareTo("Rb") == 0) {
				i = (int) tram.get(36) * num;

			} else if (element.compareTo("Sr") == 0) {
				i = (int) tram.get(37) * num;

			} else if (element.compareTo("Y") == 0) {
				i = (int) tram.get(38) * num;

			} else if (element.compareTo("Zr") == 0) {
				i = (int) tram.get(39) * num;

			} else if (element.compareTo("Nb") == 0) {
				i = (int) tram.get(40) * num;

			} else if (element.compareTo("Mo") == 0) {
				i = (int) tram.get(41) * num;

			} else if (element.compareTo("Tc") == 0) {
				i = (int) tram.get(42) * num;

			} else if (element.compareTo("Ru") == 0) {
				i = (int) tram.get(43) * num;

			} else if (element.compareTo("Rh") == 0) {
				i = (int) tram.get(44) * num;

			} else if (element.compareTo("Pd") == 0) {
				i = (int) tram.get(45) * num;

			} else if (element.compareTo("Ag") == 0) {
				i = (int) tram.get(46) * num;

			} else if (element.compareTo("Cd") == 0) {
				i = (int) tram.get(47) * num;

			} else if (element.compareTo("In") == 0) {
				i = (int) tram.get(48) * num;

			} else if (element.compareTo("Sn") == 0) {
				i = (int) tram.get(49) * num;

			} else if (element.compareTo("Sb") == 0) {
				i = (int) tram.get(50) * num;

			} else if (element.compareTo("Te") == 0) {
				i = (int) tram.get(51) * num;

			} else if (element.compareTo("I") == 0) {
				i = (int) tram.get(52) * num;

			} else if (element.compareTo("Xe") == 0) {
				i = (int) tram.get(53) * num;

			} else if (element.compareTo("Cs") == 0) {
				i = (int) tram.get(54) * num;

			} else if (element.compareTo("Ba") == 0) {
				i = (int) tram.get(55) * num;

			} else if (element.compareTo("La") == 0) {
				i = (int) tram.get(56) * num;

			} else if (element.compareTo("Ce") == 0) {
				i = (int) tram.get(57) * num;

			} else if (element.compareTo("Pr") == 0) {
				i = (int) tram.get(58) * num;

			} else if (element.compareTo("Nd") == 0) {
				i = (int) tram.get(59) * num;

			} else if (element.compareTo("Pm") == 0) {
				i = (int) tram.get(60) * num;

			} else if (element.compareTo("Sm") == 0) {
				i = (int) tram.get(61) * num;

			} else if (element.compareTo("Eu") == 0) {
				i = (int) tram.get(62) * num;

			} else if (element.compareTo("Gd") == 0) {
				i = (int) tram.get(63) * num;

			} else if (element.compareTo("Tb") == 0) {
				i = (int) tram.get(64) * num;

			} else if (element.compareTo("Dy") == 0) {
				i = (int) tram.get(65) * num;

			} else if (element.compareTo("Ho") == 0) {
				i = (int) tram.get(66) * num;

			} else if (element.compareTo("Er") == 0) {
				i = (int) tram.get(67) * num;

			} else if (element.compareTo("Tm") == 0) {
				i = (int) tram.get(68) * num;

			} else if (element.compareTo("Yb") == 0) {
				i = (int) tram.get(69) * num;

			} else if (element.compareTo("Lu") == 0) {
				i = (int) tram.get(70) * num;

			} else if (element.compareTo("Hf") == 0) {
				i = (int) tram.get(71) * num;

			} else if (element.compareTo("Ta") == 0) {
				i = (int) tram.get(72) * num;

			} else if (element.compareTo("W") == 0) {
				i = (int) tram.get(73) * num;

			} else if (element.compareTo("Re") == 0) {
				i = (int) tram.get(74) * num;

			} else if (element.compareTo("Os") == 0) {
				i = (int) tram.get(75) * num;

			} else if (element.compareTo("Ir") == 0) {
				i = (int) tram.get(76) * num;

			} else if (element.compareTo("Pt") == 0) {
				i = (int) tram.get(77) * num;

			} else if (element.compareTo("Au") == 0) {
				i = (int) tram.get(78) * num;

			} else if (element.compareTo("Hg") == 0) {
				i = (int) tram.get(79) * num;

			} else if (element.compareTo("Ti") == 0) {
				i = (int) tram.get(80) * num;

			} else if (element.compareTo("Pb") == 0) {
				i = (int) tram.get(81) * num;

			} else if (element.compareTo("Bi") == 0) {
				i = (int) tram.get(82) * num;

			} else if (element.compareTo("Po") == 0) {
				i = (int) tram.get(83) * num;

			} else if (element.compareTo("At") == 0) {
				i = (int) tram.get(84) * num;

			} else if (element.compareTo("Rn") == 0) {
				i = (int) tram.get(85) * num;

			} else if (element.compareTo("Fr") == 0) {
				i = (int) tram.get(86) * num;

			} else if (element.compareTo("Ra") == 0) {
				i = (int) tram.get(87) * num;

			} else if (element.compareTo("Ac") == 0) {
				i = (int) tram.get(88) * num;

			} else if (element.compareTo("Th") == 0) {
				i = (int) tram.get(89) * num;

			} else if (element.compareTo("Pa") == 0) {
				i = (int) tram.get(90) * num;

			} else if (element.compareTo("U") == 0) {
				i = (int) tram.get(91) * num;

			} else if (element.compareTo("Np") == 0) {
				i = (int) tram.get(92) * num;

			} else if (element.compareTo("Pu") == 0) {
				i = (int) tram.get(93) * num;

			} else if (element.compareTo("Am") == 0) {
				i = (int) tram.get(94) * num;

			} else if (element.compareTo("Cm") == 0) {
				i = (int) tram.get(95) * num;

			} else if (element.compareTo("Bk") == 0) {
				i = (int) tram.get(96) * num;

			} else if (element.compareTo("Cf") == 0) {
				i = (int) tram.get(97) * num;

			} else if (element.compareTo("Es") == 0) {
				i = (int) tram.get(98) * num;

			} else if (element.compareTo("Fm") == 0) {
				i = (int) tram.get(99) * num;

			} else if (element.compareTo("Md") == 0) {
				i = (int) tram.get(100) * num;

			} else if (element.compareTo("No") == 0) {
				i = (int) tram.get(101) * num;

			} else if (element.compareTo("Lr") == 0) {
				i = (int) tram.get(102) * num;

			} else if (element.compareTo("Rf") == 0) {
				i = (int) tram.get(103) * num;

			} else if (element.compareTo("Db") == 0) {
				i = (int) tram.get(104) * num;

			} else if (element.compareTo("Sg") == 0) {
				i = (int) tram.get(105) * num;

			} else if (element.compareTo("Bh") == 0) {
				i = (int) tram.get(106) * num;

			} else if (element.compareTo("Hs") == 0) {
				i = (int) tram.get(107) * num;

			} else if (element.compareTo("Mt") == 0) {
				i = (int) tram.get(108) * num;

			} else if (element.compareTo("Ds") == 0) {
				i = (int) tram.get(109) * num;

			} else if (element.compareTo("Rg") == 0) {
				i = (int) tram.get(110) * num;

			} else if (element.compareTo("Cn") == 0) {
				i = (int) tram.get(111) * num;

			} else if (element.compareTo("Nh") == 0) {
				i = (int) tram.get(112) * num;

			} else if (element.compareTo("Fl") == 0) {
				i = (int) tram.get(113) * num;

			} else if (element.compareTo("Mc") == 0) {
				i = (int) tram.get(114) * num;

			} else if (element.compareTo("Lv") == 0) {
				i = (int) tram.get(115) * num;

			} else if (element.compareTo("Ts") == 0) {
				i = (int) tram.get(116) * num;

			} else if (element.compareTo("Og") == 0) {
				i = (int) tram.get(117) * num;

			} else {
				System.out.println("Error, please try again.");
			}
			output.add(i);
			input.add(element);
			amount.add(num);
			j++;
		}
		double k1 = 0;
		double k2 = 0;
		double k3 = 0;
		double k4 = 0;
		double k5 = 0;
		double k6 = 0;
		double k7 = 0;
		double k8 = 0;
		double k9 = 0;
		double k10 = 0;
		String l1 = "";
		String l2 = "";
		String l3 = "";
		String l4 = "";
		String l5 = "";
		String l6 = "";
		String l7 = "";
		String l8 = "";
		String l9 = "";
		String l10 = "";
		int m1 = 0;
		int m2 = 0;
		int m3 = 0;
		int m4 = 0;
		int m5 = 0;
		int m6 = 0;
		int m7 = 0;
		int m8 = 0;
		int m9 = 0;
		int m10 = 0;
		if (amo == 1) {
			k1 = (double) output.get(0) / 10;
			l1 = (String) input.get(0);
			m1 = (int) amount.get(0);
			double tot = k1;
			System.out.println("The Relative Molecular mass of ");
			System.out.println(l1 + m1);
			System.out.println("is " + tot + " .");
		} else if (amo == 2) {
			k1 = (double) output.get(0) / 10;
			k2 = (double) output.get(1) / 10;
			l1 = (String) input.get(0);
			l2 = (String) input.get(1);
			m1 = (int) amount.get(0);
			m2 = (int) amount.get(1);
			double tot = k1 + k2;
			System.out.println("The Relative Molecular mass of ");
			System.out.println(l1 + m1 + l2 + m2);
			System.out.println("is " + tot + " .");
		} else if (amo == 3) {
			k1 = (double) output.get(0) / 10;
			k2 = (double) output.get(1) / 10;
			k3 = (double) output.get(2) / 10;
			l1 = (String) input.get(0);
			l2 = (String) input.get(1);
			l3 = (String) input.get(2);
			m1 = (int) amount.get(0);
			m2 = (int) amount.get(1);
			m3 = (int) amount.get(2);
			double tot = k1 + k2 + k3;
			System.out.println("The Relative Molecular mass of ");
			System.out.println(l1 + m1 + l2 + m2 + l3 + m3);
			System.out.println("is " + tot + " .");
		} else if (amo == 4) {
			k1 = (double) output.get(0) / 10;
			k2 = (double) output.get(1) / 10;
			k3 = (double) output.get(2) / 10;
			k4 = (double) output.get(3) / 10;
			l1 = (String) input.get(0);
			l2 = (String) input.get(1);
			l3 = (String) input.get(2);
			l4 = (String) input.get(3);
			m1 = (int) amount.get(0);
			m2 = (int) amount.get(1);
			m3 = (int) amount.get(2);
			m4 = (int) amount.get(3);
			double tot = k1 + k2 + k3 + k4;
			System.out.println("The Relative Molecular mass of ");
			System.out.println(l1 + m1 + l2 + m2 + l3 + m3 + l4 + m4);
			System.out.println("is " + tot + " .");
		} else if (amo == 5) {
			k1 = (double) output.get(0) / 10;
			k2 = (double) output.get(1) / 10;
			k3 = (double) output.get(2) / 10;
			k4 = (double) output.get(3) / 10;
			k5 = (double) output.get(4) / 10;
			l1 = (String) input.get(0);
			l2 = (String) input.get(1);
			l3 = (String) input.get(2);
			l4 = (String) input.get(3);
			l5 = (String) input.get(4);

			m1 = (int) amount.get(0);
			m2 = (int) amount.get(1);
			m3 = (int) amount.get(2);
			m4 = (int) amount.get(3);
			m5 = (int) amount.get(4);
			double tot = k1 + k2 + k3 + k4 + k5;
			System.out.println("The Relative Molecular mass of ");
			System.out.println(l1 + m1 + l2 + m2 + l3 + m3 + l4 + m4 + l5 + m5);
			System.out.println("is " + tot + " .");
		} else if (amo == 6) {
			k1 = (double) output.get(0) / 10;
			k2 = (double) output.get(1) / 10;
			k3 = (double) output.get(2) / 10;
			k4 = (double) output.get(3) / 10;
			k5 = (double) output.get(4) / 10;
			k6 = (double) output.get(5) / 10;
			l1 = (String) input.get(0);
			l2 = (String) input.get(1);
			l3 = (String) input.get(2);
			l4 = (String) input.get(3);
			l5 = (String) input.get(4);
			l6 = (String) input.get(5);

			m1 = (int) amount.get(0);
			m2 = (int) amount.get(1);
			m3 = (int) amount.get(2);
			m4 = (int) amount.get(3);
			m5 = (int) amount.get(4);
			m6 = (int) amount.get(5);
			double tot = k1 + k2 + k3 + k4 + k5 + k6;
			System.out.println("The Relative Molecular mass of ");
			System.out.println(l1 + m1 + l2 + m2 + l3 + m3 + l4 + m4 + l5 + m5 + l6 + m6);
			System.out.println("is " + tot + " .");
		} else if (amo == 7) {
			k1 = (double) output.get(0) / 10;
			k2 = (double) output.get(1) / 10;
			k3 = (double) output.get(2) / 10;
			k4 = (double) output.get(3) / 10;
			k5 = (double) output.get(4) / 10;
			k6 = (double) output.get(5) / 10;
			k7 = (double) output.get(6) / 10;
			l1 = (String) input.get(0);
			l2 = (String) input.get(1);
			l3 = (String) input.get(2);
			l4 = (String) input.get(3);
			l5 = (String) input.get(4);
			l6 = (String) input.get(5);
			l7 = (String) input.get(6);
			m1 = (int) amount.get(0);
			m2 = (int) amount.get(1);
			m3 = (int) amount.get(2);
			m4 = (int) amount.get(3);
			m5 = (int) amount.get(4);
			m6 = (int) amount.get(5);
			m7 = (int) amount.get(6);
			double tot = k1 + k2 + k3 + k4 + k5 + k6 + k7;
			System.out.println("The Relative Molecular mass of ");
			System.out.println(l1 + m1 + l2 + m2 + l3 + m3 + l4 + m4 + l5 + m5 + l6 + m6 + l7 + m7);
			System.out.println("is " + tot + " .");
		} else if (amo == 8) {
			k1 = (double) output.get(0) / 10;
			k2 = (double) output.get(1) / 10;
			k3 = (double) output.get(2) / 10;
			k4 = (double) output.get(3) / 10;
			k5 = (double) output.get(4) / 10;
			k6 = (double) output.get(5) / 10;
			k7 = (double) output.get(6) / 10;
			k8 = (double) output.get(7) / 10;

			l1 = (String) input.get(0);
			l2 = (String) input.get(1);
			l3 = (String) input.get(2);
			l4 = (String) input.get(3);
			l5 = (String) input.get(4);
			l6 = (String) input.get(5);
			l7 = (String) input.get(6);
			l8 = (String) input.get(7);

			m1 = (int) amount.get(0);
			m2 = (int) amount.get(1);
			m3 = (int) amount.get(2);
			m4 = (int) amount.get(3);
			m5 = (int) amount.get(4);
			m6 = (int) amount.get(5);
			m7 = (int) amount.get(6);
			m8 = (int) amount.get(7);
			double tot = k1 + k2 + k3 + k4 + k5 + k6 + k7 + k8;
			System.out.println("The Relative Molecular mass of ");
			System.out.println(l1 + m1 + l2 + m2 + l3 + m3 + l4 + m4 + l5 + m5 + l6 + m6 + l7 + m7 + l8 + m8);
			System.out.println("is " + tot + " .");

		} else if (amo == 9) {
			k1 = (double) output.get(0) / 10;
			k2 = (double) output.get(1) / 10;
			k3 = (double) output.get(2) / 10;
			k4 = (double) output.get(3) / 10;
			k5 = (double) output.get(4) / 10;
			k6 = (double) output.get(5) / 10;
			k7 = (double) output.get(6) / 10;
			k8 = (double) output.get(7) / 10;
			k9 = (double) output.get(8) / 10;

			l1 = (String) input.get(0);
			l2 = (String) input.get(1);
			l3 = (String) input.get(2);
			l4 = (String) input.get(3);
			l5 = (String) input.get(4);
			l6 = (String) input.get(5);
			l7 = (String) input.get(6);
			l8 = (String) input.get(7);
			l9 = (String) input.get(8);

			m1 = (int) amount.get(0);
			m2 = (int) amount.get(1);
			m3 = (int) amount.get(2);
			m4 = (int) amount.get(3);
			m5 = (int) amount.get(4);
			m6 = (int) amount.get(5);
			m7 = (int) amount.get(6);
			m8 = (int) amount.get(7);
			m9 = (int) amount.get(8);

			double tot = k1 + k2 + k3 + k4 + k5 + k6 + k7 + k8 + k9;
			System.out.println("The Relative Molecular mass of ");
			System.out.println(l1 + m1 + l2 + m2 + l3 + m3 + l4 + m4 + l5 + m5 + l6 + m6 + l7 + m7 + l8 + m8 + l9 + m9);
			System.out.println("is " + tot + " .");
		} else if (amo == 10) {
			k1 = (double) output.get(0) / 10;
			k2 = (double) output.get(1) / 10;
			k3 = (double) output.get(2) / 10;
			k4 = (double) output.get(3) / 10;
			k5 = (double) output.get(4) / 10;
			k6 = (double) output.get(5) / 10;
			k7 = (double) output.get(6) / 10;
			k8 = (double) output.get(7) / 10;
			k9 = (double) output.get(8) / 10;
			k10 = (double) output.get(9) / 10;
			l1 = (String) input.get(0);
			l2 = (String) input.get(1);
			l3 = (String) input.get(2);
			l4 = (String) input.get(3);
			l5 = (String) input.get(4);
			l6 = (String) input.get(5);
			l7 = (String) input.get(6);
			l8 = (String) input.get(7);
			l9 = (String) input.get(8);
			l10 = (String) input.get(9);
			m1 = (int) amount.get(0);
			m2 = (int) amount.get(1);
			m3 = (int) amount.get(2);
			m4 = (int) amount.get(3);
			m5 = (int) amount.get(4);
			m6 = (int) amount.get(5);
			m7 = (int) amount.get(6);
			m8 = (int) amount.get(7);
			m9 = (int) amount.get(8);
			m10 = (int) amount.get(9);

			double tot = k1 + k2 + k3 + k4 + k5 + k6 + k7 + k8 + k9 + k10;
			System.out.println("The Relative Molecular mass of ");
			System.out.println(l1 + m1 + l2 + m2 + l3 + m3 + l4 + m4 + l5 + m5 + l6 + m6 + l7 + m7 + l8 + m8 + l9 + m9
					+ l10 + m10);
			System.out.println("is " + tot + " .");
		} else {
			System.out.println("The maximum number of element is 10.");
		}

	}
}
