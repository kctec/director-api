package com.kctec.director.service;


import com.kctec.director.model.Profile;
import com.kctec.director.repositories.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jonesk1 on 10/12/17.
 */
@Service
public class ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

      public Profile getProfile(Long id) {
        return profileRepository.findOne(id);
    }

}
