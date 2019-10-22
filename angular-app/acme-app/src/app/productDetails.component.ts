import { Component } from "@angular/core";
import { ProductDataService } from './productDataService';
import { ActivatedRoute } from '@angular/router';

@Component({
    selector: "aurionpro-details",
    templateUrl: "./productDetails.component.html"
})
export class ProductDetailsComponent {
    product: Object;
    arrProducts: string[];
    error: string;
    productDetails1: any;
    id: string;
    constructor(private productdataService: ProductDataService, private activatedRoute: ActivatedRoute) { }
    ngOnInit() {
        this.id = this.activatedRoute.snapshot.paramMap.get('id');

        this.productdataService.getProducts()
            .subscribe((productt) => {
                this.product = productt;
                for (var i = 0; i < 5; i++) {
                    if (this.id == this.product[i].productId) {
                        this.productDetails1 = this.product[i];
                    }
                }
            })
    }
}