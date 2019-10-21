import { Component } from "@angular/core";
import { ProductDataService } from './productDataService';

@Component({
    selector: "app-productlist",
    templateUrl: "./productlist.component.html"
})

export class ProductListComponent {
    state: string = "Show Image";
    productNames: String;
    arrProducts: string[];
    error: string;
    imgUrl: string;
    productName;

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
    showImg() {
        if (this.state == "Show Image") {
            this.state = "Hide Image";
            //this.imgUrl = this.arrProducts[0];
            //console.log(this.imgUrl);

        } else if (this.state == "Hide Image") {
            this.state = "Show Image";
        }
    }


}