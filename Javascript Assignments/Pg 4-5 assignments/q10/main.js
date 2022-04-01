var year=2019;
var cnt=0;
while(cnt<20){
    if((year%4==0 && year%100!==0)||(year%400==0)){
        alert(year);
        cnt+=1;
    }
    year+=1;
}