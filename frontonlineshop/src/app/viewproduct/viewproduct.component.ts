import { Component, OnInit } from '@angular/core';
import {Product} from '../product.model';
import {ActivatedRoute, Router} from '@angular/router';
import {CrudService} from '../admincrudservice/crud.service';

@Component({
  selector: 'app-viewproduct',
  templateUrl: './viewproduct.component.html',
  styleUrls: ['./viewproduct.component.css']
})
export class ViewproductComponent implements OnInit {

  product = new Product();
  constructor(private _route:Router, private _service: CrudService, private _activatedRouter: ActivatedRoute) { }

  ngOnInit(): void {
    let id = parseInt(this._activatedRouter.snapshot.paramMap.get('id'));
    this._service.fetchProductBdyIdFromRemote(id).subscribe(
    data=>{
      console.log("data received");
      this.product = data;
    },
      error => console.log("Exception Occured")
    )
  }
  gotolist() {
    this._route.navigate(['productlist']);
  }
}