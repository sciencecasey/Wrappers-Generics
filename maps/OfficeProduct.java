package maps;

public class OfficeProduct {
   private int productCode;
   private String productDescription;
   private float productPrice;
   
   public OfficeProduct(int code, String thing, float price){
      this.setProductCode(code);
      this.setProductDescription(thing);
      this.setProductPrice(price);
   }
   public OfficeProduct(int code, String thing, double price){
      this(code, thing, (float) price);
   }
   public OfficeProduct() {
      this(-1, null, -1);
   }
   public String getProductDescription() {
      return this.productDescription;
   }
   public void setProductDescription(String productDescription) {
      this.productDescription = productDescription;
   }
   public float getProductPrice() {
      return this.productPrice;
   }
   public void setProductPrice(float productPrice) {
      this.productPrice = productPrice;
   }
   public int getProductCode() {
      return this.productCode;
   }
   public void setProductCode(int productCode) {
      this.productCode = productCode;
   }
   
}
