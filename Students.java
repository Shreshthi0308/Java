package Collections;

public class Students implements Comparable<Students>{
	int rollno;
	String name;
	int age;
	
	Students(int rollno,String name,int age)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
		
	}
   
	public int compareTo(Students st)
	{
		if(age==st.age)
			return 0;
		else if(age>st.age)
			return 1;
		else
			return -1;
		
	}
}
