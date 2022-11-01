import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Ordermodel } from 'src/app/model/ordermodel';
@Injectable({
  providedIn: 'root'
})
export class OrderlistService {

  private apiUrl: string;
  productId:any;
  httpOptions = {
    headers :new HttpHeaders({
      'Content-Type':'application/json'
    })    
  }

  constructor(private http: HttpClient) {
    this.apiUrl = 'https://8080-ffdcbfcaefecfbebadeeffdabedffcafacb.ide.exam.ly/admin/orders';
  }

  public getOrders():Observable<Ordermodel[]>{
    return this.http.get<Ordermodel[]>(this.apiUrl);
  }

}
