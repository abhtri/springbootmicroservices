package org.abhishek.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.abhishek.bean.Images;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class CallingDataService {
    @Autowired
    RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "getDefaultImage")
    public List<Images> getImageDataService(int id){
        List<Images> images = restTemplate.getForObject("http://image-service/images/", List.class);
        return images;
    }


    public List<Images> getDefaultImage(int id){
        Images images = new Images();
        images.setId(id);
        images.setTitle("Default Image");
        images.setUrl("Url not available");
        List<Images> list = new ArrayList<>();
        list.add(images);
        return list;
    }

}
