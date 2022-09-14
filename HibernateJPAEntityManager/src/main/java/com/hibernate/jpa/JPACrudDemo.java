
package com.hibernate.jpa;

import java.util.Scanner;

public class JPACrudDemo {

	public static void main(String[] args) {
		JpaCrudOperation jp = new JpaCrudOperation();
		Scanner sc = new Scanner(System.in);
		int input;
		System.out.println("********** JPA CRUD OPERATIONS **********");
		do {
			System.out.println("Enter a operation you want: ");
			System.out.println("1. CREATE NEW RECORD");
			System.out.println("2. FETCH SINGLE RECORD");
			System.out.println("3. FETCH MULTIPLE RECORD");
			System.out.println("4. UPDATE RECORD");
			System.out.println("5. DELETE RECORD");
			System.out.println("6.Exit");

			System.out.println("Enter a user input :");
			input = sc.nextInt();
			switch (input) {
			case 1:
				System.out.println("Enter id:");
				int id = sc.nextInt();
				System.out.println("Enter name:");
				String name = sc.next();
				Student st = new Student(name, id);
				jp.insertRecord(st);
				break;
			case 2:
				System.out.println("Enter id of record that you want to search:");
				int id1 = sc.nextInt();
				jp.findRecordById(id1);
				break;
			case 3:
				jp.fetchAllRecords();
				break;
			case 4:
				System.out.println("Enter id of record that you want to update:");
				int id2 = sc.nextInt();
				System.out.println("Enter name:");
				String name1 = sc.next();
				jp.updateRecordById(id2, name1);
				break;
			case 5:
				System.out.println("Enter id of record that you want to delete:");
				int id3 = sc.nextInt();
				jp.deleteRecordById(id3);
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Input");
				input++;
			}

		} while (input != 6);

	}

}
