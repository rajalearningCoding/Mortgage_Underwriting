/**
 * 
 */
package com.ibm.camunda.usecase.mortgage.underwriting.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author LIYAJERARD
 *
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Prop")
public class Prop {
	public String address;
	public String type;
	public long value;
	public long area;
	public int nBed;
	public int nBath;
	public int lotSize;
	public String pan;
	@Id
	public long id;

}
