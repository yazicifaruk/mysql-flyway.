package com.fy.msqlflyh.Domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="customers")
@Getter
@Setter
public class Customer{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "customers_phones")
    private Set<PhoneNumber> phoneNumbers;
}
