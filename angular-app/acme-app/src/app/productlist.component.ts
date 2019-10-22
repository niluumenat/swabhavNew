import { Component } from "@angular/core";
import { ProductDataService } from './productDataService';

@Component({
    selector: "app-productlist",
    templateUrl: "./productlist.component.html"
})

export class ProductListComponent {
    flag: boolean = false;
    state: string = "Show Image";
    arrProducts: string[];
    error: string;
    imgUrl: string;

    constructor(private productdataService: ProductDataService) { }

    ngOnInit() {
        this.productdataService.getProducts()
            .subscribe(
                data => {
                    this.arrProducts = data as string[];
                    console.log(this.arrProducts);
                },
                error => {
                    return this.error = error;
                });
    }
    showImg() {
        if (this.state == "Show Image") {
            this.flag = true;
            this.state = "Hide Image";

        } else if (this.state == "Hide Image") {
            this.flag = false;
            this.state = "Show Image";
        }
    }
    getProductName(productName1) {
        console.log(productName1);
    }



}