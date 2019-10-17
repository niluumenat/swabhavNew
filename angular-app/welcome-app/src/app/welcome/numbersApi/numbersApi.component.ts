import { NumbersApiService } from './numbers-api.service';
import { Component } from '@angular/core';
import { error } from 'util';
import { HttpErrorResponse } from '@angular/common/http';
import { throwError } from 'rxjs';
@Component({
    selector: 'aurionpro-numbersApi',
    templateUrl: './numbersApi.component.html'
})

export class NumbersApiComponent {
    facts: string;
    error: string;
    router: any;

    constructor(private numbersApiService: NumbersApiService) {
    }
    showFacts() {
        this.numbersApiService.getFacts()
            .subscribe((data: string) => {
                this.facts = data;
                console.log(this.facts);
            },
                error => {
                    console.log(error);
                    return this.error = error;

                });

    }


}