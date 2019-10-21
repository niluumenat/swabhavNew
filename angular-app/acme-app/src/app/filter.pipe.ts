import { Pipe, PipeTransform } from '@angular/core';
@Pipe({
    name: "filter1"
})
export class FilterPipe implements PipeTransform {
    transform(value: any, term: any) {
        if (!term) return value;
        return value.filter((item: any) => {
            for (let prop in item) {
                if (typeof item[prop] === "string" && item[prop].indexOf(term) > -1) {
                    return true;
                }
            }
            return false;
        });
    }
}