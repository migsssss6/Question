import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Person } from './person';


const baseUrl = `http://localhost:8080/person`;
@Injectable({
  providedIn: 'root'
})
export class LoanService {
  
  constructor(private http: HttpClient) { }

  public getResult():Observable<Person[]>{
    return this.http.get<Person[]>(baseUrl);
  }

  public addPerson(person:Person):Observable<Person>{
    return this.http.post<Person>(baseUrl,person);
  }

  public getById(id:any):Observable<Person>{
    return this.http.get<Person>(`${baseUrl}/${id}`);
  }
}
