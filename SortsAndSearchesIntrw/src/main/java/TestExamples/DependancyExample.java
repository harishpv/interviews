package TestExamples;

import com.google.gson.Gson;

import TestExamples.javaSamplePojos.Employee;

public class DependancyExample {

	public static void main(String args[]) {
		Gson gson = new Gson();
		
		Employee e = new Employee();
		e.setId("1");
		e.setName("Jaggu");
		
		System.out.println(gson.toJson(e));
	}
}
