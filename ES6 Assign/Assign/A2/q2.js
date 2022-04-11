/**
 * 1.	Symbols: Write a class that defines next() method to return next number from
 * Fibonacci series. The class will have a private attributes ‘previousNo’ & ‘currentNo’.
 */
var __generator = (this && this.__generator) || function (thisArg, body) {
    var _ = { label: 0, sent: function() { if (t[0] & 1) throw t[1]; return t[1]; }, trys: [], ops: [] }, f, y, t, g;
    return g = { next: verb(0), "throw": verb(1), "return": verb(2) }, typeof Symbol === "function" && (g[Symbol.iterator] = function() { return this; }), g;
    function verb(n) { return function (v) { return step([n, v]); }; }
    function step(op) {
        if (f) throw new TypeError("Generator is already executing.");
        while (_) try {
            if (f = 1, y && (t = op[0] & 2 ? y["return"] : op[0] ? y["throw"] || ((t = y["return"]) && t.call(y), 0) : y.next) && !(t = t.call(y, op[1])).done) return t;
            if (y = 0, t) op = [op[0] & 2, t.value];
            switch (op[0]) {
                case 0: case 1: t = op; break;
                case 4: _.label++; return { value: op[1], done: false };
                case 5: _.label++; y = op[1]; op = [0]; continue;
                case 7: op = _.ops.pop(); _.trys.pop(); continue;
                default:
                    if (!(t = _.trys, t = t.length > 0 && t[t.length - 1]) && (op[0] === 6 || op[0] === 2)) { _ = 0; continue; }
                    if (op[0] === 3 && (!t || (op[1] > t[0] && op[1] < t[3]))) { _.label = op[1]; break; }
                    if (op[0] === 6 && _.label < t[1]) { _.label = t[1]; t = op; break; }
                    if (t && _.label < t[2]) { _.label = t[2]; _.ops.push(op); break; }
                    if (t[2]) _.ops.pop();
                    _.trys.pop(); continue;
            }
            op = body.call(thisArg, _);
        } catch (e) { op = [6, e]; y = 0; } finally { f = t = 0; }
        if (op[0] & 5) throw op[1]; return { value: op[0] ? op[1] : void 0, done: true };
    }
};
var __classPrivateFieldSet = (this && this.__classPrivateFieldSet) || function (receiver, state, value, kind, f) {
    if (kind === "m") throw new TypeError("Private method is not writable");
    if (kind === "a" && !f) throw new TypeError("Private accessor was defined without a setter");
    if (typeof state === "function" ? receiver !== state || !f : !state.has(receiver)) throw new TypeError("Cannot write private member to an object whose class did not declare it");
    return (kind === "a" ? f.call(receiver, value) : f ? f.value = value : state.set(receiver, value)), value;
};
var __classPrivateFieldGet = (this && this.__classPrivateFieldGet) || function (receiver, state, kind, f) {
    if (kind === "a" && !f) throw new TypeError("Private accessor was defined without a getter");
    if (typeof state === "function" ? receiver !== state || !f : !state.has(receiver)) throw new TypeError("Cannot read private member from an object whose class did not declare it");
    return kind === "m" ? f : kind === "a" ? f.call(receiver) : f ? f.value : state.get(receiver);
};
var _Fibo_previousNo, _Fibo_currentNo;
var Fibo = /** @class */ (function () {
    function Fibo() {
        _Fibo_previousNo.set(this, Symbol());
        _Fibo_currentNo.set(this, Symbol());
        __classPrivateFieldSet(this, _Fibo_previousNo, 0, "f");
        __classPrivateFieldSet(this, _Fibo_currentNo, 1, "f");
    }
    Fibo.prototype.next = function () {
        var nxt = Symbol();
        nxt = __classPrivateFieldGet(this, _Fibo_previousNo, "f") + __classPrivateFieldGet(this, _Fibo_currentNo, "f");
        __classPrivateFieldSet(this, _Fibo_previousNo, __classPrivateFieldGet(this, _Fibo_currentNo, "f"), "f");
        __classPrivateFieldSet(this, _Fibo_currentNo, nxt, "f");
        return nxt;
    };
    return Fibo;
}());
_Fibo_previousNo = new WeakMap(), _Fibo_currentNo = new WeakMap();
var obj = new Fibo();
console.log(obj.next());
console.log(obj.next());
console.log(obj.next());
console.log(obj.next());
console.log(obj.next());
console.log(obj.next());
console.log(obj.next());
// /**
// * 2.	Iterators: Write a program that returns next Armstrong number after 
// * calling getNextArmstrong() method.
// */
var listArmStrong = [0, 1, 153, 370, 371, 407];
var iterator = listArmStrong[Symbol.iterator]();
function getNextArmstrong() {
    return iterator.next().value;
}
console.log(getNextArmstrong());
console.log(getNextArmstrong());
console.log(getNextArmstrong());
// /**
// * 3.	Generators: Write a program that returns next Armstrong number after 
// * calling getNextArmstrong() method. Add functionality to reset generating 
// * Armstrong number from zero. In case, Armstrong number goes above one thousand then
// *  throw an error.
// */
function isArmstrong(num) {
    var d = 0;
    var n1 = num;
    while (n1 > 0) {
        d++;
        n1 = Math.floor(n1 / 10);
    }
    var n = num;
    var arm = 0;
    while (n > 0) {
        var rem = n % 10;
        console.log(rem);
        arm = arm + Math.pow(rem, d);
        n = Math.floor(n / 10);
    }
    if (arm == num) {
        return true;
    }
    else {
        return false;
    }
}
function getNextArmstrong() {
    var i;
    return __generator(this, function (_a) {
        switch (_a.label) {
            case 0:
                i = 0;
                _a.label = 1;
            case 1:
                if (!true) return [3 /*break*/, 6];
                if (!isArmstrong(i)) return [3 /*break*/, 3];
                return [4 /*yield*/, i];
            case 2:
                _a.sent();
                _a.label = 3;
            case 3:
                if (!(i > 1000)) return [3 /*break*/, 5];
                i = 0;
                return [4 /*yield*/, "number is too larger"];
            case 4:
                _a.sent();
                _a.label = 5;
            case 5:
                i++;
                return [3 /*break*/, 1];
            case 6: return [2 /*return*/];
        }
    });
}
var g = getNextArmstrong();
console.log(g.next());
console.log(g.next().value);
console.log(g.next().value);
console.log(g.next().value);
console.log(g.next().value);
console.log(g.next().value);
// /**
// * 4.	Collections: Using Set & Map, create a static data for chatting application. 
// * Here we have 2 chatrooms, every chatroom is having 3 
// * users & every user has posted different messages in a chat room. Note that one user can 
// * belong to a single chat room only. Now you need to find out how you will hold this data 
// * using Set & Map data structures. Also add functionality to get list of all users from a 
// * specific chatroom & listing down all message from a chatroom.
// */
var croom1 = new Map();
var croom2 = new Map();
// adding users and messages
croom1.set("user1", ["Hi user1", "How are you?", "I am fine", "Thank you"]);
croom1.set("user2", ["Hi user2", "How are you?", "I am fine", "Thank you"]);
croom1.set("user3", ["Hi user3", "How are you?", "I am fine", "Thank you"]);
croom2.set("user4", ["Hello user4", "How are you?", "I am fine", "Thank you"]);
croom2.set("user5", ["Hello user5", "How are you?", "I am fine", "Thank you"]);
croom2.set("user6", ["Hello user6", "How are you?", "I am fine", "Thank you"]);
//printing users and messages
var printusers = function (room, name) {
    console.log("Users in room name ".concat(name, " are : "));
    for (var _i = 0, _a = room.keys(); _i < _a.length; _i++) {
        var key = _a[_i];
        console.log(key);
    }
};
var printmessages = function (room, name) {
    console.log("Messages in room name ".concat(name, " are : "));
    for (var _i = 0, _a = room.values(); _i < _a.length; _i++) {
        var value = _a[_i];
        console.log(value);
    }
};
printusers(croom1, "chatroom1");
printusers(croom2, "chatroom2");
printmessages(croom1, "chatroom1");
printmessages(croom2, "chatroom2");
