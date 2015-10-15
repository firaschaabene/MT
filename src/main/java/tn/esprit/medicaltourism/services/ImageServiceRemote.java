package tn.esprit.medicaltourism.services;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.medicaltourism.domain.Hotel;
import tn.esprit.medicaltourism.domain.Image;

@Remote
public interface ImageServiceRemote {
	Image create (Image image);
	void update (Image  image);
void delete(Integer id);
void delete(Image image);
Image find(Integer id);
Image findByUrl(String url);
List<Image>findAll();
Image findHotelImage(Hotel hotel);
}
