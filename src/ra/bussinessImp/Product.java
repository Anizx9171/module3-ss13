package ra.bussinessImp;

import ra.bussiness.IShop;
import ra.config.Config;
import ra.run.ProductManagement;

public class Product implements IShop {
    private static int index = 1;
    private int productId;
    private String productName;
    private String title;
    private String descriptions;
    private Catalog catalog;
    private float importPrice;
    private float exportPrice;
    private boolean productStatus;

    public Product() {
        this.productId = Product.index++;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getTitle() {
        return title;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public boolean isProductStatus() {
        return productStatus;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public void setExportPrice() {
        this.exportPrice = this.importPrice * this.RATE;
    }

    public void setProductStatus(boolean productStatus) {
        this.productStatus = productStatus;
    }

    @Override
    public void displayData() {
        System.out.println("Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", title='" + title + '\'' +
                ", descriptions='" + descriptions + '\'' +
                ", catalog=" + catalog +
                ", importPrice=" + importPrice +
                ", exportPrice=" + exportPrice +
                ", productStatus=" + productStatus +
                '}');
    }
    @Override
    public void inputData() {
        System.out.println("Product name:");
        this.productName = Config.scanner().nextLine();
        System.out.println("Product title:");
        this.title =  Config.scanner().nextLine();
        System.out.println("Product descriptions:");
        this.descriptions =  Config.scanner().nextLine();
        System.out.println("Product import Price:");
        this.importPrice = Float.parseFloat(Config.scanner().nextLine());
        System.out.println("""
                Trạng thái
                1,true
                2,false
                """);
        this.productStatus = Integer.parseInt(Config.scanner().nextLine()) == 1;
        System.out.println("Nhập id Catalog");
        while (true){
            int cataId = Integer.parseInt(Config.scanner().nextLine());
            ProductManagement.listCatalogs.forEach(cata -> {
                if (cata.getCatalogId() == cataId) {
                    this.catalog = cata;
                    return;
                }
            });
            System.out.println("Id không hợp lệ, vui lòng nhập lại");
        }
    }
}
