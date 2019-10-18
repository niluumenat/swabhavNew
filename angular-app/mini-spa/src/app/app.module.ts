import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { AppComponent, HomeComponent, AboutComponent, CareerComponent } from './app.component';

export const routeArr: Routes = [
  {
    path: 'home', component: HomeComponent
  },
  {
    path: 'about', component: AboutComponent
  },
  {
    path: 'career', component: CareerComponent
  },
  { path: '', redirectTo: 'home', pathMatch: 'full' }
];
@NgModule({
  declarations: [
    AppComponent,
     HomeComponent,
    AboutComponent,
    CareerComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routeArr)
  ],
  providers: [],
  bootstrap: [AppComponent]
})


export class AppModule { }
