require("amd-loader");
define(["require", "exports", "./Student"], function (require, exports, Student_1) {
    "use strict";
    Object.defineProperty(exports, "__esModule", { value: true });
    var s1 = new Student_1.Student("Nilam", 22, 50);
    console.log(s1.Name);
    console.log(s1.Age);
    console.log(s1.Rollno);
    Student_1.foo();
    var a1 = new Student_1.Address("Malad(east)");
    console.log(a1.Add);
    a1.Add = 'Mumbai';
});
