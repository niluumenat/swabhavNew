import { Component } from '@angular/core';

@Component({
    selector: 'aurionpro-blueballgame',
    templateUrl: './blueball.component.html'
})

export class BlueballGameComponent {
    button: Number;
    random: number = Math.floor((Math.random() * 50) + 1);
    color: String;
    show = false;
    isShow = false;
    isShow2 = false;
    hide = false;
    count: number = 5;
    buttonValue: number;

    restart() {
        window.location.reload();
    }
    toggle() {
        this.isShow = !this.isShow;
        this.show = !this.show;
    }
    changeColor(event, button) {
        var target = event.target;
        this.count = this.count - 1;
        console.log(this.random);
        if (this.random == button) {
            target.style.background = 'blue';
        } else if (this.random > button) {
            target.style.background = 'red';
        } else if (this.random < button) {
            target.style.background = 'green';
        }
        if (this.count == 0 && this.random == button) {
            setTimeout(() => {
                this.isShow2 = !this.isShow2;
                this.show = !this.show;
            }, 1000);
        } else if (this.count == 0){
            setTimeout(() => {
                this.show = !this.show;
                this.hide = !this.hide;
            }, 2500);
        }else if (this.random == button) {
            setTimeout(() => {
                this.isShow2 = !this.isShow2;
                this.show = !this.show;
            }, 1000);
        }

        
    }
}