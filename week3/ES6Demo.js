window.onload = function(){
    // let dog = new Dog();
    // dog.name = "fredy";
   // console.log("creating dog: "+ fredy );
    // console.log(dog.name);
    // console.log(dog.fetch());
    // console.log(dog.sayHi());
    



    //fido = new Dog("Fido");
}
// var fido;
class Dog{
	constructor(name){
        this.name = name;
        
    }
    fetch(){
        return "wheres the ball";
    }
	sayHi(){
		return "woof";
	}
	static isDog(animal){
		return Object.getPrototypeOf(animal).constructor.name === this.name;
	}
};






