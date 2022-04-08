class Rectangle {
    constructor(len, width) {
      this.len = len;
      this.width = width;
    }
    area(){
        return this.len*this.width;
    }
  }
  
  const obj = new Rectangle(5, 8);
  document.write("the len is : "+obj.len+ "and width of rect is:"+obj.width+"</br>"); 
  document.write("the area of rect is:"+obj.area()); 
