import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Productmodel } from '../model/productmodel';

@Injectable({
  providedIn: 'root'
})
export class AddproductService {

  private apiUrl:string;

  constructor(private http: HttpClient) {
    this.apiUrl = 'https://8080-ffdcbfcaefecfbebadeeffdabedffcafacb.ide.exam.ly/admin/addProduct';
  }

  public save(product:Productmodel){
      return this.http.post<Productmodel>(this.apiUrl,product);
  }
}
