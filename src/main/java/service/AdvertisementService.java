package service;

import domain.Advertisement;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AdvertisementService {
    long nr;
    String authorName;
    int year;
    float price;
    String description;
    private AdvertisementService adE;
    private AdvertisementService adD;
    private AdvertisementService adU;
    private AdvertisementService adA;
    private AdvertisementService adR;
    private AdvertisementService adS;

    private AdvertisementService(long nr, String authorName, int year, float price, String description) {
        this.nr = nr;
        this.authorName = authorName;
        this.year = year;
        this.price = price;
        this.description = description;
    }
    AdvertisementService() {
        adE = new AdvertisementService(1, "Eduards", 2017, (float) 5215, "This is the first description!");
        adD = new AdvertisementService(2, "Eduards", 2018, (float) 213, "This is the second description!");
        adU = new AdvertisementService(3, "Eduards", 2016, (float) 5555, "This is the third description!");
        adA = new AdvertisementService(4, "Eduards", 2014, (float) 123, "This is the forth description!");
        adR = new AdvertisementService(5, "Eduards", 206, (float) 321, "This is the fifth description!");
        adD = new AdvertisementService(6, "Eduards", 2078, (float) 213, "This is the second description!");
        adS = new AdvertisementService(7, "Eduards", 2, (float) 6327, "This is the seventh description!");
    }
//setter getter
    public long getNr() {
        return nr;
    }

    public void setNr(long nr) {
        this.nr = nr;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Advertisement getAdvertisement() {
        Advertisement advertisement = new Advertisement(1, "Pardod maju", "zina1", "autors1");
        return advertisement;
    }

    public ArrayList<Advertisement> getAdvertisementList() {
        ArrayList<Advertisement> advertisements = new ArrayList<>();
        Advertisement advertisement = new Advertisement(1, "title2", "zina2", "autors2");

        advertisements.add(advertisement);
        return advertisements;
    }

    public ArrayList<AdvertisementService> getAdvertisementServiceList() {
        ArrayList<AdvertisementService> advertisements2 = new ArrayList<AdvertisementService>();

        advertisements2.add(adE);
        advertisements2.add(adD);
        advertisements2.add(adU);
        advertisements2.add(adA);
        advertisements2.add(adR);
        advertisements2.add(adD);
        advertisements2.add(adS);

        //Collections.reverse(advertisements2);
        return advertisements2;
    }
}