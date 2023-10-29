package tester;

import static utils.CustomerValRules.login;
import static utils.CustomerValRules.validate;
import static utils.populatecustm.populatelist;
import static utils.populatecustm.populatemap;
import static utils.IO.store;
import static utils.IO.restore;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import classes.Customer;
import vechilexcepn.CustomerExceptn;

public class Custom {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws CustomerExceptn {
		boolean exit = false;
		List<Customer> clist = new ArrayList<>();
		clist = populatelist();
		Map<String,Customer> cmap=populatemap(clist);
		
		try (Scanner sc = new Scanner(System.in)) {

			while (!exit) {
				System.out.println("Enter Option :");
				switch (sc.nextInt()) {
				case 1:
					System.out.println(
							"Enter firstname, lastname, email,  password, regamt, dob (yyyy-mm-dd),ServicePlan ");
					clist.add(validate(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(),
							sc.next(), clist));

					break;
				case 2:
					System.out.println("Enter email");
					String email = sc.next();
					System.out.println("Enter password");
					String Pass = sc.next();
					Customer cust = login(email, Pass, clist);
					System.out.println(cust);

					break;
				case 3:
//			for(Customer c:clist)				
//				System.out.println(c);
					clist.stream().forEach(c -> System.out.println(c));
					break;
				case 4:
					System.out.println("Enter email , old pwd , new pwd");

					cust = login(sc.next(), sc.next(), clist);
					cust.setPassword(sc.next());
					break;
				case 5:
					//Collections.sort(clist);

					 clist.stream().sorted().forEach(c->System.out.println(c));
					break;
				case 6:
//					Collections.sort(clist, new Comparator<Customer>() {
//						public int compare(Customer c1, Customer c2) {
//							int a = c1.getDob().compareTo(c2.getDob());
//							if (a == 0)
//								return ((Double) c1.getRegamt()).compareTo(c2.getRegamt());
//							return a;
//
//						}
//					}
//
//					);
					clist.stream().sorted((c1,c2)->((Double)c1.getRegamt()).compareTo(c2.getRegamt())).forEach(c->System.out.println(c));
					break;
				case 7:
					cmap.values().stream().forEach(e->System.out.println(e));
					break;
				case 8:
					System.out.println("Enter File name .ser ");
					store(sc.next(),cmap);
					break;
				case 9:
					System.out.println("Enter File name .ser");
					Map<String,Customer> map=restore(sc.next());
					map.values().stream().forEach(s->System.out.println(s));
					break;
				case 0:
					exit = true;
					break;

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
