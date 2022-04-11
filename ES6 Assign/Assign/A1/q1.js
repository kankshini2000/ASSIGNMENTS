/**
 * 1.	Constants: Declare a constant & confirm its value cannot be changed.
 */
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var num = 10;
console.log(num);
// We will get error saying: "Uncaught TypeError: Assignment to constant variable."
// /**
//  * 2.	Scoping: Declare a variable inside if condition & make sure that it is not 
//  * accessible outside if condition
//  */
function test(num) {
    if (num % 2) {
        var x = num;
        console.log(x);
    }
    else {
        // console.log(x);  // Uncaught ReferenceError: x is not defined
    }
}
//  /**
//   * 3.	Enhanced object properties: Create an ‘Order’ object having data members 
//   * ‘id’, ‘title’, ‘price’. Add the methods printOrder() & getPrice(). Now, 
//   * copy the order object using Object.assign().
//   */
var Order = {
    id: 10,
    title: 'order',
    price: 100,
    printOrder: function () {
        console.log(this.id + " " + this.title + " " + this.price);
    },
    getPrice: function () {
        return this.price;
    }
};
var CopyObject = Object.assign(Order);
console.log(CopyObject);
// /**
//  4.	Arrow functions: Take an array of strings & convert it into another array 
//  of object which has two properties {string, string_length}. For example:
// let names = [‘Tom’, ‘Ivan’, ‘Jerry’]
// Output: [ {name: ’Tom’, length: 3}, {name: ’Ivan’, length: 4 }, {name: ’Jerry’, length: 5} ]
//  */
var StringArray = ['Tom', 'Ivan', 'Jerry'];
var arrowFunction = function (StringArray) {
    var resArray = [];
    StringArray.map(function (ele) {
        var object = {
            name: "",
            length: 0
        };
        object.name = ele;
        object.length = ele.length;
        resArray.push(object);
    });
    return resArray;
};
console.log(arrowFunction(StringArray));
//  /**
//    5.	Extended parameter handling:
// a.	Write a add() with default values.
// b.	Write a function userFriends() that takes 2 arguments username & array of user friends.
//  The function should print username & his list of friends. (Use rest parameters)
// c.	Write a function printCapitalNames() that takes five names as argument & prints them in 
// capital letters. Use spread operator in order to call printCapitalNames() function.
//   */
// // ans A. Defaul values
function add(a, b) {
    if (b === void 0) { b = 10; }
    console.log(a + b);
}
add(10, 40);
add(5);
// // ans B. 
function userFriends(username) {
    var arg = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        arg[_i - 1] = arguments[_i];
    }
    console.log("Name: " + username);
    console.log("Friends: ");
    for (var i in arg) {
        console.log(arg[i]);
    }
}
userFriends("Kanshi", "ANusha", "Shreya", "BTS");
//  //ans C.
function printCapitalNames(name1, name2, name3, name4, name5) {
    console.log("Names after");
    console.log(name1.toUpperCase() + " " + name2.toUpperCase() + " " + name3.toUpperCase() + " " + name4.toUpperCase() + " " + name5.toUpperCase());
}
var nameList = ["Mohsin", "Nusair", "basha", "shaik", "prajwal"];
console.log("Names Before: ", nameList);
printCapitalNames.apply(void 0, nameList);
// /**
//  * 6.	Template literals: Draft a ticket to Sysnet that describes problem with your laptop. 
//  * Use ‘template literals’ to add value of laptop model, your desk no, your name etc.
//  */
var laptop_model = "ASUS TUF505DV";
var deskNo = 1;
var name = "Kanshi";
console.log("TICKET:\nProblem: laptop screen is flickering\nlaptop Model: ".concat(laptop_model, "\ndeskNo: ").concat(deskNo, "\nName: ").concat(name));
// /**
//  * 7.	De-structuring assignment:
// a.	Suppose there is a javascript array with 4 elements. Print the value of 3rd element 
// using array matching.
// b.	Create an organization object having attributes name, address. Write a program to 
// retrieve pin code of an address using object deep matching.
//  */
// ans a.
var names = ["ASAP", "ROCKY", "LAFLAME", "LEE"];
var firstele = names[0], secondele = names[1], thirdele = names[2], fourthele = names[3];
console.log(thirdele);
// //Ans b.
var organization = {
    name: "capgemini",
    address: {
        city: "wardha",
        state: "Maharstra",
        pincode: 442001
    }
};
var _a = organization.address, city1 = _a.city, state1 = _a.state, pincode1 = _a.pincode;
console.log(pincode1);
// /**
//  * 8.	Classes & Modules: Write a class Account with attributes id, name, balance. 
//  * Add two sub classes SavingAccount & CurrentAccount having specific attribute 
//  * interest & cash_credit respectively. Create multiple saving & current account objects. 
//  * Write a functionality to find out total balance in the bank.
//  */
var Account = /** @class */ (function () {
    function Account(id, name, balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    return Account;
}());
var SavingAccount = /** @class */ (function (_super) {
    __extends(SavingAccount, _super);
    function SavingAccount(id, name, balance, interest) {
        var _this = _super.call(this, id, name, balance) || this;
        _this.interest = interest;
        return _this;
    }
    SavingAccount.prototype.getBalance = function () {
        this.totalBalance = 0;
        this.totalBalance = this.balance + (this.balance * this.interest);
        return this.totalBalance;
    };
    return SavingAccount;
}(Account));
var CurrentAccount = /** @class */ (function (_super) {
    __extends(CurrentAccount, _super);
    function CurrentAccount(id, name, balance, cash_credit) {
        var _this = _super.call(this, id, name, balance) || this;
        _this.cash_credit = cash_credit;
        return _this;
    }
    CurrentAccount.prototype.getBalance = function () {
        this.totalBalance = 0;
        this.totalBalance = this.balance - this.cash_credit;
        return this.totalBalance;
    };
    return CurrentAccount;
}(Account));
var SavingAccountObj = new SavingAccount(2, "Kanshi", 8000, 10);
console.log(SavingAccountObj.getBalance());
var CurrentAccountObj = new CurrentAccount(2, "ANusha", 140000, 100);
console.log(CurrentAccountObj.getBalance());
