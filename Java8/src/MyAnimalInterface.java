

import java.util.List;

@FunctionalInterface
public interface MyAnimalInterface {
	
	//void cry();
	void cry(List<String> sounds, String frequency);
	
	//void cry(String sound);
	
	//void shout(String sound);

}
