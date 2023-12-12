package emp;

import java.util.ArrayList;
import java.util.Scanner;

public class XYZOrg {

	public static void main(String[] args) {
		
//		Indivisual object 
		
//		Employee e1= new Employee();
//		System.out.println(e1);
//		
//		
//		Employee e2 = new Employee(101,"Eshan",10000);
//		System.out.println(e2);
		
		
		
//		Array object
		
		
		ArrayList<Employee> empList=new ArrayList<Employee>();
		Scanner sc= new Scanner(System.in);
		int flag=0;
		int flag1=0;
		
		boolean open = true;
		do {
			System.out.println("1)Add new Employee\n2)Display record\n3)Exit\n4)Delete\n5)update");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the EmpId:");
				int id= sc.nextInt();sc.nextLine();
				System.out.println("Enter the EmpName:");
				String empName= sc.nextLine();
				System.out.println("Enter the salary:");
				int salary= sc.nextInt();
				
				
				empList.add(new Employee(id,empName,salary));
				System.out.println("Employee added successfully...............");
				break;
				
				
				
			case 2:
				System.out.println("*************************Employee records are****************************** ");
				for(Employee emp : empList) {
					System.out.println(emp);
				}
				System.out.println("**************************************************************************");
				break;
				
			case 3:
				open=false;
				System.out.println("Exit Successfull..................");
				break;
				
			case 4:
				System.out.println("Enter the name to Delete: ");
				String nm= sc.next();
				
				for(int i=0;i<empList.size();i++) {
					if(empList.get(i).getEmpName().equals(nm)) {
						empList.remove(i);
						System.out.println("Deleted successfully.........");
						flag=1;
						break;
					}
				}
				if(flag==0) {
					System.out.println("Record is not available..................");
				}
				break;
				
			case 5:
//				System.out.println("Enter the name whose data want to update:  ");
//				String oldnm=sc.next();
				
				System.out.println("Choose to Update \n4.1]Update name \n4.2]Update salary");
				int ch1=sc.nextInt();
				
				switch(ch1) {
				
				case 1:
//					for(int i=0;i<empList.size();i++) {
//						if(empList.get(i).getEmpName().equals(oldnm)) {
//							System.out.println("Enter the new name to replace "+empList.get(i).getEmpName());
//							String newName=sc.next();
//							empList.get(i).setempName(newName);
//							System.out.println("Name updated successfully.........");
//							flag1=1;
//							break;
//						}
//					}
//					if(flag1==0) {
//						System.out.println("Record is not available as entered name..................");
//					}
					
					break;
					
					
				
				
			case 2:
				for(int i=0;i<empList.size();i++) {
//					if(empList.get(i).getEmpName().equals(oldnm)) {
//						System.out.println("Enter the price condition:  ");
//						int Sal1=sc.nextInt();
						
						if(empList.get(i).getsalary()<5000) {
							empList.get(i).setsalary(empList.get(i).getsalary()+empList.get(i).getsalary()*0.05);
							System.out.println("Salary updated successfully1.........");
							flag1=1;
							
						}else if(empList.get(i).getsalary()<10000 && empList.get(i).getsalary()>=5000) {
							empList.get(i).setsalary(empList.get(i).getsalary()+empList.get(i).getsalary()*0.07);
							System.out.println("Salary updated successfully2.........");
							flag1=1;
							
						}else if(empList.get(i).getsalary()<15000 && empList.get(i).getsalary()>=10000) {
							empList.get(i).setsalary(empList.get(i).getsalary()+empList.get(i).getsalary()*0.1);
//							System.out.println("Set complete");
							System.out.println("Salary updated successfully.........");
							flag1=1;
							
						}else {
//							System.out.println(empList.get(i).getsalary()+empList.get(i).getsalary()*0.15);
							empList.get(i).setsalary(empList.get(i).getsalary()+empList.get(i).getsalary()*0.15);
							System.out.println("Salary updated successfully3.........");
							flag1=1;
							
						}
						
						
						
						
//						System.out.println("Enter the incriment percent:  ");
//						int per=sc.nextInt();
						
//						empList.get(i).setsalary(empList.get(i).getsalary()*(per/100+1));
//						System.out.println("Salary updated successfully.........");
//						flag1=1;
						
//					}
				}
				if(flag1==0) {
					System.out.println("Record is not available as entered name..................");
				}
				
				break;
				
				default:
					System.out.println("Invalid choice.....");
				
			}
				
				
				
				
				
				
				
				
				default:
					System.out.println("Invalid Choice.....");
					break;
			}
			
			
		}while(open);

	}

}
