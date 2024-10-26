package com.pe.relari.model;

import com.pe.relari.util.GenderCatalog;
import com.pe.relari.util.PositionCatalog;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Relari
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements Serializable {

    /**
	 *
	 */
	private static final long serialVersionUID = 4281076365062543489L;
	private Integer id;
    private String name;
    private Integer age;
    private GenderCatalog gender;
    private PositionCatalog position;
    private Integer salary;
    private Boolean status;

}