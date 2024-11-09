package com.example.week7.data

import com.example.week7.model.RestoData

class DataSource {
    fun loadRestaurant(): List<RestoData> {
        return listOf(
            RestoData(
                1,
                "The Food Place",
                4.5,
                120,
                2.3,
                "123 Main St",
                "The Food Place is a cozy neighborhood restaurant that specializes in comfort food, offering a menu filled with hearty dishes and classic favorites. Whether you're craving a delicious mac and cheese, a warm bowl of soup, or a home-style roast, this spot guarantees a filling and satisfying meal that will remind you of home-cooked goodness. Perfect for family dinners or a relaxed night out, this restaurant is loved by locals for its welcoming atmosphere and generous portions."
            ),
            RestoData(
                2,
                "Delicious Diner",
                4.0,
                98,
                1.8,
                "456 Elm St",
                "Delicious Diner is a classic American eatery that prides itself on serving up all the diner staples you know and love. From fluffy pancakes and hearty burgers to thick milkshakes and crispy fries, this casual spot is perfect for both breakfast and lunch. The retro decor and friendly staff create an inviting vibe, making it a great choice for a casual meal with friends or family."
            ),
            RestoData(
                3,
                "Taste of Heaven",
                4.7,
                205,
                3.1,
                "789 Oak St",
                "Taste of Heaven lives up to its name with a refined dining experience that promises an exquisite culinary journey. Featuring a menu that combines gourmet flavors with artistic presentation, this fine dining establishment offers a heavenly selection of dishes made from the freshest ingredients. From carefully crafted appetizers to decadent desserts, every course is designed to delight your palate in an elegant, intimate setting."
            ),
            RestoData(
                4,
                "Best Bites",
                4.2,
                150,
                2.0,
                "101 Pine St",
                "Best Bites is your go-to spot for quick, flavorful meals that never compromise on taste. Serving a wide range of global street food-inspired dishes, this eatery delivers big flavors in small packages. Whether you're in the mood for tacos, sliders, or noodles, Best Bites has something to satisfy your cravings. With fast service and a vibrant atmosphere, it's the perfect place for a quick lunch or casual dinner."
            ),
            RestoData(
                5,
                "Culinary Corner",
                4.8,
                85,
                1.5,
                "202 Maple St",
                "Culinary Corner offers a gourmet dining experience with a contemporary twist. The restaurant’s menu is a creative blend of modern and traditional flavors, with a focus on high-quality ingredients and artistic presentation. Known for its unique fusion dishes, Culinary Corner is a favorite among foodies looking to experience bold new tastes in an upscale yet comfortable environment. Whether it's date night or a special occasion, this is the spot to indulge."
            ),
            RestoData(
                6,
                "Bistro Delight",
                4.6,
                130,
                2.9,
                "303 Cedar St",
                "Bistro Delight is a charming little restaurant that brings the best of European bistro culture to the heart of the city. With a focus on fresh, seasonal ingredients, Bistro Delight serves up an ever-changing menu of delightful dishes, from light salads to rich, flavorful entrées. The cozy atmosphere and attentive service make it the ideal spot for a leisurely meal with friends or a romantic evening for two."
            ),
            RestoData(
                7,
                "Savor Spot",
                4.1,
                170,
                1.6,
                "404 Birch St",
                "Savor Spot is a hidden gem where locals gather to enjoy good food and great company. The menu is a celebration of comfort foods from around the world, with a focus on fresh, locally sourced ingredients. Whether you're in the mood for a hearty stew, a fresh salad, or something sweet, Savor Spot has something for everyone. The laid-back vibe and friendly service make it a great place to relax and unwind."
            ),
            RestoData(
                8,
                "Grill Master",
                4.4,
                215,
                3.5,
                "505 Ash St",
                "Grill Master is the ultimate destination for meat lovers. Specializing in expertly grilled meats, this restaurant offers a wide selection of steaks, ribs, burgers, and more, all cooked to perfection over an open flame. With its rustic decor and lively atmosphere, Grill Master is the perfect spot for a fun night out with friends or a casual family dinner. Be sure to try their signature sauces and sides for the full experience."
            ),
            RestoData(
                9,
                "Urban Eats",
                4.0,
                90,
                2.1,
                "606 Chestnut St",
                "Urban Eats is a trendy, fast-casual spot that serves up a modern twist on classic dishes. From gourmet sandwiches to artisanal pizzas, everything at Urban Eats is made fresh with high-quality ingredients. The restaurant’s urban-chic decor and laid-back atmosphere make it a great choice for a quick lunch, a casual dinner, or a weekend brunch with friends. With its central location and vibrant energy, it's a popular spot for both locals and tourists."
            ),
            RestoData(
                10,
                "Tasty Treats",
                4.3,
                140,
                1.2,
                "707 Walnut St",
                "Tasty Treats is a dessert lover's paradise, offering an array of mouthwatering sweets that are as beautiful as they are delicious. From indulgent cakes and pastries to creamy gelato and decadent chocolates, Tasty Treats has something to satisfy every sweet tooth. Whether you’re stopping by for a quick coffee and a cookie or sitting down to enjoy a full dessert experience, this charming bakery is sure to delight."
            ),
            RestoData(
                11,
                "Epicurean Escape",
                4.9,
                250,
                4.0,
                "808 Willow St",
                "Epicurean Escape offers a fine dining experience like no other, with a menu that changes with the seasons and a focus on using only the finest ingredients. The restaurant's sleek, modern decor provides the perfect backdrop for a meal that is both sophisticated and unforgettable. Every dish is a work of art, designed to be savored and enjoyed in a relaxed, intimate setting. Perfect for a special occasion or a night out with someone special."
            ),
            RestoData(
                12,
                "Flavor Fiesta",
                4.2,
                100,
                2.6,
                "909 Poplar St",
                "Flavor Fiesta is a vibrant, fun-filled restaurant that celebrates the bold flavors and colorful traditions of Latin cuisine. From sizzling fajitas to tangy ceviche, every dish is packed with spice and flavor, transporting your taste buds on an adventure. The lively atmosphere and upbeat music make it a great spot for a night out with friends, and the extensive drink menu offers everything from craft cocktails to authentic margaritas."
            ),
            RestoData(
                13,
                "Gourmet Garden",
                4.7,
                180,
                3.2,
                "1010 Magnolia St",
                "Gourmet Garden is a farm-to-table restaurant that prides itself on using the freshest, locally sourced ingredients in every dish. The menu is a celebration of seasonal produce and artisanal meats, prepared with care and creativity. With its rustic decor and warm, welcoming atmosphere, Gourmet Garden is the perfect spot for a relaxing meal that’s as good for the soul as it is for the body."
            ),
            RestoData(
                14,
                "Savory Slices",
                4.5,
                155,
                1.9,
                "1111 Redwood St",
                "Savory Slices is a pizza lover's dream, offering an extensive menu of artisanal pizzas made with hand-tossed dough, premium cheeses, and fresh, flavorful toppings. Whether you’re in the mood for a classic margherita or something more adventurous, like their famous truffle pizza, Savory Slices delivers perfection in every bite. The casual, family-friendly atmosphere makes it a great place for a relaxed meal with friends or family."
            ),
            RestoData(
                15,
                "Farm-to-Table Fare",
                4.8,
                85,
                2.4,
                "1212 Fir St",
                "Farm-to-Table Fare is all about sustainability and freshness, offering a menu that showcases the best of local farms and artisans. From crisp salads to hearty roasts, every dish is a celebration of wholesome ingredients and homegrown flavors. With its cozy ambiance and friendly service, Farm-to-Table Fare is the perfect place to enjoy a meal that’s both delicious and ethically sourced."
            ),
            RestoData(
                16,
                "Global Grill",
                4.3,
                125,
                3.0,
                "1313 Spruce St",
                "Global Grill takes your taste buds on a culinary journey around the world, with a menu that features flavors from every corner of the globe. From spicy curries to delicate sushi rolls, there’s something for every palate at this internationally inspired eatery. With its eclectic decor and friendly atmosphere, Global Grill is a great spot for adventurous diners looking to try something ."
            ),
            RestoData(
                17,
                "The Breakfast Nook",
                4.6,
                95,
                1.7,
                "1414 Hemlock St",
                "The Breakfast Nook is a beloved local spot known for its hearty breakfasts and friendly service. Whether you're in the mood for pancakes, omelets, or a classic bacon and eggs breakfast, The Breakfast Nook has you covered. The cozy, down-to-earth vibe and generous portions make it a favorite for weekend brunches and early morning coffee runs."
            ),
            RestoData(
                18,
                "Dinner Dreams",
                4.1,
                145,
                2.2,
                "1515 Maplewood St",
                "Dinner Dreams brings your favorite dinner fantasies to life, offering a wide range of dishes that combine comfort with creativity. From perfectly cooked steaks to indulgent pasta dishes, every meal is designed to be a treat for the senses. The warm, inviting ambiance and attentive service make it the ideal place for a leisurely dinner with family or friends."
            ),
            RestoData(
                19,
                "Quick Fix",
                4.0,
                110,
                1.4,
                "1616 Holly St",
                "Quick Fix is the perfect spot for a fast, delicious meal that doesn't skimp on quality. Whether you're in the mood for a fresh salad, a hearty sandwich, or a hot bowl of soup, Quick Fix has something to hit the spot. With its convenient location and efficient service, it's a great option for a quick lunch or an easy dinner after a busy day."
            ),
            RestoData(
                20,
                "Palate Pleasers",
                4.9,
                220,
                4.3,
                "1717 Ivy St",
                "Palate Pleasers is a fine dining establishment that offers an exceptional culinary experience. With a menu that changes seasonally to reflect the best available ingredients, Palate Pleasers is all about elevating simple, wholesome ingredients into something truly special. Whether you’re celebrating a special occasion or just looking to treat yourself, this is the place to indulge in top-tier gourmet cuisine."
            )

        )
    }
}