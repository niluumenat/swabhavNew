
import {Student,Address,foo} from './Student'

let s1= new Student("Nilam",22,50);
console.log(s1.Name);
console.log(s1.Age);
console.log(s1.Rollno);

foo();

let a1 = new Address("Malad(east)");
console.log(a1.Add);
a1.Add='Mumbai';

