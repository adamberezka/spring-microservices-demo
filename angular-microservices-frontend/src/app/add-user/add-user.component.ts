import { Component, OnInit } from '@angular/core';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-add-user',
  templateUrl: './add-user.component.html',
  styleUrls: ['./add-user.component.css']
})
export class AddUserComponent implements OnInit {

  form: any = {
    firstName: null,
    lastName: null,
    teamId: null
  }

  constructor(private userService: UserService) { }

  ngOnInit(): void {
  }

  onSubmit(): void {
    const {firstName, lastName, teamId} = this.form;
    this.userService.createUser(firstName, lastName, teamId).subscribe(
      data => {
        alert("Pomyślnie dodano użytkownika!");
      },
      error => {
        console.log(error);
        alert("Błąd, użytkownik nie został dodany" + error.error.message);
      })
  }

}
