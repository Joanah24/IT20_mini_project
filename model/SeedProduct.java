package model;

public class SeedProduct extends Product {
    private String cropType;

    public SeedProduct(String productId, String name, double price,
                       int stockQuantity, String cropType) {
        super(productId, name, price, stockQuantity);
        this.cropType = cropType;
    }

    public String getCropType() {
        return cropType;
    }

    public void setCropType(String cropType) {
        this.cropType = cropType;
    }

    @Override
    public String getCategoryDetails() {
        return "Seed [Crop: " + cropType + "]";
    }
}