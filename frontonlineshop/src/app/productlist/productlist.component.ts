import { Component, OnInit } from '@angular/core';
import { CrudService } from '../admincrudservice/crud.service';
import {Router} from '@angular/router';
import {Product} from '../product.model';

@Component({
  selector: 'app-productlist',
  templateUrl: './productlist.component.html',
  styleUrls: ['./productlist.component.css']
})
export class ProductlistComponent implements OnInit {
  products: Array<Product> = [];
  constructor(private _route: Router, private _service:CrudService ) { }

  ngOnInit(): void {
              // this.products = this._service.fetchProductListFromRemote().subscribe(
              //       data=>console.log("response recieved"),
              //       error=>console.log("exception occured"))
              this.getProducts();
  }

  getProducts() {
    this._service.fetchProductListFromRemote().subscribe(
      data => this.products = data, error => console.log("Exception occurred 1"),
    )
  }
  isEmpty()
  {
    if (this.products == null)
    {
      return true;
    }
    else { return false; }
  }

  goToAddProduct(){
    this._route.navigate(['/addproduct']);
  }

  goToEditProduct(id: number){
    console.log("id"+ id)
    this._route.navigate(['/editproduct', id]);
  }

  goToViewProduct(id: number){
    console.log("id"+ id)
    this._route.navigate(['/viewproduct', id]);
  }


  deleteProduct(id: number) {
    if (confirm('Are you sure ?'))
  return this._service.deleteProductBdyIdFromRemote(id).subscribe(
    success =>{
      console.log("Error");
    },
    error=> {
      console.log("Product deleted succesfully"); this.getProducts();
    }
   )
  }
}