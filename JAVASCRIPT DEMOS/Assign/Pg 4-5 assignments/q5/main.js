var num=prompt("enter the no:")
let sum=0;

for(let i=1; i<=num ;i++){
    if(i%3==0 || i%5==0){
        sum=sum+i;
    }
}
document.write("the sum of nos is: " +sum)