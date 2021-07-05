import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-add-user',
  templateUrl: './add-user.component.html',
  styleUrls: ['./add-user.component.css']
})
export class AddUserComponent implements OnInit {

  form: any = {
    email: null,
    password: null
  }

  constructor() { }

  ngOnInit(): void {
  }

  onSubmit(): void {
    
  }

}
