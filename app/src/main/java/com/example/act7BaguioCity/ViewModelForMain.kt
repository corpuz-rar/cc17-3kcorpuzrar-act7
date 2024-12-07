package com.example.act7BaguioCity

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelForMain : ViewModel() {
    private val _location = MutableLiveData<List<Location>>()
    val location: LiveData<List<Location>> get() = _location

    private val locationData = mapOf(
        "Food Trip" to listOf(
            Location("Good Taste", R.drawable.goodtaste, "Food Trip", "Good Taste Baguio offers a delightful culinary experieces, serving up a variety of affordable and delicious Filipino and Chinese dishes that have satisfied both locals and tourist for decades. It is also known for its generouse and hearty flavors. Good Taste is located at Corner Carino St. and Otek St., Rizal Monument Brgy"),
            Location("Pizza Volante", R.drawable.pizzavolante, "Food Trip", "A popular pizza restaurant in Baguio City known for its delicious pizzas and cozy atmosphere. They serve pizzas, pastas and other Italian-inspired dishes at affordable price. Pizza Volante is located at Session Theater Building, Session Road Ayala Technohub, John Hay Wright Park Level 2, Sunset Terraces."),
            Location("Sizzling Plate", R.drawable.sizzlingplate, "Food Trip", "Sizzling Plate is renowned for its sizzling hot plates filled with a variety of meat and seafood dishes. Signature such as sizzling sisig and sizzling porkchop, are served on a sizzling plate. Sizzling plate is located at Session Road."),
            Location("Pet's Bulaluhan", R.drawable.petsbulaluhan, "Food Trip", "A local eatery in Baguio city, renownd for its hearty and flavorful bulalo. The Bulalo is slow-cooked to perfection, resulting in tender meat that falls off the bone and a rich, savory broth that warms the soul. Pet's Bulaluhan is located at Governor Pack road, near the police station."),

        ),

        "Schools" to listOf(
            Location("University of the Cordilleras", R.drawable.university_of_cordilleras, "Schools", "UC is a prominent private university in Baguio City, that offers a wide range of undergraduate and graduate programs. Academic programs offered are engineering, law, business, computer courses and more are available. UC is located at Governor Pack road, near SM."),
            Location("Saint Louis Univesity", R.drawable.slu, "Schools", "A renowned Catholic university in Baguio city that offers academic programs from elementary to graduate levels. SLU is located at the Lower Bonifacio street. Near the roundabout."),
            Location("University of Baguio", R.drawable.university_of_baguio, "Parks", "A private city in Baguio City that is nestles in the heart of Baguio City. UB provides a conductive learning environment to thrive academically and presonally. UB is located at Gen Luna Road."),
            Location("University of the Philippines: Baguio",R.drawable.upb,"Schools","The Univeristy of the Philippines Baguio is a prestigious public research university. UPB has strong programs in social sciences, particularly in Indigenous Studies and Cordilleran history and culture. UP Baguio is located at Gov Pack road.")
        ),

        "Parks" to listOf(
            Location("Burnham Park", R.drawable.burnham, "Parks", "A historic urban park located in the heart of Baguio City, designed by renowned American architect Daniel Burnham. Burnham park offers a lot of attractions, including a picturisque lake,  a rose garden, childrens's playground and more. Burnham park is located near the Harisson road. "),
            Location("Sunshine Park", R.drawable.sunshine, "Parks", "A serene urban park, offering a quick escape from the bustling city center. This well mentained park features lush greenery, winding pathways and benches perfect for relaxation and contemplation. Sunshine Park is located at Governor Pack road, near UP Baguio."),
            Location("Baguio Post Office Park", R.drawable.postoffice, "Parks", "The Post Office park is located near Session road. It has a unique architecture and many benches. Many food stalls are also available near the place. The Post Office park is located near Session Road."),
            ),


        "Gyms" to listOf(
            Location("Altitude Gym", R.drawable.altitude, "Gyms", "Altitude gyms offers a wide range of fitness equipment and classes. They provide a comfortable and well-equiped space for both seasones fitness entusiasist and beginners. Altitude Gym is located at Legarda Road, 2nd floor of Mt. crest hotel."),
            Location("Armztrong Gym", R.drawable.armztrong, "Gyms", "Armztrong gym i very budget friendly and offers student discounts for students availing gym membership. They have a lot of machine equipments but they have a very small space. They also offer coaching sessions. Armztrong Gym is located at Rimando street and corner of Bonifacio street. Near SLU ad 3rd Basement of Janelco Building. "),
            Location("YMCA Gym", R.drawable.ymca, "Gyms", "The YMCA gym is a popular fitness center and has affordable membership fees. IT is also has well equiped gym, a swimming pool and various fitness classes. YMCA gym is located at upper Session Road, near the Post Office. "),
            ),


        "Cafe" to listOf(
            Location("Tau Ceti Specialty Cafe", R.drawable.tauceti, "Cafes", "A popular coffee shop knwon for its high-quality coffee beans and expertly brewed coffee. It offers a wide variety of coffee drinks, from espresso to innovative speciaty brews. Tau Ceti Specialty Cafe is located at the Basement of Albergo Hotel, Ignacio Villamor Street."),
            Location("Beans Talk Bistro", R.drawable.beans, "Cafes", "A cozy and inviting cafe that is a popular spot fro both local and tourist. They offer breakfast, lunch  or a relaxing cup of coffee. Beans Talk Cafe is located at the MPB building at Session Road. "),
            Location("Ginto Cafe Bistro", R.drawable.ginto, "Cafes", "A popular dining spot known for its delicious Filipino and international cuisine. Their feature dishes are sizzling sisig, pasta and refrenshing drinks and different variety of coffee, making it a great choice for both dining and special ocasions. Ginto Cafe Bistro is located at Tan building at Lower Session Road. "),
            Location("Aracas Yard Cafe", R.drawable.aras, "Cafes", "Arca's Yard Cafe has a warm and inviting atmoshphere. It also has a museum and library on top of it being a cafe, making it a perfect spot for a date. Aracas Yard Cafe at 777 Tiptop Ambuklao Road."),
            )



    )


    fun loadLocation(category: String) {
        _location.value = locationData[category] ?: emptyList()
    }
}