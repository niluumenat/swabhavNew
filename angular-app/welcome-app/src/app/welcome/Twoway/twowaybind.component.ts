import { Component } from '@angular/core';
import { MathService } from '../services/mathService';
import { empty } from 'rxjs';

@Component({
    selector: 'aurionpro-twowaybind',
    templateUrl: './twowaybind.component.html'
})

export class TwowayBindComponent {
    firstname: String
    lastname: String
    result: string
    error: string
    i: number

    constructor(private _mathService: MathService) {
        this.firstname = "Nilam";
        this.lastname = "Menat";
    }

    firstNameChange(newName) {
        this.firstname = newName;
    }

    getResultFromService(inputNo) {
        this.i = inputNo;

        if (this.i == '') {
            this.result = "yellow";
        } else {
            this.result = this._mathService.checkPrime(inputNo);
        }
    }










}