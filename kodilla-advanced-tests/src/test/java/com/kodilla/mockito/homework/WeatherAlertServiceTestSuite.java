package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class WeatherAlertServiceTestSuite {

    WeatherAlertService weatherAlertService = new WeatherAlertService();
    User user = Mockito.mock(User.class);
    User user1 = Mockito.mock(User.class);
    User user2 = Mockito.mock(User.class);
    Alert alert = Mockito.mock(Alert.class);


    @Test
    void userInGivenLocalizationShouldGivenAlert() {
        weatherAlertService.addUserToLocation("location", user);
        weatherAlertService.addUserToLocation("location", user1);

        weatherAlertService.sendAlertToLocation("location", alert);

        Mockito.verify(user, Mockito.times(1)).receive(alert);


    }

    @Test
    void userShouldntGetAlertInGivenLocation() {
        weatherAlertService.addUserToLocation("location", user);
        weatherAlertService.addUserToLocation("location1", user2);

        weatherAlertService.removeUserFromLocation("location", user);
        weatherAlertService.sendToAllUsers(alert);

        Mockito.verify(user, Mockito.never()).receive(alert);
        Mockito.verify(user2, Mockito.times(1)).receive(alert);

    }

    @Test
    void unsubscribedUserShouldntGivenAlerts() {
        weatherAlertService.addUserToLocation("location", user);
        weatherAlertService.addUserToLocation("location1", user1);

        weatherAlertService.removeAllUserSubscription(user);
        weatherAlertService.sendToAllUsers(alert);

        Mockito.verify(user, Mockito.never()).receive(alert);

    }

    @Test
    void shouldDeleteLocation() {
        weatherAlertService.addUserToLocation("location", user);
        weatherAlertService.addUserToLocation("location2", user);

        weatherAlertService.deleteLocation("location");

        Mockito.verify(user, Mockito.never()).receive(alert);
    }
}