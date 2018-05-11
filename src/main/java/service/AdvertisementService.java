package service;

import domain.Advertisement;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Service
public class AdvertisementService {

    String name = "Eduards";
    public List<Advertisement> hardcodedAdvertisementList;
    public List<Advertisement> reverseAdvertisementList;

    public AdvertisementService() {
        hardcodedAdvertisementList = hardcodedAdvertisementInititialization();
        reverseAdvertisementList = hardcodedAdvertisementList;
        Collections.reverse(reverseAdvertisementList);

        //adE = new AdvertisementService(1, "Eduards", 2017, (float) 5215, "This is the first description!");
        //adD = new AdvertisementService(2, "Eduards", 2018, (float) 213, "This is the second description!");
        //adU = new AdvertisementService(3, "Eduards", 2016, (float) 5555, "This is the third description!");
        //adA = new AdvertisementService(4, "Eduards", 2014, (float) 123, "This is the forth description!");
        //adR = new AdvertisementService(5, "Eduards", 206, (float) 321, "This is the fifth description!");
        //adD = new AdvertisementService(6, "Eduards", 2078, (float) 213, "This is the second description!");
        //adS = new AdvertisementService(7, "Eduards", 2, (float) 6327, "This is the seventh description!");

    }

    public Advertisement getAdvertisement() {
        Advertisement advertisement = new Advertisement(1L, "Pardod maaju", "Paardod maaju", "Janis");
        return advertisement;
    }

    public List<Advertisement> getAdvertisementListByAuthor(String author) {
        List<Advertisement> filteredByName = new ArrayList<>();
        for (Advertisement advertisement : hardcodedAdvertisementList) {
            if(advertisement.getAuthor().matches(author)) {
                filteredByName.add(advertisement);
            }
        }
        return filteredByName;
    }

    public List<Advertisement> getAdvertisementListReverse() {
        return reverseAdvertisementList;
    }

    public ArrayList<Advertisement> getAdvertisementList() {
        ArrayList<Advertisement> advertisements = new ArrayList<>();
        Advertisement advertisement = new Advertisement(1L, "Pardod maaju", "Paardod maaju", "Aleksis");


        advertisements.add(advertisement);

        return advertisements;
    }

    private List<Advertisement> hardcodedAdvertisementInititialization() {
        List<Advertisement> advertisements = new ArrayList<>();
        for (int i = 1; i < name.length(); i++) {
            Advertisement advertisement = new Advertisement(Long.valueOf(i),
                    "House", "Selling house on Brivibas street, nr. " + i, getAuthorName(i));
            advertisements.add(advertisement);
        }
        return advertisements;
    }


    public String getAuthorName(int i) {
        if(i % 2 == 0 ) {
            return "Aleksis";
        }
        return "Es";
    }
}