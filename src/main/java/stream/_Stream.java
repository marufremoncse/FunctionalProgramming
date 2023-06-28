package stream;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _Stream {

	public static void main(String[] args) {
		List<Person> people = List.of(
				new Person("Remon", Gender.MALE),
				new Person("Tomon", Gender.MALE),
				new Person("Tonu", Gender.FEMALE),
				new Person("Nusaibah", Gender.FEMALE),
				new Person("Rikta", Gender.FEMALE),
				new Person("Tayabur", Gender.MALE),
				new Person("NoyonTara", Gender.TRANSGENDER)
			);
		
		people.stream().map(person -> person.gender).collect(Collectors.toSet()).forEach(System.out::println);
		
		people.stream().map(person->person.name).forEach(System.out::println);
		
		people.stream().map(person->person.name).mapToInt(String::length).forEach(System.out::println);
		Predicate<Person> isFemale = person -> Gender.FEMALE.equals(person.gender);
		boolean isMatch = people.stream().noneMatch(isFemale);
		System.out.println(isMatch);
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
		MALE, FEMALE, TRANSGENDER
	}

}
