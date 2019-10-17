import { Component } from '@angular/core';
import { IStudent } from './Istudent';

@Component({
    selector: 'aurionpro-student',
    templateUrl: './student.component.html'
})
export class StudentComponent {
    private student: IStudent
    color: String
    widthMax: Number = 150
    heightMax: Number = 150

    constructor() {
        this.student = {
            id: 101,
            name: 'Nilam',
            cgpa: 5.9,
            profilePic: 'assets/profile.jpg'
        }
    }
    students: IStudent[] = [
        {
            id: 101,
            name: 'Nilam',
            cgpa: 8.888,
            profilePic: 'assets/profile.jpg'
        },
        {
            id: 102,
            name: 'Komal',
            cgpa: 7.57888,
            profilePic: 'assets/profile.jpg'
        },
        {
            id: 103,
            name: 'Madhavi',
            cgpa: 8.78999,
            profilePic: 'assets/profile.jpg'
        }
    ]

    updateBackground(cgpa) {
        if (cgpa < 6) {
            this.color = 'Red';
        } else if (cgpa < 8) {
            this.color = 'Yellow';
        } else if (cgpa >= 8) {
            this.color = 'Green';
        }
        return this.color;
    }

}

