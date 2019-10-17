import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { catchError, retry } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class NumbersApiService {
  handleError;
  constructor(private http: HttpClient) { }
  getFacts() {
    return this.http.get("http://numbersapi.com/43", { responseType: 'text' });
  }
}


