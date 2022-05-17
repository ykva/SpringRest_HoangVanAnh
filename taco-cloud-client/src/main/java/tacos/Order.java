package tacos;

import java.sql.Date;

//import org.hibernate.validator.constraints.CreditCardNumber;
//import org.hibernate.validator.constraints.NotBlank;
import lombok.Data;

@Data
public class Order {
	private Long id;
	private Date placedAt;
	private String name;
	private String street;
	private String city;
	private String state;
	private String zip;
	private String ccNumber;
	private String ccExpiration;
	private String ccCVV;
}