package fi.metropolia.patrikmg.project.util;

import java.io.Serializable;

public class OrderitemsId implements Serializable {
    private int order_id;
    private int product_id;

    public OrderitemsId(int order_id, int product_id) {
        this.order_id = order_id;
        this.product_id = product_id;
    }

}
