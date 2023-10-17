package ra.bussinessImp;

import ra.bussiness.IShop;
import ra.config.Config;

public class Catalog implements IShop {
    private int catalogId;
    private static int count = 1;
    String catalogName;
    private int priority;
    private String descriptions;
    private boolean catalogStatus;

    public Catalog() {
        this.catalogId = Catalog.count++;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public int getPriority() {
        return priority;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public boolean isCatalogStatus() {
        return catalogStatus;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public void setCatalogStatus(boolean catalogStatus) {
        this.catalogStatus = catalogStatus;
    }

    @Override
    public void displayData() {
        System.out.println("Catalog{" +
                "catalogId= " + catalogId +
                ", catalogName= '" + catalogName + '\'' +
                ", priority= " + priority +
                ", descriptions= '" + descriptions + '\'' +
                ", catalogStatus= " + catalogStatus +
                '}');
    }

    @Override
    public void inputData() {
        System.out.println("Nhập tên cataLog");
        this.catalogName = Config.scanner().nextLine();
        System.out.println("Nhập độ ưu tiên");
        this.priority = Integer.parseInt(Config.scanner().nextLine());
        System.out.println("Nhập mô tả");
        this.descriptions = Config.scanner().nextLine();
        System.out.println("""
                Trạng thái
                1,true
                2,false
                """);
        this.catalogStatus = Integer.parseInt(Config.scanner().nextLine()) == 1;

    }
}
