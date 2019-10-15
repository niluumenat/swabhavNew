var Employee = /** @class */ (function () {
    function Employee(_firstname, _lastname) {
        this._firstname = _firstname;
        this._lastname = _lastname;
    }
    Object.defineProperty(Employee.prototype, "Firstname", {
        get: function () {
            return this._firstname;
        },
        set: function (fname) {
            this._firstname = fname;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Employee.prototype, "Lastname", {
        get: function () {
            return this._lastname;
        },
        set: function (lname) {
            this._lastname = lname;
        },
        enumerable: true,
        configurable: true
    });
    return Employee;
}());
var e1 = new Employee('Nilam', 'Menat');
console.log(e1);
console.log(e1.Firstname);
e1.Firstname = 'XYZ';
console.log(e1.Firstname);
console.log(e1.Lastname);
