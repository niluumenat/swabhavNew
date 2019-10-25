import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class NumbersApiService {

  handleError;
  constructor(private http: HttpClient) {
    console.log("Service Created");
  }
  getFacts(no) {
    return this.http.get("http://numbersapi.com/" + no, { responseType: 'text' });
  }
}
