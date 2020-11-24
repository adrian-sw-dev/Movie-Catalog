package io.company.ratingsdataservice.resources;

import io.company.ratingsdataservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsDataResource {

    @RequestMapping("/users/{userId}")
    public UserRating getUserRatings(@PathVariable("userId") String userId) {

        UserRating userRating = new UserRating();
        userRating.initData(userId);

        return userRating;
    }
}
