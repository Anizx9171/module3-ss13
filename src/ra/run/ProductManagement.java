package ra.run;

import ra.bussinessImp.Catalog;
import ra.bussinessImp.Product;
import ra.config.Config;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductManagement {
    static List<Product> listProduct = new ArrayList<>();
    public static List<Catalog> listCatalogs = new ArrayList<>();

    public static void main(String[] args) {
        int Choice;
        while (true){
            System.out.println("""
                    ****************JAVA-HACKATHON-05-ADVANCE-2-MENU***************
                    1. Nhập số danh mục sản phẩm và nhập thông tin các danh mục [10 điểm]
                    2. Nhập số sản phẩm và nhập thông tin các sản phẩm [20 điểm]
                    3. Sắp xếp sản phẩm theo giá sản phẩm tăng dần (Comparable/Comparator) [10 điểm]
                    4. Tìm kiếm sản phẩm theo tên danh mục sản phẩm [05 điểm]
                    5. Thoát [05 điểm]
                    """);
            System.out.print("Lựa chọn của bạn: ");
            Choice = Integer.parseInt(Config.scanner().nextLine());
            switch (Choice) {
                case 1:
                    addNewCateLog();
                    break;
                case 2:
                    addNewProduct();
                    break;
                case 3:
                    sortProByPrice();
                    break;
                case 4:
                    searchProByCateName();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
            System.out.println();
        }
    }

    private static void searchProByCateName() {
        System.out.println("Nhập tên danh mục muốn tìm");
        String searchValue = Config.scanner().nextLine();
        System.out.println("Kết quả tìm kiếm: ");
        listProduct.forEach(product -> {
            if (product.getCatalog().getCatalogName().toLowerCase().contains(searchValue.toLowerCase())){
                product.displayData();
            }
        });
        System.out.println();
    }

    private static void sortProByPrice() {
        listProduct.sort(Comparator.comparing(Product::getExportPrice));
        System.out.println("Danh sách sả phẩm đã được sắp xếp");
    }

    private static void addNewProduct() {
        System.out.println("Số sản phẩm muốn thêm: ");
        int count = Integer.parseInt(Config.scanner().nextLine());
        for (int i = 0; i < count; i++) {
            Product newProduct = new Product();
            newProduct.inputData();
            listProduct.add(newProduct);
        }
    }

    private static void addNewCateLog() {
        System.out.println("Số danh mục muốn thêm: ");
        int count = Integer.parseInt(Config.scanner().nextLine());
        for (int i = 0; i < count; i++) {
            Catalog newCatalog = new Catalog();
            newCatalog.inputData();
            listCatalogs.add(newCatalog);
        }
    }
}
