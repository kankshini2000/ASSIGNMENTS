function max(input) {
    //here if stmt check if the imput is array
    //checking whehter the input paramter is an array or not.
    //if (toString.call(input) !== "[object Array]")  --> the old way
    //here tostring returns the string [object Array] ,n we r cheking
    //to make sure the value is of type Array
    if (!Array.isArray(input))  
      return false;
    //here apply accepts an array and it applies the array as parameter
    //to a function
 return Math.max.apply(Math,input );
   }

document.write(max([12,34,56,1]));
