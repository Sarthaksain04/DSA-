package CollectionFrameWork.Map.HashMap;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) {

        WeakHashMap<String , Image> imageCache =  new WeakHashMap<>();


        System.out.println(imageCache);

        System.gc();
        simulateApplicationRunnig();
        System.out.println("Cache after running (Some entries may be cleared): " +imageCache);
    }

    public static void loadCache(Map<String , Image> imageCache){
        String k1 = new String("img1");
        String k2 = new String("img2");
        imageCache.put( k1 ,new Image("Image 1"));
        imageCache.put( k2 , new Image("Image 2"));
    }

    private static void simulateApplicationRunnig() {
        try{
            System.out.println("Simulating application running...");
            Thread.sleep(10000);
        }
        catch (InterruptedException e ){
            e.printStackTrace();
        }
    }
}


class Image{
     private String name ;

    public Image(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return name ;
    }
}