import { NumbersApiService } from '../services/numbers-api.service';
import { Component } from '@angular/core';

@Component({
    selector: 'aurionpro-numbersApi',
    templateUrl: './numbersApi.component.html'
})

export class NumbersApiComponent {
    facts: Array<string> = [];
    error: string;
    router: any;

    constructor(private numbersApiService: NumbersApiService) {
    }

    showFacts(no) {
        this.numbersApiService.getFacts(no)
            .subscribe((data: string) => {
                this.facts.push(data);
                localStorage.setItem('facts', JSON.stringify(this.facts));
                console.log(this.facts);

            },
                error => {
                    console.log(error);
                    return this.error = error;

                });
    }


}