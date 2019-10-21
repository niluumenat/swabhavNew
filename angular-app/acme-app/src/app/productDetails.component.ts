import { Component } from "@angular/core";
import { ProductDataService } from './productDataService';

@Component({
    selector: "aurionpro-details",
    templateUrl: "./productDetails.component.html"
})
export class ProductDetailsComponent{
    arrProducts:string[];
    productNames:string;
    error:string;
    
    constructor(private productdataService: ProductDataService) { }

    ngOnInit() {
        this.productdataService.getProducts()
            .subscribe(
                data => {
                    this.arrProducts = data as string[];
                },
                error => {
                    return this.error = error;
                });
            }
}