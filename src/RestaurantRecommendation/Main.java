package RestaurantRecommendation;

public class Main {
    public static void  main(String[] args){
        Persuation p=new Persuation();
        User u=new User();
        Restaurant[] restaurants=new Restaurant[]{};
        String[] answer=p.getRestaurantRecommendations(u,restaurants);
        for(String s:answer){
            System.out.println(s);
        }
    }
}
