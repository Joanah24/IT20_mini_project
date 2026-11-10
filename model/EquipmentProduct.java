package model;

public class EquipmentProduct extends Product {
    private String equipmentType;

    public EquipmentProduct(String productId, String name, double price,
                            int stockQuantity, String equipmentType) {
        super(productId, name, price, stockQuantity);
        this.equipmentType = equipmentType;
    }

    public String getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }
}