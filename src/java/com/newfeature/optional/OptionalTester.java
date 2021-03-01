package com.newfeature.optional;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class OptionalTester {
    @Test
    public void OptionalTest() {
        User user1 = new User();
        User user2 = new User();
        user2.setName("tom");

        Optional<User> opUser = Optional.ofNullable(null);

        User user = opUser.orElse(new User("qq", "tianjin"));

        System.out.println(user.getName());

//        if ( Optional.ofNullable(opUser.get().getName()).isPresent()){
//            System.out.println("Present");
//        }else {
//            System.out.println("No-Prensent");
//        }


    }
}
