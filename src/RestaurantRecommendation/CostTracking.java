package RestaurantRecommendation;

public class CostTracking implements Comparable<CostTracking> {
    private int type;
    private int noOfOrders;

    @Override
    public int compareTo(CostTracking o) {
        if(this.noOfOrders!=o.noOfOrders){
            return o.noOfOrders-this.noOfOrders;
        }
        return o.type-this.noOfOrders;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getNoOfOrders() {
        return noOfOrders;
    }

    public void setNoOfOrders(int noOfOrders) {
        this.noOfOrders = noOfOrders;
    }
}
