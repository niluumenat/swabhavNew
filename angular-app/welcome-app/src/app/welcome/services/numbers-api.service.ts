import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class NumbersApiService {
  handleError;
  constructor(private http: HttpClient) { }
  getFacts(no) {
    return this.http.get("http://numbersapi.com/" + no, { responseType: 'text' });
  }
}


