import { Component } from '@angular/core';

@Component({
    selector: 'aurionpro-twowaybind',
    templateUrl: './twowaybind.component.html'
})

export class TwowayBindComponent {
    firstname: String
    lastname:String

    constructor() {
        this.firstname = "Nilam";
        this.lastname="Menat";
    }

    firstNameChange(newName) {
        this.firstname = newName;
    }

    





}