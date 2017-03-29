package discountstrategy;

public class Store {
    private String storeId;
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;
    
    public Store(final String storeId, final String name, final String address, final String phoneNumber, final String emailAddress){
        setStoreId(storeId);
        setName(name);
        setAddress(address);
        setPhoneNumber(phoneNumber);
    }

    public final String getStoreId() {
        return storeId;
    }

    public final void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final String getAddress() {
        return address;
    }

    public final void setAddress(String address) {
        this.address = address;
    }

    public final String getPhoneNumber() {
        return phoneNumber;
    }

    public final void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public final String getEmailAddress() {
        return emailAddress;
    }

    public final void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
