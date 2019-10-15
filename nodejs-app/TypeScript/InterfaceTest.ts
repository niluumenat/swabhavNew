interface IStudent {

    id: Number;
    name: String;
    cgpa: Number;
    location?: String
}

var students: IStudent[] = [
    { id: 101, name: 'Nilam', cgpa: 7.6 },
    { id: 102, name: 'Madhavi', cgpa: 7.8 },
    { id: 103, name: 'Komal', cgpa: 6.8 },
    { id: 104, name: 'Heta', cgpa: 6.6 },
    { id: 105, name: 'ABC', cgpa: 7.7, location: 'Mumbai' }

]

var printStudents = (students) => {
    for (var item of students) {
        console.log("Id is: " + item.id + " Name is: " + item.name + " Cgpa is: " + item.cgpa + "Location is" + item.location);
    }
}

printStudents(students);