package ru.kazakova_net.tourguideapp.model;

/**
 * {@link Attraction} представляет достопримечательность города.
 * Содержит название, адрес, ссылку на изображение объекта.
 */
public class Attraction {
    /**
     * Название достопримечательности
     */
    private String mName;
    /**
     * Адрес достопримечательности
     */
    private String mAddress;
    /**
     * Идентификатор изображения достопримечательности
     */
    private int mObjectImageResourceId;
    
    /**
     * Краткое описание достопримечательности
     */
    private String mDescription;
    
    /**
     * Создает новый объект достопримечательности
     *
     * @param name                  название
     * @param address               адрес
     * @param objectImageResourceId идентификатор изображения
     * @param description
     */
    public Attraction(String name, String address, int objectImageResourceId, String description) {
        this.mName = name;
        this.mAddress = address;
        this.mObjectImageResourceId = objectImageResourceId;
        this.mDescription = description;
    }
    
    /**
     * Возвращает название достопримечательности
     *
     * @return название объекта
     */
    public String getName() {
        return mName;
    }
    
    /**
     * Возвращает адрес достопримечательности
     *
     * @return адрес объекта
     */
    public String getAddress() {
        return mAddress;
    }
    
    /**
     * Возвращает идентификатор ресурса изображения достопримечательности
     *
     * @return идентификатор ресурса изображения объекта
     */
    public int getObjectImageResourceId() {
        return mObjectImageResourceId;
    }
    
    /**
     * Возвращает описание достопримечательности
     *
     * @return описание объекта
     */
    public String getDescription() {
        return mDescription;
    }
    
    /**
     * Строковое представление достопримечательности
     *
     * @return строка с описанием объекта
     */
    @Override
    public String toString() {
        return "Attraction{" +
                "mName='" + mName + '\'' +
                ", mAddress='" + mAddress + '\'' +
                ", mObjectImageResourceId=" + mObjectImageResourceId +
                '}';
    }
}
