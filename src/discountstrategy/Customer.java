package discountstrategy;

class Customer {
    private String customerId;
    private String name;
    
    public Customer(String customerId, String name){
        this.setCustomerId(customerId);
        this.setName(name);
    }

    public final String getCustomerId() {
        return customerId;
    }

    public final void setCustomerId(String customerId) {
        if(customerId == null || customerId.isEmpty() || customerId.length() < 2){
            throw new IllegalArgumentException("Input is not valid.");
        }else{
            this.customerId = customerId;
        }
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        if(name == null || name.isEmpty() || name.length() < 2){
            throw new IllegalArgumentException("Input is not valid.");
        }else{
            this.name = name;
        }
    }
}
