import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { CrudService } from '../admincrudservice/crud.service';
import { Product } from '../product.model';

@Component({
  selector: 'app-addproduct',
  templateUrl: './addproduct.component.html',
  styleUrls: ['./addproduct.component.css']
})
export class AddproductComponent implements OnInit {
  product = new Product();

  constructor(private _route: Router, private _service: CrudService) { }

  ngOnInit(): void {
  }

  addproductformsubmit()
  {
    this._service.addproductToRemote(this.product).subscribe(
      data =>
            {
              console.log("Data added successfully");
              this._route.navigate(['productlist']);
            },
            error=>console.log("Error")
    )
  }
  gotolist(){
    console.log('go back');
    this._route.navigate(['productlist']);
  }
}
