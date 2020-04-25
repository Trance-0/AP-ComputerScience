package info;

import java.util.Scanner;

public class PascalsTriangleCalculateSystem {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Which line do you need?");
		Scanner in = new Scanner(System.in);
		long line = in.nextInt();
		if (line <= 20) {
			long num = 1;
			long i = 1;
			System.out.print("1");
			System.out.print(" ");
			while (line >= i) {
				long nn = line;
				long n = 1;
				long j1 = 1;
				while (j1 < nn + 1) {
					n = n * j1;
					j1++;
				}
//			System.out.println(n);
				long mm = line;
				long m = 1;
				long j2 = 1;
				while (j2 < i + 1) {
					m = m * j2;
					j2++;
				}
//			System.out.println(m);
				long nnmm = line - i;
				long nm = 1;
				long j3 = 1;
				while (j3 < nnmm + 1) {
					nm = nm * j3;
					j3++;
				}
//			System.out.println(nm);
				long sum = n / (m * nm);
				System.out.print(sum);
				System.out.print(" ");
				i++;
			}

		} else {
			System.out.println("Sorry the biggest number we can have is 20");
			System.out.println("if you need bigger number, please enter,");
			System.out.println("\"Y\"to change to float number,");
			System.out.println("\"N\" to cancel.");
			Scanner kn = new Scanner(System.in);
			String answer = kn.nextLine();
			if (answer.compareTo("Y") == 0) {
				double line1 = kn.nextInt();
				if (line1 <= 20) {
					double num = 1;
					double i = 1;
					System.out.print("1");
					System.out.print(" ");
					while (line >= i) {
						double nn = line1;
						double n = 1;
						double j1 = 1;
						while (j1 < nn + 1) {
							n = n * j1;
							j1++;
						}
//				System.out.println(n);
						double mm = line1;
						double m = 1;
						double j2 = 1;
						while (j2 < i + 1) {
							m = m * j2;
							j2++;
						}
//				System.out.println(m);
						double nnmm = line1 - i;
						double nm = 1;
						double j3 = 1;
						while (j3 < nnmm + 1) {
							nm = nm * j3;
							j3++;
						}
//				System.out.println(nm);
						double sum = n / (m * nm);
						System.out.print(sum);
						System.out.print(" ");
						i++;
					}

				}
			} else if (answer.compareTo("N") == 0) {
				System.out.print("ever say no to me, please.");

			} else {
				System.out.println("What are you **** saying?");
				Thread.sleep(1000 * 2);
				System.out.println("Just enter Y or N ok?");
				Thread.sleep(1000 * 2);
				System.out.println("Is it very HARD to do so?");
				Thread.sleep(1000 * 2);
				System.out.println("Could you please bring your brain to use the computer?");
				Thread.sleep(1000 * 2);
				System.out.println("I really want to die if it is possible.");
				Thread.sleep(1000 * 2);
				System.out.print("I will give you another chance to choose.");
				Scanner zn = new Scanner(System.in);
				String lastanswer = zn.nextLine();
				if (lastanswer.compareTo("Y") == 0) {
					System.out.println("Which line do you need?");
					Scanner yn = new Scanner(System.in);
					double line1 = yn.nextInt();
					if (line1 <= 20) {
						double num = 1;
						double i = 1;
						System.out.print("1");
						System.out.print(" ");
						while (line >= i) {
							double nn = line1;
							double n = 1;
							double j1 = 1;
							while (j1 < nn + 1) {
								n = n * j1;
								j1++;
							}
//						System.out.println(n);
							double mm = line1;
							double m = 1;
							double j2 = 1;
							while (j2 < i + 1) {
								m = m * j2;
								j2++;
							}
//						System.out.println(m);
							double nnmm = line1 - i;
							double nm = 1;
							double j3 = 1;
							while (j3 < nnmm + 1) {
								nm = nm * j3;
								j3++;
							}
//						System.out.println(nm);
							double sum = n / (m * nm);
							System.out.print(sum);
							System.out.print(" ");
							i++;
						}

					}
				} else if (lastanswer.compareTo("N") == 0) {
					System.out.print("ever say no to me, please.");

				} else {
					System.out.println("What?");
					Thread.sleep(1000 * 1);
					System.out.println("Again??");
					Thread.sleep(1000 * 1);
					System.out.println("Is it EXTREMELY HARD to do so?");
					Thread.sleep(1000 * 2);
					System.out.println("Could you save some time, please?");
					Thread.sleep(1000 * 2);
					System.out.println("You need some detention.");
					Thread.sleep(1000 * 2);
					System.out.println("**********************************************");
					System.out.println("*             DETENTION WARNING              *");
					System.out.println("* ------------------ 001 ------------------- *");
					System.out.println("*    THIS IS THE LAST CHANCE YOU WILL HAVE   *");
					System.out.println("**********************************************");
					Scanner jn = new Scanner(System.in);
					String answer3 = jn.nextLine();
					if (answer3.compareTo("Y") == 0) {
						System.out.println("Which line do you need?");
						Scanner yn = new Scanner(System.in);
						double line1 = yn.nextInt();
						if (line1 <= 20) {
							double num = 1;
							double i = 1;
							System.out.print("1");
							System.out.print(" ");
							while (line >= i) {
								double nn = line1;
								double n = 1;
								double j1 = 1;
								while (j1 < nn + 1) {
									n = n * j1;
									j1++;
								}
//								System.out.println(n);
								double mm = line1;
								double m = 1;
								double j2 = 1;
								while (j2 < i + 1) {
									m = m * j2;
									j2++;
								}
//								System.out.println(m);
								double nnmm = line1 - i;
								double nm = 1;
								double j3 = 1;
								while (j3 < nnmm + 1) {
									nm = nm * j3;
									j3++;
								}
//								System.out.println(nm);
								double sum = n / (m * nm);
								System.out.print(sum);
								System.out.print(" ");
								i++;
							}

						}
					} else if (answer3.compareTo("N") == 0) {
						System.out.print("ever say no to me, please.");

					} else {
						int detention = 1;
						System.out.print("Here is Mr.Detenton.");
						Thread.sleep(1000 * 2);
						System.out.println("Hello, poor student, my name is Detenton.");
						Thread.sleep(1000 * 2);
						System.out.println("So, what's your problem.");
						Scanner de = new Scanner(System.in);
						String det1 = de.nextLine();
						if (det1.indexOf("I don't have any problem.") >= 0) {
							Thread.sleep(1000 * 1);
							System.out.println("Ok, now you have.");
							Thread.sleep(1000 * 1);
							System.out.println("Here is your detention, you deserve it, my boy.");
							Thread.sleep(1000 * 1);
						} else {
							System.out.println("What? I can't understand what you are talking.");
							Thread.sleep(1000 * 1);
							System.out.println("You need some detention to heal you, my boy.");
						}
						while (detention <= 10000) {
							System.out.println(" *  DETENTION " + detention + "  * ");
							Thread.sleep(10* 1);
							detention++;
						}
					}
				}
			}
		}
	}
}
