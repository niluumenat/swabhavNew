import { Pipe, PipeTransform } from '@angular/core'

@Pipe({ name: 'CustomStudent' })
export class CustomStudentPipe implements PipeTransform {
    transform(cgpa: number): number {
        return Math.round(cgpa * 100) / 100;

    }
}