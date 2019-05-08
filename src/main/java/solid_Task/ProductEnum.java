package solid_Task;

public enum ProductEnum {

    PHONE("Samsung Galaxy S10", 10),
    PC("All-in-One Lenovo ThinkCentre M700Z", 12),
    LAPTOP("Lenovo IdeeaPad 110", 13),
    SMARTWATCH("Samsung Galaxy Gear S3", 14),
    BAG("TUCANO Stilo Bag", 15),
    PROGRAMS("Microsoft Windows 10", 11);

private final String PRODUCT;
private final int PRODUCTID;

ProductEnum(String product, int productId){
    this.PRODUCT = product;
    this.PRODUCTID = productId;
}

    public String getPRODUCT() {
        return PRODUCT;
    }

    public int getPRODUCTID() {
        return PRODUCTID;
    }
}
