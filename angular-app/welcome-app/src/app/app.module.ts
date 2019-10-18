import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { StudentComponent } from './welcome/student/student.component';
import { CustomStudentPipe } from './welcome/student/customStudentPipe';
import { TwowayBindComponent } from './welcome/Twoway/twowaybind.component';
import { BlueballGameComponent } from './welcome/Blueball Game/blueball.component';
import { NumbersApiComponent } from './welcome/numbersApi/numbersApi.component';
import { ToggleBtnComponent } from './welcome/Parent Child/ToggleComponent/toggle.component';
import { RatingComponent } from './welcome/Rating Component/rating.component';

@NgModule({
  declarations: [
    AppComponent,
    WelcomeComponent,
    StudentComponent,
    CustomStudentPipe,
    TwowayBindComponent,
    BlueballGameComponent,
    NumbersApiComponent,
    ToggleBtnComponent,
    RatingComponent
    
  ],
  imports: [
    FormsModule,
    BrowserModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [WelcomeComponent]
})
export class AppModule { }
