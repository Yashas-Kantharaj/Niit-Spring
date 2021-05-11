package modelMapper.test;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;

public class Demo {
	public static void main(String[] args) {
		Address ad = new Address("hennur", "bangalore");
		User user = new User("yashas", "yashastkd@gmail.com", ad, 984575555);
		
		
		ModelMapper modelMapper = new ModelMapper();
		TypeMap<User, UserDTO> typeMap = modelMapper.createTypeMap(User.class,UserDTO.class );
		
		typeMap.addMapping(src -> src.getAddress().getCity(), UserDTO::setCity);
		typeMap.addMapping(src -> src.getAddress().getStreet(), (dest, v) -> dest.setStreet((String) v));
		UserDTO dto = modelMapper.map(user, UserDTO.class);
		modelMapper.validate();
		
		System.out.println(dto.getUserName());
		System.out.println(dto.getUserEmail());
		System.out.println(dto.getUserPhno());
		System.out.println(dto.getStreet());
		System.out.println(dto.getCity());
		System.out.println(user.getAddress().getStreet().equals(dto.getStreet()));
		
		
	}
}
