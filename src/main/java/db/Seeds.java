package db;

import models.Advert;
import models.Shop;

public class Seeds {

    public static void seedData() {

        DBHelper.deleteAll(Shop.class);
        DBHelper.deleteAll(Advert.class);

        Shop shop = new Shop("Plumtree");
        DBHelper.save(shop);

        Advert advert1 = new Advert("Bike", "Very fast bike", 100.00, "/image/bike");
        advert1.setShop(shop);
        DBHelper.save(advert1);
        Advert advert2 = new Advert("Dress", "Very nice dress", 50.00, "/image/dress");
        advert2.setShop(shop);
        DBHelper.save(advert2);

        advert1.setTitle("Banana");
        DBHelper.update(advert1);

        DBHelper.delete(advert1);



    }


}
