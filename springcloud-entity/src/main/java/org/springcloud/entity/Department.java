package org.springcloud.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain=true)
public class Department implements Serializable{
	private static final long serialVersionUID = -8346699099397682464L;
	private long id;
	private String name;
	private String dbSource;
}
