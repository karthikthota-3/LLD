package RestaurantRecommendation;

import java.util.*;

public class User {
    //private String userId;
    //private CuisineTracking[] cuisines;
    //private CostTracking[] costBracket;

    Cuisine[] priorityCuisines=new Cuisine[3];
    int[] priorityCosts=new int[3];

    /*public User(){
        userId= String.valueOf(UUID.randomUUID());
    }*/

    public PriorityQueue<CuisineTracking> cuisinesPQ=new PriorityQueue<>(new Comparator<CuisineTracking>() {
        @Override
        public int compare(CuisineTracking o1, CuisineTracking o2) {
            if(o2.getNoOfOrders()>o1.getNoOfOrders())
                return 1;
            if(o2.getNoOfOrders()<o1.getNoOfOrders())
                return -1;
            return 0;
        }
    });

    public boolean addCuisineTracking(CuisineTracking cuisineTracking){
        if(cuisineTracking==null){
            return false;
        }
        cuisinesPQ.add(cuisineTracking);
        CuisineTracking p1,p2,p3;
        if(!cuisinesPQ.isEmpty()) {
            p1=cuisinesPQ.poll();
            priorityCuisines[0]=p1.getType();
            if(!cuisinesPQ.isEmpty()){
                p2=cuisinesPQ.poll();
                priorityCuisines[1]=p2.getType();
                if(!cuisinesPQ.isEmpty()) {
                    p3 = cuisinesPQ.poll();
                    priorityCuisines[2] = p3.getType();
                    cuisinesPQ.add(p3);
                }
                cuisinesPQ.add(p2);
            }
            cuisinesPQ.add(p1);
        }
        return true;
    }

    PriorityQueue<CostTracking> costBracketPQ=new PriorityQueue<>(new Comparator<CostTracking>() {
        @Override
        public int compare(CostTracking o1, CostTracking o2) {
            if(o2.getNoOfOrders()>o1.getNoOfOrders())
                return 1;
            if(o2.getNoOfOrders()<o1.getNoOfOrders())
                return -1;
            return 0;
        }
    });

    public boolean addCostTracking(CostTracking costTracking){
        if(costTracking==null){
            return false;
        }
        costBracketPQ.add(costTracking);
        CostTracking p1,p2,p3;
        if(!costBracketPQ.isEmpty()) {
            p1=costBracketPQ.poll();
            priorityCosts[0]=p1.getType();
            if(!costBracketPQ.isEmpty()){
                p2=costBracketPQ.poll();
                priorityCosts[1]=p2.getType();
                if(!costBracketPQ.isEmpty()) {
                    p3 = costBracketPQ.poll();
                    priorityCosts[2] = p3.getType();
                    costBracketPQ.add(p3);
                }
                costBracketPQ.add(p2);
            }
            costBracketPQ.add(p1);
        }
        return true;
    }

}
