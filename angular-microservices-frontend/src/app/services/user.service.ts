import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  httpOptions = {
    headers: new HttpHeaders({'Content-Type': 'application/json'})
  }
  endPoint = 'http://localhost:8080/' 
  constructor(private http: HttpClient) { }

  createUser(firstName: string, lastName: string, teamId: number): Observable<any> {
    return this.http.post(this.endPoint + '/user',{
      firstName,
      lastName,
      teamId
    },this.httpOptions);
  }
}
