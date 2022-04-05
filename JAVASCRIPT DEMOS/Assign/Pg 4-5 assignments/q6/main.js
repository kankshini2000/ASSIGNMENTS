var num=prompt("enter the no:");
let sum=0;
var choose=prompt("enter the number bte 1 and 2:");
if(choose==1){
    for(let i=1; i<=num ;i++){
        sum=sum+i;
    }
    document.write("the sum of nos is: " +sum);
    
}
else if(choose==2){
    for(let i=1; i<=num ;i++){
        if(i%3==0 || i%5==0){
            sum=sum+i;
        }
    }
    document.write("the sum of nos is: " +sum);
}
else{
   alert("enter a valid no");
}