package Imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import Imperative.Main.Person;

public class Main {

	public static void main(String[] args) {
		List<Person> people = List.of(
			new Person("Remon", Gender.MALE),
			new Person("Tomon", Gender.MALE),
			new Person("Tonu", Gender.FEMALE),
			new Person("Nusaibah", Gender.FEMALE),
			new Person("Rikta", Gender.FEMALE),
			new Person("Tayabur", Gender.MALE)
		);
		
		List<Person> femaleList = new ArrayList<Person>();
		

		System.out.println("//Imperative approach");
		for(Person person: people) {
			if(Gender.FEMALE.equals(person.gender)) {
				femaleList.add(person);
			}
		}
		for(Person person: femaleList) {
			System.out.println(person);
		}

		System.out.println("//Declarative Approach");
		Predicate<Person> predicate = person -> (Gender.FEMALE.equals(person.gender));
		List<Person> femaleList2 = people.stream().filter(predicate).collect(Collectors.toList());
		femaleList2.forEach(System.out::println);
		
		

	}
	
	public static class Person{
		private String name;
		private Gender gender;
		
		public Person(String name, Gender gender) {
			this.name = name;
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", gender=" + gender + "]";
		}
	}
	
	enum Gender{
		MALE, FEMALE
	}

}
