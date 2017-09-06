package demo.order;

import java.util.List;

import demo.cart.LineItem;

/**
 * @author addozhang 2017/9/4
 */
public class CreateOrderRequest {
    private List<LineItem> lineItems;

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }
}
