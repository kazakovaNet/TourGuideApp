package ru.kazakova_net.tourguideapp.model;

/**
 * {@link Attraction} represents the attraction of the city.
 *  Contains the name, address, link to the image of the object.
 */
public class Attraction {
    /**
     * Name of attraction
     */
    private String mName;
    /**
     * Address of attraction
     */
    private String mAddress;
    /**
     * Image resource ID of attraction
     */
    private int mObjectImageResourceId;
    /**
     * Description of attraction
     */
    private String mDescription;
    
    /**
     * Creates a new attraction object
     *
     * @param name                  name
     * @param address               address
     * @param objectImageResourceId image resource ID
     * @param description           description
     */
    public Attraction(String name, String address, int objectImageResourceId, String description) {
        this.mName = name;
        this.mAddress = address;
        this.mObjectImageResourceId = objectImageResourceId;
        this.mDescription = description;
    }
    
    public String getName() {
        return mName;
    }
    
    public String getAddress() {
        return mAddress;
    }
    
    public int getObjectImageResourceId() {
        return mObjectImageResourceId;
    }
    
    public String getDescription() {
        return mDescription;
    }
    
    @Override
    public String toString() {
        return "Attraction{" +
                "mName='" + mName + '\'' +
                ", mAddress='" + mAddress + '\'' +
                ", mObjectImageResourceId=" + mObjectImageResourceId +
                ", mDescription='" + mDescription + '\'' +
                '}';
    }
}
