import { Injectable } from '@angular/core';

@Injectable({
    providedIn: 'root'
})

export class MathService {
   
    handleError;
    checkPrime(n) {
        
        var i, flag = "green";
        for (i = 2; i <= n - 1; i++)
            if (n % i == 0) {
                flag = "red";
                break;
            }
       
        return flag;
    }
}