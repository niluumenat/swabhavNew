export class Student{
    constructor(private _name:String, private _age:Number,private _rollno:Number ){

    }
    get Name(){
        return this._name;
    }
    get Age(){
        return this._age;
    }
    get Rollno(){
        return this._rollno;
    }

    set Name(fname){
        this._name= fname;
    }
    set Age(age){
        this._age= age;
    }
    set Rollno(rollno){
        this._rollno= rollno;
    }

}

export class Address{
    constructor(private _address:String){

    }
    get Add(){
        return this._address
    }
    set Add(address){
        this._address = address;
    }
}

export function foo(){
    console.log("Hello from Foo");
}