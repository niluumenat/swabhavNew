import { Component, Input, Output, EventEmitter } from '@angular/core';

@Component({
    selector: 'aurionpro-togglebtn',
    templateUrl: './toggle.component.html'
})

export class ToggleBtnComponent {
    @Input() private title: String;
    private btnText: String = "1";
    private color: String;
    @Input() private onColor: String;
    @Input() private offColor: String;
    @Output() private stateChanged = new EventEmitter<String>();

    constructor() {
        console.log("Inside Constructor");
    }

    ngOnInit() {
        console.log("Inside ngOnInit");
        if (!this.title) {
            this.title = "Aurionpro-toggler";
        }
        if (!this.onColor) {
            this.onColor = "green";
        }
        if (!this.offColor) {
            this.offColor = "red";
        }
        this.clickHandler();
    }

    clickHandler() {
        if (this.btnText == "1") {
            this.btnText = "0";
        } else {
            this.btnText = "1";
        }

        if (this.btnText == "1") {
            this.color = this.onColor;
        } else if (this.btnText == "0") {
            this.color = this.offColor;
        }

        this.stateChanged.emit("State Changed!!!" + this.btnText);
    }
}