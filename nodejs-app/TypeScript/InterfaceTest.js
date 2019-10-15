var students = [
    { id: 101, name: 'Nilam', cgpa: 7.6 },
    { id: 102, name: 'Madhavi', cgpa: 7.8 },
    { id: 103, name: 'Komal', cgpa: 6.8 },
    { id: 104, name: 'Heta', cgpa: 6.6 },
    { id: 105, name: 'ABC', cgpa: 7.7, location: 'Mumbai' }
];
var printStudents = function (students) {
    for (var _i = 0, students_1 = students; _i < students_1.length; _i++) {
        var item = students_1[_i];
        console.log("Id is: " + item.id + " Name is: " + item.name + " Cgpa is: " + item.cgpa + "Location is" + item.location);
    }
};
printStudents(students);
