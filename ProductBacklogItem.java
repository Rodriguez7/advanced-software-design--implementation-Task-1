/**
 * Represents a product backlog item.
 * @author Rodriguez
 */
public class ProductBacklogItem {
    private String productID;
    private String name;
    private String description;

    public ProductBacklogItem(String productID, String name, String description) {
        this.productID = productID;
        this.name = name;
        this.description = description;
    }

    public String getProductID() {
        return productID;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}