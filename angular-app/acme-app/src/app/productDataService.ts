import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { HttpErrorResponse } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
    providedIn: 'root'
})

export class ProductDataService {

    constructor(private httpService: HttpClient) { }

    getProducts() {
        return this.httpService.get('./assets/products.jsonx')
    }

}