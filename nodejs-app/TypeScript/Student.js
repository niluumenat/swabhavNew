define(["require", "exports"], function (require, exports) {
    "use strict";
    Object.defineProperty(exports, "__esModule", { value: true });
    var Student = /** @class */ (function () {
        function Student(_name, _age, _rollno) {
            this._name = _name;
            this._age = _age;
            this._rollno = _rollno;
        }
        Object.defineProperty(Student.prototype, "Name", {
            get: function () {
                return this._name;
            },
            set: function (fname) {
                this._name = fname;
            },
            enumerable: true,
            configurable: true
        });
        Object.defineProperty(Student.prototype, "Age", {
            get: function () {
                return this._age;
            },
            set: function (age) {
                this._age = age;
            },
            enumerable: true,
            configurable: true
        });
        Object.defineProperty(Student.prototype, "Rollno", {
            get: function () {
                return this._rollno;
            },
            set: function (rollno) {
                this._rollno = rollno;
            },
            enumerable: true,
            configurable: true
        });
        return Student;
    }());
    exports.Student = Student;
    var Address = /** @class */ (function () {
        function Address(_address) {
            this._address = _address;
        }
        Object.defineProperty(Address.prototype, "Add", {
            get: function () {
                return this._address;
            },
            set: function (address) {
                this._address = address;
            },
            enumerable: true,
            configurable: true
        });
        return Address;
    }());
    exports.Address = Address;
    function foo() {
        console.log("Hello from Foo");
    }
    exports.foo = foo;
});
