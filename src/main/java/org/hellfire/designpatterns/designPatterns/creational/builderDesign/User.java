package org.hellfire.designpatterns.designPatterns.creational.builderDesign;

import lombok.ToString;

@ToString
public class User {

    private final String firstName;
    private final String lastName;

    private final int age;
    private final String city;
    private final String country;
    private final boolean isActive;

    private User(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.city = builder.city;
        this.country = builder.country;
        this.isActive = builder.isActive;
    }

    public static class Builder {

        private final String firstName;
        private final String lastName;

        private int age;
        private String city = "";
        private String country = "";
        private boolean isActive = false;

        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Builder country(String country) {
            this.country = country;
            return this;
        }

        public Builder isActive(boolean isActive) {
            this.isActive = isActive;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}

