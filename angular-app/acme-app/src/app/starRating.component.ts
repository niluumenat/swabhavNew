import { Component, Input } from "@angular/core";

@Component({
    selector: 'aurionpro-rating',
    templateUrl: './rating.component.html'
})

export class RatingComponent {
    @Input() rating: String;
    @Input() hoverover: String;
    constructor() {

    }
}