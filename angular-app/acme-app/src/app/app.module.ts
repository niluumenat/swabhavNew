import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { AppComponent, WelcomeComponent } from './app.component';
import { ProductListComponent } from './productlist.component';
import { FilterPipe } from './filter.pipe';
import { ProductDetailsComponent } from './productDetails.component';

export const routeArr: Routes = [
  {
    path: 'home', component: WelcomeComponent
  },
  {
    path: 'productlist', component: ProductListComponent
  },
  {
    path: 'productdetails/:id', component: ProductDetailsComponent
  },
  { path: '', redirectTo: 'home', pathMatch: 'full' }
];

@NgModule({
  declarations: [
    AppComponent,
    WelcomeComponent,
    ProductListComponent,
    FilterPipe,
    ProductDetailsComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routeArr),
    HttpClientModule,
    FormsModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})




export class AppModule { }
