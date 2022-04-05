var x = "hello\nworld\nin\na\nframe";

function star(str) {
  let arr = [];
  arr = str.split("\n");
  for (let index = 0; index < 1; index++) {
    console.log("*******");
    for (let j = 0; j <= arr.length; j++) {
     arr == arr[j].split(",");
     document.write("*" + arr[j] + "*" +"<br>");
    }
  }
  document.write("******");
  return arr;
}
document.write(star(x));