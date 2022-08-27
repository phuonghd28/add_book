package com.example.demo.entity;

public class Store {
    private int id;
    private String name;
    private String address;
    private String phone;
    private String fax;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public static final class StoreBuilder {
        private int id;
        private String name;
        private String address;
        private String phone;
        private String fax;

        private StoreBuilder() {
        }

        public static StoreBuilder aStore() {
            return new StoreBuilder();
        }

        public StoreBuilder withId(int id) {
            this.id = id;
            return this;
        }

        public StoreBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public StoreBuilder withAddress(String address) {
            this.address = address;
            return this;
        }

        public StoreBuilder withPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public StoreBuilder withFax(String fax) {
            this.fax = fax;
            return this;
        }

        public Store build() {
            Store cinema = new Store();
            cinema.setId(id);
            cinema.setName(name);
            cinema.setAddress(address);
            cinema.setPhone(phone);
            cinema.setFax(fax);
            return cinema;
        }
    }


}
