class Rectangle {
    constructor(len, width) {
      this.len = len;
      this.width = width;
    }
    area(){
        return this.len*this.width;
    }
  }
  
  obj1 = new Rectangle(4,10);
  document.write("len is: "+obj1.len+"width is: "+obj1.width+"</br>");
  obj1.width = 5;
  document.write("area is :"+obj1.area());