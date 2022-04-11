// /**
//  * 1.	Promises: Create 2 promises, one generates value of x & another generates value of y.
//  *  Write a program to print sum of x & y. (Use Promise.all)
//  */
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
var promise1 = new Promise(function (resolve, reject) {
    var x = 2;
    if (x != 0) {
        resolve(x);
    }
    else {
        reject("x value is 0");
    }
});
var promise2 = new Promise(function (resolve, reject) {
    var y = 5;
    if (y != 0) {
        resolve(y);
    }
    else {
        reject("y value is 0");
    }
});
Promise.all([promise1, promise2]).then(function (values) {
    var sum = 0;
    for (var num in values) {
        sum += values[num];
    }
    console.log(sum);
});
/**
 * 2.	TypeScript classes & types: Write a class Account with attributes id, name, balance.
 * Add two sub classes SavingAccount & CurrentAccount having specific attribute interest &
 * cash_credit respectively. Create multiple saving & current account objects.
 * Write a functionality to find out total balance in the bank.
 */
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
var SavingAccountObj = new SavingAccount(12, "Kanshi", 8000, 10);
console.log(SavingAccountObj.getBalance());
var CurrentAccountObj = new CurrentAccount(12, "ANusha", 140000, 100);
console.log(CurrentAccountObj.getBalance());
// 3.	TypeScript Interfaces: Write an interface Printable. Create 2 objects circle & employee those implement Printable interface.
//  Write a function printAll() that takes all objects as argument & invoke print() method on every object.
var Circle = /** @class */ (function () {
    function Circle(radius) {
        this.radius = radius;
    }
    Circle.prototype.print = function () {
        return "The radius of Circle is " + this.radius + "\nArea is " + (Math.PI * this.radius * this.radius);
    };
    return Circle;
}());
var Employee = /** @class */ (function () {
    function Employee(ename, eid, edesignatio) {
        this.eid = eid;
        this.ename = ename;
        this.edesignatio = edesignatio;
    }
    Employee.prototype.print = function () {
        return "Employee Details:\n" + "Employee Id:" + this.eid + "\n" + "Employee Name: " + this.ename
            + "\n" + "Employee Designation: " + this.edesignatio;
    };
    return Employee;
}());
function printAll(obj1, obj2) {
    console.log(obj1.print());
    console.log(obj2.print());
}
var circleObj = new Circle(2);
var employeeObj = new Employee("Neha", 12345, "Manager");
printAll(circleObj, employeeObj);
