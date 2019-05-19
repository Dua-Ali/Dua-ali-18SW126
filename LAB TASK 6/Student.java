class Student{
		String name;
		int age;
		String address;

		Student(){
			this.name="unknown";
			this.age=0;
			this.address="not available";
		}	
	
		public void setInfo(String name,int age){
			System.out.println(this.name=name);
			System.out.println(this.age=age);
		}
	
		public void setInfo(String name,int age,String address){
			System.out.println(	this.name=name);
			System.out.println(this.age=age);
			System.out.println(this.address=address+"\n");
		}

}
class Task5{
		public static void main(String[] args){
				Student[] obj=new Student[10];
		 
				obj[0]=new Student();
				obj[0].setInfo("Dua",16,"house no:9099 Hyderabad");
				
				obj[1]=new Student();
				obj[1].setInfo("Mahrukh",18,"house no:239 Hyderabad");
				
				obj[2]=new Student();
				obj[2].setInfo("Neha",17,"house no:88 Hyderabad");
				
				obj[3]=new Student();
				obj[3].setInfo("ali",17,"house no:400 Dadu");
				
				obj[4]=new Student();
				obj[4].setInfo("Unza",19,"house no:20 Mirpur khass");
				
				obj[5]=new Student();
				obj[5].setInfo("Aemon",14,"house no:78 Jamshoro");
				
				obj[6]=new Student();
				obj[6].setInfo("Yusra",19,"house no:34 Qasimabad");
				
				obj[7]=new Student();
				obj[7].setInfo("Danyial",19,"house no:239 Quetta");				
			
				obj[8]=new Student();
				obj[8].setInfo("nitalia",16,"house no:098 Hyderabad");
				
				obj[9]=new Student();
				obj[9].setInfo("afifa",18,"house no:239 Matiari");	

					}
}