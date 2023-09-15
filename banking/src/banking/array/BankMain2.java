package banking.array;

import java.util.Scanner;

public class BankMain2 {
	// 계좌를 저장할 배열의 크기 100개로 설정
	static Account[] accounts = new Account[100];
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean sw = true;

		while (sw) {
			System.out.println("============================================");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.입금 | 4.출금 | 5.종료");
			System.out.println("============================================");
			System.out.print("선택> ");

			// 메뉴 선택
			int selectNo = Integer.parseInt(scanner.nextLine());

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				getAccountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				sw = false;
			} else {
				System.out.println("지원하지 않는 기능입니다. 다시 입력해주세요.");
			}

		}
		System.out.println("프로그램을 종료합니다.");
		scanner.close();

	}

	// 계좌 생성
	private static void createAccount() {
		System.out.println("============================================");
		System.out.println("계좌 생성");
		System.out.println("============================================");

		while (true) {
			System.out.print("계좌번호를 입력해주세요: ");
			String ano = scanner.nextLine();
			if (findAccount(ano) != null) {
				System.out.println("계좌번호가 중복되었습니다. 다시 입력해주세요. ");
			} else {
				System.out.print("이름을 입력해주세요: ");
				String owner = scanner.nextLine();

				System.out.print("입금액: ");
				int balance = Integer.parseInt(scanner.nextLine());

				// accounts[0] = new Account(ano, owner, balance);
				for (int i = 0; i < accounts.length; i++) {
					if (accounts[i] == null) {
						accounts[i] = new Account(ano, owner, balance);
						System.out.println("계좌 생성 완료.");
						break;
					}
				}
				break;
			}
		}

	}

	// 계좌 목록
	private static void getAccountList() {
		System.out.println("============================================");
		System.out.println("계좌 목록");
		System.out.println("============================================");

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {

				System.out.print("계좌번호: " + accounts[i].getAno() + "\t");
				System.out.print("계좌주: " + accounts[i].getOwner() + "\t");
				System.out.println("잔고: " + accounts[i].getBalance() + "원");
			}

		}
	}

	// 입금
	private static void deposit() {
		System.out.println("============================================");
		System.out.println("입금");
		System.out.println("============================================");

		System.out.print("계좌번호를 입력해주세요: ");
		String ano = scanner.nextLine();

		System.out.print("입금액: ");
		int money = Integer.parseInt(scanner.nextLine());

		if (findAccount(ano) != null) {
			Account account = findAccount(ano);
			account.setBalance(account.getBalance() + money);
			System.out.println("결과: 입금 완료되었습니다.");
		} else {
			System.out.println("계좌가 없습니다.");
		}

	}

	// 출금
	private static void withdraw() {
		System.out.println("============================================");
		System.out.println("출금");
		System.out.println("============================================");

		while (true) {
			System.out.print("계좌번호를 입력해주세요: ");
			String ano = scanner.nextLine();
			if (findAccount(ano) != null) {
				while (true) {
					System.out.print("출금액: ");
					int money = Integer.parseInt(scanner.nextLine());

					Account account = findAccount(ano);
					if ((account.getBalance() - money) < 0) {
						System.out.println("잔액이 부족합니다. 다시 입력해주세요.");
					} else {
						account.setBalance(account.getBalance() - money);
						System.out.println("결과: 출금 완료되었습니다.");
						break;
					}
				}break;

			} else {
				System.out.println("계좌가 없습니다. 다시 입력해주세요.");
			}

		}

	}

	// 계좌 검색
	private static Account findAccount(String ano) {
		Account account = null;

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				String dbAno = accounts[i].getAno();
				if (dbAno.equals(ano)) {
					account = accounts[i];
					break;
				}
			}
		}
		return account;
	}

}
