package com.fy.msqlflyh.Domain;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Entity
@Table(name="products")
@Getter
@Setter
public class Product{
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;
        private String name;

}
