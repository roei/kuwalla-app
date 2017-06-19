package com.kuwalla.app.api.dto;

import com.kuwalla.app.dto.Address;
import com.kuwalla.app.dto.CarInfo;
import com.kuwalla.app.dto.ContactInfo;
import com.kuwalla.app.dto.Group;
import com.kuwalla.app.dto.KuHistory;
import com.kuwalla.app.dto.Model;
import com.kuwalla.app.dto.Profile;
import com.kuwalla.app.dto.Reputation;
import com.kuwalla.app.dto.SocialMedia;
import com.kuwalla.app.dto.Status;
import com.kuwalla.app.dto.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by roei.azar on 18/06/2017
 */
public class KuwallaTest {

    @Test
    public void testUserFormat() {
        final User user = defaultUser();
        final String expectedUser = userFormat(user);
        assertEquals(expectedUser, user.toString());
    }

    private String userFormat(User user) {
        return String.format("Id: %s, kuId: %s, Gender: %s, Age: %s, Profile: %s, Address: " +
                                     "%s, Car Info: %s," +
                                     " %s, %s", user.id(), user.kuId(), user.gender(),
                             user.age(),
                             user.profile().toString(), user.address().toString(), user.carInfo().toString(),
                             user.reputation().toString(), user.kuHistory().toString());
    }

    private static User defaultUser() {
        SocialMedia socialMedia = new SocialMedia("linkedIn", "facebook");
        ContactInfo contactInfo = new ContactInfo("email", "phone");
        Address address = new Address("city", "street");
        Model model = new Model("model", "subModel");
        CarInfo carInfo = new CarInfo("year", "licensePlate", model);
        Reputation reputation = new Reputation("reputation");
        Status status = new Status("status");
        KuHistory kuHistory = new KuHistory(status);
        Group group = new Group("group");

        Profile profile = new Profile(socialMedia, contactInfo);

        return new User("name", "id", "kuId", "gender", "age", profile, address, carInfo, reputation, kuHistory, group);
    }
}

