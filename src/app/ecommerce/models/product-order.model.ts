import {Product} from "./product.model";

export class ProductOrder {
  product: Product;
  quantity: number | undefined;

  constructor(product: Product, quantity: number) {
    this.product = product;
    this.quantity = quantity;
  }
}
