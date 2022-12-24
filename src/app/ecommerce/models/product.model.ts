export class Product {
  id: number | undefined;
  name: string | undefined;
  price: number | undefined;
  pictureUrl: string | undefined;

  constructor(id: number, name: string, price: number, pictureUrl: string) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.pictureUrl = pictureUrl;
  }
}
