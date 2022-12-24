import {ProductOrder} from "../models/product-order.model";
import {Subject} from "rxjs/internal/Subject";
import {ProductOrders} from "../models/product-orders.model";
import {HttpClient} from '@angular/common/http';
import {Injectable} from "@angular/core";

@Injectable()
export class EcommerceService {
  private productsUrl = "/api/products";
  private ordersUrl = "/api/orders";

  private productOrder: ProductOrder | undefined;
  private orders: ProductOrders | undefined = new ProductOrders();

  private productOrderSubject = new Subject();
  private ordersSubject = new Subject();
  private totalSubject = new Subject();

  private total: number | undefined;

  ProductOrderChanged = this.productOrderSubject.asObservable();
  OrdersChanged = this.ordersSubject.asObservable();
  TotalChanged = this.totalSubject.asObservable();

  constructor(private http: HttpClient) {
  }

  getAllProducts() {
    return this.http.get(this.productsUrl);
  }

  saveOrder(order: ProductOrders | undefined) {
    return this.http.post(this.ordersUrl, order);
  }

  set SelectedProductOrder(value: ProductOrder) {
    this.productOrder = value;
    // @ts-ignore
    this.productOrderSubject.next();
  }

  get SelectedProductOrder() {
    // @ts-ignore
    return this.productOrder;
  }

  set ProductOrders(value: ProductOrders | undefined) {
    this.orders = value;
    // @ts-ignore
    this.ordersSubject.next();
  }

  get ProductOrders(): ProductOrders | undefined {
    return this.orders;
  }

  get Total() {
    // @ts-ignore
    return this.total;
  }

  set Total(value: number) {
    this.total = value;
    // @ts-ignore
    this.totalSubject.next();
  }
}