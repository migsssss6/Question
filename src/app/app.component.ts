import { Component, OnInit } from '@angular/core';

import { LoanService } from './loan.service';
import { Person } from './person';
import {FormGroup,FormControl, Validators} from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'LoanappUi';
  successFlag : boolean = false;
  public person:any;
  loanForm = new FormGroup({
   
    personalCode:new FormControl('',[Validators.required]),
    loanAmount : new FormControl('',[Validators.required,Validators.min(2000),Validators.max(10000)]),
    periodMonths: new FormControl('',[Validators.required,Validators.min(12),Validators.max(60)])
  });
  public persons: Person[] = [];
  constructor(private loanService:LoanService){

  }
  ngOnInit(): void {
    this.getPerson();
  }

  public getPerson(): void{
    this.loanService.getResult().subscribe((response:Person[])=>
      {
        console.log("response :"+response);
        this.persons = response;
      });
  }

  public submitUser():void{
    this.loanService.addPerson(this.loanForm.value).subscribe((result)=>{
    console.log(result);
    this.person = result;
    this.successFlag = true;
  });
  }
  get personalCode(){
    return this.loanForm.get('personalCode')
  }
  get loanAmount(){
    return this.loanForm.get('loanAmount')
  }
  get periodMonths(){
    return this.loanForm.get('periodMonths')
  }

  
}
