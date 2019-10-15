class Employee {
    constructor(private _firstname: String, private _lastname: String) {
    }
    get Firstname() {
        return this._firstname;
    }
    set Firstname(fname) {
        this._firstname = fname;
    }
    get Lastname() {
        return this._lastname;
    }
    set Lastname(lname) {
        this._lastname = lname;
    }
}

let e1 = new Employee('Nilam', 'Menat');
console.log(e1);
console.log(e1.Firstname);
e1.Firstname = 'XYZ';
console.log(e1.Firstname);
console.log(e1.Lastname);
