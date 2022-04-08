class person {
    constructor(name, age) {
      this.name = name;
      this.age = age;
    }
    intro(){
        return "hello this is: "+this.name+ "i'm "+this.age +"years old";
    }
  }
  
 p1 = new person("Ford", 18);
 document.write(p1.intro()+"</br>");
 p1.name="ana"
 document.write(p1.intro()+"</br>");
 document.write('since there is no moddle name defined hence :'+p1.middlename+"</br>");
 p1.middlename="Bob";
 document.write(p1.intro()+"n the middle name is "+p1.middlename);
 
