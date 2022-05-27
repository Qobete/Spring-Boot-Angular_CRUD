import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { Product } from '../product.model';


@Injectable({
  providedIn: 'root'
})
export class CrudService {

  constructor(private _http: HttpClient) { }

  fetchProductListFromRemote():Observable<any>{
    return this._http.get<any>('http://localhost:8090/getproductlist');

  }

  addproductToRemote(product : Product):Observable<any>{
    return this._http.post<any>('http://localhost:8090/addproduct',product);
  }
  updateProductToRemote(product: Product): Observable<any>{
    return this.addproductToRemote(product);
    //return this._http.post<any>('http://localhost:8090/editproduct',product);
  }

  fetchProductBdyIdFromRemote(id: number): Observable<any> {
    return this._http.get<any>('http://localhost:8090/getproductbyid/'+id);
  }
  deleteProductBdyIdFromRemote(id: number): Observable<any> {
    return this._http.delete<any>('http://localhost:8090/deleteproductbyid/' + id);
  }
}
