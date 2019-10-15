import { Component } from '@angular/core';

@Component({
    selector: 'aurionpro-welcome',
    templateUrl: './welcome.component.html'
})
export class WelcomeComponent {
    message: String
    greet: String
    constructor() {
        this.message = "Hello!! Welcome to Angular";
    }
    greeting() {
        var today = new Date();
        var hour = today.getHours();
        if (hour > 18) {
            this.greet = "Good Evening!";
        } else if (hour > 12) {
            this.greet = "Good Afternoon!";
        } else if (hour > 0) {
            this.greet = 'Good morning!';
        } else {
            this.greet = 'Welcome!';
        }
        console.log(this.greet);
        return this.greet;
    }
}


