class SuperMarketItems {
	
	
    public static void main(String[] supermarket){

       String RiceItems[]={"Basmati Rice","Sona Masuri","Brown Rice","Idli Rice","Ponni Rice","Jeera Rice","Organic Rice","Boiled Rice","Raw Rice","Mini Rice","Kolam Rice","Matta Rice","Broken Rice","Steam Rice","White Rice","Red Rice","Wild Rice","Long Grain Rice","Short Grain Rice","Sticky Rice","Aged Rice","New Crop Rice","Premium Rice","Budget Rice","Local Rice"};

       String DalItems[]={"Toor Dal","Moong Dal","Masoor Dal","Urad Dal","Chana Dal","Green Gram","Black Gram","Split Peas","Horse Gram","Rajma","Lobia","Kabuli Chana","Desi Chana","Soybeans","Yellow Dal","Red Lentils","White Peas","Brown Lentils","Mixed Dal","Organic Dal","Premium Dal","Loose Dal","Packed Dal","Local Dal","Imported Dal"};

       String OilItems[]={"Sunflower Oil","Groundnut Oil","Coconut Oil","Palm Oil","Mustard Oil","Olive Oil","Rice Bran Oil","Soybean Oil","Sesame Oil","Corn Oil","Canola Oil","Vegetable Oil","Refined Oil","Cold Pressed Oil","Organic Oil","Filtered Oil","Premium Oil","Cooking Oil","Light Oil","Heavy Oil","Local Oil","Imported Oil","Healthy Oil","Pure Oil","Blended Oil"};

       String DairyItems[]={"Milk","Curd","Butter","Ghee","Paneer","Cheese","Cream","Flavored Milk","Lassi","Buttermilk","Condensed Milk","Milk Powder","Ice Cream","Yogurt","Skim Milk","Full Cream Milk","Low Fat Milk","Fresh Cream","Whipped Cream","Frozen Dessert","Organic Milk","Cow Milk","Buffalo Milk","Dairy Whitener","Milk Shake"};

       String BakeryItems[]={"White Bread","Brown Bread","Multigrain Bread","Buns","Pav","Rusk","Toast","Croissant","Donut","Cake","Pastry","Cookies","Biscuits","Muffins","Cup Cake","Fruit Cake","Plum Cake","Sponge Cake","Bread Loaf","Garlic Bread","Pizza Base","Burger Bun","Dry Cake","Tea Cake","Sweet Bread"};

       String BeverageItems[]={"Tea","Coffee","Green Tea","Black Tea","Lemon Tea","Cold Coffee","Soft Drink","Fruit Juice","Energy Drink","Soda","Mineral Water","Flavored Water","Milk Shake","Buttermilk","Lassi","Iced Tea","Mocktail","Herbal Drink","Sports Drink","Tonic Water","Packaged Juice","Fresh Juice","Coconut Water","Sugarcane Juice","Health Drink"};

       String SnacksItems[]={"Chips","KurKure","Namkeen","Mixture","Peanuts","Popcorn","Murukku","Chakli","Biscuits","Cookies","Nachos","Crackers","Salted Nuts","Roasted Chana","Aloo Bhujia","Sev","Fryums","Banana Chips","Corn Chips","Soya Sticks","Sweet Snacks","Spicy Snacks","Baked Snacks","Healthy Snacks","Instant Snacks"};

       String FruitsItems[]={"Apple","Banana","Orange","Grapes","Mango","Pineapple","Papaya","Guava","Watermelon","Muskmelon","Pomegranate","Kiwi","Strawberry","Blueberry","Pear","Peach","Plum","Cherry","Fig","Dates","Custard Apple","Dragon Fruit","Avocado","Lychee","Jackfruit"};

       String VegetablesItems[]={"Potato","Tomato","Onion","Carrot","Beans","Cabbage","Cauliflower","Brinjal","Cucumber","Capsicum","Spinach","Radish","Beetroot","Pumpkin","Bottle Gourd","Bitter Gourd","Ridge Gourd","Drumstick","Green Chilli","Coriander","Mint","Fenugreek","Sweet Corn","Peas","Broccoli"};

       String FrozenItems[]={"Frozen Peas","Frozen Corn","Frozen Fries","Frozen Nuggets","Frozen Paratha","Frozen Pizza","Frozen Veggies","Frozen Fruits","Frozen Snacks","Frozen Roti","Frozen Idli","Frozen Dosa","Frozen Samosa","Frozen Cutlet","Frozen Momos","Frozen Spring Roll","Frozen Paneer","Frozen Ice Cream","Frozen Dessert","Frozen Meat","Frozen Fish","Frozen Chicken","Frozen Prawns","Frozen Berries","Frozen Mix"};

       String PersonalCareItems[]={"Soap","Shampoo","Conditioner","Face Wash","Face Cream","Body Lotion","Toothpaste","Toothbrush","Hair Oil","Perfume","Deodorant","Talcum Powder","Face Pack","Hair Gel","Shaving Cream","Razor","After Shave","Lip Balm","Sunscreen","Hand Wash","Sanitizer","Cotton","Ear Buds","Face Tissue","Wet Wipes"};
	   
	   String CleaningItems[]={"Detergent Powder","Detergent Liquid","Dish Wash","Floor Cleaner","Toilet Cleaner","Phenyl","Bleach","Soap Bar","Scrub Pad","Sponge","Glass Cleaner","Room Freshener","Mosquito Spray","Insect Repellent","Garbage Bags","Cleaning Cloth","Mop","Broom","Dust Pan","Wiper","Hand Gloves","Disinfectant","Surface Cleaner","Liquid Soap","Cleaning Brush"};

       String BabyCareItems[]={"Baby Soap","Baby Shampoo","Baby Oil","Baby Powder","Baby Cream","Baby Lotion","Baby Diapers","Baby Wipes","Baby Feeding Bottle","Baby Food","Baby Cereal","Baby Biscuit","Baby Blanket","Baby Towel","Baby Toothbrush","Baby Paste","Baby Carrier","Baby Swing","Baby Bed","Baby Pillow","Baby Toys","Baby Napkin","Baby Bib","Baby Comb","Baby Nail Cutter"};

       String PetCareItems[]={"Dog Food","Cat Food","Pet Shampoo","Pet Soap","Pet Collar","Pet Leash","Pet Toys","Pet Bed","Pet Bowl","Pet Treats","Pet Biscuits","Pet Vitamins","Pet Grooming Kit","Pet Brush","Pet Cage","Pet Litter","Pet Mat","Pet Clothes","Pet Harness","Pet Training Pads","Pet Spray","Pet Medicine","Pet Accessories","Pet Feeder","Pet Water Bottle"};

       String StationeryItems[]={"Pen","Pencil","Eraser","Sharpener","Notebook","Drawing Book","Color Pencils","Crayons","Sketch Pens","Marker","Highlighter","Stapler","Staple Pins","Paper Clips","Glue","Scale","Compass Box","Calculator","File","Folder","Sticky Notes","White Board Marker","Ink","Correction Pen","Paper"};

       String KitchenItems[]={"Pressure Cooker","Frying Pan","Kadai","Tawa","Sauce Pan","Spatula","Ladle","Knife","Chopping Board","Peeler","Mixer Grinder","Gas Stove","Induction Stove","Electric Kettle","Rice Cooker","Lunch Box","Water Bottle","Storage Container","Steel Plates","Steel Glass","Spoon Set","Fork","Dinner Set","Kitchen Towels","Apron"};

       String ElectronicsItems[]={"LED Bulb","Tube Light","Extension Board","Electric Iron","Mixer","Fan","Table Lamp","Torch","Power Bank","Mobile Charger","Headphones","Earphones","Bluetooth Speaker","Smart Watch","Calculator","Electric Kettle","Heater","USB Cable","Adapter","Remote","Inverter Battery","Emergency Light","Trimmer","Hair Dryer","Electric Cooker"};

       String HomeNeedsItems[]={"Door Mat","Curtains","Bedsheet","Pillow Cover","Blanket","Bucket","Mug","Cloth Stand","Hangers","Laundry Basket","Wall Clock","Photo Frame","Mirror","Carpet","Rug","Table Cloth","Shoe Rack","Dustbin","Plastic Stool","Storage Box","Umbrella","Mosquito Net","Room Divider","Lamp Shade","Flower Vase"};

       String PoojaItems[]={"Agarbatti","Dhoop","Camphor","Oil Lamp","Cotton Wicks","Pooja Oil","Flowers","Garland","Kumkum","Turmeric","Chandan","Incense Holder","Bell","Pooja Plate","Pooja Book","Idols","Kalash","Coconut","Betel Leaves","Betel Nuts","Match Box","Diya","Ghee Lamp","Sacred Thread","Holy Ash"};

       String HealthItems[]={"Paracetamol","Vitamin C","Vitamin D","Calcium Tablets","Protein Powder","ORS","Glucometer","BP Monitor","Thermometer","Bandage","Cotton Roll","Antiseptic Liquid","Pain Relief Spray","First Aid Kit","Face Mask","Hand Gloves","Sanitizer","Medical Tape","Cough Syrup","Digestive Tablets","Immunity Booster","Herbal Tablets","Ayurvedic Oil","Energy Supplement","Health Drink"};

       
}
}