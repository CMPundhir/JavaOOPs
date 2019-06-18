class Animal{
	String species;
	public void showAnimal(){
		System.out.println("species : "+species);
	}
}//   DOg is an  Animal
class Dog extends Animal{
	String name;
	public Dog(){
		
	}
	public Dog(String name,String species){
		this.name = name;
		this.species = species;
	}
	@Override
	public void showAnimal(){
		System.out.println("name : "+name);
		System.out.println("species : "+species);
	}
}
class Oops3{
	public static void main(String[] args){
		/*Dog dog = new Dog();
		dog.name = "Tomy";
		dog.species = "kutta";
		dog.showAnimal();
		*/
		
		Animal jacky = new Dog("Jack","Good Dog");
		jacky.showAnimal();
	}
}