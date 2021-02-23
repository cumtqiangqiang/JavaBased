package com.newfeature.optional;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OptionalTester {
    @Test
    public void OptionalTest() {
        User user1 = new User();
        User user2 = new User();
        user2.setName("tom");

        if (user1.getName().equals(user2.getName())){
            System.out.println("equals");
        }


    }
}
