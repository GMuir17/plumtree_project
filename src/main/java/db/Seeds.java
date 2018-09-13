package db;

import models.Advert;
import models.CategoryType;
import models.Shop;

import java.util.Arrays;
import java.util.List;

public class Seeds {

    public static void seedData() {

        // deleteAll
        DBHelper.deleteAll(Advert.class);
        DBHelper.deleteAll(Shop.class);

        // shop
        Shop shop = new Shop("Plumtree");
        DBHelper.save(shop);

        // TODO: ADD MORE ADVERTS BEFORE PRESENTATION

        // adverts
        Advert advert1 = new Advert("BULLS E-Stream EVO 3 27.5 Plus", "The bike sports a monster 650Wh battery pack for incredible range…up to 137 miles.", 1500.00, "/images/bike2.jpg");
        advert1.setShop(shop);
        advert1.addCategory(CategoryType.TRANSPORT);
        DBHelper.save(advert1);
        Advert advert2 = new Advert("Audi R8 Coupe - 5204 CC", "Mag ride 29000 miles full Audi service history spare key parking camera bang olufsen upgrade in very good condition, 2 owners, Full service history.", 61500.00, "/images/car1.jpg");
        advert2.setShop(shop);
        advert2.addCategory(CategoryType.TRANSPORT);
        DBHelper.save(advert2);
        Advert advert8 = new Advert("Gregorian Copper Watering Can", "Watering can 15 in long 6 1/4 wide 8 1/2 tall. Fine piece of copper.", 20.00, "/images/wateringcan.jpg");
        advert8.setShop(shop);
        advert8.addCategory(CategoryType.GARDEN);
        DBHelper.save(advert8);
        Advert advert3 = new Advert("Ducati MTS1200", "Sport is full fat 150bhp power, with the bike always eager for you to twist the throttle more as the bike surges forward and the numbers on the digital dash rapidly rise.", 2250.00, "/images/motorbike1.jpg");
        advert3.setShop(shop);
        advert3.addCategory(CategoryType.TRANSPORT);
        DBHelper.save(advert3);
        Advert advert4 = new Advert("1973 Honda CB350", "All round beauty, kept under cover at night. Max speed 205mph", 3250.00, "/images/motorbike2.jpg");
        advert4.setShop(shop);
        advert4.addCategory(CategoryType.TRANSPORT);
        DBHelper.save(advert4);
        Advert advert5 = new Advert("Lenovo VIBE P1", "* Android 5.1, Qualcomm Snapdragon 615(MSM8939) Octa Core 1.5GHz, 3GB RAM, 5.5 inch FHD 1920×1080, Gorilla Glass III.", 145.00, "/images/phone1.jpg");
        advert5.setShop(shop);
        advert5.addCategory(CategoryType.TECHNOLOGY);
        DBHelper.save(advert5);

        Advert advert6 = new Advert("1960s Chequered Shirt", "A delightful example of a boy's shirt, made by Littlewoods in the 1960s. It is made from green, brown & and white chequered polyester cotton, with long sleeves, all original buttons and a breast pocket.", 14.00, "/images/clothing1.jpg");
        advert6.setShop(shop);
        advert6.addCategory(CategoryType.FASHION);
        DBHelper.save(advert6);




        // --- WORKING TESTS BELOW --- //

        // update
//        advert1.setTitle("Banana");
//        DBHelper.update(advert1);

        // delete
//        DBHelper.delete(advert1);

        // findAll
//        List<Advert> foundAdverts = DBHelper.findAll(Advert.class);

        // findById
//        Advert foundAdvert = DBHelper.findById(Advert.class, advert2.getId());

        // addAdvertToShop
//        DBAdvert.addAdvertToShop(advert2, shop);

        // orderByPostedTimeDescending
//        List<Advert> orderedAdvertsByTimeDescending = DBAdvert.orderByPostedTimeDescending();

        // orderByPostedTimeAscending
//        List<Advert> orderedAdvertsByTieAscending = DBAdvert.orderByPostedTimeAscending();

        // findByCategory
//        List<Advert> foundAdvertsInCategory = DBAdvert.findByCategory(CategoryType.TECHNOLOGY);

//        runs through the categorytype enum and creates a list filled with all of it's values
//        List<CategoryType> categories = Arrays.asList(CategoryType.values());


//        List<CategoryType> categories = advert1.getCategories();
//        boolean testBoolean = advert1.hasCategory(CategoryType.TRANSPORT);

//        Advert foundAdvert = DBHelper.findById(Advert.class, advert2.getId());

//        List<Advert> orderedAdvertsByPriceExpensiveFirst = DBAdvert.orderByPrice(true);
//        List<Advert> orderedAdvertsByPriceCheapFirst = DBAdvert.orderByPrice(false);

//        List<Advert> advertsFoundByTitle = DBAdvert.findByTitle("Bike");
//        List<Advert> advertsFoundByTitleWhichDoesntExist = DBAdvert.findByTitle("Error");

//        List<Advert> foundAdvertsByPrice = DBAdvert.findByPrice(100.00);
//        List<Advert> foundAdvertsByPriceNoneExists = DBAdvert.findByPrice(2.00);

//        List<Advert> orderedAdvertsByTimeNewestFirst = DBAdvert.orderByTime(true);
//        List<Advert> orderedAdvertsByTimeOldestFirst = DBAdvert.orderByTime(false);

    }


}
